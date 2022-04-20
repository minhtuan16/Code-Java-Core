package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.KetQua;
import model.Khoa;
import model.Lop;
import model.MonHoc;
import model.SinhVien;

public class KetQuaDaoIMPL implements KetQuaDao {

	@Override
	public void insert(KetQua kq) {

		String sql = "INSERT KETQUA(MaSV, MaMH, DiemThi) "
				+ "VALUES (?, ?, ?)";
		
		Connection conn = JDBCConnection.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, kq.getMaSV());
			ps.setString(2, kq.getMaMH());
			ps.setFloat(3, kq.getDiemThi());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Loi insert !");
			e.printStackTrace();
		}
	}

//	@Override
//	public void update(KetQua kq) {
//
//		String sql = "UPDATE LOP set TenLop = ?, MaKhoa = ? WHERE MaLop = ?";
//		
//		Connection conn = JDBCConnection.getConn();
//		
//		try {
//			PreparedStatement ps = conn.prepareStatement(sql);
//			
//			ps.setString(1, lop.getTenLop());
//			ps.setString(2, lop.getMaKhoa());
//			ps.setInt(3, lop.getMaLop());
//			
//			ps.executeUpdate();
//		} catch(SQLException e) {
//			System.out.println("Loi update !");
//			e.printStackTrace();
//		}
//	}

	@Override
	public List<KetQua> KQHocTapSinhVien() {

		String sql = "select sinhvien.MaSV, sinhvien.HoTen, sinhvien.GioiTinh, sinhvien.NgaySinh, sinhvien.MaLop, monhoc.MaMH, monhoc.TenMH, monhoc.SoTiet, ketqua.DiemThi from ketqua "
				+ "inner join sinhvien on sinhvien.MaSV = ketqua.kq_MaSV "
				+ "inner join monhoc on monhoc.MaMH = ketqua.kq_MaMH;";
		
		Connection conn = JDBCConnection.getConn();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			List<KetQua> lists = new ArrayList<KetQua>();
			
			while(rs.next()) {
				
				SinhVien sv = new SinhVien();
				
				sv.setMaSV(rs.getInt("MaSV"));
				sv.setHoTen(rs.getString("HoTen"));
				sv.setGioiTinh(rs.getString("GioiTinh"));
				sv.setNgaySinh(rs.getDate("NgaySinh"));
				sv.setMaLop(rs.getInt("MaLop"));
				
				
				MonHoc mh = new MonHoc();
				
				mh.setMaMH(rs.getString("MaMH"));
				mh.setTenMH(rs.getString("TenMH"));
				mh.setSoTiet(rs.getInt("SoTiet"));
				
				KetQua kq = new KetQua();
				kq.setSinhVien(sv);
				kq.setMonHoc(mh);
				kq.setDiemThi(rs.getFloat("DiemThi"));
				
				lists.add(kq);
			}
			return lists;
		} catch(SQLException e) {
			System.out.println("Loi KQHocTapSinhVien() !");
			e.printStackTrace();
		}
		return null;
	}
}