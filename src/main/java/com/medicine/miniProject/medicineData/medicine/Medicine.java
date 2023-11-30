package com.medicine.miniProject.medicineData.medicine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Medicine {
	
	@Id
	@GeneratedValue
	long patientId;
	String name, dob, phoneNumber, medicineName, prescription;
	
	public Medicine() {
		
	}
	
	public Medicine(int patientId, String name, String dob, String phoneNumber, String medicineName,
			String prescription) {
		this.patientId = patientId;
		this.name = name;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.medicineName = medicineName;
		this.prescription = prescription;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	@Override
	public String toString() {
		return "Medicine [patientId=" + patientId + ", name=" + name + ", dob=" + dob + ", phoneNumber=" + phoneNumber
				+ ", medicineName=" + medicineName + ", prescription=" + prescription + "]";
	}
	
}
