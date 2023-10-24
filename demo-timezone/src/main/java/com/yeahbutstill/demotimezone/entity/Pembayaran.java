package com.yeahbutstill.demotimezone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Pembayaran {
    @Id
    @UuidGenerator
    private String id;

    private LocalDateTime waktuTransaksi = LocalDateTime.now();
    private String keterangan;
    private BigDecimal nilai;
}
