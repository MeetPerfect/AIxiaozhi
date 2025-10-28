package com.ihteima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ihteima.domain.dos.Appointment;

/**
 * ClassName: AppointmentService
 * Package: com.ihteima.service
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 19:40
 * @Version 1.0
 */
public interface AppointmentService extends IService<Appointment> {

    Appointment getOne(Appointment appointment);
}
