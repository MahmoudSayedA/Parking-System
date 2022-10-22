import java.util.Scanner;


public class TestSystem {

    final static int numOfSlots = 10;

    public static void main(String[] args) {
            System.out.println("New Custmoer enterd!!\nWelcome");
        Slot[] mySlots = new Slot[numOfSlots];
        Slot s2 = new EmptySlot(new Dimentions2D(1, 5), 1);
        Slot s4 = new EmptySlot(new Dimentions2D(7, 3), 3);
        Slot s5 = new EmptySlot(new Dimentions2D(4, 8), 4);
        Slot s6 = new EmptySlot(new Dimentions2D(2, 7), 5);
        Slot s7 = new EmptySlot(new Dimentions2D(9, 5), 6);
        EmptySlot s1 = new EmptySlot(new Dimentions2D(1, 3), 0);
        Slot s3 = new EmptySlot(new Dimentions2D(4, 3), 2);
        mySlots[0] = s1;
        mySlots[1] = s2;
        mySlots[2] = s3;
        mySlots[3] = s4;
        mySlots[4] = s5;
        mySlots[5] = s6;
        mySlots[6] = s7;
        Garage garage = new Garage(numOfSlots, mySlots);
        GarageManager gManager = new GarageManager(garage);
        SlotChoiseConfig mode = new BestFitApprotch();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1.park in\n2.park out\n3.exit");
                int selection = scanner.nextInt();
                if (selection == 1) {
                    ParkIn.parkIn(gManager, mode,scanner);
                } else if (selection == 2) {
                    ParkOut.parkOut(gManager, scanner);
                } else if (selection == 3) {
                    break;
                }
            }

        }
        catch (Exception e) {
            System.out.println("something wrong");
        }
      }
    
}
