package com.example.servicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MyService.DownloadBinder downloadBinder;
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name) {

        }

        @Override
        public void onServiceDisconnected(ComponentName name,IBinder service) {
            downloadBinder = (MyService.DownloadBinder)  service;
            downloadBinder.startDownload();
            downloadBinder.getProgress();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button startService = (Button) findViewById(R.id.start_service);
        Button stopService = (Button) findViewById(R.id.stop_service);
        startService.setOnClickListener(this);
        stopService.setOnClickListener(this);
        Button bindService = (Button) findViewById(R.id.bind_service);
        Button unbindService = (Button) findViewById(R.id.unbind_service);
        Button startIntentService = (Button) findViewById(R.id.start_intent_service);
        startIntentService.setOnClickListener(this);
        bindService.setOnClickListener(this);
        unbindService.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())  {
            case R.id.start_service:
                Intent startIntent = new Intent(this,MyService.class);
                startService(startIntent);    //启动服务
                break;
            case  R.id.stop_service:
                Intent stopIntent = new Intent(this,MyService.class);
                stopService(stopIntent); //停止服务
                break;
            case R.id.start_intent_service:
                //打印主线程的ID
                Log.d("MainActivity", "Thread id is " + Thread.currentThread()
                        .getId());

                Intent intentService = new Intent(this,MyIntentService.class);
                startService(intentService);


                case  R.id.unbind_service:
                unbindService(connection);     //解绑服务
                break;
                default:
                    break;
        }

    }
}
