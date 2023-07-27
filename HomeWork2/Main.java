import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Market m1 = new Market();
        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            workers.add(new Worker("Имя" + i, "Фамилия" + i, 18 + i, 30000 * i));
        }
        System.out.println("Работник на сегодняшний день:");
        Worker worker = new Worker("Тимур", "Асланов", 19, 30000);
        Iterator<String> iter = worker;
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        Collections.sort(workers);
        for (Worker i:workers) {
            System.out.println(i);
        }
        functionInter value;
        value = () -> 1.2;
        m1.OpenShop();
        int s = 1;
        while (s != 0) {
            System.out.println("Меню:" + "\n" + "1. Добавить людей в очередь(сказать касса свободна)" + "\n" + "2. Обслужить клиента(удалить из очереди)" + "\n" + "3. Узнать количество людей в очереди" + "\n"
                    + "0. Выход");
            s = sc.nextInt();
            switch (s) {
                case 1:
                    m1.Add();
                    break;
                case 2:
                    m1.Delete();
                    System.out.println("Время обслуживания клиента: " + value.getTime());
                    break;
                case 3:
                    m1.countPeople();
                    break;
                default:
            }
        }
    }
}
