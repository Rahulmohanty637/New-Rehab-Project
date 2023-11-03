package ProgramEnrollment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import Model.Program;

/**
 * Servlet implementation class EnrollInProgramServlet
 */
public class EnrollInProgramServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollInProgramServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		HttpSession session = request.getSession();
		String programId = request.getParameter("programId");
		String patientId = request.getParameter("patientId");
		
		Date enrollmentDate = new Date(System.currentTimeMillis());
		
		ProgramEnrollmentService enrollmentService = new ProgramEnrollmentService();
        boolean success = enrollmentService.enrollPatientInProgram(patientId, programId, enrollmentDate);
        
        List<Program> enrolledPrograms = enrollmentService.getEnrolledProgramForPatient(programId);
        request.setAttribute("enrolledPrograms", enrolledPrograms);
		request.getRequestDispatcher("EnrolledProgramList.jsp").forward(request, response);


	}

}
