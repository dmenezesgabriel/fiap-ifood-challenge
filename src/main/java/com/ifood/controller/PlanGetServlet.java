package com.ifood.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ifood.dao.PlanDAO;
import com.ifood.factory.DAOFactory;

/**
 * Servlet implementation class PlanServlet
 */
@WebServlet(name = "getPlan", urlPatterns = { "/getplan" })
public class PlanGetServlet extends HttpServlet {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PlanDAO planDAO = (DAOFactory.getDAOFactory(DAOFactory.ORACLE).getPlanDAO());
        logger.info("" + planDAO.getAll());
        // request.setAttribute("plans", planList);
        // request.getRequestDispatcher("/choose-plan.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // response.sendRedirect("listplans");
    }

}