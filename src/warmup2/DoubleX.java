package warmup2;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
*/

public class DoubleX {

  public static void main(String[] args) {
    DoubleX doubleX = new DoubleX();
    boolean result = doubleX.doubleX("axxbb");
    System.out.println(result);
  }

  boolean doubleX(String str) {

    boolean flag = false;

    int i = str.indexOf("x");

    if(i > -1){
      if(i + 1 < str.length()){
        flag = str.substring(i+1, i+2).equals("x");
      }
    }

    return flag;
  }

}
