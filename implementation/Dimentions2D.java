public class Dimentions2D extends Dimentions {
    public Dimentions2D(int height, int width) {
        super(height, width);
    }

    @Override
    public boolean match(Dimentions dimentions) {
       
        return this.equals(dimentions);
    }

    @Override
    public boolean isSuitableFor(Dimentions dimentions) {
        
        return this.getHeight()>=dimentions.getHeight()&&
                this.getWidth() >= dimentions.getWidth();
    }

    @Override
    public boolean isBigger(Dimentions dimentions) {
        
        return false;
    }

    @Override
    public int sum() {
        
        return (this.getHeight() + this.getWidth());
    }
   
}
