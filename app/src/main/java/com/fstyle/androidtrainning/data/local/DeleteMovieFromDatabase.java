package com.fstyle.androidtrainning.data.local;

import android.os.AsyncTask;
import com.fstyle.androidtrainning.data.local.entity.MovieEntity;

/**
 * Created by huynh on 19/12/2017.
 */

public class DeleteMovieFromDatabase extends AsyncTask<MovieEntity, Void, Void> {
    private MovieDatabase mMovieDatabase;
    private OnDeleteDataListener mOnDeleteDataListener;

    public DeleteMovieFromDatabase(MovieDatabase movieDatabase,
            OnDeleteDataListener onDeleteDataListener) {
        mMovieDatabase = movieDatabase;
        mOnDeleteDataListener = onDeleteDataListener;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(MovieEntity... movieEntities) {
        mMovieDatabase.getMovieDAO().deleteMovie(movieEntities[0]);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        mOnDeleteDataListener.onDeleteDataSuccess();
    }
}
