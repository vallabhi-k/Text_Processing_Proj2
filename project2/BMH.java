package project2;

import java.util.*;

public class BMH {
  
  public int match(String T, String P) {
    /** Your code goes here */
    int m=P.length();
    int n=T.length();
    int lastOccurence[] = new int[m];
    HashMap<Character,Integer> hm=new HashMap<>();

    char pat[] = P.toCharArray();
    for(int x=0;x<m;x++)
    {
      hm.put(pat[x],x);
    } 
    
    int i,j;
    i = m - 1;
    j = m - 1;

    while(i < n-1 )
    {  
      if( T.charAt(i) == P.charAt(j))
      {
        if(j == 0)
          return  i;  
        else
        {
          i--;
          j--;
        }   
      }
      else
      {
        int temp=m;
        if(hm.containsKey(T.charAt(i)))
          temp=lastOccurence[hm.get(T.charAt(i))];
        i = i + m - Math.min(j, 1 + temp);
        j = m - 1;
      }
    }
      return -1;
  }

}
