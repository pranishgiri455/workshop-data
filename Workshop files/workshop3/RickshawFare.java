import java.util.Scanner;
public class RickshawFare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------- RickshawFare Calculator -----------");
        
        System.out.print("Enter your Travelled distance (km): ");
        double distance = sc.nextDouble();
        
        System.out.print("Travelled Time (min): ");
        int minutes = sc.nextInt();
        
        System.out.print("Local Customer? (true/false): ");
        boolean local = sc.nextBoolean();
    
        boolean night = sc.nextBoolean();     
      
        double fare = 25;
        double KM = 10;
        double Min = 5;
        
        double subTotal = fare + (KM * distance) + (minutes * Min);
        
        double nightsur = night ? (subTotal * 0.20) : 0;
        
        double discount = (local && distance > 2) ? (subTotal * 0.10) : 0;
 
        double grandTotal = subTotal + nightsur - discount;
 
        System.out.println("\n----------------------");
        System.out.println("Total Fare Price: " + grandTotal);
        System.out.println("Come Again For Happy Journey Have a Good Day");
        System.out.println("------------------------");
        
        sc.close();

    }
}