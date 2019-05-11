/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bus;
import model.BusDao;
import model.BusInfo;
import model.BusInfoDao;
import model.Buses;
import model.BusesDao;
import model.CommonDao;
import model.Routes;
import model.RoutesDao;

/**
 *
 * @author KARTIK
 */
public class ServletLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //Bus b= new Bus();
            String bid = request.getParameter("b");
            String dname = request.getParameter("dn");
            String dnum= request.getParameter("dno");
            String routes = request.getParameter("r");
            String pickup = request.getParameter("p");
            
            BusInfo obj1 = new BusInfo();
            obj1.setBusId(bid);
            obj1.setDriverName(dname);
            obj1.setRoutes(routes);
            
            Buses obj3 = new Buses();
            obj3.setBusId(bid);
            obj3.setDriverName(dname);
            obj3.setDriverNumber(dnum);
            
            Routes obj2 = new Routes();
            obj2.setBusId(bid);
            obj2.setPickuppoint(pickup);
            obj2.setRoutes(routes);
            
            boolean result = new CommonDao().Add(obj1,obj2,obj3); 
            System.out.println(result);
            
            if (result) {
                response.sendRedirect("admin.html");
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
