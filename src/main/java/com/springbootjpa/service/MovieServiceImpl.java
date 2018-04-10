package com.springbootjpa.service;

import com.springbootjpa.domain.Movie;
import com.springbootjpa.domain.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * 业务逻辑接口实现类
 */
@Service
@Transactional
public class MovieServiceImpl implements MovieService{
    @Autowired
    private MovieRepository movieRepository;

    /**
     * 新增（无id）|修改（有id）
     * @param moive
     */
    @Override
    public void save(Movie moive) {
        movieRepository.save(moive);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        movieRepository.deleteById(id);
    }

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Movie> findALL() {
       return movieRepository.findAll();
    }

    /**
     * 根据id查询
     */
    @Override
    public Optional<Movie> findById(Integer id) {
        return movieRepository.findById(id);
    }
}
