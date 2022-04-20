package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Course;


public class CourseDAOIMPL implements CourseDAO {
	

	@Override
	public void add(Course c) {
		
		String sql = "INSERT INTO COURSE(id, name) VALUES(?, ?)";
				
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, c.getId());
			ps.setString(2, c.getName());
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi insert");
		}
		
	}
		//Ctrl + shift + O: de xoa may import thua

	@Override
	public void update(Course c) {
		String sql = "UPDATE COURSE SET name = ? WHERE id = ?";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, c.getName());
			ps.setInt(2, c.getId());
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi update");
		}		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM COURSE WHERE id = ?";
		
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
	public List<Course> selectAll() {
		String sql = "SELECT id, name FROM COURSE";
		
		Connection conn = JDBCConnection.getConn();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(); 
			
			List<Course> courseList = new ArrayList<Course>();
				
			while(rs.next()) {
				Course c = new Course();
				
				c.setId(rs.getInt("id"));
				c.setName(rs.getString("name"));
				
				courseList.add(c);
			}
			
			return courseList;
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Loi selectALL");
		}
		return null;
	}
}