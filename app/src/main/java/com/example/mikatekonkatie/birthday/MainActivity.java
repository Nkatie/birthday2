package com.example.mikatekonkatie.birthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView tv2;
    TextView tv4;
    TextView tv6;
    TextView tv8;
    Button happy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv2=(TextView)findViewById(R.id.textView4);
        tv2.setOnClickListener(this);
        tv4=(TextView)findViewById(R.id.textView6);
        tv4.setOnClickListener(this);
        tv6=(TextView)findViewById(R.id.textView8);
        tv6.setOnClickListener(this);
        tv8=(TextView)findViewById(R.id.textView10);
        tv8.setOnClickListener(this);

        happy=(Button)findViewById(R.id.button);
        happy.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.textView4) {
            tv2.setText("28-July-2017");

        } else if (v.getId() == R.id.textView6) {
            tv4.setText("18:00 pm");
        } else if (v.getId() == R.id.textView8) {
            tv6.setText("Winny Mandela");
        } else if (v.getId() == R.id.textView10) {
            tv8.setText("079 933 5237");
        }else if (v.getId()==R.id.button){
            Toast.makeText(MainActivity.this,"please bring your own beer",Toast.LENGTH_LONG).show();
        }
    }
  }
