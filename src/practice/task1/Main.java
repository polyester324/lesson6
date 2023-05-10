package practice.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + calculator.findSum(2, 4) + "; Razn: " + calculator.findRazn(5, 8)
                + "; Del: " + calculator.findDel(4, 7) + "; Mult: " + calculator.findMult(6, 6));
        System.out.println("Color: "+calculator.color+"; Weight: "+calculator.weight+"; Cost: "+calculator.cost);
        Calculator calculatorPar = new Calculator(2,55,"Green");
    }
}
