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
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
public class FinalizeUserOrderServlet extends HttpServlet {

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
        
        
        HttpSession session = request.getSession();
        CurrentUser cu2 = (CurrentUser) session.getAttribute("cu");
        
        double totalAmountPurchased = 0.0;
        double totalCostOfPurchasedProducts = 0.0;
        
        
         DatabaseConnector dc = new DatabaseConnector();
        dc.setConnectionWithOracle();
        
        //update vegetable information
        for (int i=0;i<cu2.getVegCount();++i){
            
            String totalSold = dc.getColumn("vegetablelist", "total_sold",cu2.vegNames[i]);
            String recentSold = dc.getColumn("vegetablelist","recent_sold" ,cu2.vegNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.vegAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
            totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.vegCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("vegetablelist","total_sold",cu2.vegNames[i],dFinalTotalSold);
            dc.updateColumn("vegetablelist","recent_sold",cu2.vegNames[i],dFinalRecentSold);
        }
        
        
         //update grocery information
        for (int i=0;i<cu2.getGroceryCount();++i){
            
            String totalSold = dc.getColumn("grocerylist", "total_sold",cu2.groceryNames[i]);
            String recentSold = dc.getColumn("grocerylist","recent_sold" ,cu2.groceryNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.groceryAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
             totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.groceryCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("grocerylist","total_sold",cu2.groceryNames[i],dFinalTotalSold);
            dc.updateColumn("grocerylist","recent_sold",cu2.groceryNames[i],dFinalRecentSold);
        }
        
        
         //update liquids information
        for (int i=0;i<cu2.getLiquidsCount();++i){
            
            String totalSold = dc.getColumn("liquidslist", "total_sold",cu2.liquidsNames[i]);
            String recentSold = dc.getColumn("liquidslist","recent_sold" ,cu2.liquidsNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.liquidsAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
             totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.liquidsCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("liquidslist","total_sold",cu2.liquidsNames[i],dFinalTotalSold);
            dc.updateColumn("liquidslist","recent_sold",cu2.liquidsNames[i],dFinalRecentSold);
        }
        
        
         //update chockolates information
        for (int i=0;i<cu2.getChockolatesCount();++i){
            
            String totalSold = dc.getColumn("chockolateslist", "total_sold",cu2.chockolatesNames[i]);
            String recentSold = dc.getColumn("chockolateslist","recent_sold" ,cu2.chockolatesNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.chockolatesAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
            
             totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.chockolatesCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("chockolateslist","total_sold",cu2.chockolatesNames[i],dFinalTotalSold);
            dc.updateColumn("chockolateslist","recent_sold",cu2.chockolatesNames[i],dFinalRecentSold);
        }
        
        
         //update eggs information
        for (int i=0;i<cu2.getEggsCount();++i){
            
            String totalSold = dc.getColumn("eggslist", "total_sold",cu2.eggsNames[i]);
            String recentSold = dc.getColumn("eggslist","recent_sold" ,cu2.eggsNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.eggsAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
            
             totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.eggsCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("eggslist","total_sold",cu2.eggsNames[i],dFinalTotalSold);
            dc.updateColumn("eggslist","recent_sold",cu2.eggsNames[i],dFinalRecentSold);
        }
        
        
          //update meats information
        for (int i=0;i<cu2.getMeatsCount();++i){
            
            String totalSold = dc.getColumn("meatslist", "total_sold",cu2.meatsNames[i]);
            String recentSold = dc.getColumn("meatslist","recent_sold" ,cu2.meatsNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.meatsAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
            
             totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.meatsCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("meatslist","total_sold",cu2.meatsNames[i],dFinalTotalSold);
            dc.updateColumn("meatslist","recent_sold",cu2.meatsNames[i],dFinalRecentSold);
        }
        
        
          //update fishes information
        for (int i=0;i<cu2.getFishesCount();++i){
            
            String totalSold = dc.getColumn("fisheslist", "total_sold",cu2.fishesNames[i]);
            String recentSold = dc.getColumn("fisheslist","recent_sold" ,cu2.fishesNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.fishesAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
            
             totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.fishesCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("fisheslist","total_sold",cu2.fishesNames[i],dFinalTotalSold);
            dc.updateColumn("fisheslist","recent_sold",cu2.fishesNames[i],dFinalRecentSold);
        }
        
        
          //update colddrinks information
        for (int i=0;i<cu2.getColddrinksCount();++i){
            
            String totalSold = dc.getColumn("colddrinkslist", "total_sold",cu2.colddrinksNames[i]);
            String recentSold = dc.getColumn("colddrinkslist","recent_sold" ,cu2.colddrinksNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.colddrinksAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
            totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.colddrinksCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("colddrinkslist","total_sold",cu2.colddrinksNames[i],dFinalTotalSold);
            dc.updateColumn("colddrinkslist","recent_sold",cu2.colddrinksNames[i],dFinalRecentSold);
        }
        
        
          //update cosmeticss information
        for (int i=0;i<cu2.getCosmeticsCount();++i){
            
            String totalSold = dc.getColumn("cosmeticslist", "total_sold",cu2.cosmeticsNames[i]);
            String recentSold = dc.getColumn("cosmeticslist","recent_sold" ,cu2.cosmeticsNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.cosmeticsAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
            totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.cosmeticsCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("cosmeticslist","total_sold",cu2.cosmeticsNames[i],dFinalTotalSold);
            dc.updateColumn("cosmeticslist","recent_sold",cu2.cosmeticsNames[i],dFinalRecentSold);
        }
        
        
          //update others information
        for (int i=0;i<cu2.getOthersCount();++i){
            
            String totalSold = dc.getColumn("otherslist", "total_sold",cu2.othersNames[i]);
            String recentSold = dc.getColumn("otherslist","recent_sold" ,cu2.othersNames[i]);
            
            double dTotalSold = Double.parseDouble(totalSold);
            double dRecentSold = Double.parseDouble(recentSold);
            
            String amount = cu2.othersAmounts[i];
            
            double dAmount = Double.parseDouble(amount);
            
             totalAmountPurchased += dAmount;
            totalCostOfPurchasedProducts += cu2.othersCost[i];
            
            double dFinalTotalSold = dTotalSold + dAmount;
            double dFinalRecentSold = dRecentSold + dAmount;
            
            dc.updateColumn("otherslist","total_sold",cu2.othersNames[i],dFinalTotalSold);
            dc.updateColumn("otherslist","recent_sold",cu2.othersNames[i],dFinalRecentSold);
        }
        
        cu2.totalAmountPurchased = totalAmountPurchased;
        cu2.totalCostOfPurchasedProducts = totalCostOfPurchasedProducts;
        
        
        String previousBuys = dc.getColumn("userinfo", "total_purchased",Integer.parseInt(cu2.getID()));
        totalCostOfPurchasedProducts+=Double.parseDouble(previousBuys);
        
        dc.updateColumn("userinfo","total_purchased",Integer.parseInt(cu2.getID()),totalCostOfPurchasedProducts);
        
        response.sendRedirect("UserOrderReceived.jsp");
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
