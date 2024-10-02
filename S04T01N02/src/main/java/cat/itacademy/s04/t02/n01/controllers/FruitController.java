package cat.itacademy.s04.t02.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController  {
	
	@GetMapping("/fruita/add")
	public String add(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been added. ";
		
	}
	
	@GetMapping("/fruita/update")
	public String update(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been added. ";
		
	}
	
	@GetMapping("/fruita/delete/{id}")
	public String delete(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been added. ";
		
	}
	
	@GetMapping("/fruita/getOne/{id}")
	public String getOne(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been added. ";
		
	}
	
	@GetMapping("/fruita/getAll")
	public String getAll(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been added. ";
		
	}
	

}
