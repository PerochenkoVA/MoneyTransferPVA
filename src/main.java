public class main {
    public static void main(String[] args) {
        int oldBalance = 2_000_000_000; // Баланс карты
        int transfer = 500_000_000; // Сумма перевода
        int newBalance = oldBalance - transfer;
        System.out.println(newBalance); // Новый баланс карты
    }
}