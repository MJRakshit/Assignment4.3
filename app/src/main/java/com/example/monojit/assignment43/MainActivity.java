package com.example.monojit.assignment43;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ImageList>imageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView =(GridView)findViewById(R.id.imagelist);
        initVersionImage();
        VersionAdapter versionAdapter=new VersionAdapter(this,imageList);
        gridView.setAdapter((ListAdapter) versionAdapter);

    }
    public void initVersionImage(){
     imageList=new ArrayList<ImageList>();
     imageList.add(new ImageList(R.drawable.gingerbread));
        imageList.add(new ImageList(R.drawable.honeycomb));
        imageList.add(new ImageList(R.drawable.icecream));
        imageList.add(new ImageList(R.drawable.jellybean));
        imageList.add(new ImageList(R.drawable.kitkat));
        imageList.add(new ImageList(R.drawable.lollypop));
    }
}
