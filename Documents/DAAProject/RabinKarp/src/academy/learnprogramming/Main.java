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

        academy.learnprogramming.RabinKarp test = new academy.learnprogramming.RabinKarp();

        test.match(text,pattern);
    }
}
/*Input:  txt[] =  "AABAACAADAABAABA"
        pat[] =  "AABA"
Output: Pattern found at index 0
        Pattern found at index 9
        Pattern found at index 12

Input:  txt[] = "THIS IS A TEST TEXT"
        pat[] = "TEST"
Output: Pattern found at index 10

char txt[] = "ABABDABACDABABCABAB";
    char pat[] = "ABABCABAB";
Found pattern at index 10
*/
