package dao;

import java.sql.Connection;

/**
 * @author hyn
 * @create 2020-01-02-12:29
 */
public interface SequenDao {
	long getNextvalByName(String name);
	long last_insert_id(Connection conn);
}
