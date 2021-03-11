package minhcuong.com.springboot.controller;

import minhcuong.com.springboot.model.KhachHang;
import minhcuong.com.springboot.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;
    @GetMapping("/khachhang")
    public String index(Model model){
        model.addAttribute("khachhang", khachHangService.listAll());
        return "home";
    }
    @RequestMapping("create")
    public String Create(Model model){
        model.addAttribute("khachHang",new KhachHang());
        return "create";
    }

    @RequestMapping("/delete/{MaKhachHang}")
    public String XoaKhachHang(@PathVariable(name = "MaKhachHang") String MaKhachHang){
        khachHangService.delete(MaKhachHang);
        return "home";
    }
}
