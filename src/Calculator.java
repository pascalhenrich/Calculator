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
    private double firstVariable;
    private double secondVariable;
    private String result;
    private String operation;

    private double getFirstVariable() {
        return firstVariable;
    }

    private void setFirstVariable(double firstVariable) {
        this.firstVariable = firstVariable;
    }

    private double getSecondVariable() {
        return secondVariable;
    }

    private void setSecondVariable(double secondVariable) {
        this.secondVariable = secondVariable;
    }

    private String getResult() {
        return result;
    }

    private void setResult(String result) {
        this.result = result;
    }

    private String getOperation() {
        return operation;
    }

    private void setOperation(String operation) {
        this.operation = operation;
    }

    private void clearTextField() {
        textField.setText("");
    }


    public static void main(String[] args) {
        JFrame calculator = new JFrame("Calculator");
        calculator.setContentPane(new Calculator().calculatorPanel);
        calculator.setSize(355, 220);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setFocusable(true);
        calculator.setResizable(false);
        calculator.setVisible(true);
    }

    private void calculation() {
        switch (getOperation()) {
            case "addition":
                setResult(Double.toString(getFirstVariable() + getSecondVariable()));
                break;
            case "subtraction":
                setResult(Double.toString(getFirstVariable() - getSecondVariable()));
                break;
            case "multiply":
                setResult(Double.toString(getFirstVariable() * getSecondVariable()));
                break;
            case "division":
                if (secondVariable != 0) {
                    setResult(Double.toString(getFirstVariable() / getSecondVariable()));
                } else {
                    setResult("MATH ERROR");

                }
                break;
        }
        setFirstVariable(0.0);
        setSecondVariable(0.0);
    }

    private void getInput(int i) {
        if (!textField.getText().equals(getResult())) {
            textField.setText(textField.getText() + i);
        } else {
            clearTextField();
            textField.setText(textField.getText() + i);
        }
    }

    private void checkError(String s) {
        if (!textField.getText().equals("MATH ERROR")) {
            setFirstVariable(Double.parseDouble(textField.getText()));
            setOperation(s);
            clearTextField();
        } else {
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
    }

    private Calculator() {
        button_0.addActionListener(e -> getInput(0));
        button_1.addActionListener(e -> getInput(1));
        button_2.addActionListener(e -> getInput(2));
        button_3.addActionListener(e -> getInput(3));
        button_4.addActionListener(e -> getInput(4));
        button_5.addActionListener(e -> getInput(5));
        button_6.addActionListener(e -> getInput(6));
        button_7.addActionListener(e -> getInput(7));
        button_8.addActionListener(e -> getInput(8));
        button_9.addActionListener(e -> getInput(9));
        button_C.addActionListener(e -> {
            clearTextField();
            setFirstVariable(0.0);
            setSecondVariable(0.0);
            setOperation("empty");
        });
        button_division.addActionListener(e -> checkError("division"));
        button_multiply.addActionListener(e -> checkError("multiply"));
        button_subtraction.addActionListener(e -> checkError("subtraction"));
        button_addition.addActionListener(e -> checkError("addition"));
        button_result.addActionListener(e -> {
            if (!textField.getText().equals("")) {
                setSecondVariable(Double.parseDouble(textField.getText()));
                calculation();
                textField.setText(getResult());
            } else {
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
        });
        button_point.addActionListener(e -> {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText() + ".");
            } else {
                java.awt.Toolkit.getDefaultToolkit().beep();
            }
        });
    }
}
