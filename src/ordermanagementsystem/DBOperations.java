package ordermanagementsystem;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author toshiba
 */
public class DBOperations {
    
    String url = "jdbc:mysql://localhost/ordermanagement";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
    PreparedStatement pst3 = null;
    ResultSet rs2 = null;
    ResultSet rs1 = null;
    
    
        
    public Connection connect() //Buid the connection...
    {        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(url, username, password);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        
        return con;
    }
    
    public int checkLogin(String pUsername,String pPassword) //Login checker...
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query1 = "SELECT username,password FROM employeedetails WHERE username = '"+pUsername+"'";
            pst = (PreparedStatement)con.prepareStatement(query1);
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                if(pUsername.equals(rs.getString(1)))
                {
                    if(pPassword.equals(rs.getString(2)))
                    {
                        return 0;
                    }
                    else
                    {
                        return 1;
                    }
                    
                }
                else
                {
                    return 2;
                }
            }
            
            return 3;
            
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return 4;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public boolean addProducts(ProductDetails pd) //Insert values to product table...
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query2 = "INSERT INTO `product` VALUES (?,?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query2);
            
            pst.setInt(1, pd.getRegID());
            pst.setString(2, pd.getName());
            pst.setInt(3, pd.getPrice());
            pst.setString(4, pd.getSeller());
            pst.setInt(5, pd.getPieces());
            
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    
    public boolean updateProduct(ProductDetails pd)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query3 = "UPDATE products SET pname = '"+ pd.getName()+"', pprice = '"+ pd.getPrice()+"', pseller = '"+ pd.getSeller()+"', quantity = '"+ pd.getPieces()+"' WHERE pid = '"+pd.getRegID()+"'";
            pst = (PreparedStatement)con.prepareStatement(query3);
            
            pst.executeUpdate();
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public boolean deleteProduct(ProductDetails pd)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query4 = "DELETE FROM products WHERE pid = '"+pd.getRegID()+"'";
            pst = (PreparedStatement)con.prepareStatement(query4);
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public int checkPassword(String ppassword)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query5 = "SELECT password FROM employeedetails";
            pst = (PreparedStatement)con.prepareStatement(query5);
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                if(ppassword.equals(rs.getString(1)))
                {
                    return 0;
                }
            }
            
            return 1;
            
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return 2;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                
            }
            
        }
    }
    
    public boolean addMember(MemberDetails em)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query1 = "INSERT INTO employeedetails VALUES (?,?,?,?,?,?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query1);
            
            pst.setInt(1, em.getMemID());
            pst.setString(2, em.getFirstName());
            pst.setString(3, em.getLastName());
            pst.setInt(4, em.getAge());
            pst.setString(5, em.getAddress());
            pst.setString(6, em.getGender());
            pst.setString(7, em.getEmail());
            pst.setString(8, em.getUsername());
            pst.setString(9, em.getPassword());
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                
            }
            
        }
    }
    
    public boolean deleteMember(MemberDetails md)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query4 = "DELETE FROM employeedetails WHERE regid = '"+md.getMemID()+"'";
            pst = (PreparedStatement)con.prepareStatement(query4);
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public boolean addCustOrder(OrderProducts opd) //Insert values from OrderProducts.java(Encapsulation java class)...
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query4 = "INSERT INTO custorder(pid,pname,price,quantity) VALUES (?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query4);
            
            pst.setInt(1, opd.getPid());
            pst.setString(2, opd.getName());
            pst.setInt(3, opd.getPrice());
            pst.setInt(4, opd.getQuantity());
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    /*public boolean updateExistingProduct(OrderProducts op) //from OrderProduct.java
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query4 = "UPDATE custorder SET quantity = '"+op.getQuantity()+"' WHERE pid = '"+op.getPid()+"'";
            pst = (PreparedStatement)con.prepareStatement(query4);
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
    }*/
    
    public boolean deleteOrderedProduct(OrderProducts op)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query4 = "DELETE FROM custorder WHERE pid = '"+op.getPid()+"'";
            pst = (PreparedStatement)con.prepareStatement(query4);
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public boolean updateQuantityOfProduct(OrderProducts op)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query3 = "UPDATE custorder SET quantity = '"+op.getQuantity()+"' WHERE pid = '"+op.getPid()+"'";
            pst = (PreparedStatement)con.prepareStatement(query3);
            
            pst.executeUpdate();
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public boolean addCustomer(CustomerDetails cd)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query3 = "INSERT INTO customer(orderid,name,address,phone) VALUES (?,?,?,?)";
            pst = (PreparedStatement)con.prepareStatement(query3);
            
            
            pst.setInt(1, cd.getOrderID());
            pst.setString(2, cd.getName());
            pst.setString(3, cd.getAddress());
            pst.setString(4, cd.getPhone());
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public boolean deleteCustOrderTable(OrderProducts op)
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query4 = "DELETE FROM custorder";
            pst = (PreparedStatement)con.prepareStatement(query4);
            
            pst.executeUpdate();
            
            return true;
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
    public boolean orderInsert()
    {
        try 
        {
            con = (Connection)DriverManager.getConnection(url, username, password);
            
            String query = "SELECT orderid FROM customer ORDER BY orderid DESC LIMIT 1";
            pst = (PreparedStatement)con.prepareStatement(query);
            rs = pst.executeQuery();
            
            while(rs.next())
            {                
                String query2 = "SELECT pid,pname,price,quantity FROM custorder";
                pst = (PreparedStatement)con.prepareStatement(query2);
                rs1 = pst.executeQuery();
                    
                    while(rs1.next())
                    {
                        String query4 = "INSERT INTO `order`(`orderid`, `pid`, `pname`, `price`, `quantity`, `delivererID`, `deliverDate`, `delivered`) VALUES (?,?,?,?,?,?,?,?)";
                        pst1 = (PreparedStatement)con.prepareStatement(query4);
                        pst1.setInt(1, rs.getInt(1));
                        pst1.setInt(2, rs1.getInt(1));
                        pst1.setString(3, rs1.getString(2));
                        pst1.setInt(4, rs1.getInt(3));
                        pst1.setInt(5, rs1.getInt(4));
                        pst1.setString(6, null);
                            
                        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
                        pst1.setTimestamp(7, date);
                            
                        pst1.setBoolean(8, false);

                        pst1.executeUpdate();
                        
                        
                    }
            }
            return true;
            
        }
        catch (Exception e) 
        {
            System.out.println(e);
            return false;
        }
        finally
        {
            try
            {
                if(pst != null)
                {
                    pst.close();
                }
                if(con != null)
                {
                    con.close();
                }
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }
            
        }
    }
    
}
