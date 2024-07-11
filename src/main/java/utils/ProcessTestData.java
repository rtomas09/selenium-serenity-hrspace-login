package utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProcessTestData {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessTestData.class);
    private static final String JSON_FILES_PARENT_DIR = "src/main/java/testData";
    private static final String RAW_JSON_TEXT_FILE_DIR = "test_data.txt";

    public static void main (String args[]) {
        try {
            String input;
            String jsonStr;
            if (args.length == 0) {
                input = readFileAsString(RAW_JSON_TEXT_FILE_DIR);
                jsonStr = input.replaceAll("\\\\", "").replaceAll("\n", "");
                jsonStr = jsonStr.substring(1, jsonStr.length() - 1);
                jsonStr = jsonStr.replaceAll("\",\"", ",");
                jsonStr = "[" + jsonStr + "]";
            } else {
                input = args[0];
                jsonStr = input.replaceAll("\\\\", "").substring(1, input.length() - 1).replaceAll("\n", "");
            }

            JsonParser jsonParser = new JsonParser();
            JsonElement element = jsonParser.parse(jsonStr);

            for (JsonElement jsonElement : element.getAsJsonArray()) {
                writeToJsonFile(JSON_FILES_PARENT_DIR, jsonElement);
            }
        } catch (Exception e) {
            LOGGER.error("An error occured while modifying test data!");
            LOGGER.error(e.toString());
        }
    }

    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static String mergeJsonArrayObjects (JsonArray jsonArray) {
        List<String> jsonStrList = new ArrayList<>();
        for (JsonElement jsonElement : jsonArray) {
            jsonStrList.add(jsonElement.toString().substring(1, jsonElement.toString().length() - 1));
        }
        String jsonStrListStr = jsonStrList.toString();
        return "{" + jsonStrListStr.substring(1, jsonStrListStr.length() - 1) + "}";
    }

    public static void writeToJsonFile (String parentDir, JsonElement jsonElement) {
        JsonObject jsonObject = jsonElement.getAsJsonArray().get(0).getAsJsonObject();
        File jsonFile = new File(parentDir + "/" + jsonObject.keySet().toArray()[0] + ".json");
        FileWriter file = null;
        String jsonStrToWrite = mergeJsonArrayObjects(jsonObject.get(jsonObject.keySet().toArray()[0].toString()).getAsJsonArray());
        LOGGER.info(jsonStrToWrite);
        try {
            file = new FileWriter(jsonFile.getAbsoluteFile());
            file.write(jsonStrToWrite);
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                file.flush();
                file.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static JsonArray getJsonArray (String[] jsonArrStr) {
        JsonArray jsonArray = new JsonArray();
        for (String x : jsonArrStr){
            JsonParser jsonParser = new JsonParser();
            JsonElement element = jsonParser.parse(x);
            jsonArray.add(element.getAsJsonArray().get(0));
        }
        return jsonArray;
    }

    public static String[] processInputJsonString (String jsonStr) {
        jsonStr = jsonStr.replaceAll("\\\\", "");
        String[] scenarioJsonStrs = jsonStr.substring(1, jsonStr.length()-1).split("\",\"");
        return scenarioJsonStrs;
    }
}
