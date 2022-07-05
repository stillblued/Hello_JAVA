package com.yedam.prj.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	public Connection conn;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	//1. DB처리 드라이버 라이브러리 다운 ojdbc.jar
	//2. 드라이버 메모리 로딩 : Class.forName("패키지.클래스")
	//3. DB 연결 : Connection conn = DriverManager.getConnection("url", id, pw);
	//4. Statement -> Statement, PreparedStatement, CallableStatement
	//sql구문 실행 : DML -> int r = executeUpdate() , 
	//			  select -> ResultSet rs =  executeQuery()
	//5. ResultSet : 커서이동메서드 ->  rs.next() previous(), first, absolrute(4) 
	//				 컬럼값읽는메서드 -> rs.getString() rs.getInt() 
	//6. disconnect : conn.close();
	
	
	
	public void getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void disconnect() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
