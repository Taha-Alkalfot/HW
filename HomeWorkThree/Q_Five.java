package HomeWorkThree;
import java.util.Scanner;
public class Q_Five {
    public static void main(String[] args) {
        
        int n1, n2, n3;
        String answer;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter Three numbers...");
        
            n1 = in.nextInt();
            n2 = in.nextInt();
            n3 = in.nextInt();
        
        answer = (n1 == n2 && n1 == n3) ? "All the same" : (n1 != n2 && n2 != n3) ? "All different" : "Neither" ;
        
        System.out.print("Answer is : " + answer);
    }
}
