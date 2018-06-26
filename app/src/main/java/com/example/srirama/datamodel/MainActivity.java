package com.example.srirama.datamodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText name;
    Button savebtn;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.etusername);
        savebtn=(Button)findViewById(R.id.btn);
        savebtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Sqlite o1=new Sqlite(getApplicationContext());
                String nam=name.getText().toString();
                o1.insertNote(nam);
            }
        });


    }


}
