package com.xworkz.laptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.service.LaptopService;

@Component
@RequestMapping("/")
public class laptopController {
	@Autowired
	private LaptopService laptopService;

	public laptopController() {
		super();
		System.out.println(this.getClass().getSimpleName() + "Bean is created");
	}

	@RequestMapping("/laptop")
	public String onSubmitButtonClicked(@ModelAttribute LaptopDTO dto, Model model) {
		System.out.println("Invoked onSubmitButtonClicked()");
		boolean result = laptopService.validateLaptopDTO(dto);
		if (result) {
			boolean saveLaptopDTO = laptopService.saveLaptopDTO(dto);
			if (saveLaptopDTO) {
				model.addAttribute("message", "laptop data is saved to database");
				System.out.println("Laptop data is not saved to database");
			} else {
				model.addAttribute("message", "laptop data is not saved to database");
				System.out.println("Laptop data is saved to database");
			}
		} else {
			model.addAttribute("message", "Invalid data or inputs.please try again");
			System.out.println("Invalid data or inputs.please try again");
		}
		System.out.println(dto.toString());
		return "/spring.html";
	}

}
