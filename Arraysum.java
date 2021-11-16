import java.util.*;

public class Arraysum {
    static int tarGet;
    static int [] numArray = {2,7,11,15};
    static List<Integer> outputNum = new ArrayList<>();

    public static void main(String[] args) {
        inPut();
        for (int i = 0 ; i < numArray.length ; i++){           //兩個數依序相加直到為target目標的數,並儲存在Num
            for (int j = i + 1 ; j < numArray.length ; j++){
                if (tarGet == (numArray[i] + numArray[j])){
                    outputNum.add(i);
                    outputNum.add(j);
                    break;
                }
            }
        }
        outPut();
    }

    static void inPut(){
        Scanner arrayTarget = new Scanner(System.in);
        System.out.println("輸入target: ");
        tarGet = arrayTarget.nextInt();
    }

    static void outPut(){
        System.out.println("input= " + Arrays.toString(numArray));
        System.out.println("Target= " + tarGet);
        System.out.println("Output: " + outputNum);
    }
}
