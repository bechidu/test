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

	public String register(User user) {
		/*String sql = "insert into users values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { user.getUsername(), user.getPassword(), user.getFirstname(),
				user.getLastname(), user.getEmail(), user.getAddress(), user.getPhone() });*/
		if(user.getFirstname() == null){
			return "First name mandatory";
		}else if(user.getLastname() == null){
			return ("Last name mandatory");
		}else if(user.getUsername() == null){
			return ("user name mandatory");
		}else if(user.getPassword() == null){
			return "password mandatory";
		}
		return "success";
	}

	public User validateUser(Login login) {
		/*String sql = "select * from users where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<User> users = jdbcTemplate.query(sql, new UserMapper());
		return users.size() > 0 ? users.get(0) : null;*/
		if(!login.getUsername().equals("ch310445")){
			return null;
		}
		return mapUser(login);
	}
	
	private User mapUser(Login login){
		User user = null;
		if("ch310445".equals(login.getUsername())){
			user = new User();
			user.setUsername("ch310445");
			user.setPassword("chida");
			user.setFirstname("Chida");
			user.setLastname("Puttaswamy");
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
