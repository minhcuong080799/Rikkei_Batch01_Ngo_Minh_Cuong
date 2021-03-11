package minhcuong.com.springboot.repository;

import minhcuong.com.springboot.model.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {

}
