package com.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.*;
import com.utility.HiberanteUtlity;

@WebServlet("/flight-details")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public FlightDetails() {
        super();
        
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		int travellers=Integer.parseInt(request.getParameter("travellers"));
		String date=request.getParameter("date");
		Flights flight=new Flights(source,destination,travellers,date);
		Session session=HiberanteUtlity.getSession();
		Transaction tx=session.beginTransaction();
		session.save(flight);
		tx.commit();
		response.sendRedirect("available-flight.jsp");
	}

}
