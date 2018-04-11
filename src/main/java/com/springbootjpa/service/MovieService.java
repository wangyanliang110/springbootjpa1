package com.springbootjpa.service;

import com.springbootjpa.domain.Movie;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Optional;

/**
 * 业务逻辑接口
 */

public interface MovieService {
    void save(Movie moive);

    void deleteById(Integer id);

    List<Movie> findALL();

    Optional<Movie> findById(Integer id);

    List<Movie> findByMovieName(String name);
}
