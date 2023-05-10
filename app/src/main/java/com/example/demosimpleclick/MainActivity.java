package com.example.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton tbtn;
    RadioGroup rgGender;
    RadioButton rdfemale;
    RadioButton rdmale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.textViewDisplay);
        btnDisplay=findViewById(R.id.button);
        etInput=findViewById(R.id.editTextText);
        tbtn=findViewById(R.id.toggleButton);
        rgGender=findViewById(R.id.radioGroup);
        rdmale=findViewById(R.id.radioButtonGenderMale);
        rdfemale=findViewById(R.id.radioButtonGenderFemale);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code for the action
                etInput.getText().toString();
                String stringResponse=etInput.getText().toString();
                tvDisplay.setText(stringResponse);
            }
        });
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(tbtn.isChecked()){
                    etInput.setEnabled(true);
                }else{
                    etInput.setEnabled(false);
                }

            }
        });
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioButtonGenderFemale){
                    // Write the code when female selected
                    stringResponse="She says "+stringResponse;
                }
                else{
                    // Write the code when male selected
                    stringResponse="He says "+stringResponse;

                }
                tvDisplay.setText(stringResponse);
            }
        });


    }
}