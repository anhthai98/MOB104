package entity;
// Generated 10-Jun-2018 14:49:30 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Donhang generated by hbm2java
 */
@Entity
@Table(name="donhang"
    ,catalog="mob104"
)
public class Donhang  implements java.io.Serializable {


     private String maDonHang;
     private Khachhang khachhang;
     private String tenMatHang;
     private String tenNguoiNhan;
     private String diaChiNguoiNhan;
     private String sdtNguoiNhan;
     private Float trongLuong;
     private Float phiVanChuyen;
     private Boolean cachThucTraPhi;
     private Float tienThuHo;
     private Set<Tinhtrangdonhang> tinhtrangdonhangs = new HashSet<Tinhtrangdonhang>(0);

    public Donhang() {
    }

	
    public Donhang(String maDonHang, Khachhang khachhang, String tenMatHang, String tenNguoiNhan, String diaChiNguoiNhan, String sdtNguoiNhan) {
        this.maDonHang = maDonHang;
        this.khachhang = khachhang;
        this.tenMatHang = tenMatHang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChiNguoiNhan = diaChiNguoiNhan;
        this.sdtNguoiNhan = sdtNguoiNhan;
    }
    public Donhang(String maDonHang, Khachhang khachhang, String tenMatHang, String tenNguoiNhan, String diaChiNguoiNhan, String sdtNguoiNhan, Float trongLuong, Float phiVanChuyen, Boolean cachThucTraPhi, Float tienThuHo, Set<Tinhtrangdonhang> tinhtrangdonhangs) {
       this.maDonHang = maDonHang;
       this.khachhang = khachhang;
       this.tenMatHang = tenMatHang;
       this.tenNguoiNhan = tenNguoiNhan;
       this.diaChiNguoiNhan = diaChiNguoiNhan;
       this.sdtNguoiNhan = sdtNguoiNhan;
       this.trongLuong = trongLuong;
       this.phiVanChuyen = phiVanChuyen;
       this.cachThucTraPhi = cachThucTraPhi;
       this.tienThuHo = tienThuHo;
       this.tinhtrangdonhangs = tinhtrangdonhangs;
    }
   
     @Id 

    
    @Column(name="maDonHang", unique=true, nullable=false, length=10)
    public String getMaDonHang() {
        return this.maDonHang;
    }
    
    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="maKhachHang", nullable=false)
    public Khachhang getKhachhang() {
        return this.khachhang;
    }
    
    public void setKhachhang(Khachhang khachhang) {
        this.khachhang = khachhang;
    }

    
    @Column(name="tenMatHang", nullable=false, length=200)
    public String getTenMatHang() {
        return this.tenMatHang;
    }
    
    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    
    @Column(name="tenNguoiNhan", nullable=false, length=200)
    public String getTenNguoiNhan() {
        return this.tenNguoiNhan;
    }
    
    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    
    @Column(name="diaChiNguoiNhan", nullable=false, length=300)
    public String getDiaChiNguoiNhan() {
        return this.diaChiNguoiNhan;
    }
    
    public void setDiaChiNguoiNhan(String diaChiNguoiNhan) {
        this.diaChiNguoiNhan = diaChiNguoiNhan;
    }

    
    @Column(name="sdtNguoiNhan", nullable=false, length=12)
    public String getSdtNguoiNhan() {
        return this.sdtNguoiNhan;
    }
    
    public void setSdtNguoiNhan(String sdtNguoiNhan) {
        this.sdtNguoiNhan = sdtNguoiNhan;
    }

    
    @Column(name="trongLuong", precision=12, scale=0)
    public Float getTrongLuong() {
        return this.trongLuong;
    }
    
    public void setTrongLuong(Float trongLuong) {
        this.trongLuong = trongLuong;
    }

    
    @Column(name="phiVanChuyen", precision=12, scale=0)
    public Float getPhiVanChuyen() {
        return this.phiVanChuyen;
    }
    
    public void setPhiVanChuyen(Float phiVanChuyen) {
        this.phiVanChuyen = phiVanChuyen;
    }

    
    @Column(name="cachThucTraPhi")
    public Boolean getCachThucTraPhi() {
        return this.cachThucTraPhi;
    }
    
    public void setCachThucTraPhi(Boolean cachThucTraPhi) {
        this.cachThucTraPhi = cachThucTraPhi;
    }

    
    @Column(name="tienThuHo", precision=12, scale=0)
    public Float getTienThuHo() {
        return this.tienThuHo;
    }
    
    public void setTienThuHo(Float tienThuHo) {
        this.tienThuHo = tienThuHo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="donhang")
    public Set<Tinhtrangdonhang> getTinhtrangdonhangs() {
        return this.tinhtrangdonhangs;
    }
    
    public void setTinhtrangdonhangs(Set<Tinhtrangdonhang> tinhtrangdonhangs) {
        this.tinhtrangdonhangs = tinhtrangdonhangs;
    }




}


