import java.util.Scanner;
public class Hackathon1c {
    public static int calculateTotal(int morningUsage, int eveningUsage){
        return morningUsage + eveningUsage;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the morning water usage in litres: ");
        int morningUsage = scanner.nextInt();
        System.out.print("Enter the evening water usage in litres: ");
        int eveningUsage = scanner.nextInt();
        int totalUsage = calculateTotal(morningUsage, eveningUsage);
        System.out.println("Total water usage: " + totalUsage + " litres");
    }
}
