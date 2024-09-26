package com.finalproj.model;

import java.time.LocalDate;

public class MuonTra {

	private String MaMuon;
	private int MaSV;
	private String NameSV;
	private String MaSach;
	private LocalDate NgayMuon;
	private LocalDate NgayTra;
	
	public String getMaMuon() {
		return MaMuon;
	}
	public void setMaMuon(String maMuon) {
		MaMuon = maMuon;
	}
	public int getMaSV() {
		return MaSV;
	}
	public void setMaSV(int maSV) {
		MaSV = maSV;
	}
	public String getNameSV() {
		return NameSV;
	}
	public void setNameSV(String nameSV) {
		NameSV = nameSV;
	}
	public String getMaSach() {
		return MaSach;
	}
	public void setMaSach(String maSach) {
		MaSach = maSach;
	}
	public LocalDate getNgayMuon() {
		return NgayMuon;
	}
	public void setNgayMuon(LocalDate ngayMuon) {
		NgayMuon = ngayMuon;
	}
	public LocalDate getNgayTra() {
		return NgayTra;
	}
	public void setNgayTra(LocalDate ngayTra) {
		NgayTra = ngayTra;
	}
	
}
