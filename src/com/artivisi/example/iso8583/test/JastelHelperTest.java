package com.artivisi.example.iso8583.test;

import com.artivisi.example.iso8583.JastelHelper;
import com.artivisi.example.iso8583.SybPackager;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOPackager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JastelHelperTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(JastelHelperTest.class);

    @Test
    public void testGenerateInqReq() {
        ISOMsg req = JastelHelper.createInquiryRequest("02188776655");
        ISOPackager packager = new SybPackager();
        assert req != null;
        req.setPackager(packager);
        String hasil = " ";
        try {
            hasil = new String(req.pack());
        } catch (ISOException e) {
            LOGGER.error(e.getMessage(), e);
        }

        LOGGER.info("Hasil: {}", hasil);
    }
}
