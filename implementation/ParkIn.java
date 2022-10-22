import java.util.Scanner;

public class ParkIn {
    public static boolean parkIn(GarageManager gManager, SlotChoiseConfig mode, Scanner scanner) {
        // take information from the customer
        Vehicle vehicle = UserInterface.getVehicleInfo(scanner);
        // check if the information has a problem
        if (vehicle == null) {
            System.out.println("wrong informations");
            return false;
        }
        else {
            // add the vehicle to my vehicle list 
            Slot slot = gManager.addVehicel(vehicle, mode);
            // to check if there is no available slot for this vehicle 
            if (slot == null) {
                return false;
            }
            else {
                // mark the mention slot as non empty
                Slot temp = gManager.garage.getMySlots()[slot.getId()];
                gManager.garage.getMySlots()[temp.getId()] = 
                        new NonEmptySlot(temp.getDimentions(), temp.getId(), vehicle.getId());
                //tell the custmer for the suitable slot
                gManager.garage.getMySlots()[temp.getId()].print();
                // for (Slot s : gManager.garage.getMySlots()) {
                //     if (s != null)
                //         s.print();
                // }
                return true;
            }
        }
    }
}
