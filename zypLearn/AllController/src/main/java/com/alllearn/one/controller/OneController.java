package com.alllearn.one.controller;

import com.alllearn.one.service.OneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * zyp
 * 2022/7/2
 */
@Controller
public class OneController {
    @Autowired
    private OneService oneService;
}
