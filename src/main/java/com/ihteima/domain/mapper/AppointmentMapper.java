package com.ihteima.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ihteima.domain.dos.Appointment;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: AppointmentMapper
 * Package: com.ihteima.mapper
 * Description:
 *
 * @Auther gongkaiming
 * @Create 2025/10/28 19:37
 * @Version 1.0
 */
@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment> {
    
}
