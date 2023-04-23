import javax.swing.*;

public class CurrencyConverter {
    private final JFrame frame;
    private final JTextField multiplierTextField;
    private final JTextField dividerTextField;

    public CurrencyConverter() {
        frame = new JFrame("Exchange Rate App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        multiplierTextField = new JTextField(10);
        dividerTextField = new JTextField(10);
        JLabel multiplierLabel = new JLabel("PLN:");
        JLabel dividerLabel = new JLabel("GBP:");


        try{
            JLabel rateLabel = new JLabel("Exchange rent: " + ExchangeRate.getRate());
            frame.add(rateLabel);
            JLabel dateLabel = new JLabel("Date: " + ExchangeRate.getDate());
            frame.add(dateLabel);
        }catch (Exception ex){
            throw new RuntimeException(ex);
        }

        multiplierTextField.addActionListener(e -> {
            try {
                double value = Double.parseDouble(multiplierTextField.getText());
                double result = (double) Math.round(value / ExchangeRate.getRate() * 100) / 100 ;
                dividerTextField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Non-numeric value!", "Warning", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        dividerTextField.addActionListener(e -> {
            try {
                double value = Double.parseDouble(dividerTextField.getText());
                double result = (double) Math.round(value * ExchangeRate.getRate() * 100) / 100;
                multiplierTextField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Non-numeric value!", "Warning", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        frame.add(multiplierLabel);
        frame.add(multiplierTextField);
        frame.add(dividerLabel);
        frame.add(dividerTextField);
        frame.pack();
        frame.setVisible(true);

    }
    public JTextField getMultiplierTextField() {
        return multiplierTextField;
    }

    public JTextField getDividerTextField() {
        return dividerTextField;
    }
}
