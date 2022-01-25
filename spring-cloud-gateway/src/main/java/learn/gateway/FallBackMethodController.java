package learn.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/fallback")
	public String fallback() {
		return "Services are temporarily down..!! Please try again after sometime..!!";
	}
}
