package project2;

import java.util.*;

public class BMH {
  
  public int match(String T, String P) {
    /** Your code goes here */
    int m=P.length();
    int n=T.length();
    T = T.toLowerCase();
    P = P.toLowerCase();
    int lastOccurence[] = new int[m];
    HashMap<Character,Integer> hm=new HashMap<>();

    char pat[] = P.toCharArray();
    for(int x=0;x<m;x++)
    {
      // System.out.println(pat[x]+" : : "+x);
      hm.put(pat[x],x);
    } 
    // System.out.print("temp");
    
    // System.out.println(hm.get('t'));
    // System.out.println(hm.get('o'));
    // System.out.println(hm.get('h'));

    
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
        // System.out.print("entered else");
        int temp=-1;
        if(hm.containsKey(T.charAt(i))) temp=lastOccurence[hm.get(T.charAt(i))];
      //  System.out.println(temp);
        i = i + m - Math.min(j, 1 + temp);
        j = m - 1;
      }
    }
      return -1;
  }

}
