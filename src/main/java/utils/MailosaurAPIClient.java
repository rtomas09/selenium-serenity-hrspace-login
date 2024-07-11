package utils;


import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.Messages;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageListResult;
import com.mailosaur.models.MessageSummary;
import com.mailosaur.models.SearchCriteria;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class MailosaurAPIClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(MailosaurAPIClient.class);

    private final String SERVER_KEY = "ggk91zzj";
    private final String API_KEY = "N7mAcqt0JsHOM62";

    public static void main (String[] args) {
        MailosaurAPIClient mailosaurAPIClient = new MailosaurAPIClient();
        LOGGER.info(mailosaurAPIClient.getMessageBodyFromInbox("HRmanager.ggk91zzj@mailosaur.io", "Job req", new Date(120, Calendar.NOVEMBER, 11, 11, 15)));
    }

    public String getMessageBodyFromInbox (String sentTo, String subject, Date searchDate) {
        return getMessageBodyFromInbox(sentTo, subject, null, searchDate);
    }

    public String getMessageBodyFromInbox (String sentTo, String subject, String body, Date searchDate) {
        for (MessageSummary messageSummary : getMessageListResult(sentTo, body).items()) {
            Date receivedDate = Date.from(Instant.parse(messageSummary.received().toString()));

            int minsDiff = (int)(searchDate.getTime() - receivedDate.getTime()) / DateTimeConstants.MILLIS_PER_MINUTE;
            System.out.println("MINS DIFF: " + minsDiff);

            boolean isTheSameTime = minsDiff < 5; // received time and sent time should have a less than 5 mins difference

            if (messageSummary.subject().contains(subject) && isTheSameTime) {
                System.out.println("====> " + messageSummary.summary());
                return messageSummary.summary();
            }
        }
        return null;
    }

    public MessageListResult getMessageListResult (String sentTo, String body) {
        SearchCriteria criteria = new SearchCriteria();
        criteria.withSentTo(sentTo);
        if (body == null) {
            criteria.withBody(body);
        }
        return getMessageList(criteria);
    }

    public Messages getMessages () {
        EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
        String proxyUsername = environmentVariables.getProperty("api.request.proxy.username") == null ? "" : environmentVariables.getProperty("api.request.proxy.username");
        String proxyPassword = environmentVariables.getProperty("api.request.proxy.password") == null ? "" : environmentVariables.getProperty("api.request.proxy.password");

        Authenticator.setDefault(
                new Authenticator() {
                    @Override
                    public PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(proxyUsername, proxyPassword.toCharArray());
                    }
                }
        );

        System.setProperty("http.proxyUser", proxyUsername);
        System.setProperty("http.proxyPassword", proxyPassword);
        System.setProperty("jdk.http.auth.tunneling.disabledSchemes", "");

        MailosaurClient client = new MailosaurClient(API_KEY);
        return client.messages();
    }

    public Message getMessage (SearchCriteria criteria) {
        try {
            return getMessages().get(SERVER_KEY, criteria);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MailosaurException e) {
            e.printStackTrace();
        }
        return null;
    }

    public MessageListResult getMessageList (SearchCriteria criteria) {
        try {
            return getMessages().search(SERVER_KEY, criteria);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MailosaurException e) {
            e.printStackTrace();
        }
        return null;
    }

}
