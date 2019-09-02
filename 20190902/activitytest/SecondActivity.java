package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

//public class SecondActivity extends AppCompatActivity {

public class SecondActivity extends BaseActivity {
    public static void actionStart(Context context,String data1,String data2)  {
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("param",data1);
        intent.putExtra("param",data2);
        context.startActivity(intent);

   // @Override
  //  protected void onCreate(Bundle savedInstanceState) {
     //   super.onCreate(savedInstanceState);
     //   setContentView(R.layout.second_layout);
        //Intent intent = getIntent();
       // String data = intent.getStringExtra("extra_data");
      //  Log.d("SecondActivity",data);
      //  Button button2 = (Button) findViewById(R.id.button_2);
     //   button2.setOnClickListener(new View.OnClickListener() {
          //  @Override
           // public void onClick(View v) {
              //  Intent intent = new Intent();
               // intent.putExtra("data_return","Hello FirstActivity");
               // setResult(RESULT_OK,intent);
                //finish();

         //   }
        //});

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello FirstActivity");
        setResult(RESULT_OK,intent);
       finish();
    }
}
