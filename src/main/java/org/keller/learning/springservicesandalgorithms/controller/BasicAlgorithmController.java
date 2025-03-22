package org.keller.learning.springservicesandalgorithms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/algo/chapter1")
public class BasicAlgorithmController {

    @GetMapping("/sort")
    public String sort() {
        return "null";
    }
}
