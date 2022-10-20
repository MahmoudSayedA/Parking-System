public class EmptySlot extends Slot{
    public EmptySlot(Dimentions dimentions, int id) {
        super(dimentions, id);
    }
    @Override
    public boolean suitable(Dimentions dimentions) {
        
        return this.getDimentions().isSuitableFor(dimentions);
    }
    @Override
    public void print() {
        System.out.println("id " + this.getId());
        System.out.println("h " + this.getDimentions().getHeight());
        System.out.println("w "+this.getDimentions().getWidth());
        System.out.println("________________________");
    }
}
