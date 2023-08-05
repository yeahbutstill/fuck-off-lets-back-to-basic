package com.artivisi.example.iso8583;

import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SybService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SybService.class);
    private final SybChannel channel = new SybChannel();

    public SybService() {
        // inisialisasi ISOMUX di sini
        channel.setPackager(new SybPackager());
    }

    public void inquiry(String noPelanggan) {
        try {
            ISOMsg req = JastelHelper.createInquiryRequest(noPelanggan);
            channel.connect();
            channel.setTimeout(120);
            channel.send(req);
            ISOMsg resp = channel.receive();
            if (resp == null) {
                throw new IllegalStateException("Tidak mendapatkan respon sampai timeout");
            }
            String respMsg = new String(resp.pack());
            LOGGER.info("Response: {}", respMsg);
        } catch (IOException | ISOException e) {
            LOGGER.error(e.getMessage(), e);
        }
    }
}
