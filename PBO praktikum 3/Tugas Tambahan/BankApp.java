// Rona Realita Najma - 24060122140124

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        // Skenario saldo mencukupi
        try {
            account.withdraw(200.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Skenario saldo tidak mencukupi
        try {
            account.withdraw(400.0);
            System.out.println("Saldo saat ini: $" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
