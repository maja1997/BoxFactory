package json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public final class JsonLoader {

    private JsonLoader() { }

    public static JSONObject loadBoxOrder(String fileName) {
        JSONParser jsonParser = new JSONParser();
        JSONObject parsedObject = null;
        try (FileReader reader = new FileReader(fileName)) {
            parsedObject = (JSONObject) jsonParser.parse(reader);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return parsedObject;
    }
}
