import java.util.*;

public class Game {
    public static void main(String[] args) {
        berserker Berserker =new berserker("狂戰士",30,5,15,"斬擊","橫掃");
        magician Magician =new magician("魔法師",10,40,30,"治癒","小火球");
        System.out.println("輸入職業代碼：1.狂戰士 2.弓箭手 3.魔法師");
        Scanner chooseCareer = new Scanner(System.in);
        if(chooseCareer.hasNextInt()){
            switch (chooseCareer.nextInt()){
                case 1:
                    Berserker.getCurrentStatus();
                case 2:
                    //Archer.getCurrentStatus();
                case 3:
                    Magician.getCurrentStatus();
            }
        }
        else{
            System.out.println("代碼輸入錯誤");
        }
    }
}
