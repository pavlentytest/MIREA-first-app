package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText obj_a,obj_b,obj_c;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj_a = findViewById(R.id.string_a);
        obj_b = findViewById(R.id.string_b);
        obj_c = findViewById(R.id.string_c);
        res = findViewById(R.id.result);
    }

    public void Calc(View view) {
        double a = Double.parseDouble(obj_a.getText().toString());
        double b = Double.parseDouble(obj_b.getText().toString());
        double c = Double.parseDouble(obj_c.getText().toString());

        double d = b*b - 4*a*c;

        DecimalFormat decimalFormat = new DecimalFormat("###.###");

        if(d < 0) {
            res.setText(R.string.not);
        } else if( d == 0) {
            double x = -b/(2*a);
            res.setText("x="+decimalFormat.format(x));
        } else {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);
            res.setText("x1="+decimalFormat.format(x1)+"; x2="+decimalFormat.format(x2));
        }
    }
}