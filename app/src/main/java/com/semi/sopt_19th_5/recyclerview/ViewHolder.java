package com.semi.sopt_19th_5.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.semi.sopt_19th_5.R;

/**
 * Created by woody on 2016. 5. 28..
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView text1, text2, text3;

    public ViewHolder(View itemView) {
        super(itemView);

        imageView = (ImageView)itemView.findViewById(R.id.imageView);
        text1 = (TextView)itemView.findViewById(R.id.textView1);
        text2 = (TextView)itemView.findViewById(R.id.textView2);
        text3 = (TextView)itemView.findViewById(R.id.textView3);
    }
}
