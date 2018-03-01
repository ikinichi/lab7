import second.*;

public class Test2 {
    public static void main(String[] args){
        //3 пункт методички не совсем соответствует действительности при переопределении абстрактных методов класса
        // и это даже имеет смысл при прототипировании или же необходимости разового использования такого объекта
        Pet pet = new Pet("Mghglhh", 42, true) {
            @Override
            public void voice() {
                System.out.println("Amrglh glfh");
            }
        };
        pet.voice();
        Cat cat = new Cat("Boris",3,false);
        cat.voice();
        Dog dog = new Dog("Jorge",6,true);
        dog.voice();
        Fish fish = new Fish("Woopy",1,false);
        fish.voice();
        PatrolDog patrolDog = new PatrolDog("Clo",14,true);
        patrolDog.voice();
        Snake snake = new Snake("Lakash",4,false);
        snake.voice();

    }
}
