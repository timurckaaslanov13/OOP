import java.util.Timer;

public class Market implements QueueBehavior, MarketBehavior{
    private int count = 0;
    private boolean isOpen = false;
    private double time = 0.0;
    @Override
    public void countPeople() {
        System.out.printf("В очереди %d людей\n", count);
    }

    @Override
    public void Add() {
        count = count + 1;
        System.out.println("В очередь добавился один человек");
        updateShopState();
    }

    @Override
    public void Delete() {
        count = count - 1;
        System.out.println("Очередь покинул 1 человек");
        updateShopState();
    }
    public void updateShopState(){
        if (count == 0){
            countPeople();
            CloseShop();
        }
        else{
            countPeople();
            OpenShop();
        }
    }
}
