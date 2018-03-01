package second;

public abstract class Pet {
    //Т.к метод voice постоянно переопределяется, то логичнее использовать интерфейс
    // (но в тз это явно не указано)

    private String name;
    private int age;
    private boolean hungry;

    public Pet(String name,int age,boolean hungry){
        this.name = name;
        this.age = age;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public abstract void voice();

}
