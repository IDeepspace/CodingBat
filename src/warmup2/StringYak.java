package warmup2;

/*
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char.
The "yak" strings will not overlap.

stringYak("yakpak") → "pak"
stringYak("pakyak") → "pak"
stringYak("yak123ya") → "123ya"*/
public class StringYak {

  public static void main(String[] args) {
    StringYak stringYak = new StringYak();
    String answer = stringYak.stringYak("yakpak");
    System.out.println(answer);
  }

  public String stringYak(String str) {
    String result = "";
    String unluckyStr = "yak";

    for (int i = 0; i < str.length()-2; i++) {
      if(str.substring(i, i+3).equals(unluckyStr)){
        result = str.replaceAll(unluckyStr, "");
      }
    }

    return result;
  }
}
