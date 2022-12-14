public abstract class Dimentions {
    private int height, width;

    public Dimentions(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
       
        return this.width;
    }

    public abstract boolean match(Dimentions dimentions);

    public abstract boolean isSuitableFor(Dimentions dimentions);

    public abstract boolean isBigger(Dimentions dimentions);

    public abstract int sum();
}
