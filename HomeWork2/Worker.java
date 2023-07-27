import java.util.ArrayList;
import java.util.Iterator;

public class Worker implements Iterator<String>, Comparable<Worker>{
    public String firstname;
    public String surname;
    public int age;
    public int salary;
    public Worker(String firstname, String surname, int age, int salary){
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.ind = 0;
    }

    int ind;
    @Override
    public boolean hasNext() {
        return ind++ < 4;
    }

    @Override
    public String next() {
        switch (ind){
            case 1:
                return String.format("firstname: %s", firstname);
            case 2:
                return String.format("surname: %s", surname);
            case 3:
                return String.format("age: %d", age);
            default:
                return String.format("salary: %d", salary);
        }
    }
    @Override
    public int compareTo(Worker o) {
        return Integer.compare(this.age, o.age);
    }
    @Override
    public String toString(){
        return firstname + " " + surname + " " + age + " " + salary;
    }
}
