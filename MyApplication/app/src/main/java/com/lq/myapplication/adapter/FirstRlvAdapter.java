package com.lq.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lq.myapplication.R;
import com.lq.myapplication.bean.FirstHotBean;
import com.lq.myapplication.utils.LogUtils;

import java.util.ArrayList;

public class FirstRlvAdapter extends RecyclerView.Adapter {

    public ArrayList<FirstHotBean.DataDTO> mBean;
    private final Context mContext;

    public FirstRlvAdapter(Context mContext, ArrayList<FirstHotBean.DataDTO> datasDTOS) {
        this.mBean = datasDTOS;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.firstrlv_item, parent, false);
        return new Vh(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Vh holder1 = (Vh) holder;
        FirstHotBean.DataDTO datasDTO = mBean.get(position);
        LogUtils.e(datasDTO.toString());
        holder1.mFirstAuthor.setText(datasDTO.getAuthor());
        holder1.mFirstTime.setText(datasDTO.getNiceShareDate());
        holder1.mFirstTitle.setText(datasDTO.getTitle());
        holder1.mFirstSuperChapterName.setText(datasDTO.getSuperChapterName());
        holder1.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mBean.size();
    }

    public void addData(FirstHotBean datasDTO) {
        mBean.addAll(datasDTO.getData());
        //刷新数据
        notifyDataSetChanged();
    }

    //内部需继承recyViewHolder
    class Vh extends RecyclerView.ViewHolder {
        private final TextView mFirstAuthor;
        private final TextView mFirstTitle;
        private final TextView mFirstTime;
        private final TextView mFirstSuperChapterName;

        public Vh(@NonNull View itemView) {
            super(itemView);
            mFirstAuthor = (TextView) itemView.findViewById(R.id.first_author);
            mFirstTitle = (TextView) itemView.findViewById(R.id.first_title);
            mFirstTime = (TextView) itemView.findViewById(R.id.first_time);
            mFirstSuperChapterName = (TextView) itemView.findViewById(R.id.first_superChapterName);

        }
    }
}
