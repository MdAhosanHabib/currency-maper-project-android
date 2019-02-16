package test.root.android.pencil.com.currencymapper;


import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity    {

    private EditText input;
    private Button clearbtn, swapbtn, convertbtn;
    private Spinner fromspnr, tospnr;
    private TextView showresult;
    double userinput=0.0;
    int  countryOne,countryTwo;
    Boolean changeAbility =true;
    String[] toCountries = {"Select a Currency", "EUR", "GBP", "AUD", "CAD", "INR", "BDT", "JPY"};
    String[] fromCountries = {"Select a Currency", "EUR", "GBP", "AUD", "CAD", "INR", "BDT", "JPY"};


    ArrayAdapter<String> Formadapter,Toadapter;
    boolean isFirstRun = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.inputamntID);
        clearbtn = findViewById(R.id.clearbtnID);
        swapbtn = findViewById(R.id.swapbtnID);
        convertbtn = findViewById(R.id.convertbtnID);
        showresult = findViewById(R.id.showresultID);
        fromspnr = findViewById(R.id.spinner1ID);
        tospnr = findViewById(R.id.spinner2ID);

        Toadapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, toCountries);
        tospnr.setAdapter(Toadapter);

        Formadapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, fromCountries);
        fromspnr.setAdapter(Toadapter);



        fromspnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (isFirstRun) {

                    isFirstRun = false;
                } else {
                    try{
                        userinput = Double.parseDouble(input.getText().toString());
                    }catch (NumberFormatException e){

                        Toast.makeText(getApplicationContext(),"Enter a ammount",Toast.LENGTH_SHORT).show();
                    }

                    if (position == 0) {
                        Toast.makeText(getApplicationContext(), "Please Select a Currency", Toast.LENGTH_SHORT).show();
                    } else if (position == 1) {
                        if(changeAbility=true) {
                            countryOne = position;
                        }
                    } else if (position == 2) {
                        if(changeAbility=true) {
                            countryOne = position;
                        }
                    } else if (position == 3) {

                        if(changeAbility=true) {
                            countryOne = position;
                        }
                    } else if (position == 4) {

                        if(changeAbility=true) {
                            countryOne = position;
                        }
                    } else if (position == 5) {

                        if(changeAbility=true) {
                            countryOne = position;
                        }
                    } else if (position == 6) {

                        if(changeAbility=true) {
                            countryOne = position;
                        }
                    } else if (position == 7) {
                        if(changeAbility=true) {
                            countryOne = position;
                        }
                    }

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        tospnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (isFirstRun) {

                    isFirstRun = false;
                } else {


                    if (position == 0) {
                        Toast.makeText(getApplicationContext(), "Please Select a Currency", Toast.LENGTH_SHORT).show();
                    } else if (position == 1) {
                        if(changeAbility=true) {
                            countryTwo= position;
                        }

                    } else if (position == 2) {

                        if(changeAbility=true) {
                            countryTwo= position;
                        }

                    } else if (position == 3) {

                        if(changeAbility=true) {
                            countryTwo= position;
                        }

                    } else if (position == 4) {

                        if(changeAbility=true) {
                            countryTwo= position;
                        }

                    } else if (position == 5) {

                        if(changeAbility=true) {
                            countryTwo= position;
                        }

                    } else if (position == 6) {

                        if(changeAbility=true) {
                            countryTwo= position;
                        }

                    } else if (position == 7) {

                        if(changeAbility=true) {
                            countryTwo= position;
                        }

                    }

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("0.0");
            }
        });


        swapbtn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
               fromspnr.setSelection(countryTwo);
               tospnr.setSelection(countryOne);
               changeAbility=false;
            }
        });

        convertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userinput=getInput(input.getText().toString());

              if(countryOne==1 && countryTwo==2){ double moneyvalue = 0.87711 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }
                else if(countryOne==1 && countryTwo==3){ double moneyvalue = 1.62588 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }
                else if(countryOne==1 && countryTwo==4){ double moneyvalue = 1.50766 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }
                else if(countryOne==1 && countryTwo==5){ double moneyvalue = 85.1534 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }
                else if(countryOne==1 && countryTwo==6){ double moneyvalue = 96.1393 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }
                else if(countryOne==1 && countryTwo==7){ double moneyvalue = 129.90 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }



                else if(countryOne==2 && countryTwo==1){ double moneyvalue = 1.13976 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }
                else if(countryOne==2 && countryTwo==0){ double moneyvalue = 0.61487 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);
                }
                else if(countryOne==2 && countryTwo==3){  double moneyvalue = 1.85319 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==2 && countryTwo==4){  double moneyvalue = 1.71862 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==2 && countryTwo==5){  double moneyvalue = 97.0682 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==2 && countryTwo==6){  double moneyvalue = 109.591 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==2 && countryTwo==7){  double moneyvalue = 148.07 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}

                else if(countryOne==3 && countryTwo==1){  double moneyvalue = 0.61487 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==3 && countryTwo==2){  double moneyvalue = 0.53934 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==3 && countryTwo==4){  double moneyvalue = 0.92710 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==3 && countryTwo==5){  double moneyvalue = 52.3628 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==3 && countryTwo==6){  double moneyvalue = 59.1183 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==3 && countryTwo==7){  double moneyvalue = 79.88 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}

                else if(countryOne==4 && countryTwo==1){  double moneyvalue = 0.66303 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==4 && countryTwo==2){  double moneyvalue = 0.58162 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==4 && countryTwo==3){  double moneyvalue = 1.07807 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==4 && countryTwo==5){  double moneyvalue = 56.4683 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==4 && countryTwo==6){  double moneyvalue = 63.7534 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==4 && countryTwo==7){  double moneyvalue = 86.14 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}

                else if(countryOne==5 && countryTwo==1){  double moneyvalue = 0.01172 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==5 && countryTwo==2){  double moneyvalue = 0.01028 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==5 && countryTwo==3){  double moneyvalue = 0.01906 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==5 && countryTwo==4){  double moneyvalue = 0.01767 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}

                else if(countryOne==5 && countryTwo==6){  double moneyvalue = 1.12694 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==5 && countryTwo==7){  double moneyvalue = 1.52 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}


                else if(countryOne==6 && countryTwo==1){  double moneyvalue = 0.01020 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==6 && countryTwo==2){  double moneyvalue = 0.00895 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==6 && countryTwo==3){  double moneyvalue = 0.01658 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==6 && countryTwo==4){  double moneyvalue = 0.01538 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==6 && countryTwo==5){  double moneyvalue = 0.86858 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==6 && countryTwo==7){  double moneyvalue = 1.32 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}

                else if(countryOne==7 && countryTwo==1){  double moneyvalue = 0.00770 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==7 && countryTwo==2){  double moneyvalue = 0.00675 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==7 && countryTwo==3){  double moneyvalue = 0.01251 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==7 && countryTwo==4){  double moneyvalue = 0.01160 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==7 && countryTwo==5){  double moneyvalue = 0.65545 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}
                else if(countryOne==7 && countryTwo==6){  double moneyvalue = 0.74001 * userinput;
                    String value = String.valueOf(moneyvalue);
                    showresult.setText(value);}




            }
        });



    }

    double getInput(String strNumber) {
        if (strNumber != null && strNumber.length() > 0) {
            try {
                return Double.parseDouble(strNumber);
            } catch(Exception e) {
                return -1;
            }
        }
        else return 0;
    }


}
