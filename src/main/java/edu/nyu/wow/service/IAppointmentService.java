package edu.nyu.wow.service;

import edu.nyu.wow.dao.bo.AppointmentBo;
import edu.nyu.wow.dao.ibo.AppointmentIbo;
import edu.nyu.wow.entity.Appointment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-12-15
 */
public interface IAppointmentService extends IService<Appointment> {

    AppointmentBo newApp(AppointmentIbo appointmentIbo);

}
