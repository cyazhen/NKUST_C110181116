import java.util.*;

public class ArrayEx_1 {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        List<Integer> Rndlist = new ArrayList<>();
        int []arrnum = {2,7,11,15};
        arrlist.add(arrnum[0]);
        arrlist.add(arrnum[1]);
        arrlist.add(arrnum[2]);
        arrlist.add(arrnum[3]);
        for (int i = 4; i < 5; i++){
            Rndlist.clear();
            Rndlist.add ((int)(Math.random() * i));
            Rndlist.add ((int)(Math.random() * i));
            if (Rndlist.get(0) == Rndlist.get(1)){
                i -= 1;
                continue;
            }
            Collections.sort(Rndlist);
            int Target = arrnum[Rndlist.get(0)] + arrnum[Rndlist.get(1)];
            System.out.println(arrlist);
            System.out.println("Target= " + Target);
            System.out.println(Rndlist);
        }
    }
}