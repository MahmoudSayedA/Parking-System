import java.util.LinkedList;
import java.util.List;

public class Garage {
    private int numOfSlots;
    private List<Vehicle> myVehicles;
   
    private Slot[] mySlots;


    public Garage(int numOfSlots,Slot[]grageSlots) {
        this.numOfSlots = numOfSlots;
        //this.mySlots = new ArrayList<Slot>();
        this.setMySlots(grageSlots);
        this.myVehicles = new LinkedList<Vehicle>();
    }

    public List<Vehicle> getMyVehicles() {
        return myVehicles;
    }
    public void setMyVehicles(List<Vehicle> myVehicles) {
        this.myVehicles = myVehicles;
    }
    public Slot[] getMySlots() {
        return mySlots;
    }
    public int getNumOfSlots() {
        return numOfSlots;
    }

    public void setNumOfSlots(int numOfSlots) {
        this.numOfSlots = numOfSlots;
    }
    public void setMySlots(Slot[]mySlots) {
        this.mySlots = mySlots;
    }

}
