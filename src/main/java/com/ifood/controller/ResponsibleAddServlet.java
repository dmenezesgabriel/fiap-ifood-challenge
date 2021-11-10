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

import com.ifood.dao.ResponsibleDAO;
import com.ifood.entity.Responsible;
import com.ifood.factory.DAOFactory;

/**
 * Servlet implementation class ResponsibleServlet
 */
@WebServlet(name = "registerResponsible", urlPatterns = { "/registerresponsible" })
public class ResponsibleAddServlet extends HttpServlet {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/register-responsible.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("POST - Register Responsible");
        Responsible responsible = new Responsible();
        responsible.setName(request.getParameter("name"));
        responsible.setCpf(Long.parseLong(request.getParameter("cpf")));
        responsible.setRg(Long.parseLong(request.getParameter("rg")));
        logger.info(responsible.toString());
        ResponsibleDAO responsibleDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getResponsibleDAO());
        if (responsibleDAO.register(responsible)) {
            request.setAttribute("responsible", responsible);
            HttpSession session = request.getSession();
            session.setAttribute("responsible", responsible);
        } else {
            request.setAttribute("error", "Informação invalida");
        }

        // response.sendRedirect("listresponsibles");
    }

}