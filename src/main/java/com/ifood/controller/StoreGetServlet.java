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

import com.ifood.dao.StoreDAO;
import com.ifood.entity.Store;
import com.ifood.factory.DAOFactory;

/**
 * Servlet implementation class StoreServlet
 */
@WebServlet(name = "getStore", urlPatterns = { "/getstore" })
public class StoreGetServlet extends HttpServlet {
    Logger logger = java.util.logging.Logger.getLogger(this.getClass().getName());
    StoreDAO storeDAO = (DAOFactory.getDAOFactory(DAOFactory.POSTGRES).getStoreDAO());

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        logger.info("Get Stores");
        List<Store> storeList = storeDAO.getAll();
        request.setAttribute("stores", storeList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // response.sendRedirect("liststores");
    }

}