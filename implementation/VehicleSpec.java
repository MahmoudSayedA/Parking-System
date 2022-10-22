public abstract class VehicleSpec {

    private Color color;
    private String modle;

    
    public VehicleSpec(Color color, String modle) {
        this.color = color;
        this.modle = modle;
    }

 
    public Color getColor() {
        return this.color;
    }
    
    public String getModel() {
        return this.modle;
    }

    public boolean match(VehicleSpec vSpec) {
        return 
        this.color == vSpec.getColor() &&
        this.modle.equals(vSpec.getModel());
    }
    
}
