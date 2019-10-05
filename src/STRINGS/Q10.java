package STRINGS;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A String :-");
        String s = input.nextLine();
        System.out.println("Enter A Character :-");
        char k = input.nextLine().charAt(0);
        System.out.println("Index Of Given Character = " + s.indexOf(k));
    }
}

