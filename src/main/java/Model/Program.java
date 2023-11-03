package Model;

public class Program {

	String program_id;
	String program_name;
	String enrollment_date;
	

	public Program(String programId, String program_name, String enrollment_date) {
		super();
		this.program_id = programId;
		this.program_name = program_name;
		this.enrollment_date = enrollment_date;
	}


	public String getEnrollment_date() {
		return enrollment_date;
	}


	public void setEnrollment_date(String enrollment_date) {
		this.enrollment_date = enrollment_date;
	}


	public void setProgram_id(String program_id) {
		this.program_id = program_id;
	}


	public Program(String programName) {
		// TODO Auto-generated constructor stub
		super();
		this.program_name = program_name;
	}

	public String getProgram_id() {
		return program_id;
	}


	public String getProgram_name() {
		return program_name;
	}

	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	
}
