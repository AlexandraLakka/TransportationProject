/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportationproject;

/**
 *
 * @author User
 */
public class Line {
    private String lineName;
    private int lineId;
    private int departureFrequency;
    private int trainCapacity;
    private String statName;

    public Line(String lineName, int lineId, int departureFrequency, int trainCapacity, String statName) {
        this.lineName = lineName;
        this.lineId = lineId;
        this.departureFrequency = departureFrequency;
        this.trainCapacity = trainCapacity;
        this.statName = statName;
    }
    public Line(String lineName) {
        this.lineName = lineName;
    }

    
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getDepartureFrequency() {
        return departureFrequency;
    }

    public void setDepartureFrequency(int departureFrequency) {
        this.departureFrequency = departureFrequency;
    }

    public int getTrainCapacity() {
        return trainCapacity;
    }

    public void setTrainCapacity(int trainCapacity) {
        this.trainCapacity = trainCapacity;
    }
    
    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName;
    }
    
}   
