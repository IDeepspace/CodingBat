package warmup2;
/*Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"*/

public class StringX {

  public static void main(String[] args) {
    StringX stringX = new StringX();
    String answer = stringX.stringX("xabxxxcdx");
    System.out.println(answer);
  }

  public String stringX(String str) {
    String result = "";
    char delChar = 'x';
    if (str.length() < 2){
      return str;
    }else {
      for (int i = 1; i < str.length() -1; i++) {
        if(str.charAt(i) != delChar){
          result += str.charAt(i);
        }
      }
      result = str.substring(0, 1) + result + str.substring(str.length() - 1, str.length());
    }
    return result;
  }

}
