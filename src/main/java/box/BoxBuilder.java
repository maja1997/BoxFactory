package box;

import org.json.simple.JSONObject;

public class BoxBuilder {
    public static Box createBox(JSONObject box) {
        String shape = (String) box.get("shape");
        String side1colour = (String) box.get("side1colour");
        String side2colour = (String) box.get("side2colour");
        String side3colour = (String) box.get("side3colour");
        String side4colour = (String) box.get("side4colour");
        String lidPattern = (String) box.get("lidPattern");
        String boxColour = (String) box.get("boxColour");

        int width = Math.toIntExact((long) box.get("width"));
        int height = Math.toIntExact((long) box.get("height"));
        int depth = Math.toIntExact((long) box.get("depth"));

        Shape shapeOfBox = Shape.valueOf(shape.toUpperCase());
        switch (shapeOfBox) {
            case SQUARE:
                return new SquareBox(
                        lidPattern,
                        width,
                        height,
                        depth,
                        side1colour,
                        side2colour,
                        side3colour,
                        side4colour);
            case ROUND:
                return new RoundBox(
                        lidPattern,
                        width,
                        height,
                        depth,
                        boxColour
                );

            default:
                throw new IllegalArgumentException();
        }
    }
}



