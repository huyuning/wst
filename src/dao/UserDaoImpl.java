package dao;

import vo.User;

import java.sql.Connection;
import java.sql.ResultSet; 



public class UserDaoImpl extends BaseDao implements UserDao{
	public boolean insertOne(User u){
		String sql = "insert into User values(null,?,?,?,now(),?)";
		return this.executeUpdate(sql, u.getUsername(),u.getPassword());
	}
	
	public User getUserByUsername(String username){
		String sql = "select * from User where username = ?";
		ResultSet rs = this.executeQuery(sql, username);
		User u = null;
		try{
			if (rs.next()) {
				u = new User();
				
			
				u.setPassword(rs.getString("password"));
			
				u.setUsername(rs.getString("username"));
				return u;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	public boolean update(Connection conn,User u) {
		String sql = "update User set password = ?,balance = ?,status = ? where userno = ?";
		if (conn==null)
			return this.executeUpdate(sql, u.getPassword(),u.getUsername());
		else
			return this.executeUpdate(conn,sql, u.getPassword(),u.getUsername());
			
		
	}
	public User getUser(){
		String sql = "select * from User";
		ResultSet rs = this.executeQuery(sql);
		User u = null;
		try{
			if (rs.next()) {
				u = new User();
				
				u.setPassword(rs.getString("password"));
			
				u.setUsername(rs.getString("userno"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
}
