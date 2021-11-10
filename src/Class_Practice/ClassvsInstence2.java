package Class_Practice;
class Animal {
    void walk() {
        System.out.println("나는 걷고 있다.");
    }
}
class Bird extends Animal {
    void fly() {
        System.out.println("나는 날고 있다.");
    }
}
public class ClassvsInstence2 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}
