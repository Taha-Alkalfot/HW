package HomeWorkThree;
import java.util.Scanner;
public class Q_Three {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.print("Enter any number : ");
        int number = in.nextInt();
        
        if(number > 0){
            System.out.println("Positive");
        }
        else if(number == 0){
            System.out.println("Zero");
        }
        else {System.out.println("Negative");}
    }
}
