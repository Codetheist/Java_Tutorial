public class BankAccount {

    private string userName;
    private double balance;

    public static void main(string args[]) {

        BankAccount b1 = new BankAccount();

        b1.viewAccountInfo();
        b1.deposit(300.0);
        b1.viewAccountInfo();
        b1.withdrawl(50.0)
        b1.viewAccountInfo();
        

    }


    public BankAccount() {
        userName = "John Doe";
        balance = 0.0;
    }

    public BankAccount(String userName, double balance) {
        this.userName= userName;
        this.balance = balance;
    }

    public string getUserName () {
        return userName;
    }

    public void setUserName(string username){
        this.userName = username;
    }

    public void deposit(double amnt) {
        balance += amnt;
    }

    public void withdrawl(double amount) {
        balance -= amount;
    }

    public void viewAccountInfo() {
        System.out.println("\n::Account Information::");
        System.out.println("::Username: " + userName);
        System.out.println("::Balance: " + String.format("%.2f", balance)+ "\n");
    }

}