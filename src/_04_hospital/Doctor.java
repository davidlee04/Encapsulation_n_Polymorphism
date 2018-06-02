package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Exception{
	ArrayList<Patient> assignedPatients = new ArrayList<Patient>();

	public boolean performsSurgery() {
		if(this instanceof Surgeon) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean makesHouseCalls() {
		if(this instanceof GeneralPractitioner) {
			return true;
		} else {
			return false;
		}
	}
	
	public void assignPatient(Patient p) throws DoctorFullException{
		if(assignedPatients.size() == 3) {
			throw new DoctorFullException();
		}
		assignedPatients.add(p);
	}
	
	public ArrayList<Patient> getPatients() {
		return assignedPatients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for (Patient patient : assignedPatients) {
			patient.checkPulse();
		}
	}
	
	

}
