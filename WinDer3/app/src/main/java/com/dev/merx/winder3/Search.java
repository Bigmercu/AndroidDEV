package com.dev.merx.winder3;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Search extends Activity {

    private ListView lv;
    private List<String> list;
    private ArrayAdapter<String> adapter;
    ArrayList<String> res = new ArrayList<String>();

    protected SwipeRefreshLayout swipeView;

    private File files[];


    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int len = res.size();
            System.out.println(">>>>>>>>>>>>>" + res.size());
            for (int i = 0; i < len; i++) {
                String one = res.get(i);
                adapter.add(one);
            }
            swipeView.setRefreshing(false);
        }
    };

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        lv = (ListView) findViewById(R.id.listView);
        swipeView = (SwipeRefreshLayout) findViewById(R.id.swipe);
        swipeView.setColorSchemeResources(
                android.R.color.holo_blue_light,
                android.R.color.holo_red_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_green_light);
        swipeView.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                res.clear();//清除前面缓存的数据
                adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
                adapter.notifyDataSetChanged();
                lv.setAdapter(adapter);
                adapter.clear();//清除现在listview里面存的数据
                String root = "/sdcard/";
                final File roots = new File(root);
                swipeView.setRefreshing(true);
                swipeView.isRefreshing();
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        int bool = 0;
                        bool = txtFind(roots);
                        if(bool == 1)
                        {
                            mHandler.sendEmptyMessage(0);
                        }
                    }
                }).start();
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),lv.getChildAt(position).toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private int txtFind(File roots) {
        files = roots.listFiles();
        FileInputStream fis = null;
        if (files != null) {
            //System.out.println(">>>>>>>>>>>>>>>>>1231");
            for (File f : files) {
                if (f.isDirectory()) {
                    txtFind(f);
                } else {
                    String fp = f.getAbsolutePath();
                    if (fp.endsWith("txt")) {// Java String.endsWith()方法用法实例教程, 该方法返回一个true，如果参数表示的字符序列是由该对象表示的字符序列的后缀，否则返回false
                        try {
                            fis = new FileInputStream(f);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        try {
                            if (fis.available() > 1048576) {
                                System.out.println(">>>>>>>>>>>>>>>>>" + f.getPath() + "\n");
                                res.add(f.getPath() + "\n");
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return 1;
    }
}