import com.sun.jdi.IntegerValue;

import javax.swing.*;
import java.util.HashMap;
import java.util.*;
import java.util.Scanner;

public class Game {
    public static String chooseCareer= JOptionPane.showInputDialog("請選擇職業代碼：1.狂戰士 2.弓箭手 3.魔法師");
    public static String chooseWeapon= JOptionPane.showInputDialog("請選擇職業代碼：1.劍(技能：橫掃) 2.弓(技能：連射) 3.法杖(技能：火球)");
    public static void main(String[] args) {
        int quailtyNum = 0;
        List<String> quailtyKey = new ArrayList<>();
        quailtyKey.add("Hp");
        quailtyKey.add("Att");
        quailtyKey.add("Mp");
        characterInfo inputInfo = new characterInfo();
        if (!chooseCareer.isEmpty() && Character.isDigit(chooseCareer.charAt(0))){
            System.out.println("======角色訊息======");
            System.out.printf("你/妳的職業為：%s\n" , inputInfo.career(chooseCareer));
            if (!chooseWeapon.isEmpty() && Character.isDigit(chooseWeapon.charAt(0))){
                System.out.printf("你/妳的武器為：%s\n" , inputInfo.equipment(chooseWeapon));
            }
            System.out.println("======角色數值======");
            for (String i : quailtyKey){
                String getQuailty = inputInfo.urInfo(i);
                while(true){
                    System.out.printf("%s：%s\n",quailtyKey.get(quailtyNum),getQuailty);
                    break;
                }
                quailtyNum ++;
            }
            System.out.println("===================");
        }
        else{
            System.out.println("遊戲結束");
        }
    }
}
