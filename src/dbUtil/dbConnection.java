package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
    private static final String SOCONN = "jdbc:school.sqlite";

    public static Connection getConnection (){
        try {
            class.forName(org.sqlite.JDBC);
            return DriverManager.getConnection(SOCONN);
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }//getConnection
}//class
