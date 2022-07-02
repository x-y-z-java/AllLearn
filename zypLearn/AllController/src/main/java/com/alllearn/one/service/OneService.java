package com.alllearn.one.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * zyp
 * 2021/11/19
 */
@FeignClient(name="zypLearn-one-service")
public interface OneService {
}
