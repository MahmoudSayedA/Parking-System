import java.util.List;

public class BestFitApprotch implements SlotChoiseConfig{   
    @Override
    
    public Slot theBestSlot(List<Slot> suitableSlots) {
        int min = suitableSlots.get(0).getDimentions().sum();
        Slot bestSlot = suitableSlots.get(0);
        for (Slot s : suitableSlots) {
            int temp = s.getDimentions().sum();
            if (temp < min) {
                min = temp;
                bestSlot = s;
            }
        }
        return bestSlot;
    }
    
}
