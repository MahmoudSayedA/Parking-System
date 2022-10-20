import java.util.List;

public class GarageManager {
    private int freeSlots;
    Garage garage;
    public GarageManager(Garage garage) {
        this.freeSlots = garage.getNumOfSlots();
        this.garage = garage;
    }
    public int getFreeSlots() {
        return freeSlots;
    }
    
    Boolean isFilled() {
        return this.freeSlots == 0;
    }
    public boolean addVehicel(Vehicle vehicle,SlotChoiseConfig sConfig) {
        if (isFilled()) {
            UserInterface.filled();
            return false;
        }
        else {
            List<Slot> suiableSlots = SlotManager.getSuitableSlots(garage.getMySlots(), vehicle.getDimentions());
            if (suiableSlots.isEmpty()) {
                UserInterface.rejected();
                return false;
            }
            int slotId = sConfig.theBestSlot(suiableSlots);

             this.garage.getMyVehicles().add(vehicle);
       
            Slot temp = this.garage.getMySlots()[slotId];
            this.garage.getMySlots()[slotId]=new NonEmptySlot(temp.getDimentions(), slotId, vehicle.getId());
            // as the call is by value ..so we overrinde changes manually
            freeSlots--;
            return true;
        }
    }
    
}
