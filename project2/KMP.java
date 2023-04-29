package project2;

public class KMP {
  public void logestProperPrefixSuffix(String pattern, int pattern_len, int lps[]){
      int len = 0;
      int i = 1;
      lps[0] = 0; 
      while (i < pattern_len) {
        if (pattern.charAt(i) == pattern.charAt(len)) {
          len++;
          lps[i] = len;
          i++;
        }
        else 
        {
          if (len != 0) {
            len = lps[len - 1];
          }
          else {
            lps[i] = len;
            i++;
          }
        }
      }
    }

  public int match(String T, String P) {
    int pattern_len = P.length();
		int text_len = T.length();
		int lps[] = new int[pattern_len];
		int j = 0; 
		logestProperPrefixSuffix(P, pattern_len, lps);

		int i = 0; 
		while ((text_len - i) >= (pattern_len - j)) {
			if (P.charAt(j) == T.charAt(i)) {
				j++;
				i++;
			}

			if (j == pattern_len) 
			return (i - j);

			else if (i < text_len && P.charAt(j) != T.charAt(i)) {
				if (j != 0)
					j = lps[j - 1];
				else
					i = i + 1;
			}
		}
    return -1;
  }
}