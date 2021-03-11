package minhcuong.com.springboot.service;

import minhcuong.com.springboot.model.KhachHang;
import minhcuong.com.springboot.repository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class KhachHangService {
    @Autowired
    private KhachHangRepository khachHangRepository;
    public List<KhachHang> listAll(){

        return khachHangRepository.findAll();
    }
    public void save(KhachHang khachHang){
        khachHangRepository.save(khachHang);
    }
    public KhachHang get(String MaKhachHang){
        return khachHangRepository.findById(MaKhachHang).get();
    }
    public void delete(String MaKhachHang){
        khachHangRepository.deleteById(MaKhachHang);
    }
}
