import java.util.*;

public class repeatnumber {
    public static void main(String[] args) {
        Map<Character,Integer> checkRepeatMap = new HashMap<>();
        List<String> outputResult = new ArrayList<>();
        int firstNumCount = 0 , underscoreCount = 0;
        //firstNumCount計算第一次出現的數字的數量
        //underscoreCount計算最後需要加入多少"_"
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        String inputNum = strInput.nextLine();

        for (int i = 0 ; i < inputNum.length() ; i++){
            char getNum = inputNum.charAt(i);               //getNum拿取inputNum裡的數值
            if (!checkRepeatMap.containsKey(getNum)){       //透過checkRepeatMap判斷數值是否重複
                outputResult.add(String.valueOf(getNum));   //如不重複將當前數值加進outputResult
                firstNumCount = firstNumCount + 1;          //並且firstNumCount +1
            }
            else{
                underscoreCount = underscoreCount +1;       //重複的話underscoreCount +1
            }
            checkRepeatMap.put(getNum,i);                    //將getNum的值放進checkRepeatMap，用於if判斷是否重複
        }
        for (int i = 1 ; i <= underscoreCount ; i++){
            outputResult.add("_");
        }
        System.out.println("nums = " + outputResult);
        System.out.println("Output：" + firstNumCount);
    }
}
