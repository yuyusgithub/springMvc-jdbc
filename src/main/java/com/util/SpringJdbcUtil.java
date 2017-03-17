package com.util;

import com.sun.istack.internal.logging.Logger;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SpringJdbcUtil  {

	private static Logger logger = Logger.getLogger(SpringJdbcUtil.class);

	private static DataSource ds = null;
	private static Connection conn = null;

	static {
		if (ds == null) {
			ds =  SpringUtil.getBean("dataSource",DataSource.class);
		}
	}

	public static Connection getConnection() throws SQLException {
		conn = ds.getConnection();
		return conn;
	}

	public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			logger.info("未成功关闭ResultSet==" + e.getLocalizedMessage());
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				logger.info("未成功关闭Statement==" + e.getLocalizedMessage());
			} finally {
				if (conn != null)
					try {
						conn.close();
					} catch (SQLException e) {
						logger.info("未成功关闭Connection==" + e.getLocalizedMessage());
					}
			}
		}
	}

	public static void close(PreparedStatement st, Connection conn) {
		try {
			if (st != null)
				st.close();
		} catch (SQLException e) {
			logger.info("未成功关闭Statement==" + e.getLocalizedMessage());
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

	public static void close(Connection conn) {
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException e) {
				logger.info("未成功关闭Connection==" + e.getLocalizedMessage());
			}
	}
}
