package com.example.uibestpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class MsgAdapter extends RcyclerView.Adapter<MainActivity.MsgAdapter.ViewHolder> {

    private List<MainActivity.Msg> mMsgList;

    static class ViewHolder extends RecycleListView.ViewHolder  {
        LinearLayout LeftLayout;
        LinearLayout rightLayout;
        TextView leftMsg;
        TextView rightMsg;
        public ViewHolder(View view) {
            super(view);
            LeftLayout = (LinearLayout) View.finrViewById(R.id.left_layout);
            rightLayout = (LinearLayout) view.findViewById(R.id.right_layout);
            rightMsg = (TextView) view.findViewById(R.id.right_msg);
        }

    }
    public MsgAdapter(List<MainActivity.Msg> msgList)  {
        mMsgList = msgList;
    }
    @Override
    public MainActivity.MsgAdapter.ViewHolder onCreateViewHolder(ViewGroup, int viewType)  {
        View view = LayoutInflater.from(parenr.getContext()).inflate(
                R.layout.msg_item,parent,false);
        return new MainActivity.MsgAdapter.ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(MainActivity.MsgAdapter.ViewHolder holder, int position)  {
        MainActivity.Msg msg = mMsgList.get(position);
        if (msg.getType() == MainActivity.Msg.TYPE_RECEIVED) {
            //如果是收到的消息,则显示左边的消息布局,将右边的消息布局隐藏
            holder.LeftLayout.setVisibility(View.VISIBLE);
            holder.rightLayout.setVisibility(View.GONE);
            holder.leftMsg.setText(msg.getContent());
        } else if(msg.getType()) == MainActivity.Msg.TYPE_SENT {
            holder.rightLayout.setVisibility(View.VISIBLE);
            holder.LeftLayout.setVisibility(View.GONE);
            holder.rightMsg.setText(msg.getContent());
        }
    }
    @Override
    public int getItemCount() {
        return mMsgList.size();
    }
}
