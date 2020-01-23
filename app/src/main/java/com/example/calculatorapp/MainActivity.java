package com.example.calculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edt_calculation;
    Button btn_plus, btn_minus, btn_multiply, btn_divide, btn_percentage;
    Button btn_zero, btn_one, btn_two, btn_three, btn_four, btn_five, btn_six, btn_seven, btn_eight, btn_nine;
    Button btn_clear, btn_allclear, btn_point, btn_equalsto;

    public String DEFAULT_VALUE_OF_EDITTEXT = "0";
    boolean taskComplete = false;
    boolean taskDivisionExeption = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        //getting views by its id
        gettingViewsId();


        //adding listener with buttons
        settingListenerOnViews();

        edt_calculation.setText(DEFAULT_VALUE_OF_EDITTEXT);
    }

    public void gettingViewsId() {
        edt_calculation = findViewById(R.id.edt_calculation);
        btn_plus = findViewById(R.id.btn_plus);
        btn_minus = findViewById(R.id.btn_minus);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_percentage = findViewById(R.id.btn_percentage);
        btn_zero = findViewById(R.id.btn_zero);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);
        btn_clear = findViewById(R.id.btn_clear);
        btn_allclear = findViewById(R.id.btn_allclear);
        btn_point = findViewById(R.id.btn_point);
        btn_equalsto = findViewById(R.id.btn_equalsto);
    }

    public void settingListenerOnViews() {
        btn_zero.setOnClickListener(this);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_seven.setOnClickListener(this);
        btn_eight.setOnClickListener(this);
        btn_nine.setOnClickListener(this);
        btn_plus.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_multiply.setOnClickListener(this);
        btn_divide.setOnClickListener(this);
        btn_percentage.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_allclear.setOnClickListener(this);
        btn_point.setOnClickListener(this);
        btn_equalsto.setOnClickListener(this);
    }

    private void checkingLastCharOfEditTextOnPlusPress(String buttonText, String editTextData, int lengthOfEditTextData, char lastCharOfEditTextData) {

        if (lastCharOfEditTextData == '-') {

            edt_calculation.setText(editTextData.replace('-', '+'));
            return;
        } else if (lastCharOfEditTextData == '*') {

            edt_calculation.setText(editTextData.replace('*', '+'));
            return;
        } else if (lastCharOfEditTextData == '/') {

            edt_calculation.setText(editTextData.replace('/', '+'));
            return;
        } else {
            if (taskComplete) {
                edt_calculation.append(buttonText);
                taskComplete = false;
            } else if (taskDivisionExeption) {
                edt_calculation.setText("0" + buttonText);
                taskDivisionExeption = false;
            } else {
                if (editTextData.lastIndexOf('+') == lengthOfEditTextData - 1)
                    return;
                else
                    edt_calculation.append(buttonText);
            }
        }
    }

    private void checkingLastCharOfEditTextOnMinusPress(String buttonText, String editTextData, int lengthOfEditTextData, char lastCharOfEditTextData) {

        if (lastCharOfEditTextData == '+') {

            edt_calculation.setText(editTextData.replace('+', '-'));
            return;
        } else if (lastCharOfEditTextData == '*') {

            edt_calculation.setText(editTextData.replace('*', '-'));
            return;
        } else if (lastCharOfEditTextData == '/') {

            edt_calculation.setText(editTextData.replace('/', '-'));
            return;
        } else {
            if (taskComplete) {
                edt_calculation.append(buttonText);
                taskComplete = false;
            } else if (taskDivisionExeption) {
                edt_calculation.setText("0" + buttonText);
                taskDivisionExeption = false;
            } else {
                if (editTextData.lastIndexOf('-') == lengthOfEditTextData - 1)
                    return;
                else
                    edt_calculation.append(buttonText);
            }
        }
    }

    private void checkingLastCharOfEditTextOnMultiplyPress(String buttonText, String editTextData, int lengthOfEditTextData, char lastCharOfEditTextData) {

        if (lastCharOfEditTextData == '-') {

            edt_calculation.setText(editTextData.replace('-', '*'));
            return;
        } else if (lastCharOfEditTextData == '+') {

            edt_calculation.setText(editTextData.replace('+', '*'));
            return;
        } else if (lastCharOfEditTextData == '/') {

            edt_calculation.setText(editTextData.replace('/', '*'));
            return;
        } else {
            if (taskComplete) {
                edt_calculation.append(buttonText);
                taskComplete = false;
            } else if (taskDivisionExeption) {
                edt_calculation.setText("0" + buttonText);
                taskDivisionExeption = false;
            } else {
                if (editTextData.lastIndexOf('*') == lengthOfEditTextData - 1)
                    return;
                else
                    edt_calculation.append(buttonText);
            }
        }
    }

    private void checkingLastCharOfEditTextOnDividePress(String buttonText, String editTextData, int lengthOfEditTextData, char lastCharOfEditTextData) {

        if (lastCharOfEditTextData == '-') {

            edt_calculation.setText(editTextData.replace('-', '/'));
            return;
        } else if (lastCharOfEditTextData == '+') {

            edt_calculation.setText(editTextData.replace('+', '/'));
            return;
        } else if (lastCharOfEditTextData == '*') {

            edt_calculation.setText(editTextData.replace('*', '/'));
            return;
        } else {
            if (taskComplete) {
                edt_calculation.append(buttonText);
                taskComplete = false;
            } else if (taskDivisionExeption) {
                edt_calculation.setText("0" + buttonText);
                taskDivisionExeption = false;
            } else {
                if (editTextData.lastIndexOf('/') == lengthOfEditTextData - 1)
                    return;
                else
                    edt_calculation.append(buttonText);
            }
        }
    }

    private void actionOnDigitPress(String buttonText) {
        if (edt_calculation.getText().toString().equals("0")) {
            edt_calculation.setText(buttonText);

        } else if (taskComplete == true) {
            edt_calculation.setText(buttonText);
            taskComplete = false;
        } else if (taskDivisionExeption == true) {
            edt_calculation.setText(buttonText);
            taskDivisionExeption = false;
        } else
            edt_calculation.append(buttonText);


    }

    private void showingResultInDecimalOrInteger(String number1, String number2, Double result) {
        if (number1.contains(".") || number2.contains(".")) {
            edt_calculation.setText(result.toString());
        } else {
            int i = result.toString().indexOf(".");
            edt_calculation.setText(result.toString().substring(0, i));
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_plus:
                String buttonText_plus = btn_plus.getText().toString();
                String editTextData_plusPress = edt_calculation.getText().toString();
                int lengthOfEditTextData_plusPress = edt_calculation.getText().toString().length();

                char lastCharOfEditTextData_plusPress = editTextData_plusPress.charAt(lengthOfEditTextData_plusPress - 1);

                checkingLastCharOfEditTextOnPlusPress(buttonText_plus, editTextData_plusPress, lengthOfEditTextData_plusPress, lastCharOfEditTextData_plusPress);
                break;

            case R.id.btn_minus:
                String buttonText_minus = btn_minus.getText().toString();
                String editTextData_minusPress = edt_calculation.getText().toString();
                int lengthOfEditTextData_minusPress = edt_calculation.getText().toString().length();


                char lastCharOfEditTextData_minusPress = editTextData_minusPress.charAt(lengthOfEditTextData_minusPress - 1);

                checkingLastCharOfEditTextOnMinusPress(buttonText_minus, editTextData_minusPress, lengthOfEditTextData_minusPress, lastCharOfEditTextData_minusPress);
                break;

            case R.id.btn_multiply:
                String buttonText_multiply = btn_multiply.getText().toString();
                String editTextData_multiplyPress = edt_calculation.getText().toString();
                int lengthOfEditTextData_multiplyPress = edt_calculation.getText().toString().length();

                char lastCharOfEditTextData_multiplyPress = editTextData_multiplyPress.charAt(lengthOfEditTextData_multiplyPress - 1);

                checkingLastCharOfEditTextOnMultiplyPress(buttonText_multiply, editTextData_multiplyPress, lengthOfEditTextData_multiplyPress, lastCharOfEditTextData_multiplyPress);
                break;

            case R.id.btn_divide:
                String buttonText_divide = btn_divide.getText().toString();
                String editTextData_dividePress = edt_calculation.getText().toString();
                int lengthOfEditTextData_dividePress = edt_calculation.getText().toString().length();

                char lastCharOfEditTextData_dividePress = editTextData_dividePress.charAt(lengthOfEditTextData_dividePress - 1);

                checkingLastCharOfEditTextOnDividePress(buttonText_divide, editTextData_dividePress, lengthOfEditTextData_dividePress, lastCharOfEditTextData_dividePress);
                break;

            case R.id.btn_percentage:

                String text5 = edt_calculation.getText().toString();
                int strlength5 = edt_calculation.getText().toString().length();

                char lastChar5 = text5.charAt(strlength5 - 1);

                if (lastChar5 == '-' || lastChar5 == '+' || lastChar5 == '*' || lastChar5 == '/') {

                    return;
                } else if (edt_calculation.getText().toString().equals("0")) {
                    return;

                } else {
                    if (taskComplete == true) {
                        Double value = Double.parseDouble(edt_calculation.getText().toString());
                        Double data = new Calculation().calculatePercentage(value);
                        edt_calculation.setText(data.toString());
                        taskComplete = false;
                    } else if (taskDivisionExeption == true) {
                        edt_calculation.setText(DEFAULT_VALUE_OF_EDITTEXT);
                        taskDivisionExeption = false;
                    } else {
                        Double value = Double.parseDouble(edt_calculation.getText().toString());
                        Double data = new Calculation().calculatePercentage(value);
                        edt_calculation.setText(data.toString());
                    }
                }

                break;
            case R.id.btn_zero:
                String text_zero = btn_zero.getText().toString();
                if (edt_calculation.getText().toString().equals("0")) {
                    return;

                } else {
                    if (taskComplete == true) {
                        edt_calculation.setText(text_zero);
                        taskComplete = false;
                    } else if (taskDivisionExeption == true) {
                        edt_calculation.setText(text_zero);
                        taskDivisionExeption = false;
                    } else {
                        edt_calculation.append(text_zero);
                    }
                }

                break;
            case R.id.btn_one:
                String text_one = btn_one.getText().toString();

                actionOnDigitPress(text_one);

                break;
            case R.id.btn_two:
                String text_two = btn_two.getText().toString();

                actionOnDigitPress(text_two);


                break;
            case R.id.btn_three:
                String text_three = btn_three.getText().toString();
                actionOnDigitPress(text_three);

                break;
            case R.id.btn_four:
                String text_four = btn_four.getText().toString();
                actionOnDigitPress(text_four);

                break;
            case R.id.btn_five:
                String text_five = btn_five.getText().toString();
                actionOnDigitPress(text_five);

                break;
            case R.id.btn_six:
                String text_six = btn_six.getText().toString();
                actionOnDigitPress(text_six);


                break;
            case R.id.btn_seven:
                String text_seven = btn_seven.getText().toString();
                actionOnDigitPress(text_seven);


                break;
            case R.id.btn_eight:
                String text_eight = btn_eight.getText().toString();
                actionOnDigitPress(text_eight);


                break;
            case R.id.btn_nine:
                String text_nine = btn_nine.getText().toString();
                actionOnDigitPress(text_nine);


                break;
            case R.id.btn_point:
                String text_point = btn_point.getText().toString();
                if (taskComplete == true) {
                    edt_calculation.setText("0" + text_point);

                } else if (taskDivisionExeption == true) {
                    edt_calculation.setText("0" + text_point);
                    taskDivisionExeption = false;

                } else {
                    if (edt_calculation.getText().toString().equals("0."))
                        return;
                    else
                        edt_calculation.append(text_point);
                }
                break;
            case R.id.btn_clear:
                int length = edt_calculation.getText().length();
                if (taskDivisionExeption) {

                    return;
                }
                if (taskComplete) {

                    return;
                }
                if (length > 1) {
                    edt_calculation.getText().delete(length - 1, length);

                } else {
                    edt_calculation.setText(DEFAULT_VALUE_OF_EDITTEXT);
                }

                break;
            case R.id.btn_allclear:
                edt_calculation.setText(DEFAULT_VALUE_OF_EDITTEXT);
                taskDivisionExeption = false;
                taskComplete = false;
                break;

            case R.id.btn_equalsto:
                String text = edt_calculation.getText().toString();
                Double result;
                if (text.contains("+")) {
                    String number1 = text.subSequence(0, text.indexOf("+")).toString();
                    String number2 = edt_calculation.getText().subSequence(text.indexOf("+") + 1, text.length()).toString();

                    if (number2.isEmpty()) {
                        edt_calculation.setText(number1);
                    } else {
                        result = new Calculation().addTwoNumbers(Double.parseDouble(number1), Double.parseDouble(number2));

                        showingResultInDecimalOrInteger(number1, number2, result);
                    }

                    taskComplete = true;

                } else if (text.contains("-")) {

                    String number1 = edt_calculation.getText().subSequence(0, text.indexOf("-")).toString();
                    String number2 = edt_calculation.getText().subSequence(text.indexOf("-") + 1, text.length()).toString();


                    if (number2.isEmpty()) {
                        edt_calculation.setText(number1);
                    } else {
                        result = new Calculation().subtractTwoNumbers(Double.parseDouble(number1), Double.parseDouble(number2));

                        showingResultInDecimalOrInteger(number1, number2, result);
                    }
                    taskComplete = true;

                } else if (text.contains("*")) {

                    String number1 = edt_calculation.getText().subSequence(0, text.indexOf("*")).toString();
                    String number2 = edt_calculation.getText().subSequence(text.indexOf("*") + 1, text.length()).toString();


                    if (number2.isEmpty()) {
                        edt_calculation.setText(number1);
                    } else {
                        result = new Calculation().multiplyTwoNumbers(Double.parseDouble(number1), Double.parseDouble(number2));
                        showingResultInDecimalOrInteger(number1, number2, result);
                    }
                    taskComplete = true;
                } else if (text.contains("/")) {
                    String number1 = edt_calculation.getText().subSequence(0, text.indexOf("/")).toString();
                    String number2 = edt_calculation.getText().subSequence(text.indexOf("/") + 1, text.length()).toString();

                    if (number2.equals("0")) {
                        edt_calculation.setText("Can't divide by zero");
                        taskDivisionExeption = true;
                    } else if (number2.isEmpty()) {
                        edt_calculation.setText(number1);
                    } else {
                        result = new Calculation().divideTwoNumbers(Double.parseDouble(number1), Double.parseDouble(number2));
                        if (number1.contains(".") || number2.contains(".")) {
                            edt_calculation.setText(result.toString());
                        } else if ((Integer.parseInt(number1) % Integer.parseInt(number2)) == 0) {
                            int i = result.toString().indexOf(".");
                            edt_calculation.setText(result.toString().substring(0, i));
                        } else {
                            edt_calculation.setText(result.toString());
                        }
                        taskComplete = true;
                    }


                } else
                    break;


        }

    }


}
