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
    private String result;
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
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
        calculator.setSize(355, 220);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setFocusable(true);
        calculator.setResizable(false);
        calculator.setVisible(true);
    }

    public void calculation() {
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

    public void getInput(int i) {
        if (!textField.getText().equals(getResult())) {
            textField.setText(textField.getText() + i);
        } else {
            clearTextField();
            textField.setText(textField.getText() + i);
        }
    }

    public Calculator() {
        button_0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(0);
            }
        });
        button_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(1);
            }
        });
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(2);
            }
        });
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(3);
            }
        });
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(4);
            }
        });
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(5);
            }
        });
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(6);
            }
        });
        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(7);
            }
        });
        button_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(8);
            }
        });
        button_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getInput(9);
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
                if (!textField.getText().equals("MATH ERROR")) {
                    setFirstVariable(Double.parseDouble(textField.getText()));
                    setOperation("division");
                    clearTextField();
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        button_multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("MATH ERROR")) {
                    setFirstVariable(Double.parseDouble(textField.getText()));
                    setOperation("multiply");
                    clearTextField();
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        button_subtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("MATH ERROR")) {
                    setFirstVariable(Double.parseDouble(textField.getText()));
                    setOperation("subtraction");
                    clearTextField();
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        button_addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("MATH ERROR")) {
                    setFirstVariable(Double.parseDouble(textField.getText()));
                    setOperation("addition");
                    clearTextField();
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        button_result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().equals("")) {
                    setSecondVariable(Double.parseDouble(textField.getText()));
                    calculation();
                    textField.setText(getResult());
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                }
            }
        });
        button_point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textField.getText().contains(".")) {
                    textField.setText(textField.getText() + ".");
                } else {
                    java.awt.Toolkit.getDefaultToolkit().beep();
                }
            }
        });
    }
}
