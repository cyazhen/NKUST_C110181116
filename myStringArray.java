import java.util.*;

public class myStringArray {
    public static void main(String[] args) {
        int outputResult = 0 , noRepeatCount = 0;
        //noRepeatCount為計算不重複的字元長度
        //outputResult為儲存最長不重複字元
        String inputStr;
        Map<Character , Integer> strPickMap =new HashMap<>();
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        inputStr = strInput.nextLine();

        for(int i = 0 ; i < inputStr.length() ; i++){
            char charGet = inputStr.charAt(i);
            if (strPickMap.containsKey(charGet) == false) {     //判斷Map是否有字元的存在
                noRepeatCount++;                                //不存在的話，noRepeatCount累加
            }
            else{
                outputResult = Math.max(noRepeatCount , outputResult);  //如出現重複字元，則將結果與累加的值進行比較，取最大值
                noRepeatCount = 1;  //不重複字元長度，將由當前的字元開始重新累加
            }
            strPickMap.put(charGet,i);
        }
        System.out.println("Output：" + outputResult);
    }
}
