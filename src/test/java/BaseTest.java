import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class BaseTest {

    public void checkAccountId(Account account) {
        assertNotNull("Json invalid!", account);
        assertNotEquals("The account_id not exist!",0,account.getAccountId());
        System.out.println("The account_id is " + account.getAccountId());
    }
}