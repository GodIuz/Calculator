package awtcalculator;
//importing all necessary packages
import java.awt.*;
import java.awt.event.*;

public class AwtCalculator implements ActionListener, ItemListener {

    //Declaring and Initializing variable for calculations
    double num1=0, num2=0, result=0;
    int calculation;

    //Creating object of Frame Class
    Frame frame=new Frame("Calculator");

    //Creating objects of all the components
    Label label=new Label();
    TextField textField=new TextField();
    CheckboxGroup checkboxGroup=new CheckboxGroup();
    Checkbox onCheckbox=new Checkbox("On",checkboxGroup,true);
    Checkbox offCheckbox=new Checkbox("Off",checkboxGroup,false);
    Button buttonZero = new Button("0");
    Button buttonOne = new Button("1");
    Button buttonTwo = new Button("2");
    Button buttonThree = new Button("3");
    Button buttonFour = new Button("4");
    Button buttonFive = new Button("5");
    Button buttonSix = new Button("6");
    Button buttonSeven = new Button("7");
    Button buttonEight = new Button("8");
    Button buttonNine = new Button("9");
    Button buttonDot = new Button(".");
    Button buttonClear = new Button("CLR");
    Button buttonDelete = new Button("DEL");
    Button buttonEqual = new Button("=");
    Button buttonNegative = new Button("(-)");
    Button buttonMul = new Button("x");
    Button buttonDiv = new Button("/");
    Button buttonPlus = new Button("+");
    Button buttonMinus = new Button("-");
    Button buttonSquare = new Button("x\u00B2");
    Button buttonReciprocal = new Button("1/x");
    Button buttonSqrt = new Button("\u221A");


    //Creating Constructor of the Class
    AwtCalculator(){

        prepareFrame();
        addComponents();
        addActionEvent();


    }

    public void prepareFrame(){

        //Setting Frame's Property
        frame.setSize(300,490);
        frame.setLayout(null);
        frame.setBackground(new Color(12,12,93));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.addWindowListener(
                new WindowAdapter(){
                    public void windowClosing(WindowEvent e) { System.exit(0); }
                }
        );
    }

    public void addComponents(){

        //Setting properties of the Components and adding them to the Frame
        label.setBounds(10, 40, 200, 20);
        label.setForeground(Color.white);
        label.setFont(new Font("Arial",Font.BOLD,15));
        frame.add(label);

        textField.setBounds(15,60,270,35);
        textField.setFont(new Font("Arial",Font.BOLD,20));
        textField.setEditable(false);
        frame.add(textField);


        onCheckbox.setBounds(15, 100, 60, 40);
        onCheckbox.setFont(new Font("Arial", Font.BOLD, 14));
        onCheckbox.setBackground(new Color(12,12,93));
        onCheckbox.setForeground(Color.white);
        onCheckbox.setFocusable(false);
        frame.add(onCheckbox);

        offCheckbox.setBounds(15, 125, 60, 40);
        offCheckbox.setFont(new Font("Arial", Font.BOLD, 14));
        offCheckbox.setBackground(new Color(12,12,93));
        offCheckbox.setForeground(Color.white);
        offCheckbox.setFocusable(false);
        frame.add(offCheckbox);

        buttonSeven.setBounds(15, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(85, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(155, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(15, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(85, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(155, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(15, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(85, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(155, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(155, 410, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(15, 410, 60, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonNegative.setBounds(85,410,60,40);
        buttonNegative.setFont(new Font("Arial",Font.BOLD,20));
        buttonNegative.setFocusable(false);
        frame.add(buttonNegative);

        buttonEqual.setBounds(225, 350, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(72, 231, 172));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDiv.setBounds(225, 110, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(72, 231, 172));
        buttonDiv.setFocusable(false);
        frame.add(buttonDiv);

        buttonSqrt.setBounds(15, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttonMul.setBounds(225, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(72, 231, 172));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        buttonMinus.setBounds(225, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(72, 231, 172));
        buttonMinus.setFocusable(false);
        frame.add(buttonMinus);

        buttonPlus.setBounds(225, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(72, 231, 172));
        buttonPlus.setFocusable(false);
        frame.add(buttonPlus);

        buttonSquare.setBounds(85, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(155, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);

        buttonDelete.setBounds(155, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        buttonDelete.setBackground(Color.red);
        buttonDelete.setForeground(Color.white);
        buttonDelete.setFocusable(false);
        frame.add(buttonDelete);

        buttonClear.setBounds(85, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        buttonClear.setBackground(Color.red);
        buttonClear.setForeground(Color.white);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);



    }

    public void addActionEvent(){

        //Registering ActionListener and ItemListener
        onCheckbox.addItemListener(this);
        offCheckbox.addItemListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonNegative.addActionListener(this);
    }
    public static void main(String[] args) {

        //Creating object of the AwtCalculator class which will call the constructor
        AwtCalculator calculator = new AwtCalculator();
    }

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == buttonClear) {
            textField.setText("");
        }else if(source==buttonDelete){
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }if (textField.getText().endsWith("")) {
                label.setText("");
            }
        }

        else if(source==buttonZero){
            if(textField.getText().equals("0")) {
                return;
            }
            else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        }else if(source==buttonPlus){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=1;
            textField.setText("");
            label.setText(str + "+");
        }else if(source==buttonMinus){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=2;
            textField.setText("");
            label.setText(str + "-");
        }else if(source==buttonMul){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=3;
            textField.setText("");
            label.setText(str + "X");
        }else if(source==buttonDiv){
            String str = textField.getText();
            num1=Double.parseDouble(textField.getText());
            calculation=4;
            textField.setText("");
            label.setText(str + "/");
        }else if (source == buttonSqrt) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(num1);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            num1 = Double.parseDouble(textField.getText());
            double square = Math.pow(num1, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonReciprocal) {
            num1 = Double.parseDouble(textField.getText());
            double reciprocal = 1 / num1;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        }else if(source==buttonNegative){
            if(textField.getText().equals("")) {
                return;
            }
            double temp = Double.parseDouble(textField.getText());
            temp = temp * (-1);
            textField.setText(String.valueOf(temp));
        }
        else if(source==buttonEqual){
            //Setting functionalities for equals button
            num2=Double.parseDouble(textField.getText());
            switch(calculation){
                case 1:
                    result=num1+num2;
                    break;
                case 2:
                    result=num1-num2;
                    break;
                case 3:
                    result=num1*num2;
                    break;
                case 4:
                    result=num1/num2;
                    break;
            }
            if (Double.toString(result).endsWith(".0")) {
                textField.setText(Double.toString(result).replace(".0", ""));
            } else {
                textField.setText(Double.toString(result));
            }
            label.setText("");
            num1=result;

        }

    }

    //Overriding itemStateChanged() method
    @Override
    public void itemStateChanged(ItemEvent e) {

        //Setting functionalities for on and off button
        if(e.getSource()==onCheckbox){
            enable();
        }
        else if(e.getSource()==offCheckbox){
            disable();
        }

    }

    public void enable(){

        onCheckbox.setEnabled(false);
        offCheckbox.setEnabled(true);
        textField.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);
        buttonNegative.setEnabled(true);
    }
    public void disable(){

        onCheckbox.setEnabled(true);
        offCheckbox.setEnabled(false);
        label.setText("");
        textField.setText("");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonNegative.setEnabled(false);
    }

}