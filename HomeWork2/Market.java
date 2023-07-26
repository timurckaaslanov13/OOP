public class Market implements QueueBehaviour, MarketBehaviour{
    private int count = 0;
    private boolean isOpen = false;
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
