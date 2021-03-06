package com.dev.merx.activitylifecycletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends Activity {


    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "<>>>>>>>>>>>>>>>>>>>>onCreate");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null)
        {
            //String tempData = savedInstanceState.getString("data_key");
            Log.d(TAG,"Task id is" + getTaskId());
        }
        findViewById(R.id.start_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.start_normal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onStart...............");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onResume...............");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onPause...............");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onStop...............");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onRestart...............");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onDestory...............");
    }
}
