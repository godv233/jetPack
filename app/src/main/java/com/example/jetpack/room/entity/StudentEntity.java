package com.example.jetpack.room.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author godv
 * Date on 2020/5/14  20:27
 */
@Data
@Entity(tableName = "student_db")
public class StudentEntity {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String username;
    private String password;
    public StudentEntity(String username,String password){
        this.username=username;
        this.password=password;
    }
}
