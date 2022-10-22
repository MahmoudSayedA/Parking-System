import java.util.Scanner;

public class UserInterface {
    public static Vehicle getVehicleInfo(Scanner scanner) {

        try {
            // BufferedReader br = new BufferedReader (System.in);
            // String line = br.readLine();

            System.out.println("Enter vehicle data.");
            System.out.println("Id");
            int id = scanner.nextInt();
            System.out.println("vehicle width");
            int w = scanner.nextInt();
            System.out.println("vehicle hight");
            int h = scanner.nextInt();
            scanner.nextLine();
            Dimentions2D dimentions = new Dimentions2D(h, w);
            IDriver driver = getDriverInfo(scanner);
            VehicleSpec vSpec = getVehicleSpecInfo(scanner);
            Vehicle vehicle = new Car(id, (CarSpec) vSpec, dimentions, driver);
            return vehicle;

        } catch (Exception e) {
            System.out.println("Wrong values");
        }
        return null;
    }
    
    public static VehicleSpec getVehicleSpecInfo(Scanner scanner) {
        try {
            System.out.println("Model:");
            String model = scanner.next();
            System.out.println("modle  "+model);
            System.out.println("Color:");
            Color color = Color.SELVER;// scanner.nextLine();
            
            VehicleSpec tSpec = new CarSpec(color, model);
            return tSpec;
        }
        catch (Exception e) {
            System.out.println("Wrong values");
        }
        return null;
    }

    public static IDriver getDriverInfo(Scanner scanner) {
        try {
            System.out.println("Enter Driver information");
            System.out.println("phone:");
            String phone = scanner.next();
            scanner.nextLine();
            System.out.println("name:");
            String name =scanner.nextLine();
            System.out.println("National Id:");
            String id =scanner.next();
            IDriver tDriver = new Driver(name, phone, id);
            return tDriver;
        } catch (Exception e) {
            System.out.println("Wrong values");
        }
        return null;
    }

    public static void rejected() {
        System.out.println("We are sorry!!\nWe hava no suitable slot for you.('~')");
    }

    public static void filled() {
        System.out.println("We are sorry!!\nWe hava no empty slot for now.('~')");
    }

    public static void NoVehicleMatch() {
        System.out.println("Sorry, the no vehicle with this information.");
    }

    public static void displayFees(double fees) {
        System.out.println("The total cost = " + fees + " Pounds.");
    }

    public static void displayDuaration(long duaration, int HR) {
        System.out.println("Your car Stay Here for ");
        if (duaration < 24) {
            System.out.println(duaration);
        } else {
            System.out.println(duaration / 24 + " days and " + (duaration) % 24);
        }
        System.out.println(" hours.");

    }

    public static Payment PaymentMethod(Scanner scanner) {
        try {
            System.out.println("which method do you prafare.");
            System.out.println("1.Cash.");
            System.out.println("2.Credit card.");
            int m = scanner.nextInt();
            
            if (m == 2) {
                return (new PaymentByCreditCard());
            }
            else {
                return new PaymentByCash();
            }
        } catch (Exception e) {
            System.out.println("please just select a methon from the mentions");
        }
        return new PaymentByCash();
        
    }
}
