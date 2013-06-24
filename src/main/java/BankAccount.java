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

    public static void openAccount(String accountNumber) {
        BankAccountDTO account = new BankAccountDTO(accountNumber);
        bankAccountDAO.save(account);
        //To change body of created methods use File | Settings | File Templates.
    }


    public static BankAccountDTO getAccount(String accountNumber) {
        return bankAccountDAO.getAccount(accountNumber);  //To change body of created methods use File | Settings | File Templates.
    }
}
