package a5_class;

import java.util.SplittableRandom;

public class BankAccount {
    // 필드
    // accountNumber 계좌번호
    // ownerName 예금주
    // balance 잔액
    // 생성자 (기본과 매개변수 있는것)
    // 메서드
    // deposit(입금할 금액) : 돈을 입금하는 메서드 (양수만 가능)
    // withdraw(출금할 금액) : 돈을 출금하는 메서드 (잔액보다 출금액이 많으면 경고표시)
    //toString() : 계좌번호, 예금주 이름, 잔액 화면 출력
    String accountNumber;
    String ownerName;
    double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if (amount <= 0){
            System.out.println("입금액에 오류가 있습니다.");
            return false;
        }else {
            this.balance = this.balance + amount;
            return true;
        }
    }
    public double deposit2(double amount1){
        if (amount1 <= 0){
            System.out.println("입금액에 오류가 있습니다.");
        }else {
            this.balance = this.balance + amount1;
        }return amount1;
    }

   public boolean withdraw(double amount){
        if (amount <=0){
            System.out.println("출금액에 오류가 있습니다.");
            return false;
        }else if (amount > this.balance){
            System.out.println("출금액이 잔액보다 큽니다.");
            return false;
        }else {
            this.balance = this.balance - amount;
            return true;
        }
    }

    public double withdraw1(double amount){
        if (amount <=0 ){
            System.out.println("출금불가");
            return amount;
        }else if (amount > this.balance){
            System.out.println("출금불가");
            return amount;
        }else {
            this.balance = this.balance - amount;
            return amount;
        }
    }

    @Override
    public String toString() {
        return this.accountNumber +" "+ this.ownerName +" "+  this.balance;
    }
}
