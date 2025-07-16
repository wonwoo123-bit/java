package project;

public interface Healable {
    void heal();
}


class Troll extends NormalMonster implements Healable{
    public Troll(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public void heal() {
        int healHp = this.getHp() + this.getMaxHp() / 10 ;
        setHp(healHp);
        System.out.println("체력회복 스킬로 " + healHp);
    }
}

class Hellhound extends FireMonster implements Healable{
    public Hellhound(String name, int hp, int attack, int defense, int fireSkillDamage) {
        super(name, hp, attack, defense, fireSkillDamage);
    }

    @Override
    public void heal() {
        int healHp = this.getHp() + this.getMaxHp() / 20;
        setHp(healHp);
        System.out.println("체력회복 스킬로 " + healHp);
    }


}