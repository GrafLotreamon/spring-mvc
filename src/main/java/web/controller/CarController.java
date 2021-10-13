package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;


@Controller
public class CarController {

	@Autowired
	CarServiceImpl carServiceImpl;

		@GetMapping(value = "/cars")
		public String cars (@RequestParam(value = "count", defaultValue = "5") int numbers, Model model){
			model.addAttribute("carlist", carServiceImpl.getCars(numbers).toString().split(","));
			return "cars";
		}
	
}