package Model;

public class Model {
	private String u_name, password, mail, first_name, last_name, role, qualification, specialization, phone;

	public Model(String u_name, String password, String mail, String first_name, String last_name, String role,
			String qualification, String specialization, String phone) {
		super();
		this.u_name = u_name;
		this.password = password;
		this.mail = mail;
		this.first_name = first_name;
		this.last_name = last_name;
		this.role = role;
		this.qualification = qualification;
		this.specialization = specialization;
		this.phone = phone;
	}

	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
