package br.ifpe.jaboatao.zAcademicoWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.ifpe.jaboatao.zAcademicoWeb.spring_boot","br.ifpe.jaboatao.zAcademicoWeb.model.dao"})
public class ZAcademicoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZAcademicoWebApplication.class, args);
	}

}
