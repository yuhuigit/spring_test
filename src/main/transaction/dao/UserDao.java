package transaction.dao;

import transaction.module.User;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jd on 2016/06/08.
 */
@Repository
public class UserDao extends BaseDao {

    public User getUserbyId(Integer id){
        final User user = new User();
        String sql ="select id ,name,age from user where id=?";
        jdbcTemplate.query(sql, new Object[]{id}, new RowCallbackHandler() {
            public void processRow(ResultSet rs) throws SQLException {
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
            }
        });
        return user;
    }


}
