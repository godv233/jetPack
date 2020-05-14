package com.example.jetpack.room.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.jetpack.room.dao.StudentDao;
import com.example.jetpack.room.entity.StudentEntity;

/**
 * @Author godv
 * Date on 2020/5/14  20:37
 */
@Database(entities = {StudentEntity.class},version = 1,exportSchema = false)
public abstract class StudentDatabase extends RoomDatabase {
    public abstract StudentDao getStudentDao();
}
