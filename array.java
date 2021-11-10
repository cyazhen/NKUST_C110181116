public class array {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i != num.length; i++) {
            num[i] = i + 1;
        }
        int[] arr = new int[5];
        int rnd;
        int target;
        int rndarr1;
        int rndarr2;
        for (int i = 0; i != arr.length; i++) {
            rnd = (int) (Math.random() * (10 - i));
            arr[i] = num[rnd];
            for (int j = rnd; j != num.length - 1; j++) {
                num[j] = num[j + 1];
            }
            System.out.println(arr[i] + "\t");
        }
        for (int i = 4; i < 5; i++) {
            rndarr1 = (int) (Math.random() * i);
            rndarr2 = (int) (Math.random() * i);
            if (rndarr1 != rndarr2) {
                if (rndarr1<rndarr2){
                    target = arr[rndarr1] + arr[rndarr2];
                    System.out.println("target= " + target);
                    System.out.printf("Output: [%d][%d]", rndarr1, rndarr2);
                }
                else{
                    target = arr[rndarr1] + arr[rndarr2];
                    System.out.println("target= " + target);
                    System.out.printf("Output: [%d][%d]", rndarr2, rndarr1);
                }
            } else {
                i = 3;
                continue;
            }
        }
    }
}
