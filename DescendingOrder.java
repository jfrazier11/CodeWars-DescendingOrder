import java.lang.StringBuilder;
import java.util.Arrays;

public class DescendingOrder {
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
