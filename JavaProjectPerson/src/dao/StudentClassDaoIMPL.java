package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Clazz;
import model.Course;
import model.StudentClass;


public class StudentClassDaoIMPL implements StudentClassDao {
	

	@Override
	public void add(StudentClass sc) {
		
		String sql = "INSERT INTO STUDENT_CLASS(soSV, id_clazz) VALUES(?, ?)";
				
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, sc.getSoSV());
			ps.setInt(2, sc.getClazz().getId());
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi insert");
		}
		
	}
		//Ctrl + shift + O: de xoa may import thua

	@Override
	public void update(StudentClass sc) {
		String sql = "UPDATE Student_Class SET soSV = ? WHERE id_clazz = ?";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, sc.getSoSV());
			ps.setInt(2, sc.getClazz().getId());
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi update");
		}		
	}

	@Override
	public void delete(int id_clazz) {
		String sql = "DELETE FROM Student_Class WHERE id_clazz = ?";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id_clazz);
			
			ps.executeUpdate();//de update du lieu: them/sua/xoa
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Loi delete");
		}		
	}

	@Override
	public List<StudentClass> selectAll() {
		String sql = "SELECT id_clazz, soSV FROM Student_Class";
		
		Connection conn = JDBCConnection.getConn();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery(); 
			
			List<StudentClass> list = new ArrayList<StudentClass>();
				
			while(rs.next()) {
				StudentClass sc = new StudentClass();
				
				sc.setSoSV(rs.getInt("SoSV"));
				
				//tao doi tuong
				Clazz c = new Clazz();
				c.setId(rs.getInt("id_clazz"));
				sc.setClazz(c);
				
				list.add(sc);
			}
			
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Loi selectALL");
		}
		return null;
	}
	
	
	@Override
	public List<StudentClass> searchClazzName(String ClazzName) {
		String sql = "SELECT sc.soSV, id_clazz, cl.name, course_id FROM person.Student_Class sc"
				+ " INNER JOIN Clazz cl ON cl.id = sc.id_clazz"
				+ " WHERE cl.name = ?;";
		
		Connection conn = JDBCConnection.getConn();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, ClazzName);
			
			ResultSet rs = ps.executeQuery(); 
			
			List<StudentClass> list = new ArrayList<StudentClass>();
				
			while(rs.next()) {
				StudentClass sc = new StudentClass();
				
				sc.setSoSV(rs.getInt("SoSV"));
				
				
				//tao doi tuong
				Clazz cl = new Clazz();
				cl.setId(rs.getInt("id_clazz"));
				cl.setName(rs.getString("name"));
				cl.setId(rs.getInt("course_id"));
				
				sc.setClazz(cl);
				
				list.add(sc);
			}
			
			return list;
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println("Loi search by coursename");
		}
		return null;
	}
 
}