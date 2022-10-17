public abstract class Slot {
    private Dimentions dimentions;
    private int slotId;
    
    public Slot(Dimentions dimentions, int id) {
        this.dimentions = dimentions;
        this.slotId = id;
    }
    public Dimentions getDimentions() {
        return dimentions;
    }
    public void setDimentions(Dimentions dimentions) {
        this.dimentions = dimentions;
    }
    public int getId() {
        return slotId;
    }
    public void setId(int id) {
        this.slotId = id;
    }

    public abstract boolean suitable(Dimentions slot);

}
