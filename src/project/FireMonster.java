package project;

public class FireMonster extends Monster{
    private int fireSkillDamage;

    public FireMonster(String name, int hp, int attack, int defense, int fireSkillDamage) {
        super(name, hp, attack, defense);
        this.fireSkillDamage = fireSkillDamage;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("불 스킬 데미지:" + fireSkillDamage);
    }

    @Override
    public int attack(Monster target) {
        int damage = Math.max(this.getAttack() -
                target.getDefense(), 0);
        if (Math.random() < 0.35) {
            System.out.println("화염공격 !!");
            damage += fireSkillDamage;
        }
        return damage;
    }
}
