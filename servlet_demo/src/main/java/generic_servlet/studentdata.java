/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generic_servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author frikky
 */
@WebServlet("/sut")

public class studentdata extends GenericServlet {
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
       String name=req.getParameter("name");
       int age=Integer.parseInt(req.getParameter("age"));
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String stream=req.getParameter("stream");
		long phone=Long.parseLong(req.getParameter("phone"));
		String[] skills=req.getParameterValues("skill");
		
		
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		pw.println("<h1>Name:"+name);
		pw.println("<h1>Age:"+age);
		pw.println("<h1>DOB:"+dob);
		pw.println("<h1>Gender:"+gender);
		pw.println("<h1>PhoneNO:"+phone);
		pw.println("<h1>Stream:"+stream);
		pw.println("<h1>Skills:");
		for(String s:skills) {
			
			pw.println(s);
		}
	pw.println("</body></html>");
    }
    
}
