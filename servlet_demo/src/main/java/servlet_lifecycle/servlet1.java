/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet_lifecycle;

import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author frikky
 */
@WebServlet("/serv2")
public class servlet1 extends HttpServlet{
    static {
		System.out.println("this is static block of servlet1");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("this is init() method of servlet1");
	}
	
	public servlet1() {
		System.out.println("this is constructor of servlet1");
	}
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("this is doGet() method of servlet1");
	}
}
