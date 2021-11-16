import java.util.*;

public class Arraysum {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        List<Integer> sumarr = new ArrayList<>();
        Scanner arraytarget = new Scanner(System.in);
        System.out.println("輸入target: ");
        int [] array = {3,2,4};
        int target = arraytarget.nextInt();
        for (int i = 0 ; i < array.length ; i++){           //兩個數依序相加直到為target目標的數,並儲存在HashSet使其不重複輸出
            for (int j = i + 1 ; j < array.length ; j++){
                if (target == (array[i] + array[j])){
                    num.add(i);
                    num.add(j);
                    break;
                }
            }
        }
        System.out.println("input= " + array);
        System.out.println("Target= " + target);
        System.out.println("Output: " + num);
    }
}
