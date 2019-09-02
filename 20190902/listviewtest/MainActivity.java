package com.example.listviewtest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*private String[] data = {"Apple", "Banana", "Orange", "Watermelon",
            "pear", "Grape", "Pineapple", "Strawberry", "Cherry", "MANGO",
            "Apple", "Banana", "Orange", "Watermelon",
            "pear", "Grape", "Pineapple", "Strawberry", "Cherry", "MANGO",


    };*/

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();    //初始化水果数据
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView) findViewById(R.id.List_view);
        listView.setAdapter(adapter);

       /* ArrayAdapter<String> adapter = new ArrayAdapter(
                MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView ListView = (android.widget.ListView) findViewById(R.id.List_view);
        ListView.setAdapter(adapter); */

    }

    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit("Apple", R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit orange = new Fruit("Apple", R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Apple", R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Apple", R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit("Apple", R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit mango = new Fruit("Apple", R.drawable.mango_pic);
            fruitList.add(mango);
        }
    }

    public class Fruit {
        private String name;
        private int imageId;

        public Fruit(String name, int imageId) {
            this.name = name;
            this.imageId = imageId;
        }

        public String getName() {
            return name;
        }

        public int getImageId() {
            return imageId;
        }

    }

    public class FruitAdapter extends ArrayAdapter<Fruit> {
        private int resourceId;

        public FruitAdapter(Context context, int textViewResourceId,
                            List<MainActivity.Fruit> objects) {
            super(context, textViewResourceId, objects);
            resourceId = textViewResourceId;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            Fruit fruit = getItem(position);    //获取当前项的Fruit实例
           /* View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            ImageView fruitImage = (ImageView)  view.findViewById(R.id.fruit_image);
            TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
            fruitImage.setImageResource(fruit.getImageId());
            fruitName.setText(fruit.getName());
            return view;*/

            View view;
          /*  if (convertView == null) {
                view = LayoutInflater.from(getContext()).inflate(resourceId, parent,
                        false);

            } else {
                view = convertView;
            }
            ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
            TextView fruit_Name = (TextView) view.findViewById(R.id.fruit_name);
            fruit_Name.setText(fruit.getName());
            fruitImage.setImageResource(fruit.getImageId());
            return view */

            ViewHolder viewHolder;
            if (convertView == null) {
                view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
                viewHolder = new ViewHolder();
                viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
                viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
                view.setTag(viewHolder); //将ViewHolder 存储在View中

            } else {
                view = convertView;
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.fruitImage.setImageResource(fruit.getImageId());
            viewHolder.fruitname.setText(fruit.getName());
            return view;
        }

        class ViewHolder {
            ImageView fruitImage;
            TextView fruitName;


        }
        }
    }









