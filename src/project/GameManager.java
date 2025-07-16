package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NormalMonster extends Monster{
    public NormalMonster(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }


    @Override
    public void info() {
        super.info();
    }

    @Override
    public int attack(Monster target) {
        int damage = 0;
        if (Math.random() < 0.20) {
            System.out.println("치명타공격!! 방어도무시");
            damage = this.getAttack() * 2;
        }else {
            damage = Math.max(this.getAttack() -
                    target.getDefense(), 0);
        }
        return damage;
    }
}



public class GameManager {
    public static void main(String[] args) {

        List<Monster> monsters = new ArrayList<>();
        monsters.add(new NormalMonster("슬라임", 30, 8, 5));
        monsters.add(new NormalMonster("고블린", 50, 12, 4));
        monsters.add(new NormalMonster("오크", 80, 15, 7));
        monsters.add(new NormalMonster("스켈레톤", 60, 14, 10));
        monsters.add(new NormalMonster("트롤", 120, 18, 6));
        monsters.add(new NormalMonster("골렘", 100, 20, 25));
        monsters.add(new NormalMonster("와이번", 150, 25, 15));
        monsters.add(new NormalMonster("리치", 130, 35, 12));
        monsters.add(new NormalMonster("키메라", 200, 30, 20));
        monsters.add(new NormalMonster("드래곤", 300, 40, 30));
        monsters.add(new FireMonster("이프리트", 140, 22, 18, 35));
        monsters.add(new FireMonster("헬 하운드", 90, 28, 10, 25));
        monsters.add(new FireMonster("파이어 골렘", 180, 25, 22, 20));

        for (int i=0; i < monsters.size(); i++){
            System.out.println(i);
            monsters.get(i).info();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("0~12번중 첫번째 몬스터를 고르시오");
        int first = scanner.nextInt();

        System.out.println("0~12번중 두번째 몬스터를 고르시오");
        int second = scanner.nextInt();

        if (first == second || first >= monsters.size() || second >= monsters.size() ||
                first < 0 || second < 0 ){
            System.out.println("잘못된 선택입니다.");
            return;
        }

        Monster monster1 = monsters.get(first);
        Monster monster2 = monsters.get(second);
        System.out.println("전투시작");

        while (monster1.getHp() > 0 && monster2.getHp() > 0){
            int damage = monster1.attack(monster2);
            int newHp = monster2.getHp() - damage;
            monster2.setHp(Math.max(newHp,0));

            System.out.println(monster1.getName() + "이" + monster2.getName() + "을 공격!");
            System.out.println("피해량: "+ damage);
            System.out.println(monster2.getName() + "의 남은 체력: " + monster2.getHp());

            System.out.println();

            if (monster2.getHp() < 0){
                System.out.println(monster2.getName() + "이 쓰러졌습니다.");
                break;
            }


            int damage1 = monster2.attack(monster1);
            int newHp1 = monster1.getHp() - damage1;
            monster1.setHp(Math.max(newHp1,0));

            System.out.println(monster2.getName() +"이 " + monster1.getName() + "을 공격!");
            System.out.println("피해량: " + damage1);
            System.out.println(monster1.getName() + "의 남은 체력: " + monster1.getHp());

            System.out.println();

            if (monster1.getHp() <0){
                System.out.println(monster1.getName() + "이 쓰러졌습니다.");
                break;
            }

            try {
                Thread.sleep(1000); // 1000ms = 1초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }



    }
}

