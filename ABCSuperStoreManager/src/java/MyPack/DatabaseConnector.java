package MyPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnector {
    //static String[] str = {"adsd","adsd","adsd","adsd","adsd","adsd"};
     /*public static void main(String args[]){
     DatabaseConnector dv = new DatabaseConnector();
        
        if (dv.verifyUser("4", "1234")==true){
            System.out.println(dv.getUserName("4"));
        }
        else 
            System.out.println("false");
      
          
     }*/

    Connection conn;

    /**
     * sets up the connection with the super store database
     */
    public void setConnectionWithOracle() {
        conn = null;
        try {
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            String serverName = "localhost";
            String serverPort = "1521";
            String sid = "orcl";
            String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":" + sid;
            String username = "SuperStoreDatabase";
            String password = "1234";
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("ALHAMDULILLAH");
        } catch (Exception e) {
            System.out.println("error rror ttor");
        }
    }

    /**
     *
     * @param str : SQL query to insert new data to userinfo table
     */
    public int enterUserInfoToDatabase(String[] str) {
        int count = 1;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from userinfo");
            
            while (rs.next()) {
                ++count;
            }
            // st.executeQuery("create sequence a minvalue "+count+" "+"start with "+count+" "+"increment by 1");
            st.executeQuery("insert into UserInfo values(" + count + "," + "'" + str[0] + "'" + "," + "'" + str[1] + "'" + "," + "'" + str[2] + "'" + ","
                    + "'" + str[3] + "'" + "," + "'" + str[4] + "'" + "," + "'" + str[5] + "'" + ")");
            st.executeQuery("commit");
            System.out.println("Alhamdulillah" + count);
        } catch (Exception e) {
            System.out.println("gotcha");
        }
        return (count);
    }

    public boolean verifyUser(String theUser, String thePassword){
         int flag=0;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select id,password from userinfo");
            while (rs.next()) {
                String ID =rs.getString("id").toString();
                String password=rs.getString("password").toString();
                if (ID.equals(theUser) && password.equals(thePassword)){
                    System.out.println("BROKE");
                    flag = 1;
                        break;
                }
                
                    
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (flag == 0)
        return (false);
        else 
        return (true);
    }
    
    public String getUserName(String userID){
        String userName=null;
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select username from userinfo where id="+userID);
            while (rs.next()){
                userName = rs.getString("username");
            }
        }
        catch(Exception e){}
        
        return (userName);
    }
    
      public String getUserID(String username){
        String userID=null;
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select id from userinfo where username="+username);
            while (rs.next()){
                userID = rs.getString("id");
            }
        }
        catch(Exception e){}
        
        return (userID);
    }
      
       public String getUserRP(String id){
        String userRP=null;
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select rp from userinfo where id="+id);
            while (rs.next()){
                userRP = rs.getString("rp");
            }
        }
        catch(Exception e){}
        
        return (userRP);
    }
    
    public String getPrices(String databaseName,String item){
        String price = null;
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select price from "+databaseName+" where name='"+item+"'");
                while(rs.next()){
                    price = rs.getString("price").toString();    
                }
            }
            catch(Exception e){
                System.out.println("inside exception");
            }    
        return (price);
    }
    
    public String[] getItems(String databaseName){
        String[] names = new String[100];
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select name from "+databaseName);
                while(rs.next()){
                    names[i++] = rs.getString("name").toString();    
                }
            }
            catch(Exception e){
                System.out.println("inside exception");
            }    
        return (names);
    }
    
     public String getTotalSold(String databaseName,String item){
        String totalSold = null;
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select total_sold from "+databaseName+" where name='"+item+"'");
                while(rs.next()){
                    totalSold = rs.getString("total_sold").toString();    
                }
            }
            catch(Exception e){
                System.out.println("inside exception");
            }    
        return (totalSold);
    }
     
     public String getRecentSold(String databaseName,String item){
        String recentSold = null;
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select recent_sold from "+databaseName+" where name='"+item+"'");
                while(rs.next()){
                    recentSold = rs.getString("recent_sold").toString();    
                }
            }
            catch(Exception e){
                System.out.println("inside exception");
            }    
        return (recentSold);
    }
     
     
       public String getColumn(String databaseName,String columnName,String item){
        String result = null;
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select "+columnName+" from "+databaseName+" where name='"+item+"'");
                while(rs.next()){
                    result = rs.getString(columnName).toString();    
                }
            }
            catch(Exception e){
                System.out.println("inside exceptioncolumn");
            }    
        return (result);
    }
       
         public String getColumn(String databaseName,String columnName,int id){
        String result = null;
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select "+columnName+" from "+databaseName+" where id="+id);
                while(rs.next()){
                    result = rs.getString(columnName).toString();    
                }
            }
            catch(Exception e){
                System.out.println("inside exceptioncolumn");
            }    
        return (result);
    }
       
          public void updateColumn(String databaseName,String columnName,String item,double data){
       
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("update "+databaseName+" set "+columnName+"="+data+" where name='"+item+"'");
               
            }
            catch(Exception e){
                System.out.println("inside exception2");
            }    
        return ;
    }
          
             public void updateColumn(String databaseName,String columnName,int id,double data){
       
        int i =0;
             try{
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("update "+databaseName+" set "+columnName+"="+data+" where id="+id);
               
            }
            catch(Exception e){
                System.out.println("inside exception2");
            }    
        return ;
    }
}


