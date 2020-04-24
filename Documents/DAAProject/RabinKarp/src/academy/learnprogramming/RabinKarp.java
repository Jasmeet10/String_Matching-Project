package academy.learnprogramming;

public class RabinKarp {
    public static int n_char = 256, x_prime = 101,i =0, j =0, hash_string2 =0 , hash_string1 = 0 , hash =1;

    public static void match(String string1, String string2){

        // Generating hash value of the of both string
        for (i = 0; i < string2.length(); i++)
        {
            hash_string2 = (n_char*hash_string2 + string2.charAt(i))%x_prime;
            hash_string1 = (n_char*hash_string1 + string1.charAt(i))%x_prime;

        }
            // calling function for checking the string matching
            checkindex(string2,string1);

        if (j != string2.length())
            System.out.println("Matching string does not exists");
        }



    public static void checkindex(String m, String  n) {
        //generating minor hash for changing the next hash value
        for (i = 0; i < m.length()-1; i++) {
            hash = (hash * n_char) %x_prime;
        }
        // checking for the string1 and string2 matching if the hash value of string 1 matches to the hash value of string 2
        for (i = 0; i <= (n.length() - m.length()); i++) {
            // matching both strings hash value
            if (hash_string2 == hash_string1) {
                // matching the string character by character
                for (j = 0; j < m.length(); j++) {
                    if (n.charAt(i + j) != m.charAt(j))
                        break;
                }
                    // here the length of the string2 matches with the pattern length of string1
                if (j == m.length()) {
                    System.out.println("Matching string found at index " + i);
                }
            }
            // on different hash 1 and hash 2 , here we are generating the value of hash_string1 by using the minor hash value
            if ( i < (n.length()-m.length()) )
            {
                hash_string1 = (n_char*(hash_string1 - n.charAt(i)*hash) + n.charAt(i+m.length()))%x_prime;

                if (hash_string1 < 0)
                    hash_string1 = (hash_string1 + x_prime);
            }

        }
    }
}
