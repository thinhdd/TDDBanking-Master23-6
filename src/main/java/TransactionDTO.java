import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/24/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDTO {
    String accountNumber;
    double amount;
    String des;
    long timeStamp;
    static Calendar calendar =Calendar.getInstance();
    public TransactionDTO(String accountNumber, double amount, String des) {
        this.accountNumber=accountNumber;
        this.amount=amount;
        this.des=des;
        this.timeStamp=calendar.getTimeInMillis();
        //To change body of created methods use File | Settings | File Templates.
    }

    public String getAccountNumber() {
        return this.accountNumber;  //To change body of created methods use File | Settings | File Templates.
    }

    public double getAmount() {
        return this.amount;  //To change body of created methods use File | Settings | File Templates.
    }

    public String getDes() {
        return this.des;  //To change body of created methods use File | Settings | File Templates.
    }

    public long getTimeStamp() {
        return this.timeStamp;  //To change body of created methods use File | Settings | File Templates.
    }

    public static void setCalendar(Calendar calendars) {
        calendar = calendars;
    }
}
