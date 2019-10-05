package STRINGS;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = input.nextLine();
        int upperweight = 0;
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            if (k >= 65 && k <= 90)
                upperweight = upperweight + k;
        }
        System.out.println("Upper Weight = " + upperweight);
    }
}

