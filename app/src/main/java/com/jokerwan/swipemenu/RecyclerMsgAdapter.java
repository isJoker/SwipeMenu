package com.jokerwan.swipemenu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ${JokerWan} on 2017/10/10.
 * WeChat：wjc398556712
 * Function：
 */

public class RecyclerMsgAdapter extends RecyclerView.Adapter {

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MsgViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_msg,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class MsgViewHolder extends RecyclerView.ViewHolder{

        public MsgViewHolder(View itemView) {
            super(itemView);
        }
    }
}
