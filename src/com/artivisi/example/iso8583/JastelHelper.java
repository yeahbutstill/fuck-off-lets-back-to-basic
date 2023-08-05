package com.artivisi.example.iso8583;

import org.apache.commons.lang3.StringUtils;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JastelHelper {
    private JastelHelper() {
        throw new IllegalStateException("Utility class");
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(JastelHelper.class);
    private static final SimpleDateFormat formaterBit7 = new SimpleDateFormat("MMddHHmmss");
    private static final SimpleDateFormat formaterBit12 = new SimpleDateFormat("HHmmss");
    private static final SimpleDateFormat formaterBit1315 = new SimpleDateFormat("MMdd");
    private static final SimpleDateFormat formaterBit48 = new SimpleDateFormat("ddMMyyyy");

    public static ISOMsg createInquiryRequest(String noPelanggan) {
        ISOMsg reqMsg;
        try {
            reqMsg = new ISOMsg();
            reqMsg.setMTI(SYBConstants.MTI_REQ);
            Date sekarang = new Date();
            reqMsg.set(7, formaterBit7.format(sekarang));
            reqMsg.set(11, new RunningNumberGenerator().generateStan());
            reqMsg.set(12, formaterBit12.format(sekarang));
            reqMsg.set(13, formaterBit1315.format(sekarang));
            reqMsg.set(15, formaterBit1315.format(sekarang));
            reqMsg.set(18, SYBConstants.MERCHANT_TYPE);
            reqMsg.set(32, SYBConstants.ACQ_ID_CODE);
            reqMsg.set(37, new RunningNumberGenerator().generateRrn());
            reqMsg.set(41, SYBConstants.TERMINAL_ID);

            Integer panjangData = 20;
            String noPelangganIso = StringUtils.rightPad(noPelanggan, panjangData, " ");

            String bit48 = SYBConstants.PRODUCT_CODE_TELKOM;
            bit48 += "0";
            bit48 += noPelangganIso;
            bit48 += formaterBit48.format(sekarang);
            bit48 += formaterBit12.format(sekarang);
            bit48 += StringUtils.rightPad("", 30, " "); // nama pelanggan blank
            bit48 += SYBConstants.AMOUNT_INQ;
            bit48 += SYBConstants.ADMIN_FEE_INQ;
            bit48 += StringUtils.rightPad("", 32, " "); // ref #1
            bit48 += StringUtils.rightPad("", 32, " "); // ref #2
            bit48 += SYBConstants.SYB_REC_ID_INQ;

            reqMsg.set(48, bit48);
            reqMsg.set(63, SYBConstants.SYB_FORMAT_CODE);

            return reqMsg;
        } catch (ISOException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return null;
    }

}
