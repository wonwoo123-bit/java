package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameManagerFire {
    public static void main(String[] args) {
        List<FireMonster>monsters = new ArrayList<>();
        monsters.add(new FireMonster("이프리트",140,22,18,35));
        monsters.add(new FireMonster("헬 하운드",90,28,10,25));
        monsters.add(new FireMonster("파이어 골렘",180,25,22,20));
        System.out.println();
        for (int i=0; i < monsters.size(); i++){
            System.out.println(i);
            monsters.get(i).info();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 몬스터를 고르시오");
        int first = scanner.nextInt();
        System.out.println("두번째 몬스터를 고르시오");
        int second = scanner.nextInt();
        if (first==second || first<0 || second<0 || first >= monsters.size() || second >= monsters.size()){
            System.out.println("잘못된 입력");
            return;
        }

        System.out.println("전투 시작");

        Monster monster1 = monsters.get(first);
        Monster monsters2 = monsters.get(second);

        while (monster1.getHp()>0 && monsters2.getHp()>0){
            int damage = monster1.getAttack() - monsters2.getDefense();
             if (damage <= 0) damage =0;
            int newHp = monsters2.getHp()-damage;
            monsters2.setHp(newHp > 0 ? newHp : 0);
            if (monsters2.getHp() <=0) monsters2.setHp(0);
            System.out.println(monster1.getName() + "이(가)" + monsters2.getName() + "을 공격");
            System.out.println(monsters2.getName() + "남은 체력 " + monsters2.getHp());
            System.out.println();
            if (monsters2.getHp()<0)break;

            int damage1 = monsters2.getAttack() - monster1.getDefense();
            if (damage1 <= 0) damage1 =0;
            int newHp2 = monster1.getHp()-damage1;
            monster1.setHp(newHp2 > 0 ? newHp2 : 0);
            if (monster1.getHp() <=0) monster1.setHp(0);
            System.out.println(monsters2.getName() + "이(가)" + monster1.getName() + "을 공격");
            System.out.println(monster1.getName() + "남은 체력 " +monster1.getHp());
            System.out.println();
            if (monster1.getHp()<0)break;

            try {
                // 1000 밀리초 = 1초 동안 실행을 멈춥니다.
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // sleep 도중 방해를 받았을 때 처리할 코드를 여기에 작성할 수 있습니다.
                // 지금은 비워두어도 괜찮습니다.
                e.printStackTrace();
            }



        }
        System.out.print("승자는");
        if (monster1.getHp() <=0){
            System.out.println(monsters2.getName());
        }else {
            System.out.println(monster1.getName());
        }

    }
}
