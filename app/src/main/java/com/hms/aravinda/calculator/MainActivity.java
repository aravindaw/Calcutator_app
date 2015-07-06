package com.hms.aravinda.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Editable tempVal;

    Editable ftNum;
    Editable sdNum;

    Button btnAdd, btnSub, btnMul, btnDiv, btnClrAl, btnClr, btnEql,btnFct;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;

    String mathOperator;
    TextView cceDisplay;
    EditText valEnter, disResults;

    @Override
    public void onClick(View v) {
        double result = 0;
        int factAns = 1;
        String disVal1 = disResults.getText().toString();
        String disVal2 = valEnter.getText().toString();
        String disVal3 = cceDisplay.getText().toString();
        try {
            // Display values
            tempVal = valEnter.getText();
            switch (v.getId()) {
                case R.id.button0:
                    tempVal = tempVal.append(btn0.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button1:
                    tempVal = tempVal.append(btn1.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button2:
                    tempVal = tempVal.append(btn2.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button3:
                    tempVal = tempVal.append(btn3.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button4:
                    tempVal = tempVal.append(btn4.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button5:
                    tempVal = tempVal.append(btn5.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button6:
                    tempVal = tempVal.append(btn6.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button7:
                    tempVal = tempVal.append(btn7.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button8:
                    tempVal = tempVal.append(btn8.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.button9:
                    tempVal = tempVal.append(btn9.getText());
                    valEnter.setText(tempVal);
                    break;
                case R.id.clr:
                    valEnter.setText("");
                    disResults.setText("");
                    cceDisplay.setText("CE");
                    break;
                case R.id.clrAll:
                    System.out.println("Clicked clear all button#######");
                    valEnter.setText("");
                    cceDisplay.setText("C");
                    break;
                case R.id.fact: //get factorial values of a numbrt
                    if (valEnter.equals("")){
                        System.out.println("get in to factorial function");
                        //do nothing
                    }else {
                        System.out.println("get in to factorial function");
                        int factNum = Integer.parseInt(valEnter.getText().toString());
                        System.out.println(factNum+"******************");
                        for (int i=factNum; i>0; i--);{
                            System.out.println("running the for loop");
                            factAns *= factNum;
                            factNum--;
                        }
                        valEnter.setText(Integer.toString(factAns));
                    }


                    break;
                case R.id.add:
                    if (disVal1.equals("")) {
                        ftNum = valEnter.getText();
                        valEnter.setText("");
                        mathOperator = "+";
                        disResults.setText(ftNum);
                        cceDisplay.setText("+");
                    } else {
                        if (disVal3.equals("")) {
                        } else {
                            if (disVal2.equals("")) {
                                cceDisplay.setText("+");
                            } else {
                                double numSub1 = Double.parseDouble(disResults.getText().toString());
                                double numSub2 = Integer.parseInt(valEnter.getText().toString());
                                if (disVal3.equals("+")) {
                                    result = numSub1 + numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("-")) {
                                    result = numSub1 - numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("*")) {
                                    result = numSub1 * numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("/")) {
                                    result = numSub1 / numSub2;
                                    disResults.setText(String.valueOf(result));
                                }
                                valEnter.setText("");
                                mathOperator = "+";
                                cceDisplay.setText("+");
                            }
                        }
                    }
                    break;
                case R.id.sub:
                    if (disVal1.equals("")) {
                        ftNum = valEnter.getText();
                        valEnter.setText("");
                        mathOperator = "-";
                        disResults.setText(ftNum);
                        cceDisplay.setText("-");
                    } else {
                        if (disVal3.equals("")) {
                        } else {
                            if (disVal2.equals("")) {
                                cceDisplay.setText("-");
                            } else {
                                double numSub1 = Double.parseDouble(disResults.getText().toString());
                                double numSub2 = Integer.parseInt(valEnter.getText().toString());
                                if (disVal3.equals("+")) {
                                    result = numSub1 + numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("-")) {
                                    result = numSub1 - numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("*")) {
                                    result = numSub1 * numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("/")) {
                                    result = numSub1 / numSub2;
                                    disResults.setText(String.valueOf(result));
                                }
                                valEnter.setText("");
                                mathOperator = "-";
                                cceDisplay.setText("-");
                            }
                        }
                    }
                    break;
                case R.id.mult:
                    if (disVal1.equals("")) {
                        ftNum = valEnter.getText();
                        valEnter.setText("");
                        mathOperator = "x";
                        disResults.setText(ftNum);
                        cceDisplay.setText("x");
                    } else {
                        if (disVal3.equals("")) {
                        } else {
                            if (disVal2.equals("")) {
                                cceDisplay.setText("x");
                            } else {
                                double numSub1 = Double.parseDouble(disResults.getText().toString());
                                double numSub2 = Integer.parseInt(valEnter.getText().toString());
                                if (disVal3.equals("+")) {
                                    result = numSub1 + numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("-")) {
                                    result = numSub1 - numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("*")) {
                                    result = numSub1 * numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("/")) {
                                    result = numSub1 / numSub2;
                                    disResults.setText(String.valueOf(result));
                                }
                                valEnter.setText("");
                                mathOperator = "x";
                                cceDisplay.setText("x");
                            }
                        }
                    }
                    break;
                case R.id.div:
                    if (disVal1.equals("")) {
                        ftNum = valEnter.getText();
                        valEnter.setText("");
                        mathOperator = "/";
                        disResults.setText(ftNum);
                        cceDisplay.setText("/");
                    } else {
                        if (disVal3.equals("")) {
                        } else {
                            if (disVal2.equals("")) {
                                cceDisplay.setText("/");
                            } else {
                                double numSub1 = Double.parseDouble(disResults.getText().toString());
                                double numSub2 = Integer.parseInt(valEnter.getText().toString());
                                if (disVal3.equals("+")) {
                                    result = numSub1 + numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("-")) {
                                    result = numSub1 - numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("*")) {
                                    result = numSub1 * numSub2;
                                    disResults.setText(String.valueOf(result));
                                } else if (disVal3.equals("/")) {
                                    result = numSub1 / numSub2;
                                    disResults.setText(String.valueOf(result));
                                }
                                valEnter.setText("");
                                mathOperator = "/";
                                cceDisplay.setText("/");
                            }
                        }
                    }
                    break;
                case R.id.eql:
                    System.out.println("Enter to eql function###");
                    if (disVal1.equals("")) {
                        System.out.println("main display value is empty##");
                    } else {
                        mathOperator = cceDisplay.getText().toString();
                        System.out.println(mathOperator);
                        double num1 = Double.parseDouble(disResults.getText().toString());
                        double num2 = Integer.parseInt(valEnter.getText().toString());
                        if (mathOperator.equals("+")) {
                            System.out.println("enter to equal +++++++++++++++++++ ");
                            result = num1 + num2;
                            disResults.setText(String.valueOf(result));
                        } else if (mathOperator.equals("-")) {
                            result = num1 - num2;
                            disResults.setText(String.valueOf(result));
                        } else if (mathOperator.equals("*")) {
                            result = num1 * num2;
                            disResults.setText(String.valueOf(result));
                        } else if (mathOperator.equals("/")) {
                            result = num1 / num2;
                            disResults.setText(String.valueOf(result));
                        }
                        valEnter.setText("");
                        cceDisplay.setText("");
                    }
                    break;
            }
        } catch (Exception e) {
            System.out.println("Exception in text edit field..###" + e);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the elements
        try {
            btnAdd = (Button) findViewById(R.id.add);
            btnSub = (Button) findViewById(R.id.sub);
            btnMul = (Button) findViewById(R.id.mult);
            btnDiv = (Button) findViewById(R.id.div);
            btnFct = (Button) findViewById(R.id.fact);
            btnClrAl = (Button) findViewById(R.id.clrAll);
            btnClr = (Button) findViewById(R.id.clr);
            btnEql = (Button) findViewById(R.id.eql);

            btn1 = (Button) findViewById(R.id.button1);
            btn2 = (Button) findViewById(R.id.button2);
            btn3 = (Button) findViewById(R.id.button3);
            btn4 = (Button) findViewById(R.id.button4);
            btn5 = (Button) findViewById(R.id.button5);
            btn6 = (Button) findViewById(R.id.button6);
            btn7 = (Button) findViewById(R.id.button7);
            btn8 = (Button) findViewById(R.id.button8);
            btn9 = (Button) findViewById(R.id.button9);
            btn0 = (Button) findViewById(R.id.button0);

            disResults = (EditText) findViewById(R.id.display);
            cceDisplay = (TextView) findViewById(R.id.ccDis);
            valEnter = (EditText) findViewById(R.id.editText);


            // set a listener
            btnAdd.setOnClickListener(this);
            btnSub.setOnClickListener(this);
            btnMul.setOnClickListener(this);
            btnDiv.setOnClickListener(this);
            btnFct.setOnClickListener(this);
            btnEql.setOnClickListener(this);
            btnClrAl.setOnClickListener(this);
            btnClr.setOnClickListener(this);

            btn1.setOnClickListener(this);
            btn2.setOnClickListener(this);
            btn3.setOnClickListener(this);
            btn4.setOnClickListener(this);
            btn5.setOnClickListener(this);
            btn6.setOnClickListener(this);
            btn7.setOnClickListener(this);
            btn8.setOnClickListener(this);
            btn9.setOnClickListener(this);
            btn0.setOnClickListener(this);

        } catch (Exception e) {
            System.out.println("Button validation failure...###");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
