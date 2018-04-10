package com.springbootjpa.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity   //说明此类是实体类
@Table(name="MOVIE")//说明实体类对应的表名
public class Movie implements Serializable{
    //主键
    @Id
    //id的值自动增长
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //说明类中的属性对应表中的字段（字段名，长度，null）
    //@Column(name="movie_name",length = 100,nullable = true)
    @Column
    private String name;

    @Column
    private Double price;

    @Column (name="action_time")
    private Date actionTime;

    public Movie() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }
}
