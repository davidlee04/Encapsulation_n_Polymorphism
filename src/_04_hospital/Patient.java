package _04_hospital;

public class Patient {
	boolean pulseChecked = false;
	
	public boolean feelsCaredFor() {
		if(pulseChecked == true) {
			return true;
		} else {
			return false;
		}
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		pulseChecked = true;
	}

}
