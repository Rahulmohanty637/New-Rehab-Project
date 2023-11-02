package Dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Program;

public class ProgramService {
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
	public List<Program> getProgramsForPatient() {
        List<Program> programs = new ArrayList<>();
        loadDriver();
		Connection con = getConnection();
		System.out.println("I am in dao");

        try {
        	String SELECT_ENROLLED_PROGRAMS = "select * from Programs";
            PreparedStatement preparedStatement = con.prepareStatement(SELECT_ENROLLED_PROGRAMS);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int programId = resultSet.getInt("program_id");
                String programName = resultSet.getString("program_name");

                Program program = new Program(programId, programName);
                programs.add(program);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the exception appropriately, e.g., logging or showing an error message
        }

        return programs;
    }
}
