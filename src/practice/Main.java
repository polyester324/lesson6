package practice;

public class Main {
    public static void main(String[] args) {
        // Создать чертеж, шаблон
        // Создали объект кота
        Kitty kitty1 = new Kitty();
        Kitty kitty2 = new Kitty();
        kitty1.name = "Bobby";
        kitty1.age = 60;
        kitty1.breed = "Siamski";
        kitty1.weight = 70;
        kitty1.colour = "brown";
        kitty2.name = "Sam";
        kitty2.age = 6;
        kitty2.weight = 4;
        kitty2.colour = "red";
        System.out.println(kitty2.age);
        System.out.println(kitty1.age);
    }
}
