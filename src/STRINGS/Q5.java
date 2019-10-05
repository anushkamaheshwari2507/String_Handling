package STRINGS;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = input.nextLine();
        System.out.println("Enter a Substring Of The Entered String :-");
        String sub = input.nextLine();
        System.out.println("Enter A New Substring :-");
        String newSub = input.nextLine();
        System.out.println(s.replace(sub, newSub));
    }
}

