public class Multiplication {
    public static void main(String[] args) {
        for(int i = 1;i <= 9;i++){
            for(int j = 1; j <= 9;j++) {
                int sum = i * j;
                System.out.println(i + " X " + j + "=" + sum );
                if (j==9){
                    System.out.println("\t");
                }
            }
        }
    }
}
