package com.xworkz.laptop.dto;

public class LaptopDTO {
	private int laptopId;

	private String laptopName;

	private double laptopPrice;

	private int laptopRAM;

	private String laptopBrand;

	private String LaptopColor;

	private int LaptopROM;

	private String LaptopProcessor;

	public LaptopDTO() {

	}

	public LaptopDTO(int laptopId, String laptopName, double laptopPrice, int laptopRAM, String laptopBrand,
			String laptopColor, int laptopROM, String laptopProcessor) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
		this.laptopRAM = laptopRAM;
		this.laptopBrand = laptopBrand;
		LaptopColor = laptopColor;
		LaptopROM = laptopROM;
		LaptopProcessor = laptopProcessor;
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
		return LaptopColor;
	}

	public void setLaptopColor(String laptopColor) {
		LaptopColor = laptopColor;
	}

	public int getLaptopROM() {
		return LaptopROM;
	}

	public void setLaptopROM(int laptopROM) {
		LaptopROM = laptopROM;
	}

	public String getLaptopProcessor() {
		return LaptopProcessor;
	}

	public void setLaptopProcessor(String laptopProcessor) {
		LaptopProcessor = laptopProcessor;
	}

	@Override
	public String toString() {
		return "LaptopDTO [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopPrice=" + laptopPrice
				+ ", laptopRAM=" + laptopRAM + ", laptopBrand=" + laptopBrand + ", LaptopColor=" + LaptopColor
				+ ", LaptopROM=" + LaptopROM + ", LaptopProcessor=" + LaptopProcessor + "]";
	}

}
