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
        int healing = this.getMaxHp() / 10;
        int healHp = this.getHp() + healing ;
        if (healHp > this.getMaxHp()){
            healHp = this.getMaxHp();
        }
        setHp(healHp);
        System.out.println("체력회복 스킬로 " + healing + " 만큼 회복");
    }
}

class Hellhound extends FireMonster implements Healable{
    public Hellhound(String name, int hp, int attack, int defense, int fireSkillDamage) {
        super(name, hp, attack, defense, fireSkillDamage);
    }

    @Override
    public void heal() {
        int healing = this.getMaxHp() / 20;
        int healHp = this.getHp() + healing;
        if (healHp > this.getMaxHp()){
            healHp = this.getMaxHp();
        }

        setHp(healHp);
        System.out.println("체력회복 스킬로 " + healing + " 만큼 회복");
    }


}