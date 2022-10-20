import java.util.Scanner;

public class UserInterface {
    public static Vehicle getVehicleInfo() {
        
        try (Scanner scanner = new Scanner(System.in)) {
            IDriver driver = getDriverInfo();
            System.out.println("temp");
            // BufferedReader br = new BufferedReader (System.in);
            // String line = br.readLine();

            System.out.println("Enter vehicle data.");
            System.out.println("Id");
            int id = 77;//scanner.nextInt();
            System.out.println("vehicle width");
            int w = 2;//scanner.nextInt();
            System.out.println("vehicle hight");
            int h = 1;//scanner.nextInt();
            Dimentions2D dimentions=new Dimentions2D(h, w);
            VehicleSpec vSpec=getVehicleSpecInfo();
            Vehicle vehicle = new Car(id, (CarSpec) vSpec, dimentions, driver);
            scanner.close();
            return vehicle;
        
    }catch(Exception e)
        {
        System.out.println("Wrong values");
        }return null;
    }


   
    private static VehicleSpec getVehicleSpecInfo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Color:");
            String color = "gadg";// scanner.next();
            System.out.println("Model:");
            String model = "5478";// scanner.next();
            scanner.close();
            VehicleSpec tSpec = new CarSpec(color, model);
            return tSpec;
        }
        catch (Exception e) {
            System.out.println("Wrong values");
        }
        return null;
    }

    private static IDriver getDriverInfo() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Driver information");
            System.out.println("phone:");
            String phone = "012";// s.next();
            System.out.println("name:");
            String name = "mah";// s.next();
            System.out.println("National Id:");
            String id = "147852";// s.next();
            System.out.println("done");
            s.close();
            IDriver tDriver = new Driver(name, phone, id);
            return tDriver;
        } catch (Exception e) {
            System.out.println("Wrong values");
        }
        return null;
    }

    public static void rejected() {
        System.out.println("We are sorry!!\nWe hava no suitable slot for you");
    }
    public static void filled() {
        System.out.println("We are sorry!!\nWe hava no empty slot for now");
    }

}
