<%-- 
    Document   : GeneratedBill
    Created on : Oct 19, 2015, 3:25:17 PM
    Author     : DELL
--%>
<%@page import="java.sql.*"%>
<%@page import="MyPack.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your Bill!!!</title>
    </head>
    <body>
        <%
            CurrentUser cu2 = (CurrentUser) session.getAttribute("cu");
            
        %>
        <h1>UserName:<%=cu2.getName()%> </h1>
        <form method="post" action="FinalizeUserOrderServlet">
            
            <table>
            <th>Item</th>
            <th>Amount</th>
            <th>Cost</th>
            <%
                for (int i=0;i<cu2.getVegCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.vegNames[i]%>
                        </td>
                        <td>
                            <%=cu2.vegAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.vegCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                <%
                for (int i=0;i<cu2.getGroceryCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.groceryNames[i]%>
                        </td>
                        <td>
                            <%=cu2.groceryAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.groceryCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                <%
                for (int i=0;i<cu2.getLiquidsCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.liquidsNames[i]%>
                        </td>
                        <td>
                            <%=cu2.liquidsAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.liquidsCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                 <%
                for (int i=0;i<cu2.getChockolatesCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.chockolatesNames[i]%>
                        </td>
                        <td>
                            <%=cu2.chockolatesAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.chockolatesCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                 <%
                for (int i=0;i<cu2.getEggsCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.eggsNames[i]%>
                        </td>
                        <td>
                            <%=cu2.eggsAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.eggsCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                
                 <%
                for (int i=0;i<cu2.getMeatsCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.meatsNames[i]%>
                        </td>
                        <td>
                            <%=cu2.meatsAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.meatsCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                
                   <%
                for (int i=0;i<cu2.getFishesCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.fishesNames[i]%>
                        </td>
                        <td>
                            <%=cu2.fishesAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.fishesCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                   <%
                for (int i=0;i<cu2.getColddrinksCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.colddrinksNames[i]%>
                        </td>
                        <td>
                            <%=cu2.colddrinksAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.colddrinksCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                
                    <%
                for (int i=0;i<cu2.getCosmeticsCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.cosmeticsNames[i]%>
                        </td>
                        <td>
                            <%=cu2.cosmeticsAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.cosmeticsCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                
               
                        <%
                for (int i=0;i<cu2.getOthersCount();++i){%>
                    <tr>
                        <td>
                            <%=cu2.othersNames[i]%>
                        </td>
                        <td>
                            <%=cu2.othersAmounts[i]%>
                        </td>
                         <td>
                            <%=cu2.othersCost[i]%>
                        </td>
                    </tr>
            
            
                <% } %>
                
                
                 <tr>
                        <td>
                            Total
                        </td>
                        <td>
                            <%=cu2.totalAmountPurchased%>
                        </td>
                        <td>
                            <%=cu2.totalCostOfPurchasedProducts%>
                        </td>
                    </tr>   
                
                
              
           
        </table>
               
                <input type="submit" value="ConfirmOrder" >
        </form>
        
    </body>
</html>
