package com.example.cc.litepaldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.cc.litepaldemo.bean.Book;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn1;
    private Button mBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
    }

    private void initView() {
        mBtn1 = (Button) findViewById(R.id.btn_createlitepal);
        mBtn2 = (Button) findViewById(R.id.btn_insert);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_createlitepal:
                LitePal.getDatabase();
                break;
            case R.id.btn_insert:
                Book book1 = new Book("zhangsan", 14.9, 244, "Android开发精通", "人民教育出版社");
                Book book2 = new Book("李四", 35.7, 678, "Android开发入门", "图文出版社");
                book1.save();
                book2.save();
                break;
        }
    }
}
