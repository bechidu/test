package com.chida.devOps0.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.chida.devOps0.model.Login;
import com.chida.devOps0.model.User;
import com.chida.devOps0.service.UserService;

public class UserDaoImpl implements UserService {
	/*@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;*/

	public void register(User user) {
		/*String sql = "insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });*/
	}

	public User validateUser(Login login) {
		/*String sql = "select * from users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;*/
		return mapUser(login);
	}
	
	private User mapUser(Login login){
		User user = null;
		if("chida".equals(login.getUsername())){
			user = new User();
			user.setUsername("Chida");
			user.setPassword("test");
			user.setFirstname("Puttaswamy");
			user.setLastname("");
			user.setEmail("chida@wipro.com");
			user.setAddress("Tennesse");
			user.setPhone(1234567890);
		}
		return user;
	}
}

/*class UserMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setPassword(rs.getString("password"));
		user.setFirstname(rs.getString("firstname"));
		user.setLastname(rs.getString("lastname"));
		user.setEmail(rs.getString("email"));
		user.setAddress(rs.getString("address"));
		user.setPhone(rs.getInt("phone"));
		return user;
	}
}*/
