package com.hexq.nms.customer.service.impl;

import com.hexq.nms.customer.model.Customer;
import com.hexq.nms.customer.mapper.CustomerMapper;
import com.hexq.nms.customer.service.CustomerService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 客户 ServiceImpl
 * @author hexq
 * @date 2018-06-06
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    @Override
    public String getCustomerYysId(String customerId) {
        Customer customer = selectById(customerId);
        return customer.getUserId();
    }
}
