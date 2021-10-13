package edu.nyu.wow.service.impl;

import edu.nyu.wow.entity.Payment;
import edu.nyu.wow.mapper.PaymentMapper;
import edu.nyu.wow.service.IPaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MyBatisPlusGenerator
 * @since 2021-10-13
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

}
