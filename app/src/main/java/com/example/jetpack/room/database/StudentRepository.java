package com.example.jetpack.room.database;

import android.content.Context;

import androidx.room.Room;

import com.example.jetpack.room.dao.StudentDao;

/**
 * @Author godv
 * Date on 2020/5/14  20:44
 */
public class StudentRepository  {
    //单例
    private static volatile  StudentRepository instance;
    private StudentDatabase studentDatabase;
    private StudentDao studentDao;
    public static StudentRepository getInstance(Context context){
        if (instance==null){
            synchronized (StudentRepository.class){
                if (instance==null){
                    instance=new StudentRepository(context);
                }
            }
        }
        return instance;
    }
    private StudentRepository(Context context){
        //初始化数据库
        studentDatabase= Room.databaseBuilder(context,StudentDatabase.class,"student.db").allowMainThreadQueries().build();
        studentDao=studentDatabase.getStudentDao();
    }
    public  StudentDao getStudentDao(){
        return studentDao;
    }


}
