package STRINGS;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner((System.in));
        s = sc.nextLine();
        System.out.print("index:\t");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nchars:\t");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + "\t");
        }
    }
}

