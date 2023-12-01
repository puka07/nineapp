package com.example.lfbf9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {


    private Button redClick;
    private Button redClick2;
    private Button redClick3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        redClick = (Button) findViewById(R.id.redClick);
        redClick2 = (Button) findViewById(R.id.redClick2);
        redClick3 = (Button) findViewById(R.id.redClick3);

    }

    public void clickEnd(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
        finish();
    }

    public void redClickButton(View view) {
        redClick.setBackgroundColor(0xFFFF0000);
        redClick2.setBackgroundColor(0xE3E3E3);
        redClick3.setBackgroundColor(0xE3E3E3);
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Неправильно!",
                Toast.LENGTH_SHORT);
        myToast.show();

    }

    public void redClickButton2(View view) {
        redClick2.setBackgroundColor(0xFFFF0000);
        redClick.setBackgroundColor(0xE3E3E3);
        redClick3.setBackgroundColor(0xE3E3E3);
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Неправильно!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void redClickButton3(View view) {
        redClick3.setBackgroundColor(0xFFFF0000);
        redClick.setBackgroundColor(0xE3E3E3);
        redClick2.setBackgroundColor(0xE3E3E3);
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Неправильно!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }
}