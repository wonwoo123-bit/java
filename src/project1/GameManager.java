package project1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManager {
    public static void main(String[] args) {
        List<Monster>monsters = new ArrayList<>();
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
        System.out.println();
        for (int i = 0; i < monsters.size(); i++){
            System.out.println(i);
            monsters.get(i).info();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("0~9번중 첫번째 몬스터를 입력하시오");
        int first = scanner.nextInt();
        System.out.println("0~9번중 두번째 몬스터를 입력하시오");
        int second = scanner.nextInt();
        if (first==second || first<0 || second<0 ||first >= monsters.size() || second>= monsters.size()){
            System.out.println("잘못된 입력");
            return;
        }

        Monster monster1 = monsters.get(first);
        Monster monster2 = monsters.get(second);

        System.out.println("전투 시작");
        System.out.println();

        while(monster1.getHp() > 0 && monster2.getHp() > 0){
            attack(monster1,monster2);

            if (monster2.getHp() <= 0) break;

            attack(monster2,monster1);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("승자는 ");
        if (monster1.getHp() <= 0 && monster2.getHp()<=0){
            System.out.println("무승부");
        } else if (monster1.getHp() <=0) {
            System.out.println(monster2.getName());

        }else {
            System.out.println(monster1.getName());
        }
    }
    public static void attack(Monster attacker, Monster defender){
        int damage = attacker.getAttack() - defender.getDefense();
        if (damage < 0 ) damage = 0;

        int newHp = defender.getHp() - damage;
        if (newHp < 0) newHp = 0;

        defender.setHp(newHp);

        System.out.println(attacker.getName() +"이(가) " + defender.getName() + "를 공격 ");
        System.out.println(defender.getName() + "의 남은 체력은" + defender.getHp());
        System.out.println();
    }
}
