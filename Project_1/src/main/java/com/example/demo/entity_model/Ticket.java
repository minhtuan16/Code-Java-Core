package com.example.demo.entity_model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "SDT")
	private int sDT;

	@Column(name = "y_kien_khach_hang")
	private String yKienKH;
	
	@Column(name = "tgian_tiep_nhan")
	private Date ngayNhan;
	
	@Column(name = "noi_dung_xu_ly")
	private String traLoiKH;

	@Column(name = "trang_thai")
	private boolean trangThai;

	@Column(name = "tgian_xu_ly")
	private Date xuLy;
	
	@Column(name = "id_phong_ban")
	private int idPhong;
}
