package practice.task2;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Иванов К.Ф.";
        Person person2 = new Person("Петров П.И.", 34);
        person1.talk("Привет!");
        person2.move();
    }
}
