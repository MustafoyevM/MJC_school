package talks.mjc.module6;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println(dog.getDescription());
        Animal bird = new Bird();
        System.out.println(bird.getDescription());
    }
}
//This animal is mostly blue. It has 2 pows and no fur. Moreover, it has 2 wings and can fly.
//This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.
