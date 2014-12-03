//Credit Card Lab by Christian Gutierrez, 2014
public class CreditCard{

  public boolean verify(String num){
    boolean output = false; 
    int sum = 0; 
    for (int i = num.length()-1; i>0; i-=2){
      int cc = Integer.parseInt(num.substring(i-1,i)); 
      int bb = Integer.parseInt(num.substring(i,i+1)); 
      if (cc * 2 >= 10){
        sum += ((cc*2)%10 +1); 
      }
      else {
        sum += (cc*2); 
      }
      sum += bb; 
      
    }
    if (sum % 10 == 0){
      output = true; 
    }
    else {
      output = false; 
    }
    return output; 
   
  }
  
    public int findType(String num) {
        int input1Char = Integer.parseInt(num.substring(0, 1));
        int input2Chars = Integer.parseInt(num.substring(0, 2));
        int input3Chars = Integer.parseInt(num.substring(0, 3));
        int input4Chars = Integer.parseInt(num.substring(0, 4));
        int input6Chars = Integer.parseInt(num.substring(0, 6));

        if (input2Chars == 34 || input2Chars == 37) {
            if (num.length() == 15) {
                return 3;
            }
        }

        if (input4Chars == 6011
                || (input6Chars >= 622126 && input6Chars <= 622925)
                || (input3Chars >= 644 && input3Chars <= 649)
                || input2Chars == 65) {
            if (num.length() == 16) {
                return 4;
            }
        }

        if (input2Chars >= 51 && input2Chars <= 55) {
            if (num.length() >= 16 && num.length() <= 19) {
                return 1;
            }
        }
        if (input2Chars == 36 || input2Chars == 38 || input3Chars == 301 
              || input3Chars == 303 || input3Chars == 304 || input3Chars == 305){
          return 5; 
        }

        if (input1Char == 4) {
            if (num.length() >= 13 && num.length() <= 16) {
                return 2;
            }
        }
        return 0;
    }

}
      
