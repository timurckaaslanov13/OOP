public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greet() {
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет)", getName(), getAge());
    }
}
