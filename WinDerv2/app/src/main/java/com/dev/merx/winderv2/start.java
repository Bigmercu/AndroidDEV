package com.dev.merx.winderv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class start extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        View decorView = getWindow().getDecorView();
        // Hide both the navigation bar and the status bar.
        // SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
        // a general rule, you should design your app to hide the status bar whenever you
        // hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_start);
        Log.d("start", ">>>>>>>>>1");
//        public void run() {
            //mSystemUiHider.hide();
            try{
                Thread.sleep(3000);
                Log.d("start", ">>>>>>>>>2");
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent intent = new Intent(start.this,MainActivity.class);
            startActivity(intent);
            Log.d("start", ">>>>>>>>>3");
//        }
    }
//    Handler mHideHandler = new Handler();
//        public void run() {
//            //mSystemUiHider.hide();
//            try{
//                Thread.sleep(3000);
//                Log.d("start", ">>>>>>>>>2");
//            }
//            catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            Intent intent = new Intent(start.this,MainActivity.class);
//            startActivity(intent);
//            Log.d("start", ">>>>>>>>>3");
//        }
}
