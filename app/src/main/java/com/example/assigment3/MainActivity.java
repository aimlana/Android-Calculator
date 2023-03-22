package com.example.assigment3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    String process, operator;
    int lenghtsecondNumber;
    boolean btnEqualPressed = false;
    boolean zeroPressed = false;
    TextView inputText, outputText;
    private String input, output, newOutput;
    private Button ac, del, div, mul, add, sub, equ, one, two, three, four, five, six, seven, eight, nine, zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inisiasi
        inputText = (TextView) findViewById(R.id.input);
        outputText = (TextView) findViewById(R.id.output);

        ac = (Button) findViewById(R.id.ac);
        del = (Button) findViewById(R.id.delete);
        div = (Button) findViewById(R.id.division);
        mul = (Button) findViewById(R.id.multiplication);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.subtraction);
        equ = (Button) findViewById(R.id.equal);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText("");
                outputText.setText("");
                operator = null;
                div.setEnabled(true);
                sub.setEnabled(true);
                mul.setEnabled(true);
                add.setEnabled(true);
                lenghtsecondNumber=0;
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("0");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    inputText.setText(process + "0");
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
                zeroPressed = true;
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("1");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "1");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "1");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("2");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "2");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "2");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("3");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "3");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "3");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("4");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "4");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "4");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("5");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "5");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "5");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("6");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "6");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "6");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("7");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "7");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "7");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("8");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "8");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "8");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    inputText.setText("9");
                    outputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    process = inputText.getText().toString();
                    if (zeroPressed) {
                        inputText.setText(process.substring(0, process.length()-1) + "9");
                        zeroPressed = false;
                    } else {
                        inputText.setText(process + "9");
                    }
                    if (operator != null){
                        lenghtsecondNumber++;
                    }
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    String first = outputText.getText().toString();
                    outputText.setText("");
                    inputText.setText(first + "+");
                    operator = "+";
                    lenghtsecondNumber = 0;
                    btnEqualPressed = false;
                } else {
                    if (lenghtsecondNumber == 0) {
                        process = inputText.getText().toString();
                        if(operator == null){
                            inputText.setText(process + "+");
                        } else {
                            inputText.setText(process.substring(0,process.length()-1)+ "+");
                        }
                        operator = "+";
                    } else {
                        div.setEnabled(false);
                        sub.setEnabled(false);
                        mul.setEnabled(false);
                    }
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    String first = outputText.getText().toString();
                    outputText.setText("");
                    inputText.setText(first + "-");
                    operator = "-";
                    lenghtsecondNumber = 0;
                    btnEqualPressed = false;
                } else {
                    if (lenghtsecondNumber == 0){
                        process = inputText.getText().toString();
                        if(operator == null){
                            inputText.setText(process + "-");
                        }else {
                            inputText.setText(process.substring(0,process.length()-1)+ "-");
                        }
                        operator = "-";

                    } else {
                        add.setEnabled(false);
                        div.setEnabled(false);
                        mul.setEnabled(false);
                    }
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    String first = outputText.getText().toString();
                    outputText.setText("");
                    inputText.setText(first + "×");
                    operator = "×";
                    lenghtsecondNumber = 0;
                    btnEqualPressed = false;
                } else {
                    if (lenghtsecondNumber == 0){
                        process = inputText.getText().toString();
                        if(operator == null){
                            inputText.setText(process + "×");
                        }else {
                            inputText.setText(process.substring(0,process.length()-1)+ "×");
                        }
                        operator = "×";
                    } else {
                        add.setEnabled(false);
                        sub.setEnabled(false);
                        div.setEnabled(false);
                    }
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (btnEqualPressed) {
                    String first = outputText.getText().toString();
                    outputText.setText("");
                    inputText.setText(first + "÷");
                    operator = "÷";
                    lenghtsecondNumber = 0;
                    btnEqualPressed = false;
                } else {
                    if (lenghtsecondNumber == 0){
                        process = inputText.getText().toString();
                        if(operator == null){
                            inputText.setText(process + "÷");
                        }else {
                            inputText.setText(process.substring(0,process.length()-1)+ "÷");
                        }
                        operator = "÷";

                    } else {
                        add.setEnabled(false);
                        sub.setEnabled(false);
                        mul.setEnabled(false);
                    }
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String word = inputText.getText().toString();
                int input = word.length();
                if (btnEqualPressed) {
                    inputText.setText("");
                    lenghtsecondNumber = 0;
                    operator = null;
                    btnEqualPressed = false;
                } else {
                    if (input > 0) {
                        inputText.setText(word.substring(0, input -1));
                        div.setEnabled(true);
                        sub.setEnabled(true);
                        mul.setEnabled(true);
                        add.setEnabled(true);
                        if (lenghtsecondNumber==0){
                            operator=null;
                            lenghtsecondNumber=0;
                            div.setEnabled(true);
                            sub.setEnabled(true);
                            mul.setEnabled(true);
                            add.setEnabled(true);
                        } else {
                            lenghtsecondNumber--;
                        }
                    }
                }
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEqualPressed = true;

                double finalResult=0;
                int finalResult2=0;
                process = inputText.getText().toString();
                String hasil[] = process.split("[÷×+-]");

                try {
                    System.out.println(process);
                    double satu = Integer.parseInt(hasil[0]);
                    double dua = Integer.parseInt(hasil[1]);

                    if (operator == "×") {
                        finalResult2 = (int) satu * (int) dua;
                        System.out.println(satu * dua);
                        outputText.setText(String.valueOf(finalResult2));
                    } else if (operator == "-") {
                        finalResult2 = (int) satu - (int) dua;
                        System.out.println(satu - dua);
                        outputText.setText(String.valueOf(finalResult2));
                    } else if (operator == "+") {
                        finalResult2 = (int) satu + (int) dua;
                        System.out.println(satu + dua);
                        outputText.setText(String.valueOf(finalResult2));
                    } else if (operator == "÷") {
                        if(dua == 0) {
                            outputText.setText("");
                            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        } else if (satu == 0 && dua == 0) {
                            outputText.setText("");
                            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        } else {
                            finalResult = satu / dua;
                            DecimalFormat format = new DecimalFormat("0.###");
                            String Tiga = (format.format(finalResult));
                            System.out.println(satu / dua);
                            outputText.setText(Tiga);
                        }
                    }


                } catch (Exception e){

                }
            }
        });

    }
}