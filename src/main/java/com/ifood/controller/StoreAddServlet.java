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

import com.ifood.dao.StoreDAO;
import com.ifood.entity.Address;
import com.ifood.entity.Contact;
import com.ifood.entity.Responsible;
import com.ifood.entity.Store;
import com.ifood.factory.DAOFactory;

/**
 * Servlet implementation class StoreServlet
 */
@WebServlet(name = "registerStore", urlPatterns = { "/registerstore" })
public class StoreAddServlet extends HttpServlet {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/register-store.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("POST - Register Store");

        HttpSession session = request.getSession();
        Contact contact = null;
        Address address = null;
        Responsible responsible = null;

        // specialty
        // plan
        if (session != null) {
            contact = (Contact) session.getAttribute("contact");
            address = (Address) session.getAttribute("address");
            responsible = (Responsible) session.getAttribute("responsible");
        }
        if (contact != null && address != null && responsible != null) {
            System.out.println("CONTACCCCCCCCCCCCCCCCCT" + contact);
            System.out.println("CONTACCCCCCCCCCCCCCCCCT" + address);
            System.out.println("CONTACCCCCCCCCCCCCCCCCT" + responsible);

        }

        // Store store = new Store();
        // store.setName(request.getParameter("storeName"));
        // store.setEmail(request.getParameter("storeEmail"));
        // store.setPhone(Long.parseLong(request.getParameter("storePhone")));

        // StoreDAO storeDAO =
        // (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getStoreDAO());

        // if (storeDAO.register(store)) {
        // request.setAttribute("store", store);

        // session.setAttribute("store", store);
        // } else {
        // request.setAttribute("error", "Informação invalida");
        // }
        response.sendRedirect("admin.jsp");
    }

}