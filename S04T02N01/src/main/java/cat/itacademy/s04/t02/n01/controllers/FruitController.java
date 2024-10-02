package cat.itacademy.s04.t02.n01.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitController  {
	
	@PostMapping("/fruit/add")
	public String add(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been added. ";
		
	}
	
	@PostMapping("/fruit/update")
	public String update(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been updated. ";
		
	}
	
	@DeleteMapping("/fruit/delete/{id}")
	public String delete(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Fruit ID: " + id + " has been deleted. ";
		
	}
	
	@GetMapping("/fruit/getOne/{id}")
	public String getOne(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Showing Fruit ID: " + id + ". ";
		
	}
	
	@GetMapping("/fruit/getAll")
	public String getAll(@RequestParam(value = "id", defaultValue = "UNKNOWN") int id) {
		
		return "Show all fruits: ID: " + id + " has been added. ";
		
	}
	

}
