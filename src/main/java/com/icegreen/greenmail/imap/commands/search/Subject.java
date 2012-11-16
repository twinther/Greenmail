package com.icegreen.greenmail.imap.commands.search;

import com.icegreen.greenmail.store.SimpleStoredMessage;

import javax.mail.MessagingException;

/**
 * Created with IntelliJ IDEA.
 * User: twi
 * Date: 16-11-12
 * Time: 12:29
 * To change this template use File | Settings | File Templates.
 */
public class Subject implements Criteria {

    private String subject;

    public Subject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean match(SimpleStoredMessage message) {
        try {
            return message.getMimeMessage().getSubject().contains(subject);
        } catch (MessagingException e) {
            return false;
        }
    }
}
