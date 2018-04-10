package com.springbootjpa;

import com.springbootjpa.domain.Movie;
import com.springbootjpa.service.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
@Autowired
private MovieService movieService;
	@Test
	public void save() {
		Movie movie = new Movie();
		movie.setName("复仇者联盟3");
		movie.setPrice(60d);
		movie.setActionTime(new Date());

		movieService.save(movie);
	}

	@Test
	public void findALL(){
		for(Movie movie:movieService.findALL()){
			System.out.println(movie.getName()+" "+movie.getPrice());
		}
	}

	@Test
	public void findById(){
		Optional<Movie> movie= movieService.findById(3);
		System.out.println(movie.get().getName()+" "+movie.get().getPrice());
	}

	@Test
	public void deleteById(){
		movieService.deleteById(3);
	}
}
