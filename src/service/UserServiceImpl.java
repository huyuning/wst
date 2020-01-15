package service;

import dao.UserDao;
import dao.UserDaoImpl;
import tools.Md5Util;
import vo.User;

/**
 * @author hyn
 * @create 2019-12-26-14:35
 */
public class UserServiceImpl implements UserService{
	UserDao dao = new UserDaoImpl();
	
	@Override
	public int login(String username, String passsword) {
		User u = dao.getUserByUsername(username);
		if(u==null){
			return -1;
			//用户名不存在
			
		}else {
			String md5_pwd = Md5Util.encode(passsword);
			if(md5_pwd.equals(u.getPassword())){
				return 0;
				
			}else {
				
				return -2;//密码错误
			}
		}
		
	}
}
