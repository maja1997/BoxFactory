package box;


public class SquareBox extends Box {
    private final String side1Colour;
    private final String side2Colour;
    private final String side3Colour;
    private final String side4Colour;

    public SquareBox(
            String lidPattern,
            int width,
            int height,
            int depth,
            String side1Colour,
            String side2Colour,
            String side3Colour,
            String side4Colour
    ) {
        super(lidPattern, width, height, depth);
        this.side1Colour = side1Colour;
        this.side2Colour = side2Colour;
        this.side3Colour = side3Colour;
        this.side4Colour = side4Colour;
    }

    @Override
    public void getLidPattern() {
        if (lidPattern == null) {
            lidPattern = side1Colour;
        }
        System.out.println("Lid pattern: " + this.lidPattern);
    }

    @Override
    protected void getBoxShape() {
        System.out.println("Shape of the box: Square");
    }

    @Override
    public void getBoxColour() {
        System.out.println("Box side colours: ");
        System.out.println("Side 1: " + this.side1Colour);
        System.out.println("Side 2: " + this.side2Colour);
        System.out.println("Side 3: " + this.side3Colour);
        System.out.println("Side 4: " + this.side4Colour);
    }

}
