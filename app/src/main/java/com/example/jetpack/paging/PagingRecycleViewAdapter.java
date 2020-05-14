package com.example.jetpack.paging;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.jetpack.R;
import com.example.jetpack.room.entity.StudentEntity;

/**
 * @Author godv
 * Date on 2020/5/14  23:24
 */
public class PagingRecycleViewAdapter extends PagedListAdapter<StudentEntity, PagingRecycleViewAdapter.CustomViewHolder> {

    protected PagingRecycleViewAdapter() {
        super(new DiffUtil.ItemCallback<StudentEntity>() {
            //区别是否相同条目的依据
            @Override
            public boolean areItemsTheSame(@NonNull StudentEntity oldItem, @NonNull StudentEntity newItem) {
                return oldItem.getId()==newItem.getId();
            }
            //不同条目的依据
            @Override
            public boolean areContentsTheSame(@NonNull StudentEntity oldItem, @NonNull StudentEntity newItem) {
                return !oldItem.getUsername().equals(newItem.getUsername())&&!oldItem.getPassword().equals(oldItem.getPassword());
            }
        });

    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.paging_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        StudentEntity item = getItem(position);
        if (item!=null){
            holder.username.setText(item.getUsername());
            holder.password.setText(item.getPassword());
        }else{
            holder.username.setText("loading");
            holder.password.setText("loading");
        }
    }



    static class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView username;
        TextView password;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            username=itemView.findViewById(R.id.username);
            password=itemView.findViewById(R.id.password);
        }
    }
}
