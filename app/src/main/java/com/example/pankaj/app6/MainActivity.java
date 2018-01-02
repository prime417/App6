package com.example.pankaj.app6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtResult = findViewById(R.id.txtResult);
        final EditText editNumber = findViewById(R.id.editNumber);
        Button btnResult = findViewById(R.id.btnResult);

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textFieldValue = editNumber.getText().toString();
int intValue = Integer.parseInt (textFieldValue);
                String result = "";
            /*    if(textFieldValue.contains("51")){
                    //txtResult.setText(textFieldValue + "Great");
                    result = textFieldValue + "Great";
                }
                else{
                  //  txtResult.setText("Value is not 51 and value is: "+textFieldValue);
                    result = "Value is not 51 and value is: "+textFieldValue;
                } */

         /*       if (textFieldValue.contains("90")){
                    result = "Your Grade is A and your number is " + textFieldValue;
                }
                else if(textFieldValue.contains("80")){
                    result = "Your Grade is B and your number is " + textFieldValue;
                }
                else if(textFieldValue.contains("70")){
                    result = "Your Grade is C and your number is " + textFieldValue;
                }
                else{
                    result = "You are not sufficient";
                }
                */
         if (intValue > 90){
             result = "Your Grade is A and your number is " + intValue;
         }else if(intValue >80){
             result = "Your Grade is B and your number is " + intValue;
         }
           else if(intValue > 70){
             result = "Your Grade is C and your number is " + intValue;

         }
         else{
             result = "Your score is not sufficient" + intValue;
         }
                txtResult.setText(result);
            }

        });

    }
}
