import org.junit.Test;
import javax.swing.*;
import java.awt.event.ActionEvent;
import static org.junit.Assert.*;
public class CurrencyConverterTest {
    @Test
    public void testPLNtoGBPConversion() throws Exception {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        JTextField multiplierTextField = currencyConverter.getMultiplierTextField();
        JTextField dividerTextField = currencyConverter.getDividerTextField();
        //When
        multiplierTextField.setText("100");
        multiplierTextField.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, ""));
        double x = (Math.round((100/ExchangeRate.getRate())*10));
        double SUT = x/10;
        //Then
        assertEquals(String.valueOf(SUT), dividerTextField.getText());
    }
    @Test
    public void testGBPtoPLNConversion() throws Exception {
        //Given
        CurrencyConverter currencyConverter = new CurrencyConverter();
        JTextField multiplierTextField = currencyConverter.getMultiplierTextField();
        JTextField dividerTextField = currencyConverter.getDividerTextField();
        //When
        dividerTextField.setText("50");
        dividerTextField.getActionListeners()[0].actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, ""));
        double x = (Math.round((50*ExchangeRate.getRate())*100));
        double SUT = x/100;
        //Then
        assertEquals(String.valueOf(SUT), multiplierTextField.getText());
    }
}