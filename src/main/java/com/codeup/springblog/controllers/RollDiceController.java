package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RollDiceController {
    @GetMapping("/roll-dice")
    public String diceRoll() {
        return "roll-dice";
    }

//    @GetMapping("/roll-dice/{n}")
//    public String diceRollReturn() {
//
//    }
}
