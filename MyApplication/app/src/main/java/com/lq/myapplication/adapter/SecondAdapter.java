package com.lq.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lq.myapplication.R;
import com.lq.myapplication.bean.WenDaBean;
import com.lq.myapplication.utils.LogUtils;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter {

    private final Context mContext;
    private final ArrayList<WenDaBean.DataDTO.DatasDTO> mData;

    public SecondAdapter(Context context, ArrayList<WenDaBean.DataDTO.DatasDTO> dataDTOS) {
        this.mContext = context;
        this.mData = dataDTOS;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.secondrlv_item, parent, false);
        return new Vh(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Vh holder1 = (Vh) holder;
        WenDaBean.DataDTO.DatasDTO datasDTO = mData.get(position);
        holder1.mSecondAuthor.setText(datasDTO.getAuthor());
        holder1.mSecondTitle.setText(datasDTO.getTitle());
        holder1.mSecondTime.setText(datasDTO.getNiceShareDate());
        holder1.mSecondSuperChapterName.setText(datasDTO.getSuperChapterName());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void addData(WenDaBean.DataDTO dataDTO) {
        mData.addAll(dataDTO.getDatas());
        LogUtils.e("mData: " + mData.size());
        //刷新适配器
        notifyDataSetChanged();
    }

    class Vh extends RecyclerView.ViewHolder {
        private final TextView mSecondAuthor;
        private final TextView mSecondTitle;
        private final TextView mSecondTime;
        private final TextView mSecondSuperChapterName;


        public Vh(@NonNull View itemView) {
            super(itemView);
            mSecondAuthor = (TextView) itemView.findViewById(R.id.second_author);
            mSecondTitle = (TextView) itemView.findViewById(R.id.second_title);
            mSecondTime = (TextView) itemView.findViewById(R.id.second_time);
            mSecondSuperChapterName = (TextView) itemView.findViewById(R.id.second_superChapterName);
        }
    }

}
