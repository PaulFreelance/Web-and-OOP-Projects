/*Lihat Paul-Sorin*/
package Database;
import java.util.ArrayList;
import Magazin.Uleiuri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Connect {
    public static Connection connect(){
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:Benzinarie.db");
            System.out.println("Connected");
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return con;
    }

    private static class Order {
    }
    //Conectiune prin MySQL DB dar esuata
    /*Connection con;
    PreparedStatement ps;
    public void Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:7882/benzinarie","root","");
            System.out.println("Success");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }*/


    public class Database {
        private static ArrayList<Order> database = new ArrayList<Order>();

        public static void addDatabase(Order order){                            // lanches que foram vendidos
            database.add(order);
        }
        public static ArrayList<Order> getDatabase(){
            return database;
        }
    }

}
