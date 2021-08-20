package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	CarService carService;

	@GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int numbers, Model model) {
		List<Car> carlist = new ArrayList<>();
		carlist.add(new Car("Ford", 120, "1998"));
		carlist.add(new Car("Ferrari", 001, "2012"));
		carlist.add(new Car("Aston Martin", 999, "2013"));
		carlist.add(new Car("FIAT", 120, "2014"));
		carlist.add(new Car("BMW", 320, "2015"));
		try {carlist = carService.carsCount(carlist,numbers);}
		catch (NullPointerException e){}
		model.addAttribute("carlist", carlist.toString().split(","));
		return "cars";
	
}}