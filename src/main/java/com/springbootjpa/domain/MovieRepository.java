package com.springbootjpa.domain;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 持久层：由jpa管理
 * @author LIANG
 */
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    //包含了一般的增删改查
}
