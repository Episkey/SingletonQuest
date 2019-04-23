public class Singleton {
    // singleton declaration
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            // s'il n'existe pas créer le
            instance = new Singleton();
        }
        // dans tous les cas retourne la même instance.
        return instance;
    }

    // constructeur privé pour empêcher de nouvelles instances.
    private Singleton() {
    }

    // infos que contient le singleton.
    private Bank bank;

    public void openAccount(int value) {
        bank = new Bank(value);
    }

    public void deposit(int value) {
        bank.setTotal(bank.getTotal() + value);
    }

    public void withdraw(int value) {
        bank.setTotal(bank.getTotal() - value);
    }

    public Bank getBank() {
        return bank;
    }
}