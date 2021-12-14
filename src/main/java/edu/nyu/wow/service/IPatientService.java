package edu.nyu.wow.service;

import edu.nyu.wow.dao.bo.PatientBo;
import edu.nyu.wow.dao.ibo.PatientIbo;
import edu.nyu.wow.entity.Patient;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.meta.SimpleResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-11-24
 */
public interface IPatientService extends IService<Patient> {

    SimpleResponse<PatientBo> addPatient(PatientIbo patientIbo);

    SimpleResponse<PatientBo> updatePatient(PatientIbo patientIbo);

    SimpleResponse<PatientBo> patientDetail(Long patientId);
}
