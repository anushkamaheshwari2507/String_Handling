package STRINGS;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = input.nextLine();
        int upper = 0, lower = 0;
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (k >= 65 && k <= 90)
                upper = upper + k;
            else
                lower = lower + k;
        }
        System.out.println("Absolute Weight = " + (upper - lower));
    }
}

