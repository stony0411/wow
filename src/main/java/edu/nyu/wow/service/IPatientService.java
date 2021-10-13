package edu.nyu.wow.service;

import edu.nyu.wow.entity.Patient;
import com.baomidou.mybatisplus.extension.service.IService;
import edu.nyu.wow.ibo.PatientIbo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-10-13
 */
public interface IPatientService extends IService<Patient> {

    /*
    * add a new patient
    */
    void addNewPatient(PatientIbo ibo);
}
