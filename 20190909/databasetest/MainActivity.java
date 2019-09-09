package com.example.databasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public MyDatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper = new MyDatabaseHelper(this, "BookStroe.db", null, 2);
        //Button createDatabase = (Button)  findViewById(R.id.create_database);

       /* createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbHelper.getWritableDatabase();
            }
        });*/




      /*  //添加数据
        Button addData = (Button)  findViewById(R.id.add_data);
        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                //开始加装第一条数据
                values.put("name","The Ds Vinci Code");
                values.put("author","Dan Brown");
                values.put("pages",454);
                values.put("price",14.99);
                db.insert("Book",null,values); //输入第一条数据
                values.clear();

                //开始加装第二条数据
                values.put("name","The Lost Symbol");
                values.put("author","Dan Brown");
                values.put("pages",515);
                values.put("price",15.99);
                db.insert("Book",null,values);   //..插入第二条数据

            }
        }); */


    /*(  //更新数据

        Button updataData = (Button) findViewById(R.id.update_data);
        updataData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("price",10.99);
                db.update("Book",values,"name = ?",new String[] {"The Da Vinci Code"});

            }
        });*/

        //删除数据
       /* Button deleteButton = (Button) findViewById(R.id.delete_data);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                db.delete("Book","pages > ?", new String[] {"500"});
            }
        });  */

        Button queryButton = (Button) findViewById(R.id.query_data);
        queryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                //查询Book表中所有的数据
                Cursor cursor = db.query("Book", null, null, null, null
                        , null, null);
                if (cursor.moveToFirst()) {
                    do {
                        //遍历Cursor对象,取出数据并打印
                        String name = cursor.getString(cursor.getColumnIndex("name"));
                        String author = cursor.getString(cursor.getColumnIndex("author"));
                        int pages = cursor.getInt(cursor.getColumnIndex("pages"));
                        double price = cursor.getDouble(cursor.getColumnIndex("price"));
                        Log.d("MainActivity", "book name is" + name);
                        Log.d("MainActivity", "book author is" + author);
                        Log.d("MainActivity", "book pages is" + pages);
                        Log.d("MainActivity", "book price is" + price);


                    } while (cursor.moveToNext());
                }
                cursor.close();
            }
        });

    }
}
