package STRINGS;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = input.nextLine().toLowerCase();
        System.out.println("Enter A Character :- ");
        char k = input.nextLine().toLowerCase().charAt(0);
        System.out.println("Indexes Of Given Character :- ");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k)
                System.out.println(i);
        }
    }
}

