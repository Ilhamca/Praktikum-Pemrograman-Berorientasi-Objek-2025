package Model.Buku;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Iam
 */
public class ModelBuku {

    private String judul, penulis;
    private int id, tahun, alur, bahasa, orisinalitas;
    private double rating;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public Integer getAlur() {
        return alur;
    }

    public void setAlur(Integer alur) {
        this.alur = alur;
    }

    public Integer getBahasa() {
        return bahasa;
    }

    public void setBahasa(Integer bahasa) {
        this.bahasa = bahasa;
    }

    public Integer getOrisinalitas() {
        return orisinalitas;
    }

    public void setOrisinalitas(Integer orisinalitas) {
        this.orisinalitas = orisinalitas;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
