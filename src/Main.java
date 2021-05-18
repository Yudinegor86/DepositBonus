public class Main {
    public static void main(String[] args) {

        double customerAccount = 287.23; // Счет клиента
        double refill = 2840.33; // Пополнение в рублях
        double depositBonus = 1; // Бонус за пополнение в рублях
        int bonusLimit = 1000; // Лимит который нужно внести чтобы получить бонус
        int bonusConditions = 100; // Сумма за которую дают бонус
        double bonus = 0;
        if (refill >= bonusLimit) {
            bonus = (int) refill / bonusConditions * depositBonus;
        }
        System.out.println("The bonus is " + bonus + " rubles");
        double totalBalance = customerAccount + refill + bonus;
        System.out.println("Final balance = " + totalBalance);

    }
}
