package sample;

import dbUtil.dbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;

public class loginModel {
    Connection connection;
    public loginModel() {
        try {
            this.connection = dbConnection.getConnection();
        }catch (SQLDataException ex) {
            ex.printStackTrace();
        }
        if (this.connection == null){
            System.exit(1);
        }
    }
    public boolean isDatabaseConnection() {
        return this.connection != null;
    }
    public boolean islogin(String user, String pass){
        PreparedStatement pr = null;
        ResultSet r3 = null;
        //sql
        String sql = "select * from user where username = ? and passwor = ?";
        try {
            pr = this.connection.prepareStatement(sql);
            pr.setString(1,user);
            pr.setString(2, pass);

            rs.
        }
    }











}//class