package edu.nyu.wow;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAsync
@EnableTransactionManagement
@EnableSwagger2
@MapperScan("edu.nyu.wow.mapper")
public class WowApplication {
	public static final Logger log = LoggerFactory.getLogger(WowApplication.class);
	public static void main(String[] args) throws UnknownHostException {
		ApplicationContext ctx = SpringApplication.run(WowApplication.class, args);
		Environment env = ctx.getEnvironment();
		log.info(
				"\n----------------------------------------------------------\n\t"
						+ "Application '{}' is running! Access URLs:\n\t"
						+ "Local: \t\thttp://localhost:{}\n\t"
						+ "External: \thttp://{}:{}\n\t"
						+ "Swagger : \thttp://localhost:{}/swagger-ui.html#/\n\t",
				env.getProperty("spring.application.name"),
				env.getProperty("server.port"),
				InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"),
				//InetAddress.getLocalHost().getHostAddress(),
				env.getProperty("server.port"));
	}

}
