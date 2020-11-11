package com.example.dialogforalert;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NEXTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_e_x_t);
    }

    public void date(View view) {
        DialogFragment newFra = new DatePickerFragment();
        newFra.show(getSupportFragmentManager(),"Date Picker");
    }
    public void processDatePickerResult(int year, int month,int day){
        String month_s = Integer.toString(month+1);
        String day_s = Integer.toString(day);
        String year_s = Integer.toString(year);
        String dateMess = (month_s + "/" + day_s + "/"+ year_s);

        Toast.makeText(this, "Date: "+ dateMess, Toast.LENGTH_SHORT).show();
    }
}