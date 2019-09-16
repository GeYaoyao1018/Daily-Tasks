package com.example.jsonobject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.VoiceInteractor;
import android.gesture.Gesture;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.textclassifier.TextLinks;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.ResponseCache;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void sendRequestWith0kHttp() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    0 kHttpClient client = new 0 kHttpClient();
                    Request request = new Request.Builder()
                            .url("http://10.0.2.2/get_data.json")
                            .build();
                    Response response = client.newCall(request).execute();
                    String responseData = response.body().string();
                    // parseJSONWithJSONObject(responseData);
                    parseJSONWithGSON(responseData);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
        List<App> appList = gson.fromJson(jsonData, new TypeToken<List<App>>() {
        }.getType());

        for (App app : appList) ;
        Log.d("MainActivity", " id is" + app.getId());
        Log.d("MainActivity", " name is" + app.getName());
        Log.d("MainActivity", "version is" + app.getVersion());
    }
}

  /*  private void parseJSONWithJSONObject(String jsonData)   {
        try  {
            JSONArray jsonArray = new JSONArray(jsonData);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String id = jsonObject.getString("id");
                String name = jsonObject.getString("name");
                String version = jsonObject.getString("version")
                Log.d("MainActivity", "id is"  +id);
                Log.d("Mainactivity","name is"  +name);
                Log.d("MainActivity","version is" + version);
            }
        }  catch (Exception e)   {
            e.printStackTrace();
        }
    }*/

