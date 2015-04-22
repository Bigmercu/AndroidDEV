package com.dev.merx.helloword;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.net.URI;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String data = intent.getStringExtra("txt");
        Log.d("MainActivity", data);
    }
}
//        findViewById(R.id.Toast).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {//得到按钮以后执行这个方法
//                Intent ntent = new Intent("com.dev.merx.helloword.ACTION_START");
//                intent.addCategory("com.dev.merx.helloword.MY_CATEGORY");
//                Intent intent  = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent);
                //finish();//相当于退出<销毁活动>
//            }//Toast用来显示短小的通知
//        });
//
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main,menu);
//        return true;
//    }
//@Override
//public boolean onCreateOptionsMenu(Menu menu) {
//    // Inflate the menu; this adds items to the action bar if it is present.
//    getMenuInflater().inflate(R.menu.menu_main, menu);
//    return true;
//}
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId())
//        {
//            case R.id.add_item:
//                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.remove_item:
//                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
//                break;
//            default:
//        }
//        return super.onOptionsItemSelected(item);
//    }
//}
