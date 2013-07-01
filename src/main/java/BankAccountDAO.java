import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/24/13
 * Time: 9:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountDAO {
    Connection connection;
    public BankAccountDAO(DataSource dataSource) throws SQLException {
        this.connection=dataSource.getConnection();
        //To change body of created methods use File | Settings | File Templates.
    }

    public void save(BankAccountDTO account) {
        //To change body of created methods use File | Settings | File Templates.
    }

    public BankAccountDTO getAccount(String accountNumber) throws SQLException {
        String queryString = "SELECT * FROM SAVINGS_ACCOUNT WHERE ACCOUNT_NUMBER='" + accountNumber + "'";
        ResultSet resultSet = connection.createStatement().executeQuery(queryString);
        if(resultSet.next())
        {
            BankAccountDTO accountDTO = new BankAccountDTO(accountNumber);
            accountDTO.setBalance(resultSet.getDouble("balance"));
            accountDTO.setTimeStamp(resultSet.getLong("opentime"));
            return accountDTO;
        }
        else
         return null;//To change body of created methods use File | Settings | File Templates.
    }
}
