package com.example.pasingdatafromactivitytoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fname,lname;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname =findViewById(R.id.editText_fname);
        lname =findViewById(R.id.editText_lname);

        send = findViewById(R.id.button_send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String Fname= fname.getText().toString().trim();
               String Lname = lname.getText().toString().trim();


                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("FirstName",Fname);
                intent.putExtra("secondName",Lname);
                startActivity(intent);
                finish();
             /*  if(Fname.equals("")||Lname.equals("")){
                   Toast.makeText(MainActivity.this,"Enter details",Toast.LENGTH_SHORT).show();
               }else {
                   Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                   intent.putExtra("FirstName",Fname);
                   intent.putExtra("secondName",Lname);
                   startActivity(intent);
                   finish();
               }*/

            }
        });
    }
}
