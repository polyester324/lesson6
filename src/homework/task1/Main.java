package homework.task1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(142693,50);
        CreditCard creditCard2 = new CreditCard(252694,80);
        CreditCard creditCard3 = new CreditCard(362695,10);
        creditCard1.putMoneyOnTheCard(20);
        creditCard2.putMoneyOnTheCard(50);
        creditCard3.withdrawMoneyOnTheCard(10);
        creditCard1.showCreditCardInfo();
        creditCard2.showCreditCardInfo();
        creditCard3.showCreditCardInfo();
    }
}
