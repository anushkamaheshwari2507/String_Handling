package STRINGS;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER STRING :-");
        String s = sc.nextLine();
        System.out.println("ENTER THE INDEX ");
        int n = sc.nextInt();
        System.out.println("Sub String :-" + s.substring(n));
    }
}

