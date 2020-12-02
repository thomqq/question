package net.arxsoft.question.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionManagerController {

    @GetMapping("add")
    String addQuestion() {
        return "addQuestion";
    }
}
