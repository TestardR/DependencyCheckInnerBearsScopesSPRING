package com.romain.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String patientName;
	private List<String> medecines;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	@Required
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedecines() {
		return medecines;
	}

	@Required
	public void setMedecines(List<String> medecines) {
		this.medecines = medecines;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", medecines=" + medecines + "]";
	}

}
