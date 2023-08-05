package com.artivisi.example.iso8583.simulator;

import com.artivisi.example.iso8583.SybChannel;
import com.artivisi.example.iso8583.SybPackager;
import org.jpos.iso.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SybSimulator {
    private static final Logger LOGGER = LoggerFactory.getLogger(SybSimulator.class);
    public static void main(String[] args) {
        try {
            ISOServer server = new ISOServer(10000, new SybChannel(new SybPackager()), null);
            server.addISORequestListener(new ISORequestListener() {
                @Override
                public boolean process(ISOSource sender, ISOMsg req) {
                    try {
                        String strReq = new String(req.pack());
                        LOGGER.info("Request {}", strReq);
                        ISOMsg resp = (ISOMsg) req.clone();
                        resp.set(39, "00");
                        sender.send(resp);

                        return true;
                    } catch (IOException | ISOException e) {
                        LOGGER.error(e.getMessage(), e);
                    }
                    return false;
                }
            });

            new Thread(server).start();
            LOGGER.info("Server ready di port {}", server);
        } catch (IOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
