package com.example.jetpack.navigation;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetpack.R;
import com.example.jetpack.room.dao.StudentDao;
import com.example.jetpack.room.database.StudentRepository;
import com.example.jetpack.room.entity.StudentEntity;

import java.util.List;

public class IkunFragment extends Fragment {

    private IkunViewModel mViewModel;

    public static IkunFragment newInstance() {
        return new IkunFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        insert();
        select();
        return inflater.inflate(R.layout.ikun_fragment, container, false);
    }
    //查询
    private void select() {
        List<StudentEntity> studentEntities = StudentRepository.getInstance(getContext()).getStudentDao().queryList();
        Log.d("IkunFragment",studentEntities.get(0).toString());
    }

    //插入操作
    private void insert() {
        StudentEntity studentEntity = new StudentEntity("曾伟", "godv");
        Log.d("IkunFragment",studentEntity.toString());
        for (int i = 0; i < 20; i++) {
            StudentRepository.getInstance(getContext()).getStudentDao().insert(studentEntity);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(IkunViewModel.class);
        // TODO: Use the ViewModel
    }

}
