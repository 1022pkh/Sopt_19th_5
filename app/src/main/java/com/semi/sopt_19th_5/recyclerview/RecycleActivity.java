package com.semi.sopt_19th_5.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.semi.sopt_19th_5.R;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity {

    ArrayList<ItemData> itemDatas;
    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        //각 item의 크기가 일정할 경우 고정
        recyclerView.setHasFixedSize(true);

        // LayoutManager 초기화
        // layoutManager 설정
        mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLayoutManager);

        // adpater 설정
        itemDatas = new ArrayList<ItemData>();
        mAdapter = new CustomAdapter(itemDatas);
        recyclerView.setAdapter(mAdapter);

        itemDatas.add(new ItemData(R.drawable.sopt1,"양용기","서버 파트장","반갑습니다^^"));
        itemDatas.add(new ItemData(R.drawable.sopt2,"박경현","안드 파트장","잘부탁드립니다!"));
        itemDatas.add(new ItemData(R.drawable.sopt3,"이경욱","ios 파트장","SOPT 최고!"));
    }
}
