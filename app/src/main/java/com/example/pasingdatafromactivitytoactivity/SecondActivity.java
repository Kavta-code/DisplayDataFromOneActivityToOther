package com.example.pasingdatafromactivitytoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView fname_text,lname_text;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fname_text=findViewById(R.id.textView_fname);
        lname_text=findViewById(R.id.textView_lname);

        back =findViewById(R.id.button_back);


                Bundle bundle = getIntent().getExtras();
                assert bundle != null;
                String FirstName = bundle.getString("FirstName");
                String LastName= bundle.getString("secondName");

                fname_text.setText("First Name :" +FirstName);
                lname_text.setText("Last Name:" +LastName);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(SecondActivity.this,MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                });



    }
}
