package com.example.students;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Attempts;
    private Button Login;
    private int counter = 3;
    public static MyAppDatabase myAppDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        MyAppDatabase db = Room.databaseBuilder(getApplicationContext(),
//                MyAppDatabase.class, "User").build();

        MyAppDatabase db = Room.databaseBuilder(getApplicationContext(), MyAppDatabase.class, "results").build();

        Name = (EditText)findViewById(R.id.editName);
        Password = (EditText)findViewById(R.id.editPassword);
        Attempts = (TextView)findViewById(R.id.editIncorrectAttempts);
        Login = (Button)findViewById(R.id.btnLogin);

        Attempts.setText("No of attempts remaining: 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    public void validate(String username, String userpassword) {
        if((username.equals("admin")) && (userpassword.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{
            counter--;

            Attempts.setText("No of attempts remaining: " + String.valueOf(counter));

            if(counter == 0) {
                Login.setEnabled(false);
            }
        }
    }
}
