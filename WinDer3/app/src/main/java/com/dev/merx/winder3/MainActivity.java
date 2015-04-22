package com.dev.merx.winder3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Search = new Intent(MainActivity.this,Search.class);
                startActivity(Search);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        menu.add(0, 2, 0, "关于");
        menu.add(0, 1, 0, "设置");
        menu.add(0, 3, 0, "分享");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        //Intent intent = new Intent(MainActivity.this,Search.class);
        Intent star = new Intent();
        switch (id)
        {
            case 2:
                 star = new Intent(MainActivity.this,About.class);
                break;
            case 1:
                 star = new Intent(MainActivity.this,SettingsActivity.class);
                break;
            case 3:
                 star = new Intent(MainActivity.this,Shar.class);
                break;

        }
        startActivity(star);

        return super.onOptionsItemSelected(item);
    }
}

