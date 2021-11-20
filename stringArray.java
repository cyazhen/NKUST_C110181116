import java.util.*;

public class stringArray {
    public static void main(String[] args) {
<<<<<<< HEAD
        String inputStr;
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        inputStr = strInput.nextLine();
        int strLength = inputStr.length() , outputResult = 0 , start = 0 ;
        Map <Character,Integer> strPick = new HashMap();

        for (int end = 0 ; end < strLength ; end++){
            char charGet = inputStr.charAt(end);          //抓出strGet的字元
            if (strPick.containsKey(charGet)){          //判斷是否出現重複字元
                start =strPick.get(charGet)+1;
            }
            outputResult = Math.max(end - start +1,outputResult);   //比較長度，取最長
            strPick.put(charGet,end);
        }
        System.out.println("Output: " + outputResult);
        System.out.println(strPick);
=======
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
>>>>>>> 1220f117846a428f8b601529bbd851f5fc1b5b83
    }
}
