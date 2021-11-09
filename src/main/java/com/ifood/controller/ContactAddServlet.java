package com.ifood.controller;

import java.io.IOException;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ifood.dao.ContactDAO;
import com.ifood.dao.ContactDAOImplOracle;
import com.ifood.entity.Contact;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet(name = "registerContact", urlPatterns = { "/registercontact" })
public class ContactAddServlet extends HttpServlet {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/register-contact.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("POST - Register Contact");
        Contact contact = new Contact();
        contact.setName(request.getParameter("name"));
        contact.setEmail(request.getParameter("email"));
        contact.setPhone(Long.parseLong(request.getParameter("phone")));

        ContactDAO dao = new ContactDAOImplOracle();
        if (dao.register(contact)) {
            request.setAttribute("contact", contact);
            HttpSession session = request.getSession();
            session.setAttribute("contact", contact);
        } else {
            request.setAttribute("error", "Informação invalida");
        }

        // response.sendRedirect("listcontacts");
    }

}