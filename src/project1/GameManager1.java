package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


interface Healable {
    void heal();
}

class Troll extends NormalMonster implements Healable {

    public Troll(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    // Healable 인터페이스의 규칙에 따라 heal() 메서드를 구현
    @Override
    public void heal() {
        // 최대 체력의 10%를 회복함
        int healing = 0;
        if (Math.random() > 0.1)
        System.out.println("heal 발동"); this.setHp(healing);


    }

    @Override
    public int attack(Monster target) {
        return super.attack(target);
    }
}

class Hellhound extends FireMonster implements Healable {

    public Hellhound(String name, int hp, int attack, int defense, int fireSkillDamage) {
        super(name, hp, attack, defense, fireSkillDamage);
    }

    // Healable 인터페이스의 규칙에 따라 heal() 메서드를 구현
    @Override
    public void heal() {

        // 최대 체력의 20%를 회복함
    }
}

class NormalMonster extends Monster {
    NormalMonster(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }
//attack 메서드안에 전투 로직 집어넣기 NormalMonster

//전부 반복문 넣어야 함 1번과 2번이 번갈아 때리도록

//공격시 20% 확률로 크리티컬이 터지도록 해야하며, 크리티컬 발생시에는 문구도 출력해야함
//	맞는 몬스터의 체력 = 때리는 몬스터의 공격력*2 - 방어력
//	크리티컬 전투 로직에서는 공격력 - 방어력 우선이 아닌 공격력 *2 가 우선이  되도록 해야함
//	그 이후 전투로직에 데미지가 공격력*2 - 방어력 으로 진행할 수 있도록 코드 진행

    //크리티컬이 터지지 않은 경우는
//	맞는 몬스터의 체력=때리는 몬스터의 공격력 -방어력
    @Override
    public int attack(Monster target) {

        while (this.getHp() > 0 && target.getHp() > 0) {
            int damage;
//            삼항연산자로 변경?
            if (Math.random() < 0.2) {
                damage = this.getAttack() * 2 - target.getDefense();
                if (damage < 0) damage = 0;
                System.out.println("치명타! " + damage + " 의 피해!");
            } else {
                damage = this.getAttack() - target.getDefense();
                if (damage < 0) damage = 0;
            }

            int newHp = target.getHp() - damage;
            target.setHp(newHp > 0 ? newHp : 0);
            System.out.println(this.getName() + "이(가) " + target.getName() + "을 공격");
            System.out.println(target.getName() + "의 남은 체력" + target.getHp());
            System.out.println();
            if (target.getHp() <= 0) break;


            int damage1;
//            삼항연산자?
            if (Math.random() < 0.2) {
                damage1 = target.getAttack() * 2 - this.getDefense();
                if (damage1 < 0) damage1 = 0;
                System.out.println("치명타! " + damage + " 의 피해!");
            } else {
                damage1 = target.getAttack() - this.getDefense();
                if (damage1 < 0) damage1 = 0;
            }
            this.setHp(this.getHp() - damage1);
            if (this.getHp() < 0) this.setHp(0);
            System.out.println(target.getName() + "이(가) " + this.getName() + "을 공격");
            System.out.println(this.getName() + "의 남은 체력" + this.getHp());
            System.out.println();
            if (this.getHp() < 0) break;

            try {
                Thread.sleep(1000); // 1000ms = 1초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

}


        class FireMonster extends Monster {
            private int fireSkillDamage;

            public FireMonster(String name, int hp, int attack, int defense, int fireSkillDamage) {
                super(name, hp, attack, defense);
                this.fireSkillDamage = fireSkillDamage;

            }

            public int getFireSkillDamage() {
                return fireSkillDamage;
            }

            public void setFireSkillDamage(int fireSkillDamage) {
                this.fireSkillDamage = fireSkillDamage;
            }

            @Override
            public void info() {
                super.info();
                System.out.println("불 스킬 공격" + fireSkillDamage);
            }
//            스킬 데미지는 후속 추가타의 개념임
//            전투시 공격 이후 발동하면 추가로 때려야함
//            기존 while문 가져와서 공격 이후에 35% 확률 구하는 코드 집어넣어서
//            참 일경우 한대 더 때리기
//            거짓이면 스킬발동 실패 문구 넣어서 넘기기
            @Override
            public int attack(Monster target) {
                // 지금 만들어둔 메서드를 굳이 리턴으로 해야 하는가...? 리턴이 필요 없어 보이는데 일단 Monster 따라 어쩔수 없이 리턴으로
                while(this.getHp() > 0 && target.getHp() > 0){
                    int damage = this.getAttack() - target.getDefense();
                    if(damage <= 0) damage=0;
//                  삼항연산자로 변경?
                    if (Math.random() < 0.35) {
                        System.out.println("스킬발동 " + this.fireSkillDamage + " 의 추가피해!");

                        System.out.println("스킬발동 실패");
                    }

                    int newHp = target.getHp()-damage- this.fireSkillDamage;
                    target.setHp(newHp > 0 ? newHp : 0);

                    System.out.println(this.getName()+"이(가) " + target.getName()+"을 공격");
                    System.out.println(target.getName() + "의 남은 체력" + target.getHp());
                    System.out.println();


                    if (target.getHp() <= 0 ) break;

                    int damage1 = target.getAttack() - this.getDefense();{
                        if (damage1 <= 0) damage1 = 0;
                    }

                    if (target instanceof FireMonster && Math.random() < 0.35) {

                        System.out.println("스킬 발동! " + this.fireSkillDamage + "의 추가 피해!");
                    } else {
                        System.out.println("스킬 발동 실패");
                    }


                    this.setHp(this.getHp()-damage1 - this.fireSkillDamage);
                    if (this.getHp() < 0) this.setHp(0);
                    System.out.println(target.getName()+"이(가) " + this.getName()+"을 공격");
                    System.out.println(this.getName() + "의 남은 체력" + this.getHp());
                    System.out.println();
                    if (this.getHp() < 0 ) break;

                    try {
                        Thread.sleep(1000); // 1000ms = 1초
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                return 0;
            }
        }


        class GameManager1 {
            public static void main(String[] args) {
                List<Monster> monsters = new ArrayList<>();
                monsters.add(new NormalMonster("슬라임", 30, 8, 5));
                monsters.add(new NormalMonster("고블린", 50, 12, 4));
                monsters.add(new NormalMonster("오크", 80, 15, 7));
                monsters.add(new NormalMonster("스켈레톤", 60, 14, 10));
                monsters.add(new Troll("트롤", 120, 18, 6));
                monsters.add(new NormalMonster("골렘", 100, 20, 25));
                monsters.add(new NormalMonster("와이번", 150, 25, 15));
                monsters.add(new NormalMonster("리치", 130, 35, 12));
                monsters.add(new NormalMonster("키메라", 200, 30, 20));
                monsters.add(new NormalMonster("드래곤", 300, 40, 30));
                monsters.add(new FireMonster("이프리트", 140, 22, 18, 35));
                monsters.add(new Hellhound("헬 하운드", 90, 28, 10, 25));
                monsters.add(new FireMonster("파이어 골렘", 180, 25, 22, 20));


                for (int i = 0; i < monsters.size(); i++) {
                    System.out.println(i);
                    monsters.get(i).info();
                }

                Scanner scanner = new Scanner(System.in);
                System.out.println("0~12번중 첫번째 몬스터를 고르시오");
                int first = scanner.nextInt();

                System.out.println("0~12번중 두번째 몬스터를 고르시오");
                int second = scanner.nextInt();

                if (first == second || first < 0 || second < 0 || first >= monsters.size() || second >= monsters.size()) {
                    System.out.println("잘못된 선택입니다.");
                    return;
                }

                Monster monster1 = monsters.get(first);
                Monster monster2 = monsters.get(second);

                System.out.println();
                System.out.println("전투시작");
                monster1.attack(monster2);

//        while(monster1.getHp() > 0 && monster2.getHp() > 0){
//            int damage = monster1.getAttack() - monster2.getDefense();
//                if(damage <= 0) damage=0;
//
//            int newHp = monster2.getHp()-damage;
//            monster2.setHp(newHp > 0 ? newHp : 0);
//
//            System.out.println(monster1.getName()+"이(가) " + monster2.getName()+"을 공격");
//            System.out.println(monster2.getName() + "의 남은 체력" + monster2.getHp());
//            System.out.println();
//
//            if (monster2.getHp() <= 0 ) break;
//
//            int damage1 = monster2.getAttack() - monster1.getDefense();{
//                if (damage1 <= 0) damage1 = 0;
//            }
//            monster1.setHp(monster1.getHp()-damage1);
//            if (monster1.getHp() < 0) monster1.setHp(0);
//            System.out.println(monster2.getName()+"이(가) " + monster1.getName()+"을 공격");
//            System.out.println(monster1.getName() + "의 남은 체력" + monster1.getHp());
//            System.out.println();
//            if (monster1.getHp() < 0 ) break;
//
//            try {
//                Thread.sleep(1000); // 1000ms = 1초
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
                System.out.print("승자는 ");
                if (monster1.getHp() <= 0) {
                    System.out.println(monster2.getName());
                } else {
                    System.out.println(monster1.getName());
                }
            }
        }