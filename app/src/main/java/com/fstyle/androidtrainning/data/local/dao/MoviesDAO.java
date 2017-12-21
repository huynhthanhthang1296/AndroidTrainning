package com.fstyle.androidtrainning.data.local.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import com.fstyle.androidtrainning.data.local.entity.MovieEntity;
import java.util.List;

/**
 * Created by huynh on 19/12/2017.
 */

@Dao
public interface MoviesDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMovie(MovieEntity movieEntity);

    @Query("SELECT * FROM movie")
    List<MovieEntity> getMovie();

    @Delete
    void deleteMovie(MovieEntity movieEntity);

    @Query("SELECT COUNT(*) FROM movie WHERE id=:id")
    int isFavoriteMovie(int id);


}
