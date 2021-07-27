package com.examplestage.demoExpleStage.controller;

import com.examplestage.demoExpleStage.data.MessageDAO;
import com.examplestage.demoExpleStage.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RestController
@Controller
public class Messagecontroller {
    @Autowired
     private MessageDAO messageDAO;


     @GetMapping("/msg")
    public String showMessage (Model model){
        model.addAttribute("msglist",messageDAO.findAll());
        model.addAttribute("message", new Message());
        return "MsgPage";
    }
    @PostMapping("/msg")
    public String getMessage(@ModelAttribute Message newMessage){
       Message msg = new Message(newMessage.getAuteur(), newMessage.getMessage());

       messageDAO.save(msg);
      return "redirect:msg";

    }
}
