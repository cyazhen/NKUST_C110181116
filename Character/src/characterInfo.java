import jdk.dynalink.beans.StaticClass;

import java.security.PublicKey;
import java.util.*;

public class characterInfo {
    character getCharacter = new character();
    String yourCareer(){
        HashMap<String,String> careerMap = new HashMap<>();
        careerMap.put("1","狂戰士");
        careerMap.put("2","弓箭手");
        careerMap.put("3","魔法師");
        return (careerMap.get(getCharacter.chooseCareer));
    }
    String warrior(String quailtyKey){
        Map<String,Integer> warriorQuality = new HashMap<>();
        warriorQuality.put("Hp",20);
        warriorQuality.put("Att",15);
        warriorQuality.put("Mp",5);
        return (warriorQuality.get(quailtyKey).toString());
    }
    String shooter(String quailtyKey){
        Map<String,Integer> shooterQuality = new HashMap<>();
        shooterQuality.put("Hp",15);
        shooterQuality.put("Att",30);
        shooterQuality.put("Mp",10);
        return (shooterQuality.get(quailtyKey).toString());
    }
    String magician(String quailtyKey){
        Map<String,Integer> magicianQuality = new HashMap<>();
        magicianQuality.put("Hp",10);
        magicianQuality.put("Att",40);
        magicianQuality.put("Mp",30);
        return (magicianQuality.get(quailtyKey).toString());
    }
}
