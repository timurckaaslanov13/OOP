public class Cat extends Animal implements AnimalInterface{
    @Override
    public void voices(String name) {
        System.out.println("meow" + "im" + name);
    }
}
