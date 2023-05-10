package practice.task1;

public class Calculator {
    double weight = 10.5;
    int cost = 100;
    String color = "red";
    public Calculator(){
    }
    public Calculator(double weight, int cost, String color) {
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }
    static { // статический блок выполняется первым, потом логические блоки, потом конструкторы
        System.out.println("Статический блок");
    }
    // логический блок - действие которое выполняется до конструктора
    {
        // можно инициализировать переменные
        color = "red";   // почти не используется
        System.out.println("Object was created");
    }
    {
        System.out.println("второй логический блок");
    }
    {
        System.out.println("третий логический блок");
    }
    long findSum(int a, int b){
        return a + b;
    }
    int findRazn(int  a, int b){
        return a - b;
    }
    double findDel(int a, int b){
        return (double) a / b;
    }
    double findMult(int a, int b){
        return a * b;
    }
}
