package com.example.litepaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.crud.DataSupport;
import org.litepal.tablemanager.Connector;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  创建数据库
        Button createDatabase = (Button) findViewById(R.id.create_database);
        createDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Book book = new Book();
              book.setName("The Vinci Code");
              book.setAuthor("Dan Brown");
              book.setPages(454);
              book.setPrice(16.97);
              book.setPress("unkmon");
              book.save();
            }
        });  */


      //更新数据库
      Button updateData = (Button) findViewById(R.id.delete_data);
      updateData.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
         /*   Book book = new Book();
              book.setName("The lost Symbol");
              book.setAuthor("Dan Brown");
              book.setPages(510);
              book.setPrice(19.19);
              book.save();
              book.setPrice(10.00);
              book.save();

         Book book = new Book();
         book.setPrice(14.95);
         book.setPress("Anchor");
         book.updateAll("name = ? and author = ?","The Lost Smbol", "Dan Brown");*/


            /*  //删除
              Button deleteButton = (Button) findViewById(R.id.delete_data);
              deleteButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      DataSupport.deleteAll(Book.class, "price < ?", "15");
                  }
              });  */

                  //查询

              Button queryButton = (Button) findViewById(R.id.query_data);
              queryButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      List<Book> books =  DataSupport.findAll(Book.class);
                      for (Book book:books) {
                          Log.d("MainActivity","book name is"  +book.getName());
                          Log.d("MainActivity","book aythor is"  +book.getAuthor());
                          Log.d("MainActivity","book pages is"  +book.getPages());
                          Log.d("MainActivity","book price is"  +book.getPrice());
                      }
                  }
              });
          }
      }
    }
}






