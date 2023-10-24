package com.yeahbutstill.demotimezone.controller;

import com.yeahbutstill.demotimezone.dao.PembayaranDao;
import com.yeahbutstill.demotimezone.entity.Pembayaran;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PembayaranController {

    private final PembayaranDao pembayaranDao;

    public PembayaranController(PembayaranDao pembayaranDao) {
        this.pembayaranDao = pembayaranDao;
    }

    @PostMapping("/api/pembayaran")
    @ResponseStatus(HttpStatus.CREATED)
    public void simpan(@RequestBody Pembayaran pembayaran) {
        pembayaranDao.save(pembayaran);
    }

    @GetMapping("/api/pembayaran")
    public Iterable<Pembayaran> dataPembayaran() {
        return pembayaranDao.findAll();
    }
}
