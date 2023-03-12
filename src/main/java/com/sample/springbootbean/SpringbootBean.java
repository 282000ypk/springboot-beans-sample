package com.sample.springbootbean;

import com.sample.springbootbean.beans.Foo;
import com.sample.springbootbean.config.Beans;
import com.sample.springbootbean.config.DemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBean implements CommandLineRunner {

	@Autowired
	Foo foo;

	@Autowired
	@Qualifier("FooOne")
	Foo one;

	@Autowired
	@Qualifier("BeanTwo")
	DemoInterface bean;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBean.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		foo.print();
		one.print();
		bean.print();
	}
}
