import java.util.List;

public class BestFitApprotch implements SlotChoiseConfig{   
    @Override
    
    public int theBestSlot(List<Slot> suitableSlots) {
        int min = suitableSlots.get(0).getDimentions().sum();
        int bestId = suitableSlots.get(0).getId();
        for (Slot s : suitableSlots) {
            int temp = s.getDimentions().sum();
            if (temp < min) {
                min = temp;
                bestId = s.getId();
            }
        }
        return bestId;
    }
    
}
