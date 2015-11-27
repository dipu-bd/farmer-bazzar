/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class ReceiveReqServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. 
             out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head>");
             out.println("<title>Servlet ReceiveReqServlet</title>");            
             out.println("</head>");
             out.println("<body>");
             out.println("<h1>Servlet ReceiveReqServlet at " + request.getContextPath() + "</h1>");
             out.println("</body>");
             out.println("</html>");*/
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
        String[] vegamount2 = request.getParameterValues("vegamount");
        String[] groceryamount2 = request.getParameterValues("groceryamount");
        String[] liquidsamount2 = request.getParameterValues("liquidsamount");
        String[] chockolatesamount2 = request.getParameterValues("chockolatesamount");
        String[] eggsamount2 = request.getParameterValues("eggsamount");
        String[] meatsamount2 = request.getParameterValues("meatsamount");
        String[] fishesamount2 = request.getParameterValues("fishesamount");
        String[] colddrinksamount2 = request.getParameterValues("colddrinksamount");
        String[] cosmeticsamount2 = request.getParameterValues("cosmeticsamount");
        String[] othersamount2 = request.getParameterValues("othersamount");

        String[] vegamount = new String[100];
        String[] groceryamount = new String[100];
        String[] liquidsamount = new String[100];
        String[] chockolatesamount = new String[100];
        String[] eggsamount = new String[100];
        String[] meatsamount = new String[100];
        String[] fishesamount = new String[100];
        String[] colddrinksamount = new String[100];
        String[] cosmeticsamount = new String[100];
        String[] othersamount = new String[100];

        int k = 0, k2 = 0, k3 = 0, k4 = 0, k5 = 0, k6 = 0, k7 = 0, k8 = 0, k9 = 0, k10 = 0;

        for (int i = 0; i < vegamount2.length; ++i) {
            if (vegamount2[i].equals("0") || vegamount2[i].equals("")) {
                continue;
            } else {
                vegamount[k++] = vegamount2[i];
            }
        }
        for (int i = 0; i < groceryamount2.length; ++i) {
            if (groceryamount2[i].equals("0") || groceryamount2[i].equals("")) {
                continue;
            } else {
                groceryamount[k2++] = groceryamount2[i];
            }
        }
        for (int i = 0; i < liquidsamount2.length; ++i) {
            if (liquidsamount2[i].equals("0") || liquidsamount2[i].equals("")) {
                continue;
            } else {
                liquidsamount[k3++] = liquidsamount2[i];
            }
        }
        for (int i = 0; i < chockolatesamount2.length; ++i) {
            if (chockolatesamount2[i].equals("0") || chockolatesamount2[i].equals("")) {
                continue;
            } else {
                chockolatesamount[k4++] = chockolatesamount2[i];
            }
        }
        for (int i = 0; i < eggsamount2.length; ++i) {
            if (eggsamount2[i].equals("0") || eggsamount2[i].equals("")) {
                continue;
            } else {
                eggsamount[k5++] = eggsamount2[i];
            }
        }
        for (int i = 0; i < meatsamount2.length; ++i) {
            if (meatsamount2[i].equals("0") || meatsamount2[i].equals("")) {
                continue;
            } else {
                meatsamount[k6++] = meatsamount2[i];
            }
        }
        for (int i = 0; i < fishesamount2.length; ++i) {
            if (fishesamount2[i].equals("0") || fishesamount2[i].equals("")) {
                continue;
            } else {
                fishesamount[k7++] = fishesamount2[i];
            }
        }
        for (int i = 0; i < colddrinksamount2.length; ++i) {
            if (colddrinksamount2[i].equals("0") || colddrinksamount2[i].equals("")) {
                continue;
            } else {
                colddrinksamount[k8++] = colddrinksamount2[i];
            }
        }
        for (int i = 0; i < cosmeticsamount2.length; ++i) {
            if (cosmeticsamount2[i].equals("0") || cosmeticsamount2[i].equals("")) {
                continue;
            } else {
                cosmeticsamount[k9++] = cosmeticsamount2[i];
            }
        }
        for (int i = 0; i < othersamount2.length; ++i) {
            if (othersamount2[i].equals("0") || othersamount2[i].equals("")) {
                continue;
            } else {
                othersamount[k10++] = othersamount2[i];
            }
        }

        String[] vegitems = null;
        String[] allvegitems = new String[1000];
        vegitems = request.getParameterValues("vegitems");

        String[] groceryitems = null;
        String[] allgroceryitems = new String[1000];
        groceryitems = request.getParameterValues("groceryitems");

        String[] liquidsitems = null;
        String[] allliquidsitems = new String[1000];
        liquidsitems = request.getParameterValues("liquidsitems");

        String[] chockolatesitems = null;
        String[] allchockolatesitems = new String[1000];
        chockolatesitems = request.getParameterValues("chockolatesitems");

        String[] eggsitems = null;
        String[] alleggsitems = new String[1000];
        eggsitems = request.getParameterValues("eggsitems");

        String[] meatsitems = null;
        String[] allmeatsitems = new String[1000];
        meatsitems = request.getParameterValues("meatsitems");

        String[] fishesitems = null;
        String[] allfishesitems = new String[1000];
        fishesitems = request.getParameterValues("fishesitems");

        String[] colddrinksitems = null;
        String[] allcolddrinksitems = new String[1000];
        colddrinksitems = request.getParameterValues("colddrinksitems");

        String[] cosmeticsitems = null;
        String[] allcosmeticsitems = new String[1000];
        cosmeticsitems = request.getParameterValues("cosmeticsitems");

        String[] othersitems = null;
        String[] allothersitems = new String[1000];
        othersitems = request.getParameterValues("othersitems");

        if (vegitems == null && groceryitems == null && liquidsitems == null && chockolatesitems == null && eggsitems == null
                && meatsitems == null && fishesitems == null && colddrinksitems == null
                && cosmeticsitems == null && othersitems == null) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }

        if (vegitems == null && k > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (groceryitems == null && k2 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (liquidsitems == null && k3 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (chockolatesitems == null && k4 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (eggsitems == null && k5 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (meatsitems == null && k6 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (fishesitems == null && k7 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (colddrinksitems == null && k8 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (cosmeticsitems == null && k9 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (othersitems == null && k10 > 0) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }

        if (vegitems != null && k != vegitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (groceryitems != null && k2 != groceryitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (liquidsitems != null && k3 != liquidsitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (chockolatesitems != null && k4 != chockolatesitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (eggsitems != null && k5 != eggsitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (meatsitems != null && k6 != meatsitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (fishesitems != null && k7 != fishesitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (colddrinksitems != null && k8 != colddrinksitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (cosmeticsitems != null && k9 != cosmeticsitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }
        if (othersitems != null && k10 != othersitems.length) {
            response.sendRedirect("ReqFailed.jsp");
            return;
        }

        DatabaseConnector dc = new DatabaseConnector();
        dc.setConnectionWithOracle();
        allvegitems = dc.getItems("vegetablelist");
        if (vegitems != null) {
            for (int i = 0; i < allvegitems.length; ++i) {
                String theItem = allvegitems[i];
                for (int l = 0; l < vegitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(vegitems[l])) {
                        if (vegamount2[i].equals("0") || vegamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allgroceryitems = dc.getItems("grocerylist");
        if (groceryitems != null) {
            for (int i = 0; i < allgroceryitems.length; ++i) {
                String theItem = allgroceryitems[i];
                for (int l = 0; l < groceryitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(groceryitems[l])) {
                        if (groceryamount2[i].equals("0") || groceryamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allliquidsitems = dc.getItems("liquidslist");
        if (liquidsitems != null) {
            for (int i = 0; i < allliquidsitems.length; ++i) {
                String theItem = allliquidsitems[i];
                for (int l = 0; l < liquidsitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(liquidsitems[l])) {
                        if (liquidsamount2[i].equals("0") || liquidsamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allchockolatesitems = dc.getItems("chockolateslist");
        if (chockolatesitems != null) {
            for (int i = 0; i < allchockolatesitems.length; ++i) {
                String theItem = allchockolatesitems[i];
                for (int l = 0; l < chockolatesitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(chockolatesitems[l])) {
                        if (chockolatesamount2[i].equals("0") || chockolatesamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        alleggsitems = dc.getItems("eggslist");
        if (eggsitems != null) {
            for (int i = 0; i < alleggsitems.length; ++i) {
                String theItem = alleggsitems[i];
                for (int l = 0; l < eggsitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(eggsitems[l])) {
                        if (eggsamount2[i].equals("0") || eggsamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allmeatsitems = dc.getItems("meatslist");
        if (meatsitems != null) {
            for (int i = 0; i < allmeatsitems.length; ++i) {
                String theItem = allmeatsitems[i];
                for (int l = 0; l < meatsitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(meatsitems[l])) {
                        if (meatsamount2[i].equals("0") || meatsamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allfishesitems = dc.getItems("fisheslist");
        if (fishesitems != null) {
            for (int i = 0; i < allfishesitems.length; ++i) {
                String theItem = allfishesitems[i];
                for (int l = 0; l < fishesitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(fishesitems[l])) {
                        if (fishesamount2[i].equals("0") || fishesamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allcolddrinksitems = dc.getItems("colddrinkslist");
        if (colddrinksitems != null) {
            for (int i = 0; i < allcolddrinksitems.length; ++i) {
                String theItem = allcolddrinksitems[i];
                for (int l = 0; l < colddrinksitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(colddrinksitems[l])) {
                        if (colddrinksamount2[i].equals("0") || colddrinksamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allcosmeticsitems = dc.getItems("cosmeticslist");
        if (cosmeticsitems != null) {
            for (int i = 0; i < allcosmeticsitems.length; ++i) {
                String theItem = allcosmeticsitems[i];
                for (int l = 0; l < cosmeticsitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(cosmeticsitems[l])) {
                        if (cosmeticsamount2[i].equals("0") || cosmeticsamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        allothersitems = dc.getItems("otherslist");
        if (othersitems != null) {
            for (int i = 0; i < allothersitems.length; ++i) {
                String theItem = allothersitems[i];
                for (int l = 0; l < othersitems.length; ++l) {
                    if (theItem == null) {
                        break;
                    }
                    if (theItem.equals(othersitems[l])) {
                        if (othersamount2[i].equals("0") || othersamount2[i].equals("")) {
                            response.sendRedirect("ReqFailed.jsp");
                            return;
                        }
                    }
                }
            }
        }

        double[] realPricesOfVegItems = new double[100];
        double[] realPricesOfGroceryItems = new double[100];
        double[] realPricesOfLiquidsItems = new double[100];
        double[] realPricesOfChockolatesItems = new double[100];
        double[] realPricesOfEggsItems = new double[100];
        double[] realPricesOfMeatsItems = new double[100];
        double[] realPricesOfFishesItems = new double[100];
        double[] realPricesOfColddrinksItems = new double[100];
        double[] realPricesOfCosmeticsItems = new double[100];
        double[] realPricesOfOthersItems = new double[100];

        if (vegitems != null) {
            for (int i = 0; i < vegitems.length; ++i) {
                realPricesOfVegItems[i] = Double.parseDouble(dc.getPrices("vegetablelist", vegitems[i]));
            }
        }
        if (groceryitems != null) {
            for (int i = 0; i < groceryitems.length; ++i) {
                realPricesOfGroceryItems[i] = Double.parseDouble(dc.getPrices("grocerylist", groceryitems[i]));
            }
        }
        if (liquidsitems != null) {
            for (int i = 0; i < liquidsitems.length; ++i) {
                realPricesOfLiquidsItems[i] = Double.parseDouble(dc.getPrices("liquidslist", liquidsitems[i]));
            }
        }
        if (chockolatesitems != null) {
            for (int i = 0; i < chockolatesitems.length; ++i) {
                realPricesOfChockolatesItems[i] = Double.parseDouble(dc.getPrices("chockolateslist", chockolatesitems[i]));
            }
        }
        if (eggsitems != null) {
            for (int i = 0; i < eggsitems.length; ++i) {
                realPricesOfEggsItems[i] = Double.parseDouble(dc.getPrices("eggslist", eggsitems[i]));
            }
        }
        if (meatsitems != null) {
            for (int i = 0; i < meatsitems.length; ++i) {
                realPricesOfMeatsItems[i] = Double.parseDouble(dc.getPrices("meatslist", meatsitems[i]));
            }
        }
        if (fishesitems != null) {
            for (int i = 0; i < fishesitems.length; ++i) {
                realPricesOfFishesItems[i] = Double.parseDouble(dc.getPrices("fisheslist", fishesitems[i]));
            }
        }
        if (colddrinksitems != null) {
            for (int i = 0; i < colddrinksitems.length; ++i) {
                realPricesOfColddrinksItems[i] = Double.parseDouble(dc.getPrices("colddrinkslist", colddrinksitems[i]));
            }
        }
        if (cosmeticsitems != null) {
            for (int i = 0; i < cosmeticsitems.length; ++i) {
                realPricesOfCosmeticsItems[i] = Double.parseDouble(dc.getPrices("cosmeticslist", cosmeticsitems[i]));
            }
        }
        String chk = null;

        if (othersitems != null) {
            for (int i = 0; i < othersitems.length; ++i) {
                chk = othersitems[i];
                realPricesOfOthersItems[i] = Double.parseDouble(dc.getPrices("otherslist", othersitems[i]));
            }
        }

        double[] costOfEachVegItem = new double[100];
        double[] costOfEachGroceryItem = new double[100];
        double[] costOfEachLiquidsItem = new double[100];
        double[] costOfEachChockolatesItem = new double[100];
        double[] costOfEachEggsItem = new double[100];
        double[] costOfEachMeatsItem = new double[100];
        double[] costOfEachFishesItem = new double[100];
        double[] costOfEachColddrinksItem = new double[100];
        double[] costOfEachCosmeticsItem = new double[100];
        double[] costOfEachOthersItem = new double[100];
        
        double totalAmountPurchased=0.0;
        double totalCostOfPurchasedProducts=0.0;

        int j = 0, j2 = 0, j3 = 0, j4 = 0, j5 = 0, j6 = 0, j7 = 0, j8 = 0, j9 = 0, j10 = 0;

        if (vegitems != null) {
            for (int i = 0; i < vegitems.length; ++i) {
                costOfEachVegItem[i] = realPricesOfVegItems[i] * Double.parseDouble(vegamount[i]);
                totalAmountPurchased+=Double.parseDouble(vegamount[i]);
                totalCostOfPurchasedProducts+=costOfEachVegItem[i];
                ++j;
            }
        }
        if (groceryitems != null) {
            for (int i = 0; i < groceryitems.length; ++i) {
                costOfEachGroceryItem[i] = realPricesOfGroceryItems[i] * Double.parseDouble(groceryamount[i]);
                totalAmountPurchased+=Double.parseDouble(groceryamount[i]);
                totalCostOfPurchasedProducts+=costOfEachGroceryItem[i];
                ++j2;
            }
        }
        if (liquidsitems != null) {
            for (int i = 0; i < liquidsitems.length; ++i) {
                costOfEachLiquidsItem[i] = realPricesOfLiquidsItems[i] * Double.parseDouble(liquidsamount[i]);
                totalAmountPurchased+=Double.parseDouble(liquidsamount[i]);
                totalCostOfPurchasedProducts+=costOfEachLiquidsItem[i];
                ++j3;
            }
        }
        if (chockolatesitems != null) {
            for (int i = 0; i < chockolatesitems.length; ++i) {
                costOfEachChockolatesItem[i] = realPricesOfChockolatesItems[i] * Double.parseDouble(chockolatesamount[i]);
                totalAmountPurchased+=Double.parseDouble(chockolatesamount[i]);
                totalCostOfPurchasedProducts+=costOfEachChockolatesItem[i];
                ++j4;
            }
        }
        if (eggsitems != null) {
            for (int i = 0; i < eggsitems.length; ++i) {
                costOfEachEggsItem[i] = realPricesOfEggsItems[i] * Double.parseDouble(eggsamount[i]);
                totalAmountPurchased+=Double.parseDouble(eggsamount[i]);
                totalCostOfPurchasedProducts+=costOfEachEggsItem[i];
                ++j5;
            }
        }
        if (meatsitems != null) {
            for (int i = 0; i < meatsitems.length; ++i) {
                costOfEachMeatsItem[i] = realPricesOfMeatsItems[i] * Double.parseDouble(meatsamount[i]);
                totalAmountPurchased+=Double.parseDouble(meatsamount[i]);
                totalCostOfPurchasedProducts+=costOfEachMeatsItem[i];
                ++j6;
            }
        }
        if (fishesitems != null) {
            for (int i = 0; i < fishesitems.length; ++i) {
                costOfEachFishesItem[i] = realPricesOfFishesItems[i] * Double.parseDouble(fishesamount[i]);
                totalAmountPurchased+=Double.parseDouble(fishesamount[i]);
                totalCostOfPurchasedProducts+=costOfEachFishesItem[i];
                ++j7;
            }
        }
        if (colddrinksitems != null) {
            for (int i = 0; i < colddrinksitems.length; ++i) {
                costOfEachColddrinksItem[i] = realPricesOfColddrinksItems[i] * Double.parseDouble(colddrinksamount[i]);
                totalAmountPurchased+=Double.parseDouble(colddrinksamount[i]);
                totalCostOfPurchasedProducts+=costOfEachColddrinksItem[i];
                ++j8;
            }
        }
        if (cosmeticsitems != null) {
            for (int i = 0; i < cosmeticsitems.length; ++i) {
                costOfEachCosmeticsItem[i] = realPricesOfCosmeticsItems[i] * Double.parseDouble(cosmeticsamount[i]);
                totalAmountPurchased+=Double.parseDouble(cosmeticsamount[i]);
                totalCostOfPurchasedProducts+=costOfEachCosmeticsItem[i];
                ++j9;
            }
        }
        if (othersitems != null) {
            for (int i = 0; i < othersitems.length; ++i) {
                costOfEachOthersItem[i] = realPricesOfOthersItems[i] * Double.parseDouble(othersamount[i]);
                totalAmountPurchased+=Double.parseDouble(othersamount[i]);
                totalCostOfPurchasedProducts+=costOfEachOthersItem[i];
                ++j10;
            }
        }

        HttpSession session = request.getSession();
        CurrentUser cu2 = (CurrentUser)session.getAttribute("cu");
        
        cu2.totalAmountPurchased = totalAmountPurchased;
        cu2.totalCostOfPurchasedProducts = totalCostOfPurchasedProducts;
        cu2.setVegCount(j);
        cu2.setVegNames(vegitems);
        cu2.setVegAmounts(vegamount);
        cu2.setVegCost(costOfEachVegItem);

        cu2.setGroceryCount(j2);
        cu2.setGroceryNames(groceryitems);
        cu2.setGroceryAmounts(groceryamount);
        cu2.setGroceryCost(costOfEachGroceryItem);

        cu2.setLiquidsCount(j3);
        cu2.setLiquidsNames(liquidsitems);
        cu2.setLiquidsAmounts(liquidsamount);
        cu2.setLiquidsCost(costOfEachLiquidsItem);

        cu2.setChockolatesCount(j4);
        cu2.setChockolatesNames(chockolatesitems);
        cu2.setChockolatesAmounts(chockolatesamount);
        cu2.setChockolatesCost(costOfEachChockolatesItem);

        cu2.setEggsCount(j5);
        cu2.setEggsNames(eggsitems);
        cu2.setEggsAmounts(eggsamount);
        cu2.setEggsCost(costOfEachEggsItem);

        cu2.setMeatsCount(j6);
        cu2.setMeatsNames(meatsitems);
        cu2.setMeatsAmounts(meatsamount);
        cu2.setMeatsCost(costOfEachMeatsItem);

        cu2.setFishesCount(j7);
        cu2.setFishesNames(fishesitems);
        cu2.setFishesAmounts(fishesamount);
        cu2.setFishesCost(costOfEachFishesItem);

        cu2.setColddrinksCount(j8);
        cu2.setColddrinksNames(colddrinksitems);
        cu2.setColddrinksAmounts(colddrinksamount);
        cu2.setColddrinksCost(costOfEachColddrinksItem);

        cu2.setCosmeticsCount(j9);
        cu2.setCosmeticsNames(cosmeticsitems);
        cu2.setCosmeticsAmounts(cosmeticsamount);
        cu2.setCosmeticsCost(costOfEachCosmeticsItem);

        cu2.setOthersCount(j10);
        cu2.setOthersNames(othersitems);
        cu2.setOthersAmounts(othersamount);
        cu2.setOthersCost(costOfEachOthersItem);

        session.setAttribute("cu", cu2);
        response.sendRedirect("GeneratedBill.jsp");
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
