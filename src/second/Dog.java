package second;

public class Dog extends Pet {
    public Dog(String name, int age, boolean hungry) {
        super(name, age, hungry);
    }

    @Override
    public void voice() {
        System.out.println("woof-woof");
    }
}
