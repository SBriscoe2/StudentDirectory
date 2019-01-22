package com.example.students;

import android.os.Bundle;
import android.view.View;
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

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String firstname = firstName.getText().toString();
                String lastname =  lastName.getText().toString();
                String subjectname = subject.getText().toString();
                int scores = Integer.parseInt(score.getText().toString());

                User student  = new User();
                student.setFirstName(firstname);
                student.setLastName(lastname);
                student.setSubject(subjectname);
                student.setScore(scores);

//                MainActivity.myAppDatabase.userDao().addStudent(student);
//                Toast.makeText(setActivity(), "Request to add student details successful", Toast.LENGTH_LONG).show();

                firstName.setText("");
                lastName.setText("");
                subject.setText("");
                score.setText("");
            }
        });

        }

    }

