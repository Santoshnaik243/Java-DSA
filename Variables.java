public class Variables {
    public static void main(String[] args) {
        int x;
        x=5;
        System.out.println(x);                    //whitespace is not permitted in variable names.
        x=400;                                    //keyword cannot be used as a variabl
        System.out.println(x);                    //variable names should not begin with a number
        System.out.println(x+1);                  //variables are written in camelCase
        x=x+3;                                    //variables preferred to give meaningful name                 
        System.out.println(x);                    //all are lowercase if variable name is one word
        x=x-3;
        System.out.println(x);
        int a=5;
        int b=3;                                          //Identifiers
        System.out.println(a+b);           //all identifiers should begin with a letter (A to Z or a to z),currency character($),or an underscore(_).
        System.out.println(a-b);           //After the first character ,identifier can have any combination of character.
        System.out.println(a*b);          //A keyword cannot be used as an identifier.
        System.out.println(a/b);           //identifier are case sensitive

    }
}
