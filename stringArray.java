import java.util.*;

public class stringArray {
    static String strGet;
    public static void main(String[] args) {
        inPut();
        int strLength = strGet.length() , outPut = 0 ;
        Map <Character,Integer> strPick = new HashMap();

        for (int end = 0 , start = 0 ; end < strLength ; end++){
            char charGet = strGet.charAt(end);          //抓出strGet的字元
            if (strPick.containsKey(charGet)){          //判斷是否出現重複字元
                start = Math.max(start,strPick.get(charGet)+1);
            }
            outPut = Math.max(end - start +1,outPut);   //比較長度，取最長
            strPick.put(charGet,end);
        }
        System.out.println("Output: " + outPut);
    }
    static void inPut(){
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        strGet = strInput.nextLine();
    }
}
