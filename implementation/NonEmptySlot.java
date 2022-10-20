import java.time.LocalDateTime;

public class NonEmptySlot extends Slot{
    private int vehicleId;
    private LocalDateTime startTime;
   
    public NonEmptySlot(Dimentions dimentions, int id, int vehicleId) {
        super(dimentions, id);
        this.vehicleId = vehicleId;
        this.startTime = TimeManager.getDateTimeNow();
        
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    @Override
    public boolean suitable(Dimentions dimentions) {
        
        return false;
     }

    @Override
    public void print() {
        System.out.println("id " + this.getId());
        System.out.println("h " + this.getDimentions().getHeight());
        System.out.println("w "+this.getDimentions().getWidth());
        System.out.println("vehicle id " + this.vehicleId);
        System.out.println("+++++++++++++++++++++");

    }
    
}
