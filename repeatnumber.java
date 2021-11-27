import java.util.*;

public class repeatnumber {
    public static void main(String[] args) {
        Map<Character,Integer> checkRepeatMap = new HashMap<>();
        List<String> outputResult = new ArrayList<>();
<<<<<<< HEAD
        int firstNumCount = 0;                                //repeatCount第一次出現的數字的數量
=======
        int noRepeatCount = 0;                                //noRepeatCount用來計算第一次出現的數字的數量
>>>>>>> a5d8a896214022688cfe40e0e7348784172122e1
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        String inputNum = strInput.nextLine();

        for (int i = 0 ; i < inputNum.length() ; i++){
<<<<<<< HEAD
            char getNum = inputNum.charAt(i);               //getNum拿取inputNum裡的數值
            if (!checkRepeatMap.containsKey(getNum)){       //透過checkRepeatMap判斷數值是否重複
                outputResult.add(String.valueOf(getNum));   //如不重複將當前數值加進outputResult
                firstNumCount = firstNumCount + 1;          //並且firstNumCount +1
            }
            else{
                outputResult.add("_");                      //重複的話將一個底線加至outputResult
=======
            char getNum = inputNum.charAt(i);                //getNum拿取inputNum裡的數值
            if (!checkRepeatMap.containsKey(getNum)){        //透過checkRepeatMap判斷數值是否重複
                outputResult.add(String.valueOf(getNum));    //如不重複將當前數值加進outputResult
                noRepeatCount = noRepeatCount + 1;           //並且noRepeatCount +1
            }
            else{
                outputResult.add("_");                       //重複的話將一個底線加至outputResult
>>>>>>> a5d8a896214022688cfe40e0e7348784172122e1
            }
            checkRepeatMap.put(getNum,i);                    //將getNum的值放進checkRepeatMap，用於if判斷是否重複
        }
        Collections.sort(outputResult);                      //整理outputResult
        System.out.println("nums = " + outputResult);
<<<<<<< HEAD
        System.out.println("Output：" + firstNumCount);
=======
        System.out.println("Output：" + noRepeatCount);
>>>>>>> a5d8a896214022688cfe40e0e7348784172122e1
    }
}
