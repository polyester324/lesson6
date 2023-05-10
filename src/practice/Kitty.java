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
    // методы
    // у метода должно быть имя(с маленькой буквы)
    // методу можно передать параметры
    // в методе обязательно указать тело метода
    // нужно указать что метод выдает как результат
    void makeVoice(){   // void - ключевое слово, метод ничего не возвращает, лишь печает строку
        System.out.println("Meow meow!");
    }
    int giveMeAgePlusOneYear(){    // return прописывается когда мы конкретно получаем значение
        return age + 1;
    }
    void printMeAgePlusOneYear(){    // return прописывается когда мы конкретно получаем значение
        System.out.println(age + 1);
    }

}
