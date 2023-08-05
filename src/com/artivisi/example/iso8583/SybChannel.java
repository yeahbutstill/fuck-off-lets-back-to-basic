package com.artivisi.example.iso8583;

import org.jpos.iso.BaseChannel;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOPackager;
import org.jpos.iso.ISOUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SybChannel extends BaseChannel {

    private static final Integer LENGTH_BYTE = 2;
    private static final Logger LOGGER = LoggerFactory.getLogger(SybChannel.class);

    public SybChannel() {
    }

    public SybChannel(ISOPackager p) throws IOException {
        super(p);
    }

    @Override
    protected int getMessageLength() throws IOException, ISOException {
        byte[] msgLenght = new byte[LENGTH_BYTE];
        serverIn.readFully(msgLenght, 0, LENGTH_BYTE);

        String hexLength = new String(msgLenght);
        LOGGER.debug("Length Data: {}", hexLength);

        Integer length = Integer.parseInt(hexLength, 16);
        LOGGER.debug("Length: {}", length);

        return length;
    }

    @Override
    protected void sendMessageLength(int len) throws IOException {
        int maxLength = 9999;
        if (len > maxLength) throw new IOException("Message to long: " + len);
        try {
            serverOut.write(ISOUtil.zeropad(Integer.toString(len), LENGTH_BYTE).getBytes());
        } catch (ISOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
