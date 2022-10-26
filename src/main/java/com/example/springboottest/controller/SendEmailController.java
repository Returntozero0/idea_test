package com.example.springboottest.controller;

import com.example.springboottest.entity.SimpleEmail;
import com.example.springboottest.service.impl.SendEmailImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("sendEmail")
public class SendEmailController {

    @Autowired
    private SendEmailImpl sendEmail;

    @RequestMapping("simple")
    public void sendEmail(@RequestBody SimpleEmail email){
        sendEmail.sendEmail(email);
    }

}
