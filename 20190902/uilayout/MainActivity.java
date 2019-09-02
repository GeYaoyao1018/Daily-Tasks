package com.example.uilayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.drm.DrmStore;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar !=null)  {
            actionbar.hide();
        }
    }


}

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context) {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title,this);
        Button titleBack = (Button) findViewsWithText(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity) getContext()).finish();

            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"You clicked Edit button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}



