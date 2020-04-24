package academy.learnprogramming;

public class NaiveMatching {

    public static void match( String text, String pattern)
    {
        int p = pattern.length();
        int t = text.length();

        for (int i = 0; i <= t-p; i++ ){
            int j;
            for( j = 0; j < p; j++) {
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
            }
            if (j == p)
                System.out.println("Pattern matched at index " + i);

        }
    }
}
