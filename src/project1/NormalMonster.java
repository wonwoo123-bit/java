package project1;
//public class NormalMonster extends Monster {
//    NormalMonster(String name, int hp, int attack, int defense) {
//        super(name, hp, attack, defense);
//    }
////attack 메서드안에 전투 로직 집어넣기 NormalMonster
//
////전부 반복문 넣어야 함 1번과 2번이 번갈아 때리도록
//
////공격시 20% 확률로 크리티컬이 터지도록 해야하며, 크리티컬 발생시에는 문구도 출력해야함
////	맞는 몬스터의 체력 = 때리는 몬스터의 공격력*2 - 방어력
////	크리티컬 전투 로직에서는 공격력 - 방어력 우선이 아닌 공격력 *2 가 우선이  되도록 해야함
////	그 이후 전투로직에 데미지가 공격력*2 - 방어력 으로 진행할 수 있도록 코드 진행
//
//    //크리티컬이 터지지 않은 경우는
////	맞는 몬스터의 체력=때리는 몬스터의 공격력 -방어력
//    @Override
//    public int attack(Monster target) {
//
//        while (this.getHp() > 0 && target.getHp() > 0) {
//            int damage;
////            삼항연산자로 변경?
//            if (Math.random() < 0.2) {
//                damage = this.getAttack() * 2 - target.getDefense();
//                if (damage < 0) damage = 0;
//                System.out.println("치명타! " + damage + " 의 피해!");
//            } else {
//                damage = this.getAttack() - target.getDefense();
//                if (damage < 0) damage = 0;
//            }
//            int newHp = target.getHp() - damage;
//            target.setHp(newHp > 0 ? newHp : 0);
//            System.out.println(this.getName() + "이(가) " + target.getName() + "을 공격");
//            System.out.println(target.getName() + "의 남은 체력" + target.getHp());
//            System.out.println();
//            if (target.getHp() <= 0) break;
//
//            int damage1;
////            삼항연산자?
//            if (Math.random() < 0.2) {
//                damage1 = target.getAttack() * 2 - this.getDefense();
//                if (damage1 < 0) damage1 = 0;
//                System.out.println("치명타! " + damage + " 의 피해!");
//            } else {
//                damage1 = target.getAttack() - this.getDefense();
//                if (damage1 < 0) damage1 = 0;
//            }
//            this.setHp(this.getHp() - damage1);
//            if (this.getHp() < 0) this.setHp(0);
//            System.out.println(target.getName() + "이(가) " + this.getName() + "을 공격");
//            System.out.println(this.getName() + "의 남은 체력" + this.getHp());
//            System.out.println();
//            if (this.getHp() < 0) break;
//
//            try {
//                Thread.sleep(1000); // 1000ms = 1초
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        return 0;
//    }
//}