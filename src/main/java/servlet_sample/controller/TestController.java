package servlet_sample.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import servlet_sample.service.TestService;

@WebServlet( "/" )
public class TestController extends HttpServlet {
  
  protected void doGet( 
    HttpServletRequest request,
    HttpServletResponse response )
      throws ServletException, IOException {
    
    TestService service = new TestService();
    service.writeData();
    return;

    
  }

}
