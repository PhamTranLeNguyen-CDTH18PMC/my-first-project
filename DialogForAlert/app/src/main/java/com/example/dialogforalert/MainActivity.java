package com.example.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAlert(View view) {
        AlertDialog.Builder myAB = new AlertDialog.Builder(MainActivity.this);
        myAB.setTitle("ALERTTTT!!!");
        myAB.setMessage("Click OK to continue, or Cancel to stop:");
        myAB.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "PRESS OK!", Toast.LENGTH_SHORT).show();
            }
        });
        myAB.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "PESS CANCEL", Toast.LENGTH_SHORT).show();
            }
        });
        myAB.show();
    }

    public void next(View view) {
        startActivity(new Intent(MainActivity.this,NEXTActivity.class));
    }
}