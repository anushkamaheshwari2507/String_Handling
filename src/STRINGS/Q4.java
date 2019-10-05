package STRINGS;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String g = "";
        int c = 1;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == 'a' || a == 'A' || a == 'E' || a == 'e' || a == 'I' || a == 'i' || a == 'O' || a == 'o' || a == 'U' || a == 'u') {
                if (c == 1)
                    g = g + "*";
                else if (c == 2)
                    g = g + "^";
                else if (c == 3)
                    g = g + "!";
                c++;
            } else
                g = g + a;
            if (c == 4)
                c = 1;
        }
        System.out.println("New Modified String :-" + g);
    }
}

