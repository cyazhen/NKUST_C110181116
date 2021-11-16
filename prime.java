import java.util.*;

public class prime {
    public static void main(String[] args) {
        List<Integer> primeArray = new ArrayList<>();
        int i , j;
        for (i = 2; i <= 100; i++) {    //i,被除數
            for (j = 2; j < i; j++) {   //j,除數
                if (i % j == 0)    //取最小因數
                    break;
            }
            if (j == i){    //判斷最小因數是否為自己
                primeArray.add(i);
                System.out.println(j);
            }
        }
        System.out.printf("總共有%d個數為質數" , primeArray.size());
    }
}
