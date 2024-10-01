import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println("Enetr a number:");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int rev = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;

            num = num / 10;
            
        }
        System.out.println(" The Reverse of s Number:"+ rev);

    }
    
}
