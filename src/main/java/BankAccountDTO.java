import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/24/13
 * Time: 9:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountDTO {
    String accountNumber;
    double balance;
    public BankAccountDTO(String accountNumber) {
        this.accountNumber=accountNumber;
        this.balance=balance;
        //To change body of created methods use File | Settings | File Templates.
    }

    public String getAccountNumber() {
        return this.accountNumber;  //To change body of created methods use File | Settings | File Templates.
    }

    public double getBalance() {
        return this.balance;  //To change body of created methods use File | Settings | File Templates.
    }

    public void setBalance(double amount) {
        this.balance = this.balance+amount;
    }

    public long getTimeStamp() {
        return 0;  //To change body of created methods use File | Settings | File Templates.
    }
}
