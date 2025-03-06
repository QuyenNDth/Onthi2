package service;

import entity.SinhVien;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinhVienServiceTest {
private SinhVienService sinhVienService;
@BeforeEach
    void setUp(){
    sinhVienService = new SinhVienService();
}
@Test
    void addStudentWithValidStudent(){
    SinhVien sv = new SinhVien("1","Quyen",20,9.0f, 2, "CNTT");
    sinhVienService.add(sv);

    assertEquals(1, sinhVienService.getAll().size());
}

@Test
    void addSinhVienWithNull(){
    Exception exception = assertThrows(IllegalArgumentException.class, () -> sinhVienService.add(null));
    assertEquals("sv null", exception.getMessage());
}
@Test
    void addSinhVienInvalidAge(){
    Exception exception = assertThrows(IllegalArgumentException.class, () -> new SinhVien("1","Quyen",20,9.0f, 2, "CNTT"));
    assertEquals("Tuổi phải lớn hơn 18", exception.getMessage());
}
}