package com.example.user.projectone;

public class CongViec {
    int id;
    String noidung;
    String thoigian;

    public CongViec(int id, String noidung, String thoigian) {
        this.id = id;
        this.noidung = noidung;
        this.thoigian = thoigian;
    }

    public CongViec(String noidung, String thoigian) {
        this.noidung = noidung;
        this.thoigian = thoigian;
    }
}
