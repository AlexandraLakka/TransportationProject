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
public class Stop {
    private String stopName;
    private int lineId;
    private int arrivalToStopRight;
    private int arrivalToStopLeft;
    private int anchorTime;

    public Stop(String stopName, int lineId, int arrivalToStopRight, int arrivalToStopLeft, int anchorTime) {
        this.stopName = stopName;
        this.lineId = lineId;
        this.arrivalToStopRight = arrivalToStopRight;
        this.arrivalToStopLeft = arrivalToStopLeft;
        this.anchorTime = anchorTime;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getArrivalToStopRight() {
        return arrivalToStopRight;
    }

    public void setArrivalToStopRight(int arrivalToStopRight) {
        this.arrivalToStopRight = arrivalToStopRight;
    }

    public int getArrivalToStopLeft() {
        return arrivalToStopLeft;
    }

    public void setArrivalToStopLeft(int arrivalToStopLeft) {
        this.arrivalToStopLeft = arrivalToStopLeft;
    }

    public int getAnchorTime() {
        return anchorTime;
    }

    public void setAnchorTime(int anchorTime) {
        this.anchorTime = anchorTime;
    }        
    Stop stop1 = new Stop("Piraeus L1",1,240,0,180);
    Stop stop2 = new Stop("Faliro L1",1,180,240,30);
    Stop stop3 = new Stop("Moschato L1",1,120,180,30);
    Stop stop4 = new Stop("Kallithea L1",1,120,120,30);
    Stop stop5 = new Stop("Tavros L1",1,120,120,30);
    Stop stop6 = new Stop("Petralona L1",1,120,120,30);
    Stop stop7 = new Stop("Thissio L1",1,120,120,30);
    Stop stop8 = new Stop("Monastiraki L1",1,120,120,30);
    Stop stop9 = new Stop("Omonia L1",1,120,120,60);
    Stop stop10 = new Stop("Victoria L1",1,180,120,30);
    Stop stop11 = new Stop("Attiki L1",1,120,180,60);
    Stop stop12 = new Stop("Aghios Nikolaos L1",1,60,120,30);
    Stop stop13 = new Stop("Kato Patissia L1",1,120,60,30);
    Stop stop14 = new Stop("Aghios Eleftherios L1",1,120,120,30);
    Stop stop15 = new Stop("Ano Patissia L1",1,120,120,30);
    Stop stop16 = new Stop("Perissos L1",1,120,120,30);
    Stop stop17 = new Stop("Pefkakia L1",1,60,120,30);
    Stop stop18 = new Stop("Nea Ionia L1",1,180,60,30);
    Stop stop19 = new Stop("Iraklio L1",1,180,180,30);
    Stop stop20 = new Stop("Irini L1",1,120,180,30);
    Stop stop21 = new Stop("Neratziotissa L1",1,180,120,30);
    Stop stop22 = new Stop("Maroussi L1",1,180,180,30);
    Stop stop23 = new Stop("KAT L1",1,120,180,30);
    Stop stop24 = new Stop("Kifissia L1",1,0,120,180);
    Stop stop25 = new Stop("Elliniko L2",2,60,0,180);
    Stop stop26 = new Stop("Argyroupoli L2",2,60,60,30);
    Stop stop27 = new Stop("Alimos L2",2,120,60,30);
    Stop stop28 = new Stop("Ilioupoli L2",2,120,120,30);
    Stop stop29 = new Stop("Aghios Dimitrios L2",2,120,120,30);
    Stop stop30 = new Stop("Dafni L2",2,120,120,30);
    Stop stop31 = new Stop("Aghios Ioannis L2",2,60,120,30);
    Stop stop32 = new Stop("Neos Kosmos L2",2,120,60,30);
    Stop stop33 = new Stop("Syngrou - Fix L2",2,60,120,30);
    Stop stop34 = new Stop("Acropoli L2",2,120,60,60);
    Stop stop35 = new Stop("Syntagma L2",2,60,120,120);
    Stop stop36 = new Stop("Panepistimio L2",2,120,60,30);
    Stop stop37 = new Stop("Omonia L2",2,120,120,60);
    Stop stop38 = new Stop("Metaxourghio L2",2,120,120,30);
    Stop stop39 = new Stop("Larissa Station L2",2,60,120,60);
    Stop stop40 = new Stop("Attiki L2",2,60,60,60);
    Stop stop41 = new Stop("Sepolia L2",2,60,60,30);
    Stop stop42 = new Stop("Aghios Antonios L2",2,120,60,30);
    Stop stop43 = new Stop("Peristeri L2",2,120,120,60);
    Stop stop44 = new Stop("Anthoupoli L2",2,0,120,120);
    Stop stop45 = new Stop("Doukissis Plakentias L3",3,30,0,120);
    Stop stop46 = new Stop("Halandri L3",3,60,30,30);
    Stop stop47 = new Stop("Aghia Paraskevi L3",3,120,60,30);
    Stop stop48 = new Stop("Nomismatokopio L3",3,60,120,30);
    Stop stop49 = new Stop("Holargos L3",3,120,60,30);
    Stop stop50 = new Stop("Ethniki Amyna L3",3,120,120,30);
    Stop stop51 = new Stop("Katehaki L3",3,120,120,30);
    Stop stop52 = new Stop("Panormou L3",3,180,120,30);
    Stop stop53 = new Stop("Ambelokipi L3",3,120,180,30);
    Stop stop54 = new Stop("Megaro Moussikis L3",3,60,120,30);
    Stop stop55 = new Stop("Evangelismos L3",3,120,60,30);
    Stop stop56 = new Stop("Syntagma L3",3,120,120,120);
    Stop stop57 = new Stop("Monastiraki L3",3,120,120,30);
    Stop stop58 = new Stop("Kerameikos L3",3,120,120,30);
    Stop stop59 = new Stop("Eleonas L3",3,120,120,30);
    Stop stop60 = new Stop("Egaleo L3",3,120,120,60);
    Stop stop61 = new Stop("Aghia Marina L3",3,0,120,120);
    
    public void showStops(String stopName){
        ArrayList<Stop> listOfStops = new ArrayList<>();

        
    }

    public void calculateTime(String startStop, String endStop){
        ArrayList<Stop> listOfStops = new ArrayList<>();
        listOfStops.add(stop1);
        listOfStops.add(stop2);
        listOfStops.add(stop3);
        listOfStops.add(stop4);
        listOfStops.add(stop5);
        listOfStops.add(stop6);
        listOfStops.add(stop7);
        listOfStops.add(stop8);
        listOfStops.add(stop9);
        listOfStops.add(stop10);
        listOfStops.add(stop11);
        listOfStops.add(stop12);
        listOfStops.add(stop13);
        listOfStops.add(stop14);
        listOfStops.add(stop15);
        listOfStops.add(stop16);
        listOfStops.add(stop17);
        listOfStops.add(stop18);
        listOfStops.add(stop19);
        listOfStops.add(stop20);
        listOfStops.add(stop21);
        listOfStops.add(stop22);
        listOfStops.add(stop23);
        listOfStops.add(stop24);
        listOfStops.add(stop25);
        listOfStops.add(stop26);
        listOfStops.add(stop28);
        listOfStops.add(stop29);
        listOfStops.add(stop30);
        listOfStops.add(stop31);
        listOfStops.add(stop32);
        listOfStops.add(stop33);
        listOfStops.add(stop34);
        listOfStops.add(stop35);
        listOfStops.add(stop36);
        listOfStops.add(stop37);
        listOfStops.add(stop38);
        listOfStops.add(stop39);
        listOfStops.add(stop40);
        listOfStops.add(stop41);
        listOfStops.add(stop42);
        listOfStops.add(stop43);
        listOfStops.add(stop44);
        listOfStops.add(stop45);
        listOfStops.add(stop46);
        listOfStops.add(stop47);
        listOfStops.add(stop48);
        listOfStops.add(stop49);
        listOfStops.add(stop50);
        listOfStops.add(stop51);
        listOfStops.add(stop52);
        listOfStops.add(stop53);
        listOfStops.add(stop54);
        listOfStops.add(stop55);
        listOfStops.add(stop56);
        listOfStops.add(stop57);
        listOfStops.add(stop58);
        listOfStops.add(stop59);
        listOfStops.add(stop60);
        listOfStops.add(stop61);
        int time = 0;
        for(Stop s : listOfStops){
            if(s.getStopName().equals(startStop) && s.getStopName().equals(endStop)){
                
                time += s.getArrivalToStopLeft();
            }
        }
    }         
    
}
