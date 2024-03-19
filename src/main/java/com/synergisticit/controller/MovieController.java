package com.synergisticit.controller;

import com.synergisticit.domain.Movie;
import com.synergisticit.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MovieController {

    @Qualifier(value= "movieService")

    @Autowired
    MovieService movieService;

    @RequestMapping("findAll")
    public ResponseEntity<List<Movie>> findAll(){
        List<Movie> movies = movieService.findAll();
        for(Movie m :  movies) {
            System.out.println(m);
        }
        return new ResponseEntity<List<Movie>>(movies, HttpStatus.FOUND);
    }

    @RequestMapping("findById")
    public ResponseEntity<Movie> findById(@RequestParam int mId){
        Movie m = movieService.findById(mId);
        System.out.println("findById "+ mId +": "+m);
        return new ResponseEntity<Movie>(m, HttpStatus.FOUND);
    }


    @RequestMapping("save")
    public ResponseEntity<Movie> saveMovie(@RequestParam int mId, @RequestParam  String title,
                                                 @RequestParam String genre, @RequestParam String rating, @RequestParam int price){
        System.out.println("mId: "+mId);
        System.out.println("title: "+title);
        System.out.println("genre: "+genre);
        System.out.println("rating: "+rating);
        System.out.println("price: " + price);
        Movie m = new Movie(mId, title, genre, rating, price);
        movieService.save(m);
        return new ResponseEntity<Movie>(m, HttpStatus.CREATED);
    }
    //save?mId=5&title=Garden of Sinners&genre=Drama&rating=mid&price=0

    @RequestMapping("delete")
    public ResponseEntity<String> deleteMovie(@RequestParam int mId){
        movieService.deleteById(mId);
        return new ResponseEntity<String>("Movie Record deleted for mId" + mId, HttpStatus.GONE);
    }

}
