package com.medicine.miniProject.medicineData.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.medicine.miniProject.medicineData.medicine.Medicine;
import com.medicine.miniProject.medicineData.repository.MedicineRepository;

@RestController

public class MedicineController {
	
	@Autowired
	MedicineRepository medicineRepository;
	
	@GetMapping("/medicine")
	public List<Medicine> getAllData() {
		return medicineRepository.findAll();
	}
	@PostMapping("/medicine")  //requesting to POST
	public void createCourse(@RequestBody Medicine medicine) {  //pick a body of request and maps to Course entity
		medicineRepository.save(medicine);
	}
	@PutMapping("/medicine/{patientId}")  //when you are updating you know what your updating so use {id}
	public void updateCourse(@PathVariable long patientId, @RequestBody Medicine medicine) {  //pick a body of request and maps to Course entity
		medicineRepository.save(medicine);
	}
	@DeleteMapping("/medicine/{patientId}")  //when you are updating you know what your updating so use {id}
	public void deleteCourse(@PathVariable long patientId) {  //pick a body of request and maps to Course entity
		medicineRepository.deleteById(patientId);
	}
	
}
