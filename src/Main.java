public class Main {
    public static void main(String[] args) {
        int Ticketprice = 10_000; // стоимость билета, в рублях
        int Milecost = 20; // стоимость одной бонусной милли, в рублях
        int bonusmiles = Ticketprice / Milecost; // рассчет количества бонусных милль
        System.out.println("Количество бонусных миль: " + bonusmiles); // вывод итога
    }
}
