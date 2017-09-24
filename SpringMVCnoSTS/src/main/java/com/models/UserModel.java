package com.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserModel {

	private String name;
	private int id;
	private CarModel carModel;

	public UserModel() {
	}

	@Autowired
	public UserModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	public String getUserCarModel() {
		return carModel.getModel();
	}

	public String getUserCarMark() {
		return carModel.getMark();
	}

	public void setUserCarModel() {
		carModel.setModel("example model");
	}

	public void setUserCarMark() {
		carModel.setMark("example mark");
	}

}
