package Model;

public class PatientModel {
	    private String name;
	    private String email;
	    private String medicalHistory;
	    
	    
	    // Getters and setters for the attributes
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }


		public PatientModel(String name, String email, String medicalHistory) {
			super();
			this.name = name;
			this.email = email;
			this.medicalHistory = medicalHistory;
			System.out.print(this.name);
			System.out.print(this.email);
		}

		public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getMedicalHistory() {
	        return medicalHistory;
	    }

	    public void setMedicalHistory(String medicalHistory) {
	        this.medicalHistory = medicalHistory;
	    }

	}


