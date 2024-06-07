package jp.co.fbsc.salessupport;

import javax.swing.Spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "jp.co.fbsc.salessupport.mapper")
public class SalesSupportApplication {
	public static void main(String[] args) {
		SpringApplication.run(SalesSupportApplication.class, args);
	}

}
