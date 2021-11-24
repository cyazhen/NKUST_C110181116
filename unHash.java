import java.util.*;

class UnHash{
    public static void main (String[] args) {
        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long hash) {
        List<Character> correctChr = new ArrayList();
        List<Character> outputResult = new ArrayList<>();
        //chrGet取得正確字元
        //output字元排序校正
        while (true){
            for (int i = 0; i < letters.length(); i++){
                if ((hash - i) % 23 == 0){                      //以0開始取數直到letters的長度，進行運算，用來判斷字元正確位置
                    hash = (hash - letters.indexOf(i)) / 23;    //替換數字用來判斷下一個字元的位置
                    correctChr.add(letters.charAt(i));          //將正確字元放進correctChr
                    break;
                }
            }
            if (hash == 7){
                break;
            }
        }
        for (int i = correctChr.size() - 1 ; i >= 0 ; i--){     //將字元排序校正
            outputResult.add(correctChr.get(i));                //例：peels 校正為 sleep
        }
        return (outputResult.toString());
    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }
}