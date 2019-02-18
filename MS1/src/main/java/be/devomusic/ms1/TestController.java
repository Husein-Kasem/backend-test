package be.devomusic.ms1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
	
	@RequestMapping(value="/teststring")
	public String test() {
		return "test from ms1";
	}

}
