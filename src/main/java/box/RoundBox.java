package box;

public class RoundBox extends Box {
    private final String boxColour;

    public RoundBox(
            String lidPattern,
            int width,
            int height,
            int depth,
            String boxColour
    ) {
        super(lidPattern, width, height, depth);
        this.boxColour = boxColour;
    }

    @Override
    protected void getBoxShape() {
        System.out.println("Shape of the box: Round");
    }

    @Override
    public void getBoxColour() {
        System.out.println("Color of the box: " + this.boxColour);
    }

    @Override
    public void getLidPattern() {
        if (lidPattern == null) {
            lidPattern = boxColour;
        }
        System.out.println("Lid pattern: " + this.lidPattern);
    }
}
