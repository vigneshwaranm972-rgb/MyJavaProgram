package practice;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter the one string");
        String s = Scan.nextLine();

        System.out.println("Enter the another string");
        String m = Scan.nextLine();

        int l = s.length();
        int v = m.length();

        char[] a = s.toLowerCase().toCharArray();
        char[] b = m.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (l == v && Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        Scan.close();
    }
}