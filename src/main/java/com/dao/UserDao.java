package com.dao;

import com.bean.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.util.SpringJdbcUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yuyu on 2016/10/19.
 */
@Repository("userDao")
public class UserDao {

    private static Logger logger = Logger.getLogger(User.class);

    @Autowired
    private DataSource dataSource;

    public User getUserByName(String userName){
        StringBuilder sb = new StringBuilder();
        sb.append("select * from t_user where user_name = ?");
        String sql = sb.toString();
        User user = new User();
        try {
            Connection connection =  dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,userName);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                long id = rs.getLong("id");
                String name = rs.getString("user_name");
                String password = rs.getString("password");
                System.out.println("name:"+name+"  ; password:"+password);
                user.setName(name);
                user.setPassword(password);
                user.setId(id);
            }

        } catch (SQLException e) {
            logger.error("",e);
        }
        return user;
    }

}
