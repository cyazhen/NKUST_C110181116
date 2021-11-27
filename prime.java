import java.util.*;

public class prime {
    public static void main(String[] args) {
        int i , j , primeCount = 0;     //primeCount計算質數的總數
        for (i = 2; i <= 100; i++) {    //i,被除數
            for (j = 2; j < i; j++) {   //j,除數
                if (i % j == 0)         //取因數
                    break;
            }
            if (j == i){                //判斷因數是否為自己
                primeCount = primeCount + 1;
                System.out.println(j);
            }
        }
        System.out.printf("總共有%d個數為質數" , primeCount);
    }
}
