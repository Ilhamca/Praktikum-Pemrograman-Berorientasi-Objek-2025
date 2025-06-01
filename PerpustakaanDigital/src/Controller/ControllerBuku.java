/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Buku.*;
import View.Buku.*;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author iam
 */
public class ControllerBuku {

    private View view;
    private InterfaceDAO dao;
    private List<ModelBuku> daftarBuku;

    public ControllerBuku(View view) {
        this.view = view;
        this.dao = new DAOBuku();
        loadTable();

        // addButton
        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertBuku();
            }
        });

        // clearButton
        view.getClearButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.clearFields();
            }
        });

        // deleteButton
        view.getDeleteButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteBuku();
            }
        });

        // updateButton
        view.getUpdateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateBuku();
            }
        });

        view.getTable().addMouseListener(new java.awt.event.MouseAdapter() {
            // ModelBuku buku = new ModelBuku();
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = view.getTable().getSelectedRow();

                if (row != -1) {
                    view.setJudul(view.getTable().getValueAt(row, 1).toString());
                    view.setPenulis(view.getTable().getValueAt(row, 1).toString());
                    view.setPenulis(view.getTable().getValueAt(row, 1).toString());
                    view.setPenulis(view.getTable().getValueAt(row, 1).toString());
                    view.setPenulis(view.getTable().getValueAt(row, 1).toString());
                    view.setPenulis(view.getTable().getValueAt(row, 1).toString());
                }
            }
        });
    }

    private void loadTable() {
        daftarBuku = dao.getAll();
        ModelTable modelTable = new ModelTable(daftarBuku);
        view.getTable().setModel(modelTable);
    }

    private void updateBuku() {
        int confirm = JOptionPane.showConfirmDialog(view, "Apakah anda yakin ingin mengupdate data ini?", "Konfirmasi Update", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            int selectedRow = view.getTable().getSelectedRow();
            if (selectedRow != -1) {
                try {
                    int id = (int) view.getTable().getValueAt(selectedRow, 0);

                    ModelBuku buku = new ModelBuku();
                    buku.setId(id);
                    buku.setJudul(view.getJudul());
                    buku.setPenulis(view.getPenulis());
                    buku.setTahun(view.getTahun());
                    buku.setAlur(view.getAlur());
                    buku.setBahasa(view.getBahasa());
                    buku.setOrisinalitas(view.getOrisinalitas());
                    double alurValue = (view.getAlur());
                    double bahasaValue = (view.getBahasa());
                    double orisinalitasValue = (view.getOrisinalitas());

                    if (alurValue < 0 || alurValue > 5 || bahasaValue < 0 || bahasaValue > 5 || orisinalitasValue < 0 || orisinalitasValue > 5) {
                        JOptionPane.showMessageDialog(view, "Nilai Alur, Bahasa, dan Orisinalitas harus antara 0-5");
                        return;
                    }
                    double ratingValue = (buku.getAlur() + buku.getBahasa() + buku.getOrisinalitas()) / 3.0;
                    buku.setRating(ratingValue);

                    dao.update(buku);

                    loadTable();
                    view.clearFields();
                    System.out.println("Update Success!");
                } catch (NumberFormatException e) {
                    System.out.println("Format salah: " + e.getMessage());
                    JOptionPane.showMessageDialog(view, "Input Alur, Bahasa, dan Orisinalitas harus berupa angka!", "Format salah", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                System.out.println("Pilih baris dalam tabel untuk update");
            }
        }
    }

    private void insertBuku() {
        try {
 
            ModelBuku buku = new ModelBuku();
            buku.setJudul(view.getJudul());
            buku.setPenulis(view.getPenulis());
            buku.setTahun(view.getTahun());
            buku.setAlur(view.getAlur());
            buku.setBahasa(view.getBahasa());
            buku.setOrisinalitas(view.getOrisinalitas());

            double alurValue = view.getAlur();
            double bahasaValue = view.getBahasa();
            double orisinalitasValue = view.getOrisinalitas();

            if (alurValue < 0 || alurValue > 5 || bahasaValue < 0 || bahasaValue > 5 || orisinalitasValue < 0 || orisinalitasValue > 5) {
                JOptionPane.showMessageDialog(view, "Nilai Alur, Bahasa, dan Orisinalitas harus antara 0-5");
                return;
            }
            double ratingValue = (alurValue + bahasaValue + orisinalitasValue) / 3.0;
            buku.setRating(ratingValue);

            dao.insert(buku);
            
            System.out.println("Book Added");
            loadTable();
            view.clearFields();

        } catch (NumberFormatException e) {
            System.out.println("Format salah: " + e.getMessage());
            JOptionPane.showMessageDialog(view, "Input Alur, Bahasa, dan Orisinalitas harus berupa angka!", "Format salah", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteBuku() {
        int confirm = JOptionPane.showConfirmDialog(view, "Hapus data ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            int row = view.getTable().getSelectedRow();
            if (row != -1) {
                int id = (int) view.getTable().getValueAt(row, 0);
                dao.delete(id);
                loadTable();
            } else {
                System.out.println("Baris belum terpilih!");
            }
        }
    }
}
