package com.example.activitytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast
               // Toast.makeText(FirstActivity.this,"You clicked Button 1",
                   //     Toast.LENGTH_SHORT).show();
                //显示intent
               // Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //startActivity(intent);
                //隐式intent
                //Intent intent = new Intent("com.example.activitytest.ACTION_STRAT");
                //intent.addCategory("com.example.activitytest.MY_CATEGORY");
               // Intent intent = new Intent(Intent.ACTION_VIEW);
              //  intent.setData(Uri.parse("http://www.baidu.com"));
              //  startActivity(intent);
                    //intent 拨打电话
              //  Intent intent = new Intent(Intent.ACTION_DIAL);
               // intent.setData(Uri.parse("tel.10086"));
              //  startActivity(intent);
                //向下一个活动传递数据
              //  String data = "Hello SecondActivity";
               // Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               // intent.putExtra("extra_data",data);
               // startActivity(intent);


                //返回数据给上一个活动
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
               // startActivityForResult(intent,1);

                Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 1:
                if (requestCode == RESULT_OK)  {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
                default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      getMenuInflater().inflate(R.menu.main,menu);
      return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
    }
}




