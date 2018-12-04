package com.chevrolet;

import com.mhc.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDubboConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.chevrolet.core", "com.chevrolet.dal"})
public class ChevroletCoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ChevroletCoreApplication.class, args);
		String str = "  dafaf ";
		System.out.println(str.trim());
	}
}
