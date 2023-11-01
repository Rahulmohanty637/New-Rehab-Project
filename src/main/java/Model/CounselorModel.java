package Model;

public class CounselorModel {
	    private String name;
	    private String email;
	    private String qualifications;
	    private String specializations;
	    
		public CounselorModel(String name, String email, String qualifications, String specializations) {
			super();
			this.name = name;
			this.email = email;
			this.qualifications = qualifications;
			this.specializations = specializations;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getQualifications() {
			return qualifications;
		}
		public void setQualifications(String qualifications) {
			this.qualifications = qualifications;
		}
		public String getSpecializations() {
			return specializations;
		}
		public void setSpecializations(String specializations) {
			this.specializations = specializations;
		}
 
	    
}
