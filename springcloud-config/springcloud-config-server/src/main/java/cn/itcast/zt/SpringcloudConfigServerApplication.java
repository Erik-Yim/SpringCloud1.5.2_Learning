package cn.itcast.zt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// 访问地址：http://127.0.0.1:7001/ztspace/dev [test/prod]
@SpringBootApplication
// 添加@EnableConfigServer注解，开启Config Server
@EnableConfigServer
public class SpringcloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudConfigServerApplication.class, args);
	}
}
