package second;

public class Fish extends Pet {
    public Fish(String name, int age, boolean hungry) {
        super(name, age, hungry);
    }

    @Override
    public void voice() {
        System.out.println("... ..... .....");
    }
}
