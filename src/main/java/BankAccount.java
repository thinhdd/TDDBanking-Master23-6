import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/24/13
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount {
    static BankAccountDAO bankAccountDAO;
    public static void setBankAccountDAO(BankAccountDAO mockDao) {
        bankAccountDAO = mockDao;
        //To change body of created methods use File | Settings | File Templates.
    }

    public static BankAccountDTO openAccount(String accountNumber) {
        BankAccountDTO account = new BankAccountDTO(accountNumber);
        bankAccountDAO.save(account);
        return account;
        //To change body of created methods use File | Settings | File Templates.
    }


    public static BankAccountDTO getAccount(String accountNumber) {
        return bankAccountDAO.getAccount(accountNumber);  //To change body of created methods use File | Settings | File Templates.
    }

    public static void doDeposit(String accountNumber, double amount, String des) {
        BankAccountDTO account = bankAccountDAO.getAccount(accountNumber);
        Transaction.createTransaction(accountNumber,amount,des, true);
        account.setBalance(amount);
        bankAccountDAO.save(account);
        //To change body of created methods use File | Settings | File Templates.
    }

    public static void doWithDraw(String accountNumber, double amount, String des) {
        BankAccountDTO account = bankAccountDAO.getAccount(accountNumber);
        Transaction.createTransaction(accountNumber,amount,des, false);
        account.setBalance(-amount);
        bankAccountDAO.save(account);
        //To change body of created methods use File | Settings | File Templates.
    }

    public static List<TransactionDTO> getAllTransaction(String accountNumber) {
        return Transaction.getAllTransaction(accountNumber);
        //To change body of created methods use File | Settings | File Templates.
    }

    public static List<TransactionDTO> getAllTransaction(String accountNumber, long start, long end) {
        return Transaction.getAllTransaction(accountNumber,start, end);
        //To change body of created methods use File | Settings | File Templates.
    }
}
