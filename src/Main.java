public class Main {
    public static void main(String[] args) {
        int amountTicketprice = 10_000; // стоимость билета, в рублях
        int amountMilecost = 20; // стоимость одной бонусной милли, в рублях
        int bonusmiles = amountTicketprice / amountMilecost; // рассчет количества бонусных милль
        System.out.println("Количество бонусных миль: " + bonusmiles); // Вывод итога
    }
}
