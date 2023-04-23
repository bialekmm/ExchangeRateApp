import javax.swing.SwingUtilities;

public class ExchangeRateApp {
    public static void main(String[] args){
        SwingUtilities.invokeLater(CurrencyConverter::new);
    }
}
