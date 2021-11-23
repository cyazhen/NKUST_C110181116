import java.util.*;

public class repeatnumber {
    public static void main(String[] args) {
        Map<Integer,Character> pickNumMap = new HashMap<>();
        Scanner strInput = new Scanner(System.in);
        System.out.println("請輸入字串：");
        String inputNum = strInput.nextLine();

        for (int i = 0 ; i < inputNum.length() ; i++){
            char getNum = inputNum.charAt(i);
            if (pickNumMap.containsValue(getNum) == true){
                pickNumMap.putIfAbsent(i,);
            }
            pickNumMap.put(i,getNum);
        }

    }
}
