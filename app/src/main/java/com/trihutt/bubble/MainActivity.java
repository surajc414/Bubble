package com.trihutt.bubble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Integer num;
    Handler handler = new Handler();
    TextView txt;
    RadioGroup radioGroup;
    RadioButton btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_1 = findViewById(R.id.btn1);
        btn_2 = findViewById(R.id.btn2);
        btn_3 = findViewById(R.id.btn3);
        btn_4 = findViewById(R.id.btn4);
        btn_5 = findViewById(R.id.btn5);
        btn_6 = findViewById(R.id.btn6);
        btn_7 = findViewById(R.id.btn7);
        btn_8 = findViewById(R.id.btn8);
        btn_9 = findViewById(R.id.btn9);

        radioGroup = findViewById(R.id.rg_checked);

        

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                handler.postDelayed(runnable,1000);

                findViewById(R.id.btn_start).setEnabled(false);
                findViewById(R.id.btn_stop).setEnabled(true);

            }
        });




       btn_1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               if(num == 1 && btn_1.isChecked())
                   Toast.makeText(MainActivity.this, "Button 1 is checked", Toast.LENGTH_SHORT).show();
           }
       });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 2 && btn_2.isChecked())
                    Toast.makeText(MainActivity.this, "Button 2 is checked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 3 && btn_3.isChecked())
                    Toast.makeText(MainActivity.this, "Button 3 is checked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 4 && btn_4.isChecked() )
                    Toast.makeText(MainActivity.this, "Button 4 is checked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 5 && btn_5.isChecked())
                    Toast.makeText(MainActivity.this, "Button 5 is checked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 6 && btn_6.isChecked())
                    Toast.makeText(MainActivity.this, "Button 6 is checked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 7 && btn_7.isChecked())
                    Toast.makeText(MainActivity.this, "Button 7 is checked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 8 && btn_8.isChecked())
                    Toast.makeText(MainActivity.this, "Button 8 is checked", Toast.LENGTH_SHORT).show();
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num == 9 && btn_9.isChecked())
                    Toast.makeText(MainActivity.this, "Button 9 is checked", Toast.LENGTH_SHORT).show();
            }
        });







        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                handler.removeCallbacks(runnable);
                findViewById(R.id.btn_stop).setEnabled(false);
                findViewById(R.id.btn_start).setEnabled(true);

                Toast.makeText(MainActivity.this, "Remove Runnable", Toast.LENGTH_SHORT).show();
            }
        });
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            Random rnd = new Random();
            num = rnd.nextInt(11);
            if(num==1)
                btn_1.setChecked(true);
            else if(num==2)
                btn_2.setChecked(true);

            else if(num==3)
                btn_3.setChecked(true);

            else if(num==4)
                btn_4.setChecked(true);

            else if(num==5)
                btn_5.setChecked(true);

            else if(num==6)
                btn_6.setChecked(true);

            else if(num==7)
                btn_7.setChecked(true);

            else if(num==8)
                btn_8.setChecked(true);

            else
                btn_9.setChecked(true);

            new Handler().postDelayed(this,1000);
        }
    };
}
