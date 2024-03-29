package com.example.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private IntentFilter intentFilter;
  //   private NetworkChangeReceiver networkChangeReceiver;

    //使用本地广播
    private LocalReceiver LocalReceiver;
    private LocalBroadcastManager LocalBroadcastManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        localBroadcastManager = LocalBroadcastManager.getInstance(this);  //获取实例
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent("com.example.broadcasttest.MY_BROADCAST");
              LocalBroadcastManager.sendBroadcast(intent); //发送本地广播
              //sendBroadcast(intent);

            }
        });

        intentFilter = new IntentFilter();
        //intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("com.example.broadcasttest.LOCAL_BROADCAST");
        localReceiver = new LocalReceiver();
        localBroadcastManager.registerReceiver(localReceiver,intentFilter);//注册本地广播监听器
       // networkChangeReceiver = new NetworkChangeReceiver();
       // registerReceiver(networkChangeReceiver,intentFilter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
      //  unregisterReceiver(networkChangeReceiver);
        localBroadcastManager.unregisterReceiver(localReceiver);
    }

 /*   class NetworkChangeReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectionManager = (ConnectivityManager)
                    getSystemService(Context.CONNECTIVITY_SERVICE);
         NetworkInfo networkInfo = connectionManager.getActiveNetworkInfo();
            if (networkInfo != null && networkInfo.isAvailable())  {
                Toast.makeText(context,"network is available",
                        Toast.LENGTH_SHORT).show();
            }  else {
                Toast.makeText(context,"network is unavailable",
                        Toast.LENGTH_SHORT).show();
            }
           // Toast.makeText(context,"neteork change", Toast.LENGTH_SHORT).show();
        }
    }*/

     class LocalReceiver extends BroadcastReceiver{
         @Override
         public void onReceive(Context context, Intent intent) {
              Toast.makeText(context,"received local broadcast",Toast.LENGTH_SHORT).show();
         }
     }
}
