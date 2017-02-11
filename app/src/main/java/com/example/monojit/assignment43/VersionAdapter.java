package com.example.monojit.assignment43;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MONOJIT on 2/11/2017.
 */

public class VersionAdapter extends BaseAdapter{
    Context context;
    List<ImageList>imageList;
    public VersionAdapter(Context context,List<ImageList>images){
        this.context=context;
        this.imageList=images;
    }


    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public Object getItem(int i) {
        return imageList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.dataimage,viewGroup,false);
            ImageView name=(ImageView)view.findViewById(R.id.imageView);
            ImageList images = imageList.get(i);
            name.setImageResource(images.id);
        }
        return view;
    }
}
