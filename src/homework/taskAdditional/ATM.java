package homework.taskAdditional;
public class ATM {
    int amountOf20;
    int amountOf50;
    int amountOf100;
    public ATM() {
    }
    public ATM(int amountOf20, int amountOf50, int amountOf100) {
        this.amountOf20 = amountOf20;
        this.amountOf50 = amountOf50;
        this.amountOf100 = amountOf100;
    }
    void addMoney(int amountOf20, int amountOf50, int amountOf100) {
        this.amountOf20 += amountOf20;
        this.amountOf50 += amountOf50;
        this.amountOf100 += amountOf100;
        System.out.println("Banknotes were added!");
        System.out.println();
        System.out.println("Banknotes with value 20 - " + this.amountOf20 + "\nBanknotes with value 50 - " + this.amountOf50 + "\nBanknotes with value 100 - " + this.amountOf100);
        System.out.println();
        }
    void withdrawMoney(int sum){
        int n20 = 0;
        int n50 = 0;
        int n100 = 0;
        boolean flag = true;
        while (sum != 0)  {
            if (sum >= 100 && sum - 100 != 30 && sum - 100 != 10) {
                n100++;
                sum -= 100;
            } else if (sum >= 50 && sum - 50 != 30 && sum - 50 != 10) {
                n50++;
                sum -= 50;
            } else if (sum >= 20) {
                n20++;
                sum -= 20;
            } else {
                flag = false;
                System.out.println(flag);
                break;
            }
            }
        if(flag){
            this.amountOf100 -= n100 * 100;
            this.amountOf100 -= n50 * 50;
            this.amountOf100 -= n20 * 20;
            System.out.println("Banknotes were withdrawn!");
            System.out.println();
            System.out.println("Banknotes with value 20 - " + n20 + "\nBanknotes with value 50 - " + n50 + "\nBanknotes with value 100 - " + n100);
            System.out.println();
        }
    }
}
