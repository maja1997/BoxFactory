package box;

public abstract class Box {
    protected String lidPattern;
    private final int width;
    private final int height;
    private final int depth;

    public Box(
            String lidPattern,
            int width,
            int height,
            int depth
    ) {
        this.lidPattern = lidPattern;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public final void printBox() {
        getBoxShape();
        getBoxColour();
        getLidPattern();
        getWidth();
        getHeight();
        getDepth();
    }

    public void getLidPattern() {
        System.out.println("Lid pattern: " + this.lidPattern);
    }

    public void getWidth() {
        System.out.println("Width: " + this.width);
    }

    public void getHeight() {
        System.out.println("Height: " + this.height);
    }

    public void getDepth() {
        System.out.println("Depth: " + this.depth);
    }

    protected abstract void getBoxShape();

    protected abstract void getBoxColour();

}
