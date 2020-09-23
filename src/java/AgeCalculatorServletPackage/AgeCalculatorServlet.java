
package AgeCalculatorServletPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");
        if(age.equals("")){
            String message = "You must give your current age";
            request.setAttribute("message", message);
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }else if(!isNumber(age) ){
            String message = "invalid input";
             request.setAttribute("message", message);
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }else {
            int  userRealNumber = Integer.parseInt(age) + 1;
            
            String message = "Your next birthday will be " + userRealNumber;
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    }
    
    public static boolean isNumber(String s) 
    { 
        for (int i = 0; i < s.length(); i++) 
        if (Character.isDigit(s.charAt(i))  
            == false) 
            return false; 
  
        return true; 
    } 


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
