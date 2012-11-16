package com.icegreen.greenmail.imap.commands.search;

import com.icegreen.greenmail.store.SimpleStoredMessage;

import javax.mail.Flags;

/**
 * Created with IntelliJ IDEA.
 * User: twi
 * Date: 16-11-12
 * Time: 12:27
 * To change this template use File | Settings | File Templates.
 */
public class Unseen implements Criteria {

    @Override
    public boolean match(SimpleStoredMessage message) {
        return !message.getFlags().contains(Flags.Flag.SEEN);
    }
}
