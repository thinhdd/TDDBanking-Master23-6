import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/24/13
 * Time: 9:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class testTransaction {
    public BankAccountDAO mockDao = mock(BankAccountDAO.class);
    public TransactionDAO mockTDao = mock(TransactionDAO.class);
    public String accountNumber = "123456";
    @Before
    public void setUp()
    {
        reset(mockDao);
        reset(mockTDao);
        BankAccount.setBankAccountDAO(mockDao);
        Transaction.setTransactionDAO(mockTDao);
    }
    @Test
    public void testDeposit()
    {
        ArgumentCaptor<BankAccountDTO> ac = ArgumentCaptor.forClass(BankAccountDTO.class);
        BankAccountDTO account = BankAccount.openAccount(accountNumber);
        when(mockDao.getAccount(accountNumber)).thenReturn(account);
        BankAccount.doDeposit(accountNumber, 100.0, "Them 100k");
        verify(mockDao ,times(2)).save(ac.capture());
        List<BankAccountDTO> list = ac.getAllValues();
        assertEquals(accountNumber, list.get(1).getAccountNumber());
        assertEquals(100.0, list.get(1).balance);
    }
}