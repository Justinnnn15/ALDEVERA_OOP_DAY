package aldevera_calculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GUICALCU extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    private JTextField displayField;
    private ALDEVERA_CALCULATOR.Calculator calculator;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUICALCU calculatorGUI = new GUICALCU();
            calculatorGUI.setVisible(true);
        });
    }

    public GUICALCU() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        calculator = new ALDEVERA_CALCULATOR.Calculator();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/",
                                 "4", "5", "6", "*",
                                 "1", "2", "3", "-",
                                 "C", "0", "=", "+"};

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        displayField = new JTextField();
        displayField.setEditable(false);

        add(displayField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "C":
                displayField.setText("");
                break;
            case "=":
                
                String input = displayField.getText();
                String[] parts = input.split("\\+|-|\\*|/"); 
                if (parts.length == 2) {
                    double operand1 = Double.parseDouble(parts[0]);
                    double operand2 = Double.parseDouble(parts[1]);
                    char operator = input.charAt(parts[0].length());
                    
                    calculator.setOperand1(operand1);
                    calculator.setOperand2(operand2);
                    calculator.setOperator(operator);
                    
                    double result = calculator.calculate();
                    displayField.setText(String.valueOf(result));
                } else {
                    displayField.setText("Invalid input");
                }
                break;
            default:
                displayField.setText(displayField.getText() + actionCommand);
                break;
        }
    }
}
