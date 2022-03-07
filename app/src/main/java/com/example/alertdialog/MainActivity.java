package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   Button btn;

// alert diolag dersine bida bak


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //open alert window
                AlertDialog.Builder alertWindow=new AlertDialog.Builder(MainActivity.this);
                alertWindow.setTitle("approval");
                alertWindow.setMessage("select approve option");
                alertWindow.show();

                alertWindow.setPositiveButton("approve", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(MainActivity.this, "onay verdiniz thanks you aseee", Toast.LENGTH_LONG).show();


                    }
                });


                //negatif issue
                alertWindow.setNegativeButton("Deny", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //uyari penceresini kapt
                        dialog.dismiss();



                    }
                });
                alertWindow.show();

            }
        });


    }
}