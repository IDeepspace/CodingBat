package warmup2;

/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.
    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
*/

public class StringTimes {

  public static void main(String[] args) {
    StringTimes stringTimes = new StringTimes();
    String result = stringTimes.stringTimes("Hi", 2);
    System.out.println(result);
  }

  private String stringTimes(String str, int n) {
    String result = "";

    for(int i = 1; i <= n; i++) {
      result += str;
    }

    return result;
  }
}
