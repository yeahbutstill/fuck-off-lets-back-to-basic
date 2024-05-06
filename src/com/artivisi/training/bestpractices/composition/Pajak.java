package com.artivisi.training.bestpractices.composition;

import java.math.BigDecimal;

public interface Pajak {
    BigDecimal hitungPajak(TransaksiDenganComposition t);
}
