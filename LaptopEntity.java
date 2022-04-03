package com.xworkz.laptop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Table(name="laptop")
@Entity
public class LaptopEntity {
	@Column(name="laptopId")
	@Id
	@GenericGenerator(name="abc", strategy="increment")
	@GeneratedValue(generator="abc")
	private int laptopId;
	
	@Column(name="laptopName")
	private String laptopName;
	
	@Column(name="laptopPrice")
	private double laptopPrice;
	
	@Column(name="laptopRAM")
	private int laptopRAM;
	
	@Column(name="laptopBrand")
	private String laptopBrand;
	
	@Column(name="laptopColor")
	private String laptopColor;
	
	@Column(name="laptopROM")
	private int laptopROM; 
	
	@Column(name="laptopProcessor")
	private String laptopProcessor;

	public LaptopEntity() {
		super();
		
	}

	public LaptopEntity(int laptopId, String laptopName, double laptopPrice, int laptopRAM, String laptopBrand,
			String laptopColor, int laptopROM, String laptopProcessor) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
		this.laptopRAM = laptopRAM;
		this.laptopBrand = laptopBrand;
		this.laptopColor = laptopColor;
		this.laptopROM = laptopROM;
		this.laptopProcessor = laptopProcessor;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public double getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public int getLaptopRAM() {
		return laptopRAM;
	}

	public void setLaptopRAM(int laptopRAM) {
		this.laptopRAM = laptopRAM;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	public String getLaptopColor() {
		return laptopColor;
	}

	public void setLaptopColor(String laptopColor) {
		this.laptopColor = laptopColor;
	}

	public int getLaptopROM() {
		return laptopROM;
	}

	public void setLaptopROM(int laptopROM) {
		this.laptopROM = laptopROM;
	}

	public String getLaptopProcessor() {
		return laptopProcessor;
	}

	public void setLaptopProcessor(String laptopProcessor) {
		this.laptopProcessor = laptopProcessor;
	}

	@Override
	public String toString() {
		return "LaptopEntity [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopPrice=" + laptopPrice
				+ ", laptopRAM=" + laptopRAM + ", laptopBrand=" + laptopBrand + ", laptopColor=" + laptopColor
				+ ", laptopROM=" + laptopROM + ", laptopProcessor=" + laptopProcessor + "]";
	}
	
	
	
	

}
