package com.example.students;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView firstName;
    private TextView lastName;
    private TextView subject;
            private TextView score;
    private Button submit;
    private TextView secondView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        firstName = (TextView)findViewById(R.id.etFirstName);
        lastName = (TextView)findViewById(R.id.etLastName);
        subject = (TextView)findViewById(R.id.etSubject);
        score = (TextView)findViewById(R.id.etScore);
        submit = (Button)findViewById(R.id.btnSubmit);
        secondView = (TextView)findViewById(R.id.editSecondPage);

    }
}
