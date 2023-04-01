import java.util.Scanner;
//TO import a whole package; use import java.util.*;

public class MyClass{
    public static void  main (String[]args){
        Scanner myObj= new Scanner (System.in);
        Scanner.out.println ("Enter username");
        String username =myObj.nextLine();
        System.out.println ("Username is: " + userName);
    }   
}


/*package mypack;
Class MyPackageClass{
    public static void main (String[]args){
        System.out.println("This is my package!");
    }
}*/

