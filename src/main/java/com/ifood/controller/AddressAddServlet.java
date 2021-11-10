package com.ifood.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ifood.dao.AddressDAO;
import com.ifood.entity.Address;
import com.ifood.factory.DAOFactory;

/**
 * Servlet implementation class AddressServlet
 */
@WebServlet(name = "registerAddress", urlPatterns = { "/registeraddress" })
public class AddressAddServlet extends HttpServlet {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/register-address.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("POST - Register Address");
        Address address = new Address();
        address.setPostalCode(Integer.parseInt(request.getParameter("zip")));
        address.setState(request.getParameter("state"));
        address.setCity(request.getParameter("city"));
        address.setDistrict(request.getParameter("district"));
        address.setAddress(request.getParameter("address"));
        address.setNumber(Integer.parseInt(request.getParameter("number")));
        address.setAdjunct(request.getParameter("adjunct"));
        logger.info(address.toString());
        AddressDAO addressDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getAddressDAO());
        if (addressDAO.register(address)) {
            HttpSession session = request.getSession();
            session.setAttribute("address", address);
        } else {
            request.setAttribute("error", "Informação invalida");
        }

        response.sendRedirect("register-responsible.jsp");
    }

}