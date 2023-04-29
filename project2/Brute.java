package project2;

public class Brute {

  public int match(String T, String P) {
    /** Your code goes here */
    int Pattern = P.length();
    int text = T.length();
    int i = 0, j = text - 1;

    for (i = 0, j = text - 1; j < Pattern;) {
        if (T.equals(P.substring(i, j + 1))) {
            return i;
        }
        i++;
        j++;
    }

    return -1;
  }
  
}
