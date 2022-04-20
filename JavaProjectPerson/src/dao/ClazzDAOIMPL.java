package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Clazz;
import model.Course;


public class ClazzDAOIMPL implements ClazzDAO {
	

	@Override
	public void add(Clazz c) {
		
		String sql = "INSERT INTO CLAZZ(id, name, course_id) VALUES(?, ?, ?)";
				
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, c.getId());
			ps.setString(2, c.getName());
			ps.setInt(3, c.getCourse().getId());
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi insert");
		}
		
	}
		//Ctrl + shift + O: de xoa may import thua

	@Override
	public void update(Clazz c) {
		String sql = "UPDATE CLAZZ SET name = ? course_id = ? WHERE id = ?";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, c.getName());
			ps.setInt(2, c.getCourse().getId());
			ps.setInt(3, c.getId());
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi update");
		}		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM CLAZZ WHERE id = ?";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi delete");
		}		
	}

	@Override
	public List<Clazz> selectAll() {
		String sql = "SELECT id, name, course_id FROM CLAZZ";
		
		Connection conn = JDBCConnection.getConn();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(); 
			
			List<Clazz> list = new ArrayList<Clazz>();
				
			while(rs.next()) {
				Clazz c = new Clazz();
				
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				
				//tao doi tuong
				Course c1 = new Course();
				c1.setId(rs.getInt("course_id"));
				c.setCourse(c1);
				
				list.add(c);
			}
			
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Loi selectALL");
		}
		return null;
	}
	
	
	@Override
	public List<Clazz> searchByCourseName(String Coursename) {
		String sql = "SELECT cl.id, cl.name AS 'c_name', cl.course_id, c.name FROM person.clazz cl"
				+ " INNER JOIN COURSE c ON cl.course_id = c.id"
				+ " WHERE c.name = ?;";
		
		Connection conn = JDBCConnection.getConn();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, Coursename);
			
			ResultSet rs = ps.executeQuery(); 
			
			List<Clazz> list = new ArrayList<Clazz>();
				
			while(rs.next()) {
				Clazz c = new Clazz();
				
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("c_name"));
				
				//tao doi tuong
				Course c1 = new Course();
				c1.setId(rs.getInt("course_id"));
				c1.setName(rs.getString("name"));
				
				c.setCourse(c1);
				
				list.add(c);
			}
			
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Loi search by coursename");
		}
		return null;
	}
}