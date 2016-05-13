import java.lang.StringBuilder;
import java.util.Arrays;

/**
 * A class that allows you to sort integers into descending order
 * @author Jeremi Frazier
 * @version 1.2
 */

public class DescendingOrder {
  
  /**
   * This method sorts an integer into descending order and return the sorted integer
   * @param num - the number to sort i.e 9134 = 9431
   * @return int - the sorted (DESC) number
   */
  public static int sortDesc(final int num) {
  char[] charString = Integer.toString(num).toCharArray();
  Arrays.sort(charString);
  StringBuilder strb = new StringBuilder();
  for(int i=0; i< charString.length;i++){
    strb.append(charString[i]);
  }
  
  return Integer.parseInt(strb.reverse().toString());
  
    
  }
}
