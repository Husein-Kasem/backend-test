package be.devomusic.discovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

	
	@Value("${spring.security.user.name}")
	private String conf;
	
	@RequestMapping("/conf")
	public String configString() {
		return conf;
	}
}
