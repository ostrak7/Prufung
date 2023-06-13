package com.example.prufung;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HammingController {

    @GetMapping("/ham")
    public int hamming (@RequestParam int a){
        int counter = 0;


        while (a > 0){
            if(a%10 != 0){
                counter++;
            }
            a = a/10;
        }

        return counter;

    }
}
