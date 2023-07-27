public interface QueueBehavior {
    public void countPeople();
    default void CloseShop(){
        System.out.println("Мазагин закрыт!");
    }
    default void OpenShop(){
        System.out.println("Мазагин открыт!");
    }
}
