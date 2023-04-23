import org.junit.Test;
import static org.junit.Assert.*;

public class ExchangeRateTest {

    @Test
    public void testGetRateNotNull() throws Exception {
        //When
        double SUT = ExchangeRate.getRate();
        //Then
        assertNotNull(SUT);
    }
    @Test
    public void testGetDateNotNull() throws Exception {
        //When
        String SUT = ExchangeRate.getDate();
        //Then
        assertNotNull(SUT);
    }
}