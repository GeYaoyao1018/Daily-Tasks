package com.example.lbstest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public  LocationClient mLocationClient;

    private TextView positionText;

    private MapView mapView;

    private BaiduMap baiduMap;

    private boolean isFirstLocate = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLocationClient = new LocationClient(getApplicationContext());
        mLocationClient.registerLocationListener(new MyLocationListener());
        setContentView(R.layout.activity_main);
        SDKInitializer.initialize(getApplicationContext());
        positionText = (TextView) findViewById(R.id.position_text_view);
        mapView = (MapView) findViewById(R.id.bmapView);
        baiduMap = mapView.getMap();
        List<String> permisssionList = new ArrayList<>();
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest
                .permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            permisssionList.add(Manifest.permission.ACCESS_FINE_LOCATION);
        }
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest
                .permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
            permisssionList.add(Manifest.permission.READ_PHONE_STATE);
        }

        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest
                .permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            permisssionList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }
        if (!permisssionList.isEmpty()) {
            String[] permissions = permisssionList.toArray(new String[permissionList.size()]);
            ActivityCompat.requestPermissions(MainActivity.this, permissions, 1);

        } else {
            requestLocation();
        }
    }

        private void requestLocation () {
          initLocation();
        mLocationClient.start();

        }

        private void initLocation()  {
            LocationClientOption option = new LocationClientOption();
            option.setScanSpan(5000);
            option.setIsNeedAddress(true);
            mLocationClient.setLocOption(option);
        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLocationClient.stop();
        mapView.onDestroy();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions,
                                           @NonNull int[] grantResults) {
         switch (requestCode)  {
             case 1:
                 if (grantResults.length > 0)  {
                     for (int result : grantResults)  {
                         if (result != PackageManager.PERMISSION_GRANTED)  {
                             Toast.makeText(this, "必须同意所有权限才能使用本程序",
                                     Toast.LENGTH_SHORT).show();
                             finish();
                             return;
                         }
                     }
                     requestLocation();
                 } else {
                     Toast.makeText(this,"发生未知错误",Toast.LENGTH_SHORT).show();
                     finish();
                 }
                 break;
                 default:
         }
    }

    public class MyLocationListener implements BDLocationListener {
        @Override
        public void onReceiveLocation(BDLocation location)  {

            if(location.getLocType() == BDLocation.TypeGpsLocation
                || location.getLocType() = BDLocation.TypeNetWorkLocation) {
                navigateUpTo(location);
            }
            StringBuilder currentPosition = new StringBuilder();
            currentPosition.append("纬度:").append(location.getLatitude())
                    .append("\n");
            currentPosition.append("经线:").append(location.getLongtitude())
                    .append("\n");
            currentPosition.append("国家:").append(location.getCountry())
                    .append("\n");
            currentPosition.append("省:").append(location.getProvince())
                    .append("\n");
            currentPosition.append("市:").append(location.getCity())
                    .append("\n");
            currentPosition.append("区:").append(location.getDistrict())
                    .append("\n");
            currentPosition.append("定位方式:");
            if (location.getLocType() == BDLocation.TypeGpsLocation)  {
                currentPosition.append("GPS");

            } else if (location.getLocType() == BDLocation.TypeNetWorkLocation)  {
                currentPosition.append("网络");

            }

            positionText.setText(currentPosition);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }
}

