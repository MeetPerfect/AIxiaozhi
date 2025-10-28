package com.ihteima;

import com.ihteima.domain.dos.Appointment;
import com.ihteima.service.AppointmentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: AppointmentTest
 * Package: com.ihteima
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 19:46
 * @Version 1.0
 */
@SpringBootTest
public class AppointmentTest {
    
    @Autowired
    private AppointmentService appointmentService;
    
    @Test
    public void test() {
        Appointment appointment = Appointment.builder()
                .username("张三")
                .idCard("123456789012345678")
                .department("内科")
                .date("2025-04-14")
                .time("上午")
                .build();

        Appointment appointmentDB = appointmentService.getOne(appointment);
        System.out.println(appointmentDB);
    }
    
    @Test
    public void test1(){
        Appointment appointment = new Appointment();
        appointment.setUsername("张三");
        appointment.setIdCard("123456789012345678");
        appointment.setDepartment("内科");
        appointment.setDate("2025-04-14");
        appointment.setTime("上午");

        appointment.setDoctorName("张医生");
        appointmentService.save(appointment);
    }

    @Test
    void testRemoveById() {
        appointmentService.removeById(1L);
    }
}
