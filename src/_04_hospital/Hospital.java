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

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for (int i = 0; i < doctors.size(); i++) {
			for (int j = i*3; j < patients.size(); j++) {
				try {
					doctors.get(i).assignPatient(patients.get(j));
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
