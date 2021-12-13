import java.util.*;

public class characterInfo {
    Map<String,Integer> yourQuailty = new HashMap<>();
    Map<String,String> yourCareer = new HashMap<>();
    Map<String,String> yourWeapon = new HashMap<>();
    Map<String,String> yourSkillMap = new HashMap<>();

    String career(String i){
        Map<String,String> careerMap = new HashMap<>();
        careerMap.put("1","狂戰士");
        careerMap.put("2","弓箭手");
        careerMap.put("3","魔法師");
        yourCareer.put("職業",careerMap.get(i));
        return (yourCareer.get("職業"));
    }
    String urInfo(String i){
        switch (Game.chooseCareer){
            case "1":
                //狂戰士
                yourQuailty.put("Hp",20);
                yourQuailty.put("Att",15);
                yourQuailty.put("Mp",5);
                break;
            case "2":
                //弓箭手
                yourQuailty.put("Hp",15);
                yourQuailty.put("Att",30);
                yourQuailty.put("Mp",10);
                break;
            case "3":
                //魔法師
                yourQuailty.put("Hp",10);
                yourQuailty.put("Att",40);
                yourQuailty.put("Mp",30);
                break;
        }
        //yourQuailty.putIfAbsent("Hp",yourQuailty.get("Hp") - monsterDamage);  Hp扣損
        //yourQuailty.putIfAbsent("Att",yourQuailty.get("Att") + weapon);   武器傷害加乘
        //yourQuailty.putIfAbsent("Mp",yourQuailty.get("Mp") - skillCost);  Mp消耗
        return (yourQuailty.get(i).toString());
    }
    String equipment(String i){
        Map<String,String> weaponMap = new HashMap<>();
        weaponMap.put("1","劍");
        weaponMap.put("2","弓");
        weaponMap.put("3","法杖");
        yourWeapon.put("武器",weaponMap.get(i));
        return (yourWeapon.get("武器"));
    }
    String skill(){
        switch (yourWeapon.get("武器")){
            case "劍":
                yourSkillMap.put("1","橫掃");
                break;
            case "弓":
                yourSkillMap.put("1","連射");
                break;
            case "法杖":
                yourSkillMap.put("1","火球");
                break;
        }
        return null;
    }
}
