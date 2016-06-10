package com.pe.pescarcena.model;

import com.pe.pescarcena.entity.Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 6/6/16.
 */
public class ClientModel {
    private static final ArrayList<Client> clients =
            new ArrayList<Client>(Arrays.asList(
                    new Client("CLI001", "Renault", "16 allée des Peupliers", "Tourcoing"),
                    new Client("CLI002", "Singer", "87 avenue des Platanes", "Paris"),
                    new Client("CLI003", "Canon", "125 rue des Fraises", "Marseille"),
                    new Client("CLI004", "Orange", "36 allée des Templiers", "Orleans"),
                    new Client("CLI005", "SFR", "43 impasse du Baron", "Nantes"),
                    new Client("CLI006", "Lyonnaise des eaux", "58 tour des Cieux", "Montpellier"),
                    new Client("CLI007", "Veolia", "63 rue des Allouettes", "Avignon"),
                    new Client("CLI008", "Avensys", "17 allée des Pigeons", "Toulouse"),
                    new Client("CLI009", "Cultura", "2 avenue des Amandiers", "Angers"),
                    new Client("CLI010", "Histoire d'or", "55 tour des Moulins", "Mulhouse"),
                    new Client("CLI011", "Cap Gemini", "654 avenue du Fond", "Perpignan"),
                    new Client("CLI012", "Free", "39 rue des oiseaux", "Niort"),
                    new Client("CLI013", "Citroën", "43 impasse des Marins", "Roubais"),
                    new Client("CLI014", "HP", "24 tour des Vins", "Strasbourg"),
                    new Client("CLI015", "Yamaha", "69 chemin des Vaisseliers", "Limoges"),
                    new Client("CLI016", "Royal Post", "245 allée des Platanes", "Nice"),
                    new Client("CLI017", "Royal canin", "25 tour des Parfums", "Aix en Provence"),
                    new Client("CLI018", "Rivoire & Carré", "67 rue des Fruits", "Orange"),
                    new Client("CLI019", "Hays", "18 allée des Arênes", "Nîmes"),
                    new Client("CLI020", "Total", "11 passage Wilson", "Evry"),
                    new Client("CLI021", "Crédit Agricole", "20 allée Jean-Moulin", "Dijon"),
                    new Client("CLI022", "Vinci", "369 avenue Descartes", "Nancy"),
                    new Client("CLI023", "Bouygues", "77 tour de Lyon", "Bordeaux"),
                    new Client("CLI024", "Alstom", "66 passage sans issue", "Toulouse"),
                    new Client("CLI025", "Sanofi Aventis", "55 chemin Paul Valery", "Poitiers")
            ));

    public static Client getClient(String clientCode) {
        for (Client client : clients) {
            if (client.getClientCode().equals(clientCode)) {
                return client;
            }
        }
        return null;
    }

    public static List<Client> getClientsByName(String pieceOfName) {
        List<Client> clientsByName = new ArrayList<Client>();
        for (Client client : clients) {
            if (client.getName().toLowerCase().startsWith(pieceOfName.toLowerCase()))
                clientsByName.add(client);
        }
        return clientsByName;
    }

}