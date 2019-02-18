package be.devomusic.ms1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;

@RestController
public class EurekaClientApplication{

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;
	
	@Value("${spring.application.name}")
    private String appName;
	
	@RequestMapping(value="/eureka")
	public String eurekaMethod() {
		return String.format("Application Name: '%s'\nEureka Client: '%s'", appName, eurekaClient.getApplication(appName).getName());
	}
}
