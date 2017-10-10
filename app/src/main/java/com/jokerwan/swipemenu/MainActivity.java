package com.jokerwan.swipemenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerItemSwipeListener itemSwipeListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView)findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(new RecyclerMsgAdapter());

        itemSwipeListener = new RecyclerItemSwipeListener(this, recycler);
        itemSwipeListener

                .setClickable(new RecyclerItemSwipeListener.OnRowClickListener() {
                    @Override
                    public void onRowClicked(int position) {
                        Toast.makeText(MainActivity.this, position + "  item clicked", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onIndependentViewClicked(int independentViewID, int position) {
                        switch (independentViewID) {
                            case R.id.img_avatar :
                                Toast.makeText(MainActivity.this, position + "  头像", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                })
                .setIndependentViews(R.id.img_avatar)
                .setSwipeOptionViews(R.id.btn_stick, R.id.btn_delete)
                .setSwipeable(R.id.ll_item_msg, R.id.rl_swipe_btn, new RecyclerItemSwipeListener.OnSwipeOptionsClickListener() {
                    @Override
                    public void onSwipeOptionClicked(int viewID, int position) {
                        switch (viewID) {
                            case R.id.btn_stick:
                                Toast.makeText(MainActivity.this, position + "  置顶", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.btn_delete:
                                Toast.makeText(MainActivity.this, position + "  删除", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });

        recycler.addOnItemTouchListener(itemSwipeListener);
    }
}
