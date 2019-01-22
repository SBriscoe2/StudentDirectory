package com.example.students;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

//DAO = data access objects
//DAO includes methods that offer abstract access to your app's database.

@Dao
public interface UserDao {
    @Query("SELECT * FROM results")
    List<User> getAll();

    @Query("SELECT * FROM results WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM results WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Query("SELECT * FROM results WHERE subject LIKE :subject")
    User findBySubject(String subject);

    @Insert
    void insertAll(User... results);

    @Delete
    void delete(User results);
}
