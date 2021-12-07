import java.util.HashMap;
import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        characterInfo inputInfo = new characterInfo();
        HashMap<Integer,String> chooseCareer = new HashMap<>();
        chooseCareer.put(1,"Warrior");
        chooseCareer.put(2,"Shooter");
        chooseCareer.put(3,"Magician");

        System.out.println(chooseCareer);
        Scanner getCareer = new Scanner(System.in);
        System.out.println("請選擇職業：");
        String yourCareer = chooseCareer.get(getCareer);
        System.out.printf("你的職業為：%s" , yourCareer);
    }
}
