//package project1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//class NormalMonster extends Monster {
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
//        int damage = 0;
//        if (Math.random() < 0.20) {
//            System.out.println("치명타공격!! 방어도무시");
//            damage = this.getAttack() * 2;
//        }else {
//            damage = Math.max(this.getAttack() -
//                    target.getDefense(), 0);
//        }
//        return damage;
//
//}
//
//
//
//        public class GameManager1 {
//            public static void main(String[] args) {
//                List<Monster> monsters = new ArrayList<>();
//                monsters.add(new NormalMonster("슬라임", 30, 8, 5));
//                monsters.add(new NormalMonster("고블린", 50, 12, 4));
//                monsters.add(new NormalMonster("오크", 80, 15, 7));
//                monsters.add(new NormalMonster("스켈레톤", 60, 14, 10));
//                monsters.add(new NormalMonster("트롤", 120, 18, 6));
//                monsters.add(new NormalMonster("골렘", 100, 20, 25));
//                monsters.add(new NormalMonster("와이번", 150, 25, 15));
//                monsters.add(new NormalMonster("리치", 130, 35, 12));
//                monsters.add(new NormalMonster("키메라", 200, 30, 20));
//                monsters.add(new NormalMonster("드래곤", 300, 40, 30));
//
//
//
//                for (int i = 0; i < monsters.size(); i++) {
//                    System.out.println(i);
//                    monsters.get(i).info();
//                }
//
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("0~12번중 첫번째 몬스터를 고르시오");
//                int first = scanner.nextInt();
//
//                System.out.println("0~12번중 두번째 몬스터를 고르시오");
//                int second = scanner.nextInt();
//
//                if (first == second || first < 0 || second < 0 || first >= monsters.size() || second >= monsters.size())
//                {
//                    System.out.println("잘못된 선택입니다.");
//                    return;
//                }
//
//                Monster monster1 = monsters.get(first);
//                Monster monster2 = monsters.get(second);
//
//                System.out.println();
//                System.out.println("전투시작");
//
//                while (monster1.getHp() > 0 && monster2.getHp() > 0) {
//                    int damage = monster1.getAttack() - monster2.getDefense();
//                    if (damage <= 0) damage = 0;
//
//                    int newHp = monster2.getHp() - damage;
//                    monster2.setHp(newHp > 0 ? newHp : 0);
//
//                    System.out.println(monster1.getName() + "이(가) " + monster2.getName() + "을 공격");
//                    System.out.println(monster2.getName() + "의 남은 체력" + monster2.getHp());
//                    System.out.println();
//
//                    if (monster2.getHp() <= 0) break;
//
//                    int damage1 = monster2.getAttack() - monster1.getDefense();
//                    {
//                        if (damage1 <= 0) damage1 = 0;
//                    }
//                    monster1.setHp(monster1.getHp() - damage1);
//                    if (monster1.getHp() < 0) monster1.setHp(0);
//                    System.out.println(monster2.getName() + "이(가) " + monster1.getName() + "을 공격");
//                    System.out.println(monster1.getName() + "의 남은 체력" + monster1.getHp());
//                    System.out.println();
//                    if (monster1.getHp() < 0) break;
//
//                    try {
//                        Thread.sleep(1000); // 1000ms = 1초
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//                System.out.print("승자는 ");
//                if (monster1.getHp() <= 0) {
//                    System.out.println(monster2.getName());
//                } else {
//                    System.out.println(monster1.getName());
//                }
//            }
//        }
//        }