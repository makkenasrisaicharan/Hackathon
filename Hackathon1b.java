import java.util.Scanner;
public class Hackathon1b {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the water consumed in litres: ");
        double c = scanner.nextDouble();
        int bill;
        if (c<= 500){
            if(c>0){
                bill = 100;
            } else {
                bill = 0;
            }
        } else {
            bill = 200;
        }
        System.out.println("Water bill: Rs" + bill);
    }
    
}
