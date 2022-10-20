import java.util.List;

public class FirstComeConfig implements SlotChoiseConfig {

    @Override
    public int theBestSlot(List<Slot> suitableSlots) {
        return suitableSlots.get(0).getId();
    }

    
}
