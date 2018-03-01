package second;

public class Cat extends Pet {
    public Cat(String name, int age, boolean hungry) {
        super(name, age, hungry);
    }

    @Override
    public void voice() {
        System.out.println("mew-mew");
    }
}
