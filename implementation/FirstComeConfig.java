import java.util.List;

public class FirstComeConfig implements SlotChoiseConfig {

    @Override
    public Slot theBestSlot(List<Slot> suitableSlots) {
        return suitableSlots.get(0);
    }

    
}
