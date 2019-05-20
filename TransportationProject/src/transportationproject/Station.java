/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportationproject;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Station {
    private String stationName;
    private String stationType;

    public Station(String stationName, String stationType) {
        this.stationName = stationName;
        this.stationType = stationType;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }        
    Station station1 = new Station("Piraeus","initial/terminal");
    Station station2 = new Station("Faliro","ordinary");
    Station station3 = new Station("Moschato","ordinary");
    Station station4 = new Station("Kallithea","ordinary");
    Station station5 = new Station("Tavros","ordinary");
    Station station6 = new Station("Petralona","ordinary");
    Station station7 = new Station("Thissio","ordinary");
    Station station8 = new Station("Monastiraki","transit");
    Station station9 = new Station("Omonia","transit");
    Station station10 = new Station("Victoria","ordinary");
    Station station11 = new Station("Attiki","ordinary");
    Station station12 = new Station("Aghios Nikolaos","ordinary");
    Station station13 = new Station("Kato Patissia","ordinary");
    Station station14 = new Station("Aghios Eleftherios","ordinary");
    Station station15 = new Station("Ano Patissia","ordinary");
    Station station16 = new Station("Perissos","ordinary");
    Station station17 = new Station("Pefkakia","ordinary");
    Station station18 = new Station("Nea Ionia","ordinary");
    Station station19 = new Station("Iraklio","ordinary");
    Station station20 = new Station("Irini","ordinary");
    Station station21 = new Station("Neratziotissa","ordinary");
    Station station22 = new Station("Maroussi","ordinary");
    Station station23 = new Station("KAT","ordinary");
    Station station24 = new Station("Kifissia","initial/terminal");
    Station station25 = new Station("Elliniko","initial/terminal");
    Station station26 = new Station("Argyroupoli","ordinary");
    Station station27 = new Station("Alimos","ordinary");
    Station station28 = new Station("Ilioupoli","ordinary");
    Station station29 = new Station("Aghios Dimitrios","ordinary");
    Station station30 = new Station("Dafni","ordinary");
    Station station31 = new Station("Aghios Ioannis","ordinary");
    Station station32 = new Station("Neos Kosmos","ordinary");
    Station station33 = new Station("Syngrou - Fix","ordinary");
    Station station34 = new Station("Acropoli","ordinary");
    Station station35 = new Station("Syntagma","transit");
    Station station36 = new Station("Panepistimio","ordinary");
    Station station37 = new Station("Omonia","transit");
    Station station38 = new Station("Metaxourghio","ordinary");
    Station station39 = new Station("Larissa Station","ordinary");
    Station station40 = new Station("Attiki","ordinary");
    Station station41 = new Station("Sepolia","ordinary");
    Station station42 = new Station("Aghios Antonios","ordinary");
    Station station43 = new Station("Peristeri","ordinary");
    Station station44 = new Station("Anthoupoli","initial/terminal");
    Station station45 = new Station("Doukissis Plakentias","initial/terminal");
    Station station46 = new Station("Halandri","ordinary");
    Station station47 = new Station("Aghia Paraskevi","ordinary");
    Station station48 = new Station("Nomismatokopio","ordinary");
    Station station49 = new Station("Holargos","ordinary");
    Station station50 = new Station("Ethniki Amyna","ordinary");
    Station station51 = new Station("Katehaki","ordinary");
    Station station52 = new Station("Panormou","ordinary");
    Station station53 = new Station("Ambelokipi","ordinary");
    Station station54 = new Station("Megaro Moussikis","ordinary");
    Station station55 = new Station("Evangelismos","ordinary");
    Station station56 = new Station("Syntagma","transit");
    Station station57 = new Station("Monastiraki","transit");
    Station station58 = new Station("Kerameikos","ordinary");
    Station station59 = new Station("Eleonas","ordinary");
    Station station60 = new Station("Egaleo","ordinary");
    Station station61 = new Station("Aghia Marina","initial/terminal");
    
    public void showStations(String stationName){
        ArrayList<Station> listOfStations = new ArrayList<>();
        listOfStations.add(station1);
        listOfStations.add(station2);
        listOfStations.add(station3);
        listOfStations.add(station4);
        listOfStations.add(station5);     
        listOfStations.add(station6);
        listOfStations.add(station7);
        listOfStations.add(station8);
        listOfStations.add(station9);
        listOfStations.add(station10);
        listOfStations.add(station11);
        listOfStations.add(station12);
        listOfStations.add(station13);
        listOfStations.add(station14);
        listOfStations.add(station15);
        listOfStations.add(station16);
        listOfStations.add(station17);
        listOfStations.add(station18);
        listOfStations.add(station19);
        listOfStations.add(station20);
        listOfStations.add(station21);
        listOfStations.add(station22);
        listOfStations.add(station23);
        listOfStations.add(station24);
        listOfStations.add(station25);
        listOfStations.add(station26);
        listOfStations.add(station27);
        listOfStations.add(station28);
        listOfStations.add(station29);
        listOfStations.add(station30);
        listOfStations.add(station31);
        listOfStations.add(station32);
        listOfStations.add(station33);
        listOfStations.add(station34);
        listOfStations.add(station35);
        listOfStations.add(station36);
        listOfStations.add(station37);
        listOfStations.add(station38);
        listOfStations.add(station39);
        listOfStations.add(station40);
        listOfStations.add(station41);
        listOfStations.add(station42);
        listOfStations.add(station43);
        listOfStations.add(station44);
        listOfStations.add(station45);
        listOfStations.add(station46);
        listOfStations.add(station47);
        listOfStations.add(station48);
        listOfStations.add(station49);
        listOfStations.add(station50);
        listOfStations.add(station51);
        listOfStations.add(station52);
        listOfStations.add(station53);
        listOfStations.add(station54);
        listOfStations.add(station55);
        listOfStations.add(station56);
        listOfStations.add(station57);
        listOfStations.add(station58);
        listOfStations.add(station59);
        listOfStations.add(station60);
        listOfStations.add(station61);     
        
        for(Station s : listOfStations){
            System.out.println("Station name: " + s.getStationName()
            + ", Station type: " + s.getStationType());
        }
    }
}
