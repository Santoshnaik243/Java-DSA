import java.util.*;



public class CountDigit {
    public static void main(String[] args) {
        
    
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter number:");
    int n = s1.nextInt();
     int numberOfDigits = 0;
    while(n > 0){
        n = n/10;
        numberOfDigits ++;
        
    }
    System.out.println("Number of Digits:" + numberOfDigits);
    
   }
}
