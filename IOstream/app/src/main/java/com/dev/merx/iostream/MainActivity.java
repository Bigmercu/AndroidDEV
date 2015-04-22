package com.dev.merx.iostream;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends Activity {

    private Button readBtn,writeBtn;
    private TextView txtView;
    private EditText input;

    File sdcard = Environment.getExternalStorageDirectory();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView = (TextView) findViewById(R.id.txtView);
        input = (EditText) findViewById(R.id.input);
        findViewById(R.id.writeBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                File myfile = new File(sdcard,"helllllo.txt");
                if(!sdcard.exists())
                {
                    Toast.makeText(MainActivity.this,"不存在SD卡", LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    try {
                        myfile.createNewFile();
                        Toast.makeText(MainActivity.this,"文件已经创建", LENGTH_SHORT).show();
                        FileOutputStream fos= new FileOutputStream(myfile);
                        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
                        String Str = input.getText().toString();
                        osw.write(Str);
                        osw.flush();
                        fos.flush();
                        osw.close();
                        fos.close();
                        Toast.makeText(MainActivity.this,"数据已写入", LENGTH_SHORT).show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        findViewById(R.id.readBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
