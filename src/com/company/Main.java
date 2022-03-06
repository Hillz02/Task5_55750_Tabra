package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        double priceWithoutVat = 9.99;

        System.out.println("Price without VAT:" + priceWithoutVat);

        double priceWithVat = priceWithoutVat * 1.23;
        System.out.println("Price with VAT:" + priceWithVat);

        double valueWithVat = priceWithVat * 10000;
        System.out.println("Value with VAT:" + valueWithVat);

        double priceWithoutVat2 = valueWithVat / 1.23;
        System.out.println("Value without VAT:" + priceWithoutVat2);

        System.out.println();
        System.out.println("Same thing after using Big decimal:");

        BigDecimal dbPriceWithoutVAT = new BigDecimal(val: "9.99")
        System.out.println("Price Without VAT:" + dbPriceWithoutVAT);

        BigDecimal dbPriceWithVAT = dbPriceWithoutVAT.multiply

                (new BigDecimal(val:"1.23"))

        dbPriceWithVAT = dbPriceWithVAT.setScale(newScale: 2,
        BigDecimal.ROUND_HALF_EVEN)
        System.out.println("Price with VAT rounded:" + dbPriceWithVAT);

        BigDecimal dbValueWithVat = dbPriceWithVAT.multiply

                (new BigDecimal(val: 10000));
        System.out.println("Value with VAT:" +dbValueWithVat);

        BigDecimal dbPriceWithoutVat2 = dbValueWithVat.divide
                (new BigDecimal(val: "1.23"),
        BigDecimal.ROUND_HALF_EVEN)


    }
}
