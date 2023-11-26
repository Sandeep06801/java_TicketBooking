import java.util.*;

public class ticket_booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long passenger_ID = 00000000 + new Random().nextInt(99999999);
        long pnr_no = 00000000 + new Random().nextInt(99999999);
        System.out.println("Passenger ID: "+passenger_ID);
        System.out.println("PNR NO: "+pnr_no);
        String travel_date = sc.nextLine();
        String source = sc.nextLine();
        String destination = sc.nextLine();
        System.out.println("Status should be in : ");
        System.out.println("1.New");
        System.out.println("2.Confirm");
        System.out.println("3.Hold");
        String status = sc.nextLine();
        switch(status) {
            case "New":
                System.out.println("New");
                break;
            case "Confirm":
                System.out.println("Confirm");
                break;
            case "Hold":
                System.out.println("Hold");
                break;
            default:
                System.out.println("Enter valid status");
                break;
        }
        System.out.println("Seat Preference should be in : ");
        System.out.println("1.Middle");
        System.out.println("2.Aisle");
        String seat_preference = sc.nextLine();
        switch(seat_preference) {
            case "Middle":
                System.out.println("Middle");
                break;
            case "Aisle":
                System.out.println("Aisle");
                break;
            default:
                System.out.println("Enter valid status");
                break;
        }
        System.out.println("Meal Preference should be in : ");
        System.out.println("1.Veg");
        System.out.println("2.Non-Veg");
        String meal_preference = sc.nextLine();
        switch(meal_preference) {
            case "Veg":
                System.out.println("Veg");
                break;
            case "Non-Veg":
                System.out.println("Non-Veg");
                break;
            default:
                System.out.println("Enter valid status");
                break;
        }
        String[] array = new String[8];
        array[0] = String.valueOf(passenger_ID);
        array[1] = String.valueOf(pnr_no);
        array[2] = String.valueOf(travel_date);
        array[3] = String.valueOf(source);
        array[4] = String.valueOf(destination);
        array[5] = String.valueOf(status);
        array[6] = String.valueOf(seat_preference);
        array[7] = String.valueOf(meal_preference);

        System.out.print("[");
        for(int i = 0;i<array.length;i++) {
            System.out.print(array[i]);
            if(i<array.length -1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println("\nTicket Booked successfully, Happy Journey...");
    }
}
