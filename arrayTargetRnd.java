import java.util.*;

public class arrayTargetRnd {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        List<Integer> Rndlist = new ArrayList<>();
        int []arrnum = {2,7,11,15};
        for (int i = 0 ; i < arrnum.length ; i++){
            arrlist.add(arrnum[i]);
        }
        for (int i = arrnum.length; i < arrnum.length + 1; i++){
            Rndlist.clear();
            Rndlist.add ((int)(Math.random() * i));
            Rndlist.add ((int)(Math.random() * i));
            if (Rndlist.get(0) == Rndlist.get(1)){
                i -= 1;
                continue;
            }
            Collections.sort(Rndlist);
            int Target = arrnum[Rndlist.get(0)] + arrnum[Rndlist.get(1)];
            System.out.println("InPut= " + arrlist);
            System.out.println("Target= " + Target);
            System.out.println("Output: " + Rndlist);
        }
    }
}