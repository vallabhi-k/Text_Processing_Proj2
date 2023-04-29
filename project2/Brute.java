package project2;

public class Brute {

  public int match(String T, String P) {
    /** Your code goes here */
    int Pattern = P.length();
    int text = T.length();
    int i = 0, j = Pattern - 1;

    for (i = 0, j = Pattern - 1; j < text;) {
        if (P.equals(T.substring(i, j + 1))) {
            return i;
        }
        i++;
        j++;
    }

    return -1;
  }
  
}
