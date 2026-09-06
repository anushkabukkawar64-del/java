class inheritance{

    void eat() {
        System.out.println("Eating");
    }
}

public class Dog extends inheritance {

    void bark() {
        System.out.println("Barking");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}