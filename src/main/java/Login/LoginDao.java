package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class LoginDao {
	private String url = "jdbc:mysql://localhost:3306/rehab";
	private String userName = "root";
	private String password = "JSR#3306monty";
	Connection con = null;
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	public void loadDriver() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public boolean isValidUser(String username2, String password2, String role2) {
		// TODO Auto-generated method stub
		try {
			loadDriver();
			Connection con = getConnection();
			String sqlQuery = "SELECT role FROM Users WHERE username = ? AND password = ?";
			preparedStatement = con.prepareStatement(sqlQuery);

			// Set the parameters (username and password)
			preparedStatement.setString(1, username2);
			preparedStatement.setString(2, password2);

			// Execute the query
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				// Retrieve and print the role
				String role = resultSet.getString("role");
				System.out.println("Role: " + role);
				if (role.length() == role2.length()) {
					return true;
				}
			} else {
				System.out.println("User not found or invalid credentials.");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// Close database resources
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
