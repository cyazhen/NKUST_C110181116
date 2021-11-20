import java.util.*;

public class myStringArray {
    public static void main(String[] args) {
        int outputResult = 0 , norepeatCount = 0;
        String inputStr;
        Map<Character , Integer> strPick =new HashMap<>();
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        inputStr = strInput.nextLine();

        for(int i = 0 ; i < inputStr.length() ; i++){
            char charGet = inputStr.charAt(i);
            if (strPick.containsKey(charGet) == false) {
                norepeatCount++;
            }
            else{
                outputResult = Math.max(norepeatCount , outputResult);
                norepeatCount = 1;
            }
            strPick.put(charGet,i);
        }
        System.out.println("Output：" + outputResult);
    }
}
