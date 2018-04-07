package warmup2;

/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end substring).

last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
*/

public class Last2 {

  public static void main(String[] args) {
    Last2 last2 = new Last2();
    int answer = last2.last2("axxxaaxx");
    System.out.println(answer);
  }

  public int last2(String str) {
    int result = 0;

    if(str.length() <= 2) {
      result = 0;
    }else {
      String end = str.substring(str.length() - 2);
      for (int i = 0; i < str.length() - 2; i++) {
        if (str.substring(i, i+2).equals(end)) {
          result++;
        }
      }
    }

    return result;
  }

}
