package com.alllearn.two.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * zyp
 * 2021/11/19
 */
@FeignClient(name="zypLearn-two-service")
public interface TwoService {
}
