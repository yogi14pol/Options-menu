package com.clicks.yogi.options_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.myoptionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.itm0:
                Toast.makeText(this,"Item 0", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itm1:
                Toast.makeText(this,"Item 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itm2:
                Toast.makeText(this,"Item 2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.itm3:
                Toast.makeText(this,"Item 3", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}