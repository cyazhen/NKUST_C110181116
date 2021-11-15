import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int []arrnum = {2,7,11,15};
        list.add(arrnum[0]);
        list.add(arrnum[1]);
        list.add(arrnum[2]);
        list.add(arrnum[3]);
        Collections.sort(list);
        System.out.println(list.get(0));
        for (int n : list)
            System.out.println(n);
    }
}
