package com.synergisticit.service;
import com.synergisticit.domain.Movie;

import java.util.List;
public interface MovieService {
    void save(Movie m);
    Movie findById(int mId);
    List<Movie> findAll();

    void update(Movie m);
    void deleteById(int mId);
}
