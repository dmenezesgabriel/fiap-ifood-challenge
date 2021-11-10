package com.ifood.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ifood.dao.PlanDAO;
import com.ifood.entity.Plan;
import com.ifood.factory.DAOFactory;

/**
 * Servlet implementation class PlanServlet
 */
@WebServlet(name = "getPlan", urlPatterns = { "/getplan" })
public class PlanGetServlet extends HttpServlet {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());
    PlanDAO planDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getPlanDAO());

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("Get Plans");
        List<Plan> planList = planDAO.getAll();
        request.setAttribute("plans", planList);
        HttpSession session = request.getSession();
        session.setAttribute("defaultPlan", planList.get(0));
        RequestDispatcher dispatcher = request.getRequestDispatcher("choose-plan.jsp");
        dispatcher.forward(request, response);
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