package com.example.springboottest.service;

import com.example.springboottest.entity.SimpleEmail;

public interface ISendEmail {
    void sendEmail(SimpleEmail email);
}
