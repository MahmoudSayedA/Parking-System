import java.util.LinkedList;
import java.util.List;

public class SlotManager {
    // static public List<EmptySlot> getEmptySlots(List<Slot> mySlots) {
    //     List<EmptySlot> freeSlots = new LinkedList<EmptySlot>();
    //     for (Slot s : mySlots) {
    //         if (s instanceof EmptySlot) {
    //             freeSlots.add((EmptySlot) s);
    //         }
    //     }
    //     return freeSlots;
    // }
    public static List<Slot> getSuitableSlots(Slot[] mySlots, Dimentions dimentions) {/////////////
        List<Slot> suitableList = new LinkedList<Slot>();
        for (Slot slot : mySlots) {
            if (slot!=null && slot.suitable(dimentions)) {
                suitableList.add(slot);
            }
        }
        return (suitableList);
    }
    
}

