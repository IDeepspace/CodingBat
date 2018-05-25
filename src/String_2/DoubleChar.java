/*Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"*/

package String_2;

public class DoubleChar {

    public static void main(String[] args) {
        DoubleChar doubleChar = new DoubleChar();
        String answer = doubleChar.doubleChar("The");
        System.out.println(answer);
    }

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char add = str.charAt(i);
            result += "" + add + add;
        }
        return result;
    }
}
