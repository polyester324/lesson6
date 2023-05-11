package homework.taskAdditional;
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(5,5,5);
        atm.addMoney(2,2,2);
        atm.withdrawMoney(510);
        atm.withdrawMoney(80);
        atm.withdrawMoney(60);
        atm.withdrawMoney(30);
        atm.withdrawMoney(10);
    }
}
