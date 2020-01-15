package dao;

import vo.User;




public interface UserDao {
//	public boolean insertOne(Users u);
	public User getUserByUsername(String userno);
//	public boolean update(Connection conn, Users u);
}
