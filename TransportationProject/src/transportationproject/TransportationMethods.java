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
public class TransportationMethods {
    Line line1 = new Line("Piraeus-Kifissia",1,360,1000,"Piraeus");
    Line line2 = new Line("Piraeus-Kifissia",1,360,1000,"Faliro");
    Line line3 = new Line("Piraeus-Kifissia",1,360,1000,"Moschato");
    Line line4 = new Line("Piraeus-Kifissia",1,360,1000,"Kallithea");
    Line line5 = new Line("Piraeus-Kifissia",1,360,1000,"Tavros");
    Line line6 = new Line("Piraeus-Kifissia",1,360,1000,"Petralona");
    Line line7 = new Line("Piraeus-Kifissia",1,360,1000,"Thissio");
    Line line8 = new Line("Piraeus-Kifissia",1,360,1000,"Monastiraki");
    Line line9 = new Line("Piraeus-Kifissia",1,360,1000,"Omonia");
    Line line10 = new Line("Piraeus-Kifissia",1,360,1000,"Victoria");
    Line line11 = new Line("Piraeus-Kifissia",1,360,1000,"Attiki");
    Line line12 = new Line("Piraeus-Kifissia",1,360,1000,"Aghios Nikolaos");
    Line line13 = new Line("Piraeus-Kifissia",1,360,1000,"Kato Patissia");
    Line line14 = new Line("Piraeus-Kifissia",1,360,1000,"Aghios Eleftherios");
    Line line15 = new Line("Piraeus-Kifissia",1,360,1000,"Ano Patissia");
    Line line16 = new Line("Piraeus-Kifissia",1,360,1000,"Perissos");
    Line line17 = new Line("Piraeus-Kifissia",1,360,1000,"Pefkakia");
    Line line18 = new Line("Piraeus-Kifissia",1,360,1000,"Nea Ionia");
    Line line19 = new Line("Piraeus-Kifissia",1,360,1000,"Iraklio");
    Line line20 = new Line("Piraeus-Kifissia",1,360,1000,"Irini");
    Line line21 = new Line("Piraeus-Kifissia",1,360,1000,"Neratziotissa");
    Line line22 = new Line("Piraeus-Kifissia",1,360,1000,"Maroussi");
    Line line23 = new Line("Piraeus-Kifissia",1,360,1000,"KAT");
    Line line24 = new Line("Piraeus-Kifissia",1,360,1000,"Kifissia");
    Line line25 = new Line("Elliniko-Anthoupoli",2,300,1030,"Elliniko");
    Line line26 = new Line("Elliniko-Anthoupoli",2,300,1030,"Argyroupoli");
    Line line27 = new Line("Elliniko-Anthoupoli",2,300,1030,"Alimos");
    Line line28 = new Line("Elliniko-Anthoupoli",2,300,1030,"Ilioupoli");
    Line line29 = new Line("Elliniko-Anthoupoli",2,300,1030,"Aghios Dimitrios");
    Line line30 = new Line("Elliniko-Anthoupoli",2,300,1030,"Dafni");
    Line line31 = new Line("Elliniko-Anthoupoli",2,300,1030,"Aghios Ioannis");
    Line line32 = new Line("Elliniko-Anthoupoli",2,300,1030,"Neos Kosmos");
    Line line33 = new Line("Elliniko-Anthoupoli",2,300,1030,"Syngrou - Fix");
    Line line34 = new Line("Elliniko-Anthoupoli",2,300,1030,"Acropoli");         
    Line line35 = new Line("Elliniko-Anthoupoli",2,300,1030,"Syntagma");
    Line line36 = new Line("Elliniko-Anthoupoli",2,300,1030,"Panepistimio");
    Line line37 = new Line("Elliniko-Anthoupoli",2,300,1030,"Omonia");
    Line line38 = new Line("Elliniko-Anthoupoli",2,300,1030,"Metaxourghio");
    Line line39 = new Line("Elliniko-Anthoupoli",2,300,1030,"Larissa Station");
    Line line40 = new Line("Elliniko-Anthoupoli",2,300,1030,"Attiki");
    Line line41 = new Line("Elliniko-Anthoupoli",2,300,1030,"Sepolia");
    Line line42 = new Line("Elliniko-Anthoupoli",2,300,1030,"Aghios Antonios");
    Line line43 = new Line("Elliniko-Anthoupoli",2,300,1030,"Peristeri");
    Line line44 = new Line("Elliniko-Anthoupoli",2,300,1030,"Anthoupoli");
    Line line45 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Doukissis Plakentias");
    Line line46 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Halandri");
    Line line47 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Aghia Paraskevi");
    Line line48 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Nomismatokopio");
    Line line49 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Holargos");
    Line line50 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Ethniki Amyna");
    Line line51 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Katehaki");
    Line line52 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Panormou");
    Line line53 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Ambelokipi");
    Line line54 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Megaro Moussikis");
    Line line55 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Evangelismos");
    Line line56 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Syntagma");
    Line line57 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Monastiraki");
    Line line58 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Kerameikos");
    Line line59 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Eleonas");
    Line line60 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Egaleo");
    Line line61 = new Line("Doukissis Plakentias-Aghia Marina",3,300,1030,"Aghia Marina");

