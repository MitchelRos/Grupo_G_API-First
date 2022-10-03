package net.Jaumebalmes.APIG;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
	
	@GetMapping("/hello")
	public String bonaTarda() {
		return "<h1>bona tarda</h1>";
	}
	


}
