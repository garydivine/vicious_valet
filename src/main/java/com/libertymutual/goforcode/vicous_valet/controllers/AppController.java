package com.libertymutual.goforcode.vicous_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vicous_valet.models.Car;
import com.libertymutual.goforcode.vicous_valet.models.Lot;

@Controller  // traffic cop
public class AppController {

	private Lot carLot; //declaring variable

	public AppController() {
		carLot = new Lot(5); //instantiating object
	}

	@RequestMapping("/")  //tying back to the root
	public ModelAndView showApp(String license, String state, String color, String make, String model) {

		// if license is not null and the length of license is greater than 0
		// create a new instance of the car class from the values submitted

		if (license != null && license.length() > 0) {
			Car carBeingAdded = new Car(license, state, color, make, model);
			
			// park the car in the log 
			// we need to add a method to the Lot class and call that method
			
			carLot.addCar(carBeingAdded);
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);

		return mv;
	}

	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCarFromLot(carIndex);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}
}


