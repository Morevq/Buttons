package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);*/
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.button1) {
            EditText editText = findViewById(R.id.edit);
            TextView textView = findViewById(R.id.textView3);
            //if(editText.getText()=="") {
            try {
                textView.setText((Integer.parseInt(textView.getText().toString())) + "");//+1
                //}
                //else{
                textView.setText((Integer.parseInt(editText.getText().toString()) + (Integer.parseInt(textView.getText().toString()))) + "");
                //}
            }
            catch(Exception error){
                textView.setText((Integer.parseInt(textView.getText().toString()) +1) + "");
            }
        }
        else{
            //EditText editText = findViewById(R.id.edit);
            //TextView textView = findViewById(R.id.textView3);
            //textView.setText((Integer.parseInt(editText.getText().toString())+1)+"");
        }
        /*if(v.getId()== R.id.button1) {
            Toast toast = Toast.makeText(this, "Hello", Toast.LENGTH_LONG);
            toast.show();
        }
        else{
            EditText editText = findViewById(R.id.edit);
            TextView textView = findViewById(R.id.textView2);
            textView.append(editText.getText());
            editText.append("Hello");
        }*/
    }
}