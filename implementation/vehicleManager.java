public class vehicleManager {
    public static boolean IsItHisVehicle(Vehicle vehicle, VehicleSpec vSpec, IDriver driver) {
        return (vehicle.getSpec().match(vSpec) &&
                vehicle.getVehicleDriver().match(driver));
    }

    public static Vehicle getSpecificVehicle(Garage garage, VehicleSpec vSpec, IDriver driver) {
        for (Vehicle vehicle : garage.getMyVehicles()) {
            if (vehicle != null && vehicleManager.IsItHisVehicle(vehicle, vSpec, driver)) {
                return vehicle;
            }
        }
        return null;
    }

   

}
