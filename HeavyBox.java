public class HeavyBox {
    private int width;
    private int height;
    private int depth;
    private int weight;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", weight=" + weight +
                '}';
    }
}
