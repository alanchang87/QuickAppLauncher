package com.example.alanchang.quickapplauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adder);

        Button addBtn = findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = findViewById(R.id.firstNumEditTex);
                EditText secondNumEditText = findViewById(R.id.secondNumEditText);
                TextView resultText = findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;
                resultText.setText(result + "");
            }
        });

        if(getIntent().hasExtra("com.example.alanchang.placeholder")){
            TextView placeholder = findViewById(R.id.placeholderTextView);
            String text = getIntent().getExtras().getString("com.example.alanchang.placeholder");
            placeholder.setText(text);
        }

    }
}
