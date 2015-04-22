package com.dev.merx.activitylifecycletest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;


public class NormalActivity extends Activity {

    public static final String TAG = "NormalActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("NormalActivity","2222Task id is"+getTaskId());
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_normal);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(NormalActivity.this,DialogActivity.class);
                startActivity(intent1);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onStart...............");
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
        Log.d(TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onStop...............");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onRestart...............");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>onDestory...............");
    }
}
