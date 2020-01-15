package dao;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author hyn
 * @create 2020-01-02-12:29
 */
public class SequenDaoImpl extends BaseDao implements SequenDao{
	
	
	@Override
	public long getNextvalByName(String name) {
		String sql = "SELECT NEXTVAL(?) as val";
		ResultSet rs = this.executeQuery(sql,name);
		try{
			if (rs.next()){
				return rs.getLong("val");
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public long last_insert_id(Connection conn) {
		String sql = "select last_insert_id() as iid";
		ResultSet rs = this.executeQuery(conn,sql);
		try{
			if (rs.next()){
				return rs.getLong("iid");
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return 0;
	}
}
