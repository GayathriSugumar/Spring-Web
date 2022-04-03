package com.xworkz.laptop.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.laptop.dao.LaptopDAO;
import com.xworkz.laptop.dto.LaptopDTO;
import com.xworkz.laptop.entity.LaptopEntity;
@Component
public class LaptopServiceImpl implements LaptopService {
	@Autowired
	private LaptopDAO laptop;
	
	public LaptopServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "BeanCreated");
	}

	@Override
	public boolean validateLaptopDTO(LaptopDTO dto) {
		System.out.println("");
		boolean temp = false;

		if (dto.getLaptopName() != null && !dto.getLaptopName().isEmpty()) {
			System.out.println("laptopName is valid");
			temp = true;
		} else {
			System.out.println("laptopName is Invalid");
			temp = false;
			return temp;
		}

		if (dto.getLaptopBrand() != null && !dto.getLaptopBrand().isEmpty()) {
			System.out.println("laptopbrand is valid");
			temp = true;
		} else {
			System.out.println("laptopbrand is Invalid");
			temp = false;
			return temp;
		}

		if (dto.getLaptopPrice() > 0) {
			System.out.println("laptopPrice is valid");
			temp = true;
		} else {
			System.out.println("laptopPrice is Invalid");
			temp = false;
			return temp;
		}

		if (dto.getLaptopColor() != null && !dto.getLaptopColor().isEmpty()) {
			System.out.println("laptopColor is valid");
			temp = true;
		} else {
			System.out.println("laptopColor is Invalid");
			temp = false;
			return temp;
		}

		if (dto.getLaptopRAM() > 0) {
			System.out.println("laptopRAM is valid");
			temp = true;
		} else {
			System.out.println("laptopRAM is Invalid");
			temp = false;
			return temp;
		}

		if (dto.getLaptopROM() > 0) {
			System.out.println("laptopROM is valid");
			temp = true;
		} else {
			System.out.println("laptopROM is Invalid");
			temp = false;
			return temp;
		}

		if (dto.getLaptopProcessor() != null && !dto.getLaptopProcessor().isEmpty()) {
			System.out.println("laptopProcessor is valid");
			temp = true;
		} else {
			System.out.println("laptopProcessor is Invalid");
			temp = false;
			return temp;
		}

		System.out.println(dto);
		return temp;
	}

	@Override
	public boolean saveLaptopDTO(LaptopDTO laptopDTO) {

		System.out.println("Invoked savaLaptopDTO()");
		LaptopEntity laptopEntity = new LaptopEntity();
		BeanUtils.copyProperties(laptopDTO, laptopEntity);
		boolean isEntitySaved = laptop.saveLaptopEntity(laptopEntity);
		return isEntitySaved;
	}

}
