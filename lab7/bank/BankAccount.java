package bank;

public class BankAccount{
    private long balance;
    private String number;

    public long getBalance ()
    {
        return balance;
    }
    public String getNumber ()
    {
        return number;
    }
    public void withdraw (long money)
    {
        balance -= money;
    }
    public void deposit (long money)
    {
        balance += money;
    }

    BankAccount(long balanceBegin, String numberBegin) {
        balance = balanceBegin;
        number = numberBegin;
    }


}
