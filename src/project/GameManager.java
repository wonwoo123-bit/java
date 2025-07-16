package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



class FireMonster extends Monster {
    private int fireskilldamage ;

     public FireMonster(String name, int hp, int attack, int defense, int fireskilldamage) {
         super(name, hp, attack, defense);
         this.fireskilldamage = fireskilldamage;
     }

     @Override
    public void info() {
        super.info();
        System.out.println("불 스킬 데미지: "+ fireskilldamage);
    }

    @Override
    public int attack(project1.Monster target) {
        return 0;
    }
}


class NormalMonster extends Monster{
    public NormalMonster(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }

    @Override
    public int attack(project1.Monster target) {
        return 0;
    }

    @Override
    public void info() {
        super.info();
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
                first < 0 || second < 0 );










    }
}
