package com.hexq.nms.healthlog.service.impl;

import com.hexq.nms.healthlog.model.HealthLog;
import com.hexq.nms.healthlog.mapper.HealthLogMapper;
import com.hexq.nms.healthlog.service.HealthLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 客户健康信息记录 ServiceImpl
 * @author hexq
 * @date 2018-06-09
 */
@Service
public class HealthLogServiceImpl extends ServiceImpl<HealthLogMapper, HealthLog> implements HealthLogService {

}
