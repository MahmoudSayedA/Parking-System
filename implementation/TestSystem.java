import java.util.Scanner;


public class TestSystem {
    static GarageManager parkIn(GarageManager gManager,SlotChoiseConfig mode) {
        Vehicle vehicle = UserInterface.getVehicleInfo();

        gManager.addVehicel(vehicle,mode);
        
        for (Slot slot : gManager.garage.getMySlots()) {
            if (slot != null)
            slot.print();
        }
        return gManager;
    }

    final static int numOfSlots = 10;
    public static void main(String[] args) {
       

        System.out.println("New Custmoer enterd!!\nWelcome");
        try (Scanner scanner = new Scanner(System.in)) {
            int selection = 1;
            Slot[] mySlots = new Slot[numOfSlots];
            Slot s2 = new EmptySlot(new Dimentions2D(1, 5), 1);
            Slot s4 = new EmptySlot(new Dimentions2D(7, 3), 3);
            Slot s5 = new EmptySlot(new Dimentions2D(4, 8), 4);
            Slot s6 = new EmptySlot(new Dimentions2D(2, 7), 5);
            Slot s7 = new EmptySlot(new Dimentions2D(9, 5), 6);
            EmptySlot s1 = new EmptySlot(new Dimentions2D(1, 3), 0);
            NonEmptySlot s3 = new NonEmptySlot(new Dimentions2D(4, 3), 2, 1452);
            mySlots[0] = s1;
            mySlots[1] = s2;
            mySlots[2] = s3;
            mySlots[3] = s4;
            mySlots[4] = s5;
            mySlots[5] = s6;
            mySlots[6] = s7;
            Garage garage = new Garage(7, mySlots);
            GarageManager gManager = new GarageManager(garage);
            SlotChoiseConfig mode = new BestFitApprotch();
            if (selection == 1) {
                gManager = parkIn(gManager, mode);
            } else if (selection == 2) {
                System.out.println("we are working on it (^_^)");
            } else {

            }
        } catch (Exception e) {
            System.out.println("something wrong");
        }
     }
}
