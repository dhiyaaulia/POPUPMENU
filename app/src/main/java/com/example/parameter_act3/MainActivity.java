package com.example.parameter_act3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText edemail, edpassword;
    String nama, password;


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnDaftar)
        {
            Intent i = new Intent(getApplicationContext(), Home_Activity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btSignIn);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                //set email yang benar
                String nama = "admin@mail.com";
                String password = "123";

                if (nama.equals(nama) && password.equals(password)) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "Login Sukses", Toast.LENGTH_LONG);
                    t.show();

                    Bundle b = new Bundle();

                    //memasukkan value dari variabel nama dengan kunci "a"
                    b.putString("a", nama.trim());

                    //memasukkan value dari variabel nama dengan kunci "b"
                    b.putString("b", password.trim());

                    //membuat objek intent berpindah ke activity dari mainactivity ke ActivityHasil
                    Intent i = new Intent(getApplicationContext(), ActivityKedua.class);

                    //masukkan bundle kedalam intent untuk dikirimkan ke ActivityHasil
                    i.putExtras(b);
                    //berpindah ke ActivityHasil
                    startActivity(i);
                } else {

                    Toast t = Toast.makeText(getApplicationContext(),"Login Gagal",Toast.LENGTH_LONG);

                    t.show();

                }
            }
        });
    }
}
