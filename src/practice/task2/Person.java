package practice.task2;

public class Person {
    String fullName;
    int age;
    public Person(){
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    void talk(String text){
        System.out.println(this.fullName + " talk " + text);
    }
    void move(){
        System.out.println(this.fullName + " walks ");
    }

}
