package com.example.examplethympagelayout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.UUID;

@Controller
public class IndexController {
    @GetMapping("/notes")
    public String getNotes(){
        return "notes";
    }
    @GetMapping("/layout")
    public String getLayout(){
        return "layout";
    }


    @GetMapping("/edit")
    public ModelAndView updateForm(){
        ModelAndView result = new ModelAndView("noteUpdate");
        Note note = new Note();
        note.setId(UUID.randomUUID());
        note.setName("Test note");
        note.setContent("It`s text of example note");
        note.setAccessType(AssesType.PUBLIC);
        result.addObject("note", note);
        result.addObject("accessTypes", AssesType.values());

        return result;
    }


}
