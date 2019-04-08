import javax.swing.*;

public class Calculator {
    private JPanel calculatorPanel;
    private JButton button_0;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JButton button_4;
    private JButton button_5;
    private JButton button_6;
    private JButton button_7;
    private JButton button_8;
    private JButton button_9;
    private JButton button_point;
    private JButton button_addition;
    private JButton button_subtraction;
    private JButton button_multiply;
    private JButton button_division;
    private JButton button_result;
    private JTextField textField;
    private JButton button_C;

    public static void main(String[] args) {
        JFrame calculator = new JFrame("Calculator");
        calculator.setContentPane(new Calculator().calculatorPanel);
        calculator.setSize(355, 220);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setResizable(false);
        calculator.setVisible(true);

    }
}
