import java.util.List;

public class GarageManager {
    private int freeSlots;
    Garage garage;

    public Garage getGarage() {
        return garage;
    }

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

    public Slot addVehicel(Vehicle vehicle, SlotChoiseConfig sConfig) {
        if (isFilled()) {
            UserInterface.filled();
            return null;
        } else {
            List<Slot> suiableSlots = SlotManager.getSuitableSlots(garage.getMySlots(), vehicle.getDimentions());
            if (suiableSlots.isEmpty()) {
                UserInterface.rejected();
                return null;
            }
            Slot slot = sConfig.theBestSlot(suiableSlots);

            this.garage.getMyVehicles().add(vehicle);
            freeSlots--;
            return slot;
        }
    }
    
    public boolean deleteVehicle(Vehicle vehicle) {
        this.freeSlots++;
        return this.garage.getMyVehicles().remove(vehicle);
    }

    public boolean freeSpecificSlot(Slot slot) {
        this.garage.getMySlots()[slot.getId()] = new EmptySlot(slot.getDimentions(), slot.getId());
        return true;
    }
   

}
