package com.itproger.var1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] countries = { "Россия", "США", "Франция", "Германия", "Япония"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
    //public void pok(View view){
//        Toast toast = Toast.makeText(getApplicationContext(),"Регистрация прошла успешно!", Toast.LENGTH_SHORT);
//        toast.show();


    public EditText lname, firsname, email, password, secondPassword;
    private void init(){
        password = findViewById(R.id.editTextTextPassword);
        secondPassword = findViewById(R.id.editTextTextPassword2);
        lname = findViewById(R.id.editTextTextPersonName);
        firsname = findViewById(R.id.editTextTextPersonName2);
        email = findViewById(R.id.editTextTextEmailAddress2);


    }

    public void pok(View view){
        String firstPass = password.getText().toString();
        String secondPass = secondPassword.getText().toString();
        String name = lname.getText().toString();
        String firstname = firsname.getText().toString();
        String mailpochta = email.getText().toString();

        if (name.length() == 0 || firstname.length() == 0 || mailpochta.length() == 0){
            Toast.makeText(getApplicationContext(),"Поля не могут быть пустыми", Toast.LENGTH_SHORT).show();
        }else{
            if (firstPass.equals(secondPass) & firstPass.length() != 0 & secondPass.length() != 0){
                Toast toast = Toast.makeText(getApplicationContext(),"Регистрация прошла успешно!", Toast.LENGTH_SHORT);
                toast.show();
            }else {
                Toast.makeText(getApplicationContext(),"Введенные пароли не совпадают", Toast.LENGTH_SHORT).show();

            }
        }

    }
}
