
package arithmeticcalculatorPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String message = "-----";
            request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String cal = request.getParameter("button");
        if(first.equals("")||second.equals("")){
            String message = "input both number";
            request.setAttribute("message", message);
            request.setAttribute("first", first);
            request.setAttribute("second", second);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }else if(isNumber(first)&isNumber(second)){
            int firstinput = Integer.parseInt(first);
            int secondinput = Integer.parseInt(second);
            if(cal.equals("+")){
                int total = firstinput + secondinput;
                String message = " " + total;
                request.setAttribute("message", message);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }else if(cal.equals("-")){
                int total = firstinput - secondinput;
                String message = " " + total;
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }else if(cal.equals("*")){
                int total = firstinput * secondinput;
                String message = " " + total;
                request.setAttribute("message", message);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }else if(cal.equals("%")){
                int total = firstinput % secondinput;
                String message = " " + total;
                request.setAttribute("message", message);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            }
            
        }else {
            String message = "invalid input";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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


}
