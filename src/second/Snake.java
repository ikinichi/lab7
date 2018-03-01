package second;

public class Snake extends Pet {
    public Snake(String name, int age, boolean hungry) {
        super(name, age, hungry);
    }

    @Override
    public void voice() {
        System.out.println("Ssss-sss-s");
    }
}
