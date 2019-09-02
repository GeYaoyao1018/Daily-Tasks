package com.example.uiwidgettest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    //实现接口方法实行注册

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }
            @Override
            public void onClick(View view) {
               switch (view.getId()) {
                   case R.id.button:
                    //   imageView.setImageResource(R.drawable.ic_launcher_background)
                      // String inputText = editText.getText().toString();
                      // Toast.makeText(MainActivity.this,inputText,
                           //    Toast.LENGTH_SHORT).show();

                       //加载进度条
                       /*int progress = progressBar.getProgress();
                       progress = progress +10;
                       progressBar.setProgress(progress);
                       if (progressBar.getVisibility() == View.GONE)  {
                           progressBar.setVisibility(View.VISIBLE);
                       }else {
                           progressBar.setVisibility(View.GONE);
                       }*/

                       //弹出警告
                     /*  AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                       dialog.setTitle("This is a Dialog");
                       dialog.setMessage("Something important.");
                       dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                           }
                       });
                       dialog.setPositiveButton(("Cancel", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialogInterface, int i) {

                           }
                       });
                       dialog.show();

                       break;*/

                       ProgressDialog progressDialog = new ProgressDialog
                               (MainActivity.this);
                       progressDialog.setTitle("This is Progress");
                       progressDialog.setMessage("Loading");
                       progressDialog.setCancelable(true);
                       progressDialog.show();
                       break;
                       default:
                           break;
            }
    }
}


