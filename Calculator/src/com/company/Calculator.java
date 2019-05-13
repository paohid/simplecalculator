package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    double number, result;
    int calculation;


    JFrame frame;
    //Creating objects of Components
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton radioOnButton = new JRadioButton("on");
    JRadioButton radioOffButton = new JRadioButton("off");
    JButton zeroButton = new JButton("0");
    JButton oneButton = new JButton("1");
    JButton twoButton = new JButton("2");
    JButton threeButton = new JButton("3");
    JButton fourButton = new JButton("4");
    JButton fiveButton = new JButton("5");
    JButton sixButton = new JButton("6");
    JButton sevenButton = new JButton("7");
    JButton eightButton = new JButton("8");
    JButton nineButton = new JButton("9");
    JButton dotButton = new JButton(".");
    JButton clearButton = new JButton("CLR");
    JButton deleteButton = new JButton("DEL");
    JButton equalButton = new JButton("=");
    JButton multiplyButton = new JButton("x");
    JButton divideButton = new JButton("/");
    JButton addButton = new JButton("+");
    JButton substractButton = new JButton("-");
    JButton squareButton = new JButton("x\u00B2");
    JButton reciprocalButton = new JButton("1/x");
    JButton sqrootButton = new JButton("\u221A");


    Calculator()
    {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {



        //JFrame(Window) Properties
        frame = new JFrame();
        frame.setTitle("Simple Calculator");
        frame.setSize(300, 490);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.CYAN);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        //Label properties
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.LIGHT_GRAY);
        frame.add(label);

        //Setting property of text field
        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        //On radio button
        radioOnButton.setBounds(10, 95, 60, 40);
        radioOnButton.setSelected(true);
        radioOnButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        radioOnButton.setBackground(Color.CYAN);
        radioOnButton.setForeground(Color.BLUE);
        frame.add(radioOnButton);

        //Off radio button
        radioOffButton.setBounds(10, 120, 60, 40);
        radioOffButton.setSelected(false);
        radioOffButton.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        radioOffButton.setBackground(Color.CYAN);
        radioOffButton.setForeground(Color.BLUE);
        frame.add(radioOffButton);

        /*Creating an object of button group and
           adding both the radio buttons to that button group*/
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioOnButton);
        buttonGroup.add(radioOffButton);

        //button 7
        sevenButton.setBounds(10, 230, 60, 40);
        sevenButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(sevenButton);

        //button 8
        eightButton.setBounds(80, 230, 60, 40);
        eightButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(eightButton);

        //button 9
        nineButton.setBounds(150, 230, 60, 40);
        nineButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(nineButton);

        //button 4
        fourButton.setBounds(10, 290, 60, 40);
        fourButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(fourButton);

        //button 5
        fiveButton.setBounds(80, 290, 60, 40);
        fiveButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(fiveButton);

        //button 6
        sixButton.setBounds(150, 290, 60, 40);
        sixButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(sixButton);

        //button 1
        oneButton.setBounds(10, 350, 60, 40);
        oneButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(oneButton);

        //button 2
        twoButton.setBounds(80, 350, 60, 40);
        twoButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(twoButton);

        //button 3
        threeButton.setBounds(150, 350, 60, 40);
        threeButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(threeButton);

        //dot button
        dotButton.setBounds(150, 410, 60, 40);
        dotButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(dotButton);

        //button 0
        zeroButton.setBounds(10, 410, 130, 40);
        zeroButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(zeroButton);

        //button =
        equalButton.setBounds(220, 350, 60, 100);
        equalButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        equalButton.setBackground(Color.PINK);
        frame.add(equalButton);

        //button /
        divideButton.setBounds(220, 110, 60, 40);
        divideButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        divideButton.setBackground(Color.PINK);
        frame.add(divideButton);

        //button square root
        squareButton.setBounds(10, 170, 60, 40);
        squareButton.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        frame.add(squareButton);

        //button X
        multiplyButton.setBounds(220, 230, 60, 40);
        multiplyButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        multiplyButton.setBackground(Color.PINK);
        frame.add(multiplyButton);

        //button -
        substractButton.setBounds(220, 170, 60, 40);
        substractButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        substractButton.setBackground(Color.PINK);
        frame.add(substractButton);

        //button +
        addButton.setBounds(220, 290, 60, 40);
        addButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        addButton.setBackground(Color.PINK);
        frame.add(addButton);

        //button square
        squareButton.setBounds(80, 170, 60, 40);
        squareButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        frame.add(squareButton);

        //reciprocal button
        reciprocalButton.setBounds(150, 170, 60, 40);
        reciprocalButton.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        frame.add(reciprocalButton);

        //delete button
        deleteButton.setBounds(150, 110, 60, 40);
        deleteButton.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        deleteButton.setBackground(Color.BLACK);
        deleteButton.setForeground(Color.PINK);
        frame.add(deleteButton);

        //clear button
        clearButton.setBounds(80, 110, 60, 40);
        clearButton.setFont(new Font("Courier New", Font.BOLD, 12));
        clearButton.setBackground(Color.BLACK);
        clearButton.setForeground(Color.PINK);
        frame.add(clearButton);

    }


    public void addActionEvent() {
        //Registering ActionListener to each button
        radioOnButton.addActionListener(this);
        radioOffButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        divideButton.addActionListener(this);
        squareButton.addActionListener(this);
        squareButton.addActionListener(this);
        reciprocalButton.addActionListener(this);
        substractButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        addButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        equalButton.addActionListener(this);
        zeroButton.addActionListener(this);
        dotButton.addActionListener(this);
    }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == radioOnButton) {
            enable();
        } else if (source == radioOffButton) {
            disable();
        } else if (source == clearButton) {
            //Clearing texts of label and text field
            label.setText("");
            textField.setText("");
        } else if (source == deleteButton) {
            //Setting functionality for delete button(backspace)
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        } else if (source == zeroButton) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == oneButton) {
            textField.setText(textField.getText() + "1");
        } else if (source == twoButton) {
            textField.setText(textField.getText() + "2");
        } else if (source == threeButton) {
            textField.setText(textField.getText() + "3");
        } else if (source == fourButton) {
            textField.setText(textField.getText() + "4");
        } else if (source == fiveButton) {
            textField.setText(textField.getText() + "5");
        } else if (source == sixButton) {
            textField.setText(textField.getText() + "6");
        } else if (source == sevenButton) {
            textField.setText(textField.getText() + "7");
        } else if (source == eightButton) {
            textField.setText(textField.getText() + "8");
        } else if (source == nineButton) {
            textField.setText(textField.getText() + "9");
        } else if (source == dotButton) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }

        } else if (source == addButton) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == substractButton) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == multiplyButton) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == divideButton) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == squareButton) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == squareButton) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == reciprocalButton) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == equalButton) {
            //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    result = number + Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;
                case 2:
                    result = number - Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;
                case 3:
                    result = number * Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;
                case 4:
                    result = number / Double.parseDouble(textField.getText());
                    if (Double.toString(result).endsWith(".0")) {
                        textField.setText(Double.toString(result).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(result));
                    }
                    label.setText("");
                    break;

            }
        }


    }

    public void enable() {
        radioOnButton.setEnabled(false);
        radioOffButton.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        clearButton.setEnabled(true);
        deleteButton.setEnabled(true);
        divideButton.setEnabled(true);
        squareButton.setEnabled(true);
        squareButton.setEnabled(true);
        reciprocalButton.setEnabled(true);
        substractButton.setEnabled(true);
        sevenButton.setEnabled(true);
        eightButton.setEnabled(true);
        nineButton.setEnabled(true);
        multiplyButton.setEnabled(true);
        fourButton.setEnabled(true);
        fiveButton.setEnabled(true);
        sixButton.setEnabled(true);
        addButton.setEnabled(true);
        oneButton.setEnabled(true);
        twoButton.setEnabled(true);
        threeButton.setEnabled(true);
        equalButton.setEnabled(true);
        zeroButton.setEnabled(true);
        dotButton.setEnabled(true);

    }

    public void disable() {
        radioOnButton.setEnabled(true);
        radioOffButton.setEnabled(false);
        textField.setText("");
        label.setText(" ");
        clearButton.setEnabled(false);
        deleteButton.setEnabled(false);
        divideButton.setEnabled(false);
        squareButton.setEnabled(false);
        squareButton.setEnabled(false);
        reciprocalButton.setEnabled(false);
        substractButton.setEnabled(false);
        sevenButton.setEnabled(false);
        eightButton.setEnabled(false);
        nineButton.setEnabled(false);
        multiplyButton.setEnabled(false);
        fourButton.setEnabled(false);
        fiveButton.setEnabled(false);
        sixButton.setEnabled(false);
        addButton.setEnabled(false);
        oneButton.setEnabled(false);
        twoButton.setEnabled(false);
        threeButton.setEnabled(false);
        equalButton.setEnabled(false);
        zeroButton.setEnabled(false);
        dotButton.setEnabled(false);
    }
}
