package com.app.mobile11;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyGridAdapter extends BaseAdapter {
    Context context;

    MyGridAdapter(Context context){
        this.context = context;
    }
    int[] posterId = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,
            R.drawable.pic9,
    };
    @Override
    public int getCount() {
        return posterId.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        /*ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(300,300));
        imageView.setPadding(5,5,5,5);
        imageView.setImageResource(posterId[i]);
        return imageView;*/
        TextView textView = new TextView(context);
        textView.setText(i + "번 그림");
        return textView;
    }
}
