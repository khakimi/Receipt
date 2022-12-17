package com.khakimi.receipt.controller;

import com.khakimi.receipt.dto.CheckDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/check")
@RestController
public class CheckController {

    @GetMapping
    public String getCheck(@RequestBody CheckDto checkDto) {
        return checkDto.toString() + "\n";
    }
}
