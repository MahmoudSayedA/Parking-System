public class Dimentions2D extends Dimentions {
    public Dimentions2D(int height, int width) {
        super(height, width);
    }

    @Override
    public boolean match(Dimentions dimentions) {
       
        return this.equals(dimentions);
    }
   
}
