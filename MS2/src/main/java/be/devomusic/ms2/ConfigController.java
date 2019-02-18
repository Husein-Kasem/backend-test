package be.devomusic.ms2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigController {

	@Value("${spring.security.user.name}")
	private String conf;
	
	@RequestMapping(value="/conf")
	public String configString() {
		return conf;
	}
}
