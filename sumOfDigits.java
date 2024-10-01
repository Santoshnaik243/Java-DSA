import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = s2.nextInt();
        int ans = 0; 
        //int last = 0;                                       
        while (num > 0) {
            ans += num % 10;
           // ans = ans + last;
            num = num / 10;

            
        }
        System.out.println("Sum of Dogits:"+ ans);
    }
    
}


// 658 % 10 = 8
