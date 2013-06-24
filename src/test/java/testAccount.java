import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/24/13
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class testAccount {
    public BankAccountDAO mockDao= mock(BankAccountDAO.class);
    public String accountNumber = "123456";
    @Before
    public void setUp()
    {
        reset(mockDao);
        BankAccount.setBankAccountDAO(mockDao);
    }
    @Test
    public void testOpenAccount()
    {
        ArgumentCaptor<BankAccountDTO> ac = ArgumentCaptor.forClass(BankAccountDTO.class);
        BankAccount.openAccount(accountNumber);
        verify(mockDao).save(ac.capture());
        assertEquals(accountNumber, ac.getValue().getAccountNumber());
        assertEquals(0.0, ac.getValue().getBalance());
    }
}
