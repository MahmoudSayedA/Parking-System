import java.util.Scanner;

public class ParkOut {
    public static boolean parkOut(GarageManager gManager,Scanner scanner) {
        // first get the driver and vehicle spec from the customer
        IDriver driver = UserInterface.getDriverInfo(scanner);
        VehicleSpec vSpec = UserInterface.getVehicleSpecInfo(scanner);
        // get the mention vehicle
        Vehicle vehicle = vehicleManager.getSpecificVehicle(gManager.garage, vSpec, driver);
        // to check if the vehicle is already found
        if (vehicle == null) {
            UserInterface.NoVehicleMatch();
            return false;
        } else {

            // get the slot that has this vehicle
            NonEmptySlot slot = SlotManager.getSpecificSlot(gManager.garage, vehicle);
            // get total time 
            long duaration = TimeManager.calculateDuartion(slot.getStartTime(), TimeManager.getDateTimeSpec());
            // caculate fees
            feesManagement fManagement = new feesManagement(5);
            double fees = fManagement.culculateFees(duaration);
            // display for the customer
            UserInterface.displayDuaration(duaration, fManagement.getHourlyRate());
            UserInterface.displayFees(fees);
            // complete payment process 
            Payment tPayment = UserInterface.PaymentMethod(scanner);
            tPayment.pay();;
            // delete the vehicle from my vehicle list and free the slot
            String name = vehicle.getVehicleDriver().getName();
            gManager.deleteVehicle(vehicle);
            gManager.freeSpecificSlot(slot);
            System.out.println("Done!\nHave a nice day Mr. "+name+" ('=')");
            return true;
        }
    }
}