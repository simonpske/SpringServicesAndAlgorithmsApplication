package org.keller.learning.springservicesandalgorithms.controller;

import org.keller.learning.springservicesandalgorithms.service.BasicAlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/algo/chapter1")
public class BasicAlgorithmController {

    @Autowired
    BasicAlgorithmService basicAlgorithmService;

    @GetMapping("/sort")
    public String sort() {
        return "null";
    }
}
