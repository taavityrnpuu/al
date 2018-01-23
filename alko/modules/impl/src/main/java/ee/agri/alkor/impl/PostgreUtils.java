package ee.agri.alkor.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ee.agri.alkor.util.AppContextHelper;
import ee.agri.alkor.impl.DbBean;

import org.apache.commons.dbcp2.BasicDataSource;
import org.jboss.resource.adapter.jdbc.WrapperDataSource;
import org.springframework.orm.hibernate3.HibernateTransactionManager;

public class PostgreUtils {
	static DbBean dbBean = (DbBean) AppContextHelper.getInstance().getBean("pgDataSource");
	static HibernateTransactionManager myTxManager = (HibernateTransactionManager) AppContextHelper.getInstance().getBean("myTxManager");
	
	private static Connection connect() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(dbBean.getUrl() , dbBean.getUsername(), dbBean.getPassword());

			//Connection conn = myTxManager.getDataSource().getConnection();

			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

	public static ee.agri.alkor.impl.ResultSet query(String sql) {

		Connection c = PostgreUtils.connect();
		
		ResultSet rs = null;
		Statement stmnt = null;
		ee.agri.alkor.impl.ResultSet returnable = null;

		try {		
			stmnt = c.createStatement();
			rs = stmnt.executeQuery(sql);
			returnable = new ee.agri.alkor.impl.ResultSet(rs);
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				c.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} finally {
			try{
				rs.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}

			try{
				stmnt.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
			try{
				c.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
		}

		return returnable;

	}

	public static void insert(String sql) {
		Connection c = PostgreUtils.connect();

		Statement stmnt = null;
		try {
			stmnt = c.createStatement();
			stmnt.execute(sql);
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				c.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} finally {
			try{
				stmnt.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
			try{
				c.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
		}
	}

	public static long insert(String sql, String returnField) {
		if (sql.substring(sql.length() - 1).equals(";")) {
			sql = sql.substring(0, sql.length() - 1);
		}

		sql += " RETURNING " + returnField + ";";
		long lastId = 0;
		Connection c = PostgreUtils.connect();
		Statement stmnt = null;
		ResultSet rs = null;
		try {
			stmnt = c.createStatement();
			rs = stmnt.executeQuery(sql);
			while (rs.next()) {
				lastId = (long) rs.getInt(1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				c.rollback();
			} catch (SQLException e) {
				System.out.println("ROLLBACK FAIL: "+e.getMessage());
				System.out.println("SQL: "+sql);
			}
		} finally {
			try{
				rs.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
			try{
				stmnt.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
			try{
				c.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
		}
		
		return lastId;
	}

	public static boolean delete(String sql) {
		return update(sql);
	}

	public static boolean update(String sql) {
		boolean isError = false;

		Connection c = PostgreUtils.connect();
		Statement stmnt = null;
		try {
			stmnt = c.createStatement();
			stmnt.execute(sql);
		} catch (Exception ex) {
			ex.printStackTrace();
			isError = true;
			try {
				c.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} finally {
			try{
				stmnt.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
			try{
				c.close();
			} catch (Exception ex){
				ex.printStackTrace();
			}
		}

		return isError;
	}

}
