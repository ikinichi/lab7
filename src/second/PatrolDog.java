package second;

public class PatrolDog extends Pet {
    public PatrolDog(String name, int age, boolean hungry) {
        super(name, age, hungry);
    }

    @Override
    public void voice() {
        System.out.println("woof-woofout");
    }
}
