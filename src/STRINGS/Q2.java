package STRINGS;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("VALUE OF STRING :-");
        String s = input.nextLine();
        System.out.println("ENTER THE VALUE OF INDEX ");
        int K = input.nextInt();
        System.out.println("Sub String :-" + s.substring(K));
    }
}

