package com.springbootjpa;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(MysqlxDatatypes.Scalar.String[] args) {
		SpringApplication.run(Application.class, args);
	}
}