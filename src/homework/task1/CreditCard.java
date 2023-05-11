package homework.task1;

public class CreditCard {
    int accountNumber;
    double currentAmountOnTheAccount;
    public CreditCard(int accountNumber, double currentAmountOnTheAccount) {
        this.accountNumber = accountNumber;
        this.currentAmountOnTheAccount = currentAmountOnTheAccount;
    }
    public CreditCard() {
    }
    double putMoneyOnTheCard(double amount) {
        return this.currentAmountOnTheAccount += amount;
    }
    double withdrawMoneyOnTheCard(double amount){
        if (this.currentAmountOnTheAccount >= amount) {
            return this.currentAmountOnTheAccount -= amount;
        } else{
            return this.currentAmountOnTheAccount;
        }
    }
    void showCreditCardInfo(){
        System.out.println("Account number: " + this.accountNumber + "; Amount of money: " + this.currentAmountOnTheAccount);
    }
}
