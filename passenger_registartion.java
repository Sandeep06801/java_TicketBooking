import java.util.*;
import java.util.Random;

public class passenger_registartion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int passenger_ID = 00000000 + new Random().nextInt(99999999);
        System.out.println("Passenger ID: "+passenger_ID);
        String passenger_name = sc.nextLine();
        passenger_name = passenger_name.substring(0,Math.min(passenger_name.length(),50));
        System.out.println("Passenger Name: "+passenger_name);
        String email = sc.nextLine();
        System.out.println("Email: "+email);
        String password = sc.nextLine();
        password = password.substring(0,Math.min(password.length(),30));
        System.out.println("Password: "+password);
        String address = sc.nextLine();
        address = address.substring(0,Math.min(address.length(),100));
        System.out.println("Address: "+address);
        long contact_number = getInput(sc);     
        System.out.println("Contact Number: "+contact_number);   
        String[] array = new String[6];
        array[0] = String.valueOf(passenger_ID);
        array[1] = String.valueOf(passenger_name);
        array[2] = String.valueOf(email);
        array[3] = String.valueOf(password);
        array[4] = String.valueOf(address);
        array[5] = String.valueOf(contact_number);
        System.out.print("[");
        for(int i = 0;i<array.length;i++) {
            System.out.print(array[i]);
            if(i<array.length -1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println("\nPassenger Registration is Successful.");
    }
    public static long getInput(Scanner sc){
        int input = 0;
        while(true) {
            input = sc.nextInt();
            if(input > 10 || input<10){
                break;
            }
        }
        return input;
    }
}