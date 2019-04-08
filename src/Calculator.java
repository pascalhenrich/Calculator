import javax.swing.*;
import java.awt.event.*;

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
    private double result;
    private String operation;

    public double getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(double firstVariable) {
        this.firstVariable = firstVariable;
    }

    public double getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(double secondVariable) {
        this.secondVariable = secondVariable;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void clearTextField() {
        textField.setText("");
    }


    public static void main(String[] args) {
        JFrame calculator = new JFrame("Calculator");
        calculator.setContentPane(new Calculator().calculatorPanel);
        KeyLis listener = new KeyLis();
        calculator.addKeyListener(listener);
        calculator.setSize(355, 220);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setFocusable(true);
        calculator.setResizable(false);
        calculator.setVisible(true);
    }

    public Calculator() {
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("")) {
                    textField.setText(textField.getText() + "0");
                }
            }
        });
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });
        button_C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTextField();
                setFirstVariable(0.0);
                setSecondVariable(0.0);
                setOperation("empty");
            }
        });
        button_division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setFirstVariable(Double.parseDouble(textField.getText()));
                setOperation("division");
                clearTextField();
            }
        });
        button_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setFirstVariable(Double.parseDouble(textField.getText()));
                setOperation("multiply");
                clearTextField();
            }
        });
        button_subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setFirstVariable(Double.parseDouble(textField.getText()));
                setOperation("subtraction");
                clearTextField();
            }
        });
        button_addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setFirstVariable(Double.parseDouble(textField.getText()));
                setOperation("addition");
                clearTextField();
            }
        });

        calculatorPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                System.out.println(e);
            }
        });
    }


}
