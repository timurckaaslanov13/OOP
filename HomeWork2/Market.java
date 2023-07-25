public class Market implements QueueBehaviour, MarketBehaviour{
    public int count = 0;

    @Override
    public void countPeople() {
        System.out.printf("В очереди %d людей\n", count);
    }

    @Override
    public void Add() {
        count = count + 1;
        System.out.println("В очередь добавился один человек");;
    }

    @Override
    public void Delete() {
        count = count - 1;
        System.out.println("Очередь покинул 1 человек");;
    }
}