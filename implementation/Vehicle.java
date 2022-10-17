public abstract class Vehicle {
    private int id;
    private VehicleSpec vehicleSpec;
    private Dimentions dimentions;
    private IDriver vehicleDriver;

    public IDriver getVehicleDriver() {
        return vehicleDriver;
    }

    public Dimentions getDimentions() {
        return dimentions;
    }

    public Vehicle(int id, VehicleSpec vehicleSpec,Dimentions dimentions,IDriver vehiclDriver) {
        this.id = id;
        this.vehicleSpec = vehicleSpec;
        this.dimentions = dimentions;
        this.vehicleDriver = vehiclDriver;
    }

    public VehicleSpec getSpec() {
        return this.vehicleSpec;
    }

    public int getId() {
        return this.id;
    }

   

}