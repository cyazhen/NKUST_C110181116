import java.util.*;

public class stringArray {
    public static void main(String[] args) {
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
    }
}
