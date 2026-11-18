class Bank {

    private String customer_name;
    private double balance;

    public Bank(String customer_name, double balance) {
        this.customer_name = customer_name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void showStatement() {
        System.out.println("Customer: " + customer_name);
        System.out.println("Balance: Rs " + balance);
    }

    public static void main(String[] args) {

        Bank account = new Bank("Lydia", 10000.00);

        account.deposit(2000.00);
        account.withdraw(500.00);

        account.showStatement();
    }
}
