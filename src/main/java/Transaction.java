/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/24/13
 * Time: 9:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Transaction {
    static TransactionDAO transactionDAO;
    public static void setTransactionDAO(TransactionDAO mockTDao) {
        transactionDAO = mockTDao;
        //To change body of created methods use File | Settings | File Templates.
    }

    public static void createTransaction(String accountNumber, double amount, String des) {
        TransactionDTO transactionDTO = new TransactionDTO(accountNumber, amount, des);
        transactionDAO.save(transactionDTO);
        //To change body of created methods use File | Settings | File Templates.
    }
}
