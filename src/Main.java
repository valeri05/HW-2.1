public class Main {
    public static void main(String[] args) {

        int tiket = 15550;  // стоимость билета
        int bonus = 20; // 1 миля = 20 рублей
        int mile = tiket / bonus; // формула для расчета миль

        System.out.println("Количество бонусов за купленный билет:");
        System.out.println(mile + " миль");


    }
}