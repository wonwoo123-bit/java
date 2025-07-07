package project1;


public class FireMonster extends Monster{
    private int fireSkillDamage;
    public FireMonster(String name, int hp, int attack, int defense, int fireSkillDamage){
        super(name, hp, attack, defense);
        this.fireSkillDamage = fireSkillDamage;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("불 스킬 공격" + fireSkillDamage);
    }
}
