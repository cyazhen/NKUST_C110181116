import javax.swing.*;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class character {
    public static String chooseCareer= JOptionPane.showInputDialog("請選擇職業代碼：1.狂戰士 2.弓箭手 3.魔法師");
    public static void main(String[] args) {
        int quailtyNum = 0;
        List<String> quailtyKey = new ArrayList<>();
        quailtyKey.add("Hp");
        quailtyKey.add("Att");
        quailtyKey.add("Mp");
        characterInfo inputInfo = new characterInfo();
        if (!chooseCareer.isEmpty()){
            System.out.printf("你/妳的職業為：%s\n" , inputInfo.yourCareer());
            switch (chooseCareer) {
                case "1":
                    for (String i : quailtyKey){
                        String getQuailty = inputInfo.warrior(i);
                        while(true){
                            System.out.printf("%s：%s\n",quailtyKey.get(quailtyNum),getQuailty);
                            break;
                        }
                        quailtyNum ++;
                    }
                    break;
                case "2":
                    for (String i : quailtyKey){
                        String getQuailty = inputInfo.shooter(i);
                        while(true){
                            System.out.printf("%s：%s\n",quailtyKey.get(quailtyNum),getQuailty);
                            break;
                        }
                        quailtyNum ++;
                    }
                    break;
                case "3":
                    for (String i : quailtyKey){
                        String getQuailty = inputInfo.magician(i);
                        while(true){
                            System.out.printf("%s：%s\n",quailtyKey.get(quailtyNum),getQuailty);
                            break;
                        }
                        quailtyNum ++;
                    }
                    break;
            }
        }
        else{
            System.out.println("遊戲結束");
        }
    }
}
