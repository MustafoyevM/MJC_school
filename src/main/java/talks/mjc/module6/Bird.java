package talks.mjc.module6;

public class Bird extends Animal{

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }
}
//This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.
//This animal is mostly blue. It has 2 pows and no fur. Moreover, it has 2 wings and can fly.