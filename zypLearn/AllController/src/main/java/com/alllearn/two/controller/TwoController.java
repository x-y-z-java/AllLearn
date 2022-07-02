package com.alllearn.two.controller;

import com.alllearn.two.service.TwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * zyp
 * 2022/7/2
 */
@Controller
public class TwoController {
    @Autowired
    private TwoService twoService;
}
