package com.medicine.miniProject.medicineData.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.medicine.miniProject.medicineData.medicine.*;

public interface MedicineRepository extends JpaRepository<Medicine, Long>{

}
