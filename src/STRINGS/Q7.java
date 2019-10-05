package STRINGS;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A  String :-");
        String s = sc.nextLine();
        int totalweight = 0;
        for (int i = 0; i < s.length(); i++) {
            totalweight = totalweight + s.charAt(i);
        }
        System.out.println("Total Weight = " + totalweight);
    }
}

