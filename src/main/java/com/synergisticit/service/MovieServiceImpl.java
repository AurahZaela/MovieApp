package com.synergisticit.service;

import com.synergisticit.dao.MovieRepository;
import com.synergisticit.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service(value = "movieService")
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;
    @Override
    public void save(Movie m) {

        movieRepository.save(m);
    }

    @Override
    public Movie findById(int mId) {

        Optional<Movie> optMovie = movieRepository.findById(mId);
        if(optMovie.isPresent()){
            return optMovie.get();
        }
        else{
            return null;
        }
    }

    @Override
    public List<Movie> findAll() {

        return movieRepository.findAll();
    }

    @Override
    public void update(Movie m) {
        Movie savedMovie = movieRepository.save(m);
        System.out.println("savedEmployee: "+savedMovie);
    }

    @Override
    public void deleteById(int mId) {
        movieRepository.deleteById(mId);
    }
}
