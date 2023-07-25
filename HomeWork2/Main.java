import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Market m1 = new Market();
        m1.OpenShop();
        System.out.println("Меню:" + "\n" + "1. Добавить людей в очередь(сказать касса свободна)" + "\n" + "2. Обслужить клиента(удалить из очереди)" + "\n" + "3. Узнать количество людей в очереди" + "\n"
                + "0. Выход");
        int s = sc.nextInt();
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
                    break;
                case 3:
                    m1.countPeople();
                    break;
                default:
            }
        }
    }
}
