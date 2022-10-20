public abstract class VehicleSpec {

    private String color, modle;

    
    public VehicleSpec(String color, String modle) {
        this.color = color;
        this.modle = modle;
    }

 
    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.modle;
    }

    public boolean match(VehicleSpec vSpec) {
        return 
        this.color == vSpec.getColor() &&
        this.modle == vSpec.getModel();
    }
    
}
