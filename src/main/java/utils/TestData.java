package utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;


public class TestData {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestData.class);
    JSONObject jsonObject;

    public TestData (String scenario) {
        jsonObject = getJsonObj(scenario);
    }

    private JSONObject getJsonObject() {
        return jsonObject;
    }

    public String getString (String key) {
        return (String) getJsonObject().get(key);
    }

    public int getInt (String key) {
        try {
            return (int) ((long) getJsonObject().get(key));
        } catch (Exception e) {
            LOGGER.error(e.toString());
            try {
                return Integer.parseInt((String) getJsonObject().get(key));
            } catch (Exception e2) {
                LOGGER.error(e2.toString());
            }
        }
        return -1;
    }

    private static JSONObject getJsonObj(String scenario) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("src/main/java/testData/EmployeeData/" + scenario + ".json"));
            JSONObject jsonObject = (JSONObject) obj;
            return jsonObject;
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return null;
    }

    public String[] getStringArray(String key) {
        JSONArray jsonArray = (JSONArray) getJsonObject().get(key);
        String[] array = new String[jsonArray.size()];
        for (int i = 0;  i < jsonArray.size(); i++) {
            array[i] = jsonArray.get(i).toString();
        }
        return array;
    }

    public int[] getIntArray(String key) {
        JSONArray jsonArray = (JSONArray) getJsonObject().get(key);
        int[] array = new int[jsonArray.size()];
        for (int i = 0;  i < jsonArray.size(); i++) {
            array[i] = Integer.parseInt(jsonArray.get(i).toString());
        }
        return array;
    }

    public Map<String, Boolean> getTestSteps() {
        Map<String, Boolean> testOrderMap = new HashMap<>();
        JSONObject jsonObject = (JSONObject) getJsonObject().get("TEST_STEPS");
        if (jsonObject != null) {
            for (Object key : jsonObject.keySet()) {
                testOrderMap.put(key.toString(), Boolean.parseBoolean(jsonObject.get(key).toString()));
            }
        }
        return testOrderMap;
    }
}
