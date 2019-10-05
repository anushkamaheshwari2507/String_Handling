package STRINGS;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = sc.nextLine();
        int upper = 0, lower = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a >= 65 && a <= 90)
                upper = upper + a;
            else
                lower = lower + a;
        }
        System.out.println("Absolute Weight = " + (upper - lower));
    }
}

