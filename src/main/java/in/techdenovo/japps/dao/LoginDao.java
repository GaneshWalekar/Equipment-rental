package in.techdenovo.japps.dao;

import in.techdenovo.japps.model.LogIn;
import in.techdenovo.japps.utils.DbUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    boolean flag=false;
    DbUtility dbUtility=new DbUtility();
    LogIn logIn=new LogIn();

    public boolean logInCheck(String userName, String password){
        String query = "SELECT * FROM USER_LOGIN WHERE U_NAME=? && pwd=?";
        try {

            Connection con = dbUtility.getConnection();
            if(con==null){
                flag=false;
            }else {
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, userName);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    logIn.setId(rs.getInt("id"));
                    logIn.setUserName(rs.getString("U_NAME"));
                    logIn.setPassword(rs.getString("PWD"));

                    flag = true;
                }
            }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        return flag;
    }


}
