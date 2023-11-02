package Model;

public class Program {

	int program_id;
	String program_name;

	public Program(int programId, String program_name) {
		super();
		this.program_id = programId;
		this.program_name = program_name;
	}


	public Program(String programName) {
		// TODO Auto-generated constructor stub
		super();
		this.program_name = program_name;
	}


	public int getProgram_id() {
		return program_id;
	}

	public void setProgram_id(int program_id) {
		this.program_id = program_id;
	}

	public String getProgram_name() {
		return program_name;
	}

	public void setProgram_name(String program_name) {
		this.program_name = program_name;
	}
	
}
