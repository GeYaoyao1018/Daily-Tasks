package com.example.notificationtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button sendNotice = (Button) findViewById(R.id.send_notice);
        sendNotice.setOnClickListener(this);
    }

    @Override
    public void onClick(View v ){
        switch (v.getId()) {
            case R.id.send_notice:
                Intent intent = new Intent(this,NotificationActivity.class);
                PendingIntent pi = PendingIntent.getActivity(this,0,intent,0);
                NotificationManager manager = (NotificationManager) getSystemService
                        (NOTIFICATION_SERVICE);
                Notification notification = new NotificationCompat.Builder(this)
                        .setContentTitle("This is content title")
                        .setContentText("This is content text")
                        .setWhen(System.currentTimeMillis())
                        .setSmallIcon(R.mipmap.ic_launcher)
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.mipmap
                                .ic_launcher))
                        .setContentIntent(pi)
                        .setVibrate(new long[] {0,1000,1000,1000})
                        .setLights(Color.GREEN,1000,1000)
                        .setAutoCancel(true)
                        .setPriority(NotificationCompat.PRIORITY_MAX)
                        .build();
                manager.notify(1,notification);
                break;
                default:
                    break;
        }
    }
}
