package com.example.jetpack.paging;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jetpack.R;
import com.example.jetpack.room.database.StudentRepository;
import com.example.jetpack.room.entity.StudentEntity;

/**
 * @Author godv
 * Date on 2020/5/14  23:17
 */
public class PagingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paging_layout);
        RecyclerView recyclerView=findViewById(R.id.recycle_view);
        final PagingRecycleViewAdapter adapter=new PagingRecycleViewAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LiveData<PagedList<StudentEntity>> data = new LivePagedListBuilder<>(StudentRepository.getInstance(this).getStudentDao().queryListPaging(), 5).build();
        data.observe(this, new Observer<PagedList<StudentEntity>>() {
            @Override
            public void onChanged(PagedList<StudentEntity> studentEntities) {
                adapter.submitList(studentEntities);
            }
        });
    }
}
