package com.imtiaz_acedamy.online_shop_app_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.imtiaz_acedamy.online_shop_app_java.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.editTextText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_DOWN) {
                    char pressedChar = (char) event.getUnicodeChar();
                    if (Character.isLetter(pressedChar)) {
                        Toast.makeText(MainActivity.this, "Enter Key Pressed " + pressedChar, Toast.LENGTH_SHORT).show();
                    }
                }

                return false;
            }
        });

    }
}