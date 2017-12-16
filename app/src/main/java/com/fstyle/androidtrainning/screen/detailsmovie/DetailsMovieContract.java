package com.fstyle.androidtrainning.screen.detailsmovie;

import com.fstyle.androidtrainning.data.model.Movie;
import com.fstyle.androidtrainning.data.service.config.MoviesApi;
import com.fstyle.androidtrainning.screen.BasePresenter;
import com.fstyle.androidtrainning.screen.BaseView;
import java.util.List;

/**
 * This specifies the contract between the view and the presenter.
 */
interface DetailsMovieContract {
    /**
     * View.
     */
    interface DetailsMovieView extends BaseView {
        Integer getMovieId();

        void onDetailsMovieSuccess(Movie body, List<String> listGenre);
    }

    /**
     * Presenter.
     */
    interface Presenter extends BasePresenter<DetailsMovieView> {
        void setView(DetailsMovieContract.DetailsMovieView detailsMovieView);

        void setMovieApi(MoviesApi moviesApi);

        void getDetailsMovie();
    }
}
