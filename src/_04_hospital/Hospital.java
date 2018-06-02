package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	void addPatient(Patient p) {
		patients.add(p);
	}
	
	ArrayList<Patient> getPatients() {
		return patients;
	}

}
