package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text , pattern;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the first string");
        text = a.nextLine();
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the second string");
        pattern = b.nextLine();

        NaiveMatching test = new NaiveMatching();

        test.match(text,pattern);
    }

   //  AABCABCACABCABC
    // BCA
}
