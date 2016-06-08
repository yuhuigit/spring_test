package transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by jd on 2016/06/08.
 */
public class BaseDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;
}
