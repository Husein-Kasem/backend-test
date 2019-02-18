package be.devomusic.ms2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {

	@RequestMapping(value="/teststring")
	public String testString() {
		return "test from ms2";
	}
}
