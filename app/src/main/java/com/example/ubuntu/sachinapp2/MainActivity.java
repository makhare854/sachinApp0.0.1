package com.example.ubuntu.sachinapp2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {


    String hobby;
    String Running;
    String hobby2;
    String hobby3;

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_dancing:
                if (checked) {
                    hobby = " dancing";
                }
//                else{
//                    hobby = null;
//                }

                break;

            case R.id.checkbox_running:
                if (checked) {
                    Running = " running";

                }
//                else{
//                    Running = null;
//                }

                break;


            case R.id.checkbox_fishing:
                if (checked) {

                    hobby2 = " fishing";

                }
//                else{
//                    hobby2 = null;
//                }

                break;

            case R.id.checkbox_swimming:
                if (checked) {
                    hobby3 = " swimming";
                }
//                else{
//                    hobby3 = null;
//                }

                break;


        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name_edit = (EditText) findViewById(R.id.edit_name);

        CheckBox swimming = (CheckBox) findViewById(R.id.checkbox_swimming);
        CheckBox dancing = (CheckBox) findViewById(R.id.checkbox_dancing);
        CheckBox running = (CheckBox) findViewById(R.id.checkbox_running);
        CheckBox fishing = (CheckBox) findViewById(R.id.checkbox_fishing);
        Button submit = (Button) findViewById(R.id.submit_button);


        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);

                // Setting Dialog Title
                alertDialog.setTitle("You have entered");

                // Setting Dialog Message
                alertDialog.setMessage("your name is "+ name_edit.getText().toString() + " And your Hobbies are " +Running+hobby+hobby2+hobby3);



                // Setting Positive "Yes" Button
                alertDialog.setPositiveButton("YES",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                // Write your code here to execute after dialog
                                Toast.makeText(getApplicationContext(), "Your response is recorded", Toast.LENGTH_SHORT).show();
                            }
                        });
                // Setting Negative "NO" Button
                alertDialog.setNegativeButton("NO",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,	int which) {
                                // Write your code here to execute after dialog
                                Toast.makeText(getApplicationContext(), "Please fill in the details again", Toast.LENGTH_SHORT).show();
                                dialog.cancel();
                            }
                        });

                // Showing Alert Message
                alertDialog.show();

            }


//

        });



    }



}

