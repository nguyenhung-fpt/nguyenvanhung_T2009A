package com.example.chutunglam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.nguyenvanhung.R;
import com.example.nguyenvanhung.Student;

public class MainActivity extends AppCompatActivity {
    AppDatabase db;
    Button button;
    EditText mEdit;
    EditText mEdit2;
    EditText mEdit3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout.activity_main);

     AppDatabase.getAppDatabase(this);

        button = findViewById(R.id.submit_btn);
        mEdit = findViewById(R.id.name);
        mEdit2 = findViewById(R.id.email);
        mEdit3 = findViewById(R.id.content);
        button.setOnClickListener(view -> {
            Student st = new Student() {
            };
            st.name = mEdit.getText().toString();
            st.email = mEdit2.getText().toString();
            st.content = mEdit3.getText().toString();
            db.studentInterface().insertStudent(st);
        });
    }
}
}