package com.example.springboottest.service.impl;


import com.example.springboottest.entity.SimpleEmail;
import com.example.springboottest.service.ISendEmail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SendEmailImpl implements ISendEmail {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(SimpleEmail email) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("2094962069@qq.com");
        message.setSubject(email.getSubject());
        message.setText(email.getContent());
        message.setTo(email.getTos());
        mailSender.send(message);
    }
}
