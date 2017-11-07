package java112.project3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * This servlet is used to demonstrate MVC.
 *
 * @author jadams
 */
@WebServlet(
    name = "PowerballServlet",
    urlPatterns = { "/PowerballServlet" }
)

public class PowerballServlet extends HttpServlet {

    private List<PowerballBean> powerballBeanList = new ArrayList<>();

    /**
     * Init.
     *
     * @throws ServletException the servlet exception
     */
    public void init() throws ServletException {

    }
/*
    @java.lang.Override
    public java.lang.String toString() {
        return "powerballBeanList=" + powerballBeanList;
    }
*/
    /**
     * Handles HTTP GET requests.
     *
     * @param request  the HttpServletRequest object
     * @param response the HttpServletResponse object
     * @throws ServletException if there is a Servlet failure
     * @throws IOException      if there is an IO failure
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        //Create a new Powerball object using the Request parameters
        Powerball myPowerball = new Powerball(Integer.parseInt(request.getParameter("yourLuckyNumber")),
                Integer.parseInt(request.getParameter("yourUnluckyNumber")));

        //Create a new Powerball Bean using the Request parameters
        PowerballBean myPowerballBean = new PowerballBean(Integer.parseInt(request.getParameter("yourLuckyNumber")),
                Integer.parseInt(request.getParameter("yourUnluckyNumber")));

        //Set Winning Numbers in the bean using the getWinningNumbers method
        myPowerballBean.setWinningNumbers(myPowerball.getWinningNumbers());

        //Set Powerball Number in the bean using the getPowerballNumber method
        myPowerballBean.setPowerballNumber(myPowerball.getPowerballNumber());

        //Set Found Lucky Number in the bean using the getIsFoundLuckyNumber method
        myPowerballBean.setFoundLuckyNumber(myPowerball.isFoundLuckyNumber());

        //Set Found UnLucky Number in the bean using the getIsFoundUnLuckyNumber method
        myPowerballBean.setFoundUnluckyNumber(myPowerball.isFoundUnluckyNumber());
        /*
        //Remove print lines after testing.
        PrintWriter out = response.getWriter();
        out.print("<HTML>");
        out.print("<BODY>");

        //Display the current winning numbers. Remove this after testing.
        out.print("<p>Get Winning numbers from the Bean: " + myPowerballBean.getWinningNumbers() +
                " Powerball Number: " + myPowerballBean.getPowerballNumber() +
                " Lucky Number: " + myPowerballBean.getLuckyNumber() + " Unlucky Number: " +
                myPowerballBean.getUnluckyNumber() + " Contains Lucky Number: " +
                myPowerballBean.isFoundLuckyNumber() + " Contains Unlucky Number: " +
                myPowerballBean.isFoundUnluckyNumber() + "</p>");


        //Display the past winning numbers. Remove this after testing.
        for (PowerballBean myElement : powerballBeanList) {

            out.print("<p>Past Winning Regular Numbers from Servlet ArrayList: " + myElement.getWinningNumbers() +
                    " Past Powerball Number: " + myElement.getPowerballNumber() + " Past Lucky Number: " +
                    myElement.getLuckyNumber() + " Past UnLucky Number: " + myElement.getUnluckyNumber() + "</p>");

        }
        */
        //Add Powerball Bean to the Instance ArrayList
        powerballBeanList.add(0, myPowerballBean);
        /*
        //Remove this after testing.
        out.print("</BODY>");
        out.print("</HTML>");
        out.close();*/

         //Add Powerball Bean to the Request
         request.setAttribute("myPowerballBean", myPowerballBean);

         //Add Powerball Bean ArrayList to the Request
        request.setAttribute("myPowerballBeanList", powerballBeanList);

         //Forward to the Powerball page
         String url = "/showNumbers.jsp";

         RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
         dispatcher.forward(request, response);

    }
}


