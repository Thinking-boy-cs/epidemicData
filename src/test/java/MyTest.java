import org.junit.Test;
import swu.zk.util.DruidUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2021/6/7 10:56
 * @Created by brain
 */
public class MyTest {

    @Test
    public void test1(){
        try {
            Connection connection = DruidUtils.getConnection();
            System.out.println(connection);
            String sql = "select * from account";
            PreparedStatement pre = connection.prepareStatement(sql);
            ResultSet res = pre.executeQuery();
            while (res.next()){
                System.out.println(res.getString("uername"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
