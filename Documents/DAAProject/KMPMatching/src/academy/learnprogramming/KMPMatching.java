package academy.learnprogramming;

public class KMPMatching {

    public static void match( String string1, String string2)
    {
        // creating the temp array for the longest matching prefix which is also a suffix
         int TempArray[] = new int[string2.length()];
         int i =0 , j=0 ,length = 0, temp_index = 1;

        while (temp_index < string2.length()) {
            if (string2.charAt(temp_index) == string2.charAt(length)) {
                length++;
                TempArray[temp_index] = length;
                temp_index++;
            }
            else
            {
                if (length != 0) {
                    length = TempArray[length - 1];
                }
                else
                {
                    TempArray[temp_index] = length;
                    temp_index++;
                }
            }
        }
          while(i < string1.length()){
              if(string2.charAt(j)== string1.charAt(i)){
                  i++;
                  j++;
              }
              if (j == string2.length()) {
                  System.out.println("Matching string found at index " + (i - j));
                  j = TempArray[j - 1];
              }
              //here the string1 is not a match of string2, go back to temp array and check the last matching pattern
              else if (i < string1.length() && string2.charAt(j) != string1.charAt(i)) {
                  if (j != 0)
                      j = TempArray[j - 1];
                  else
                      i = i + 1;
              }
          }
    }

}


