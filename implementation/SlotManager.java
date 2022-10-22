import java.util.LinkedList;
import java.util.List;

public class SlotManager {
    public static List<Slot> getSuitableSlots(Slot[] mySlots, Dimentions dimentions) {/////////////
        List<Slot> suitableList = new LinkedList<Slot>();
        for (Slot slot : mySlots) {
            if (slot != null && slot.suitable(dimentions)) {
                suitableList.add(slot);
            }
        }
        return (suitableList);
    }

    public static NonEmptySlot getSpecificSlot(Garage garage, Vehicle vehicle) {
        for (Slot slot : garage.getMySlots()) {
            if (slot != null && slot instanceof NonEmptySlot) {
                if (((NonEmptySlot) slot).getVehicleId() == vehicle.getId()) {
                    return (NonEmptySlot) slot;
                }
            }
        }
        return null;
    }
    
}
