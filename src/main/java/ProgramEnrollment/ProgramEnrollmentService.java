package ProgramEnrollment;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Program;

public class ProgramEnrollmentService {

	private String url = "jdbc:mysql://localhost:3306/rehab";
	private String userName = "root";
	private String password = "JSR#3306monty";

	public void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public boolean enrollPatientInProgram(String patientId, String programId, Date enrollmentDate) {
		loadDriver();
		Connection con = getConnection();

		try {
			String sql = "INSERT INTO Program_Enrollment (patient_id, program_id, enrollment_date) VALUES (?, ?, ?)";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, patientId);
			statement.setString(2, programId);
			statement.setDate(3, enrollmentDate);

			int rowsInserted = statement.executeUpdate();

			return rowsInserted > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Program> getEnrolledProgramForPatient(String programId2) {
		// TODO Auto-generated method stub
		 List<Program> enrolledPrograms = new ArrayList<>();
	        loadDriver();
			Connection con = getConnection();

	        try {
	        	String SELECT_ENROLLED_PROGRAMS = "select program_name from program_enrollment WHERE program_id = ?";
	            PreparedStatement preparedStatement = con.prepareStatement(SELECT_ENROLLED_PROGRAMS);
	            preparedStatement.setString(1, programId2);
	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {
	                String programName = resultSet.getString("program_name");

	                String SELECT_date = "select enrollment_date from Programs WHERE program_id = ?";
		            PreparedStatement preparedStatement1 = con.prepareStatement(SELECT_date);
		            preparedStatement1.setString(1, programId2);
		            ResultSet resultSet1 = preparedStatement.executeQuery();
		            String date = null;
		            if(resultSet1.next()) {
		            	date = resultSet1.getString("enrollment_date");
		            }
	                
	                
	                Program program = new Program(programId2, programName, date);
	                enrolledPrograms.add(program);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            // Handle the exception appropriately, e.g., logging or showing an error message
	        }

	        return enrolledPrograms;
	}
}
