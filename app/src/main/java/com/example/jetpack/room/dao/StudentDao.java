package com.example.jetpack.room.dao;

import androidx.paging.DataSource;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.jetpack.room.entity.StudentEntity;

import java.util.List;

/**
 * @Author godv
 * Date on 2020/5/14  20:33
 */
@Dao
public interface StudentDao {
    @Insert
    void insert(StudentEntity... studentEntities);
    @Update
    void update(StudentEntity... studentEntities);

    @Query("select * from student_db")
    List<StudentEntity> queryList();
    //当我们使用room集成不同的组件的时候。我们可以自定义我们的返回类型
    @Query("select * from student_db")
    DataSource.Factory<Integer,StudentEntity> queryListPaging();

}
