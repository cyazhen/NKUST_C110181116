public class role {
    String Career;
    int HP; //data member
    int MP; //data member
    int ATT; //data member
    String Skill_1;
    String SKill_2;

    role(String roleCareer,int roleHP, int roleMP, int roleATT,String roleSkill_1,String roleSkill2) {
        Career = roleCareer;
        HP = roleHP;
        MP = roleMP;
        ATT = roleATT;
        Skill_1 = roleSkill_1;
        SKill_2 = roleSkill2;
    }
    void getCurrentStatus() {
        System.out.println("職業：" + Career);
        System.out.println("Attack：" + ATT);
        System.out.println("HP：" + HP);
        System.out.println("MP：" + MP);
        System.out.printf("技能：%s,%s" , Skill_1 , SKill_2);
    }
}
