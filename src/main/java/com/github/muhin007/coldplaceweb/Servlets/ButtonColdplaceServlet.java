package com.github.muhin007.coldplaceweb.Servlets;


import com.github.muhin007.coldplaceweb.Data.Cities;
import com.github.muhin007.coldplaceweb.Data.LowTempList;
import com.github.muhin007.coldplaceweb.PageGenerator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;


public class ButtonColdplaceServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.getWriter().println(PageGenerator.instance().getPage("ButtonPage.html", new HashMap<>()));
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.getWriter().println(LowTempList);//TODO
        response.setContentType("text/html;charset=utf-8");
    }

}


