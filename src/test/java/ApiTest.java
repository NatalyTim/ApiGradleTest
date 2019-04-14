import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ApiTest extends BaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<Object[]> list = Account.createList("http://kn-ktapp.herokuapp.com/apitest/accounts");
        list.add(new Object[]{Account.create("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678")});
        return list;
    }

    @Parameterized.Parameter()
    public Account nameJson;

    @Test
    public void testMethod() {
        checkAccountId(nameJson);
    }
}
