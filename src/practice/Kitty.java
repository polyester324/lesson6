package practice;

public class Kitty {
    // 1. Состояние (характеристики) : colour
    String colour;
    String breed;
    String name;
    int age;
    int weight;

    // 2. Поведение  (то он умеет) : run
    // конструктор по умолчанию если в конструкторе ничего нет
    public Kitty(){         // конструктор без параметров
        System.out.println("we created kitty!");
    }
    public Kitty(int age){      // конструктор с параметрами
        this.age = age; // this.age - ссылка на на поле класса
    }
    public Kitty(int age, String name){
        this.age =  age;
        this.name = name;
    }
    // конструкторы должны отличаться количеством параметров или их расположением
    // Code - generate - constructor
    // Конструктор по умолчанию должен быть всегда,
    // потому что он удаляется если создаются пользовательские конструкторы

}
