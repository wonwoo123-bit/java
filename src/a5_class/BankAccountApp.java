package a5_class;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankObject = new BankAccount(
                "111-222-333", "steav",10000);
        System.out.println(bankObject);
        if (bankObject.deposit(2000)){
            System.out.println("입금성공");
            System.out.println(bankObject);
        }
         bankObject.deposit2(0);{
            System.out.println("입금성공");
            System.out.println(bankObject);
        }

        if (bankObject.withdraw(3000)){
            System.out.println("출금성공");
            System.out.println(bankObject);
        }else {
            System.out.println("출금실패");
        }
//        예외상황 (잔액보다 많은 출금)
        if (bankObject.withdraw(200000)){
            System.out.println("출금성고");
            System.out.println(bankObject);
        }else {
            System.out.println("출금실패");
        }


    }
}
