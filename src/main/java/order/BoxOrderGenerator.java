package order;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public final class BoxOrderGenerator {

    private static final Random random = new Random();
    private static final String[] shapes = {"round", "square"};
    private static final String[] colors = {"red", "blue", "black", "gold"};
    private static final String[] lidPattern = {"christmas", "love", "birthday", null};


    private BoxOrderGenerator() {
    }

    public static void createBoxOrder() {
        String shape = getRandomValue(shapes);
        JSONObject generatedBoxOrder = createBoxOrder(shape);
        try (FileWriter file = new FileWriter("boxes.json")) {

            file.write(generatedBoxOrder.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JSONObject createBoxOrder(String shape) {
        JSONObject boxOrder = new JSONObject();
        switch (shape) {
            case "square":
                boxOrder.put("side1colour", getRandomValue(colors));
                boxOrder.put("side2colour", getRandomValue(colors));
                boxOrder.put("side3colour", getRandomValue(colors));
                boxOrder.put("side4colour", getRandomValue(colors));
                break;
            case "round":
                boxOrder.put("boxColour", getRandomValue(colors));
                break;
            default:
                break;
        }
        boxOrder.put("shape", shape);
        boxOrder.put("lidPattern", getRandomValue(lidPattern));
        boxOrder.put("width", new Random().nextInt(81));
        boxOrder.put("height", new Random().nextInt(41));
        boxOrder.put("depth", new Random().nextInt(51));

        return boxOrder;
    }

    public static String getRandomValue(String[] array) {
        return array[random.nextInt(array.length)];
    }
}
