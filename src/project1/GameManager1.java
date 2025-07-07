package project1;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager1 {
    public static void main(String[] args) {
        ArrayList<Monster>monsters = new ArrayList<>();
        monsters.add(new Monster("슬라임",30,8,5));
        monsters.add(new Monster("고블린",50,12,4));
        monsters.add(new Monster("오크",80,15,7));
        monsters.add(new Monster("스켈레톤",60,14,10));
        monsters.add(new Monster("트롤",120,18,6));
        monsters.add(new Monster("골렘",100,20,25));
        monsters.add(new Monster("와이번",150,25,15));
        monsters.add(new Monster("리치",130,35,12));
        monsters.add(new Monster("키메라",200,30,20));
        monsters.add(new Monster("드래곤",300,40,30));


        for (int i = 0; i < monsters.size(); i++){
            System.out.println(i);
            monsters.get(i).info();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("0~9번중 첫번째 몬스터를 고르시오");
        int first = scanner.nextInt();

        System.out.println("0~9번중 두번째 몬스터를 고르시오");
        int second = scanner.nextInt();

        if (first==second || first<0 || second<0 || first >= monsters.size() || second >= monsters.size()){
            System.out.println("잘못된 선택입니다.");
            return;
        }

        Monster monster1 = monsters.get(first);
        Monster monster2 = monsters.get(second);

        System.out.println();
        System.out.println("전투시작");

        while(monster1.getHp() > 0 && monster2.getHp() > 0){
            int damage = monster1.getAttack() - monster2.getDefense();
                if(damage <= 0) damage=0;

            int newHp = monster2.getHp()-damage;
            monster2.setHp(newHp > 0 ? newHp : 0);

            System.out.println(monster1.getName()+"이(가) " + monster2.getName()+"을 공격");
            System.out.println(monster2.getName() + "의 남은 체력" + monster2.getHp());
            System.out.println();

            if (monster2.getHp() <= 0 ) break;

            int damage1 = monster2.getAttack() - monster1.getDefense();{
                if (damage1 <= 0) damage1 = 0;
            }
            monster1.setHp(monster1.getHp()-damage1);
            if (monster1.getHp() < 0) monster1.setHp(0);
            System.out.println(monster2.getName()+"이(가) " + monster1.getName()+"을 공격");
            System.out.println(monster1.getName() + "의 남은 체력" + monster1.getHp());
            System.out.println();
            if (monster1.getHp() < 0 ) break;

            try {
                Thread.sleep(1000); // 1000ms = 1초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.print("승자는 ");
        if (monster1.getHp() <= 0){
            System.out.println(monster2.getName());
        }else {
            System.out.println(monster1.getName());
        }
    }
}
