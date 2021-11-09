import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        float hight;
        int weight;
        float sum;
        Scanner H =new Scanner(System.in);
        Scanner W =new Scanner(System.in);

        System.out.println("請輸入身高: ");
        hight = H.nextInt();
        hight = hight / 100;
        System.out.println("請輸入體重: ");
        weight = W.nextInt();
        sum = weight / (hight * hight);
        System.out.println("你的BMI是 " + sum);
    }
}
