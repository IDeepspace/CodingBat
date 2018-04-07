package warmup2;

/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/

public class StringMatch {

  public static void main(String[] args) {
    StringMatch stringMatch = new StringMatch();
    int answer = stringMatch.stringMatch("abc", "abc");
    System.out.println(answer);
  }

  public int stringMatch(String a, String b) {
    int result = 0;

    int len = Math.min(a.length(), b.length());

    for (int i = 0; i < len-1; i++) {
      String aStr = a.substring(i, i + 2);
      String bStr = b.substring(i, i + 2);
      if (aStr.equals(bStr)){
        result ++;
      }
    }

    return result;
  }
}
