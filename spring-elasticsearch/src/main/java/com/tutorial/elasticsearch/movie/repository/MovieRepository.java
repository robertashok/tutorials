package com.tutorial.elasticsearch.movie.repository;

import com.tutorial.elasticsearch.movie.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MovieRepository extends ElasticsearchRepository<Movie, String> {

    Page<Movie> findAll();
}
