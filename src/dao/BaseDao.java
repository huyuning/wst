package dao;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
		public static final String drivername = "com.mysql.cj.jdbc.Driver";
		public static final String url = "jdbc:mysql://localhost:3306/wst?characterEncoding = utf8";
		public static final String username = "root";
		public static final String password = "xiaosa0827";
		private Connection con        = null;
		private PreparedStatement pst = null;
		public Connection getConnetion(){
			try{
				//1.????????
				Class.forName(drivername);
				//2.?????????
				con = DriverManager.getConnection(url, username, password);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}
		public void closeResource(){
			try{
				if(pst != null)
					pst.close();
				if(con != null)
					con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	 
	   	public boolean executeUpdate(String sql,Object...objects){
	   		try{
	   			getConnetion();
	   			pst = con.prepareStatement(sql);
	   			if(objects != null){
	   				//???????????
	   				for(int i = 0; i < objects.length; i++){
	   					pst.setObject(i+1, objects[i]);
	   				}
	   			}
	   		return	pst.executeUpdate() == 0?false:true;
	   		}catch(SQLException e){
	   			e.printStackTrace();
	   		}finally{
	   			closeResource();
	   		}
	   		return false;
	   	}
	   	//????????????????? 
	 	public boolean executeUpdate(Connection conn ,String sql,Object...objects){
	   		try{
	   			pst = conn.prepareStatement(sql);
	   			if(objects != null){
	   				//???????????
	   				for(int i = 0; i < objects.length; i++){
	   					pst.setObject(i+1, objects[i]);
	   				}
	   			}
	   			pst.executeUpdate();
	   			return true;
	   		}catch(SQLException e){
	   			e.printStackTrace();
	   			try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
	   		}finally{
	   			closeResource();
	   		}
	   		return false;
	   	}
		public ResultSet executeQuery(String sql, Object...objects){
			try{
				getConnetion();
				pst = con.prepareStatement(sql);
				if (objects != null) {
					//??????????????
					for(int i = 0; i < objects.length; i++){
						pst.setObject(i+1, objects[i]);
					}
				}
				return pst.executeQuery();
			}catch(SQLException e){
				e.printStackTrace();
			}
			return null;
		}
	public ResultSet executeQuery(Connection con,String sql, Object...objects){
		try{
			
			pst = con.prepareStatement(sql);
			if (objects != null) {
				//??????????????
				for(int i = 0; i < objects.length; i++){
					pst.setObject(i+1, objects[i]);
				}
			}
			return pst.executeQuery();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}
