package com.indivaragroup.rumah.floor.logic;

import com.indivaragroup.rumah.floor.dto.CeramicDTO;

public class CeramicLogic {

    public static void showCeramic(CeramicDTO ceramicDTO) {

        System.out.println(ceramicDTO.getNameCeramic());
        System.out.println(ceramicDTO.getTypeCeramic());

        if (ceramicDTO.getNameCeramic().equals("MARMER")) {

            System.out.println("Ini marmer");

        } else {

            System.out.println("ini bukan marmer men");
        }
    }
}