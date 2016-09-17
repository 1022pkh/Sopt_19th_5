package com.semi.sopt_19th_5.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.semi.sopt_19th_5.R;

import java.util.ArrayList;

/**
 * Created by woody on 2016. 5. 28..
 */
public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<ItemData> itemDatas;

    public CustomAdapter(ArrayList<ItemData> itemDatas){
        this.itemDatas = itemDatas;
    }

    //ViewHolder 생성
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                                        .inflate(R.layout.item_cardview, parent,false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;

    }

    //ListView의 getView()랑 동일
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(itemDatas.get(position).getImage());
        holder.text1.setText(itemDatas.get(position).getName());
        holder.text2.setText(itemDatas.get(position).getPart());
        holder.text3.setText(itemDatas.get(position).getContents());
    }


    @Override
    public int getItemCount() {
        return (itemDatas != null) ? itemDatas.size() : 0;
    }
}
