public class vehicleManager {
    public static boolean IsItHisVehicle(Vehicle vehicle, VehicleSpec vSpec, IDriver driver) {
        return (vehicle.getSpec().match(vSpec) &&
                vehicle.getVehicleDriver().match(driver));
    }
}
//second sprint
