import java.util.*;

public class stringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入字串：");
        String inputStr = scanner.nextLine();
        Map<Character, Integer> strPickMap = new HashMap();
        int output = 0;
        int start = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);          //抓出strGet的字元
            if (strPickMap.containsKey(currentChar)) {          //判斷是否出現重複字元
                start = Math.max(start, strPickMap.get(currentChar) + 1);
            }
            output = Math.max(i - start + 1, output);   //比較不重複字元長度，取最長
            strPickMap.put(currentChar, i);
        }
        System.out.println("Output: " + output);
    }
}