    public void showLines(String lineName){
        String l1 = "Piraeus-Kifissia";
        String l2 = "Elliniko-Anthoupoli";
        String l3 = "Doukissis Plakentias-Aghia Marina";
        ArrayList<Line> listOfLines = new ArrayList<>();
        if(lineName.equals(l1)){
            listOfLines.add(line1);
            listOfLines.add(line2);
            listOfLines.add(line3);
            listOfLines.add(line4);
            listOfLines.add(line5);
            listOfLines.add(line6);
            listOfLines.add(line7);
            listOfLines.add(line8);
            listOfLines.add(line9);
            listOfLines.add(line10);
            listOfLines.add(line11);
            listOfLines.add(line12);
            listOfLines.add(line13);
            listOfLines.add(line14);
            listOfLines.add(line15);
            listOfLines.add(line16);
            listOfLines.add(line17);
            listOfLines.add(line18);
            listOfLines.add(line19);
            listOfLines.add(line20);
            listOfLines.add(line21);
            listOfLines.add(line22);
            listOfLines.add(line23);
            listOfLines.add(line24);
            System.out.println("Array is filled");
        }else{
            if(lineName.equals(l2)){
                listOfLines.add(line25);
                listOfLines.add(line26);
                listOfLines.add(line27);
                listOfLines.add(line28);
                listOfLines.add(line29);
                listOfLines.add(line30);
                listOfLines.add(line31);
                listOfLines.add(line32);
                listOfLines.add(line33);
                listOfLines.add(line34);
                listOfLines.add(line35);
                listOfLines.add(line36);
                listOfLines.add(line37);
                listOfLines.add(line38);
                listOfLines.add(line39);
                listOfLines.add(line40);
                listOfLines.add(line41);
                listOfLines.add(line42);
                listOfLines.add(line43);
                System.out.println("Array is filled");
            }else{
                if(lineName.equals(l3)){
                   listOfLines.add(line44);
                   listOfLines.add(line45);
                   listOfLines.add(line46);
                   listOfLines.add(line47);
                   listOfLines.add(line48);
                   listOfLines.add(line49);
                   listOfLines.add(line50);
                   listOfLines.add(line51);
                   listOfLines.add(line52);
                   listOfLines.add(line53);
                   listOfLines.add(line54);
                   listOfLines.add(line55);
                   listOfLines.add(line56);
                   listOfLines.add(line57);
                   listOfLines.add(line58);
                   listOfLines.add(line59);
                   listOfLines.add(line60);
                   System.out.println("Array is filled");
                }else{
                    if(!(lineName.equals(l1)) || !(lineName.equals(l2)) || !(lineName.equals(l3))){
                        System.out.println("Please enter a valid line name.");
                    }
                }
            }
        }
        for(Line line : listOfLines){
            System.out.println("Line name:" + line.getLineName() + ", Line Id:" + line.getLineId() 
                    + ", Depaure Frequency:" + line.getDepartureFrequency()
                    + ", Train capacity:" + line.getTrainCapacity() 
                    + ", Station name:" + line.getStatName());
        }
    }
}

