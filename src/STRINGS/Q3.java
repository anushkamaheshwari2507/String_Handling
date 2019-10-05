package STRINGS;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);
        System.out.println("Enter  the value of String :-");
        String s = INPUT.nextLine();
        System.out.println("Enter the value of Character :-");
        char K = INPUT.nextLine().charAt(0);
        System.out.println("String Is :- " + s.replace(K, '*'));
    }
}

