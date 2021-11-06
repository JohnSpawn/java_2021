package com.hell.tuto.enregistrementlocal;

import java.util.List;
import java.util.stream.Collectors;

public class Client {

    List<Client> findTopClient(List<Client> clients, int annee){
        //enregistrement local;
        record ClientAchat(Client client, double montant){};

        return clients.stream()
                // stock dans enregistrement local
                .map(c -> new ClientAchat(c, calculMontantAchat(c, annee)))

                // tri pour classer chaque montant
                .sorted((r1, r2) -> Double.compare(r1.montant, r2.montant))

                // Récupération du client
                .map(ClientAchat::client)

                //Collect des clients dans une liste
                .collect(Collectors.toList());
    }

    private double calculMontantAchat(Client c, int annee) {
        // TODO
        return 0;
    }
}
