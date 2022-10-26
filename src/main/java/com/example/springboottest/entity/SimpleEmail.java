package com.example.springboottest.entity;


import lombok.Data;

@Data
public class SimpleEmail {
    /**

     * 主题
     */
    private String subject;

    /**

     * 主题内容
     */
    private String content;

    /**

     * 接收人邮箱列表
     */
    private String[] tos;
}
