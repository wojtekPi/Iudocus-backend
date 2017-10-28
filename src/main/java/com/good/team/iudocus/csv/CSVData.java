package com.good.team.iudocus.csv;

public class CSVData {
    private String idAddres;
    private String streetName;
    private String nrOfTheBuilding;
    private String date;
    private String place;
    private String typeOfPlace;
    private String surfaceCondition;
    private String marking;
    private String lighting;
    private String conditions;
    private String accident;
    private int numberOfParticipants;
    private int ageOfPerperator;
    private String carOfPerperator;
    private int ageOfPedestriant;
    private int numberOfSlightWounded;
    private int numberOfHeavilyInjured;
    private int numberOfKilled;

    public String getIdAddres() {
        return idAddres;
    }

    public void setIdAddres(String idAddres) {
        this.idAddres = idAddres;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getNrOfTheBuilding() {
        return nrOfTheBuilding;
    }

    public void setNrOfTheBuilding(String nrOfTheBuilding) {
        this.nrOfTheBuilding = nrOfTheBuilding;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTypeOfPlace() {
        return typeOfPlace;
    }

    public void setTypeOfPlace(String typeOfPlace) {
        this.typeOfPlace = typeOfPlace;
    }

    public String getSurfaceCondition() {
        return surfaceCondition;
    }

    public void setSurfaceCondition(String surfaceCondition) {
        this.surfaceCondition = surfaceCondition;
    }

    public String getMarking() {
        return marking;
    }

    public void setMarking(String marking) {
        this.marking = marking;
    }

    public String getLighting() {
        return lighting;
    }

    public void setLighting(String lighting) {
        this.lighting = lighting;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public int getAgeOfPerperator() {
        return ageOfPerperator;
    }

    public void setAgeOfPerperator(int ageOfPerperator) {
        this.ageOfPerperator = ageOfPerperator;
    }

    public String getCarOfPerperator() {
        return carOfPerperator;
    }

    public void setCarOfPerperator(String carOfPerperator) {
        this.carOfPerperator = carOfPerperator;
    }

    public int getAgeOfPedestriant() {
        return ageOfPedestriant;
    }

    public void setAgeOfPedestriant(int ageOfPedestriant) {
        this.ageOfPedestriant = ageOfPedestriant;
    }

    public int getNumberOfSlightWounded() {
        return numberOfSlightWounded;
    }

    public void setNumberOfSlightWounded(int numberOfSlightWounded) {
        this.numberOfSlightWounded = numberOfSlightWounded;
    }

    public int getNumberOfHeavilyInjured() {
        return numberOfHeavilyInjured;
    }

    public void setNumberOfHeavilyInjured(int numberOfHeavilyInjured) {
        this.numberOfHeavilyInjured = numberOfHeavilyInjured;
    }

    public int getNumberOfKilled() {
        return numberOfKilled;
    }

    public void setNumberOfKilled(int numberOfKilled) {
        this.numberOfKilled = numberOfKilled;
    }

    @Override
    public String toString() {
        return "CSVData{" +
                "idAddres='" + idAddres + '\'' +
                ", streetName='" + streetName + '\'' +
                ", nrOfTheBuilding='" + nrOfTheBuilding + '\'' +
                ", date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", typeOfPlace='" + typeOfPlace + '\'' +
                ", surfaceCondition='" + surfaceCondition + '\'' +
                ", marking='" + marking + '\'' +
                ", lighting='" + lighting + '\'' +
                ", conditions='" + conditions + '\'' +
                ", accident='" + accident + '\'' +
                ", numberOfParticipants=" + numberOfParticipants +
                ", ageOfPerperator=" + ageOfPerperator +
                ", carOfPerperator='" + carOfPerperator + '\'' +
                ", ageOfPedestriant=" + ageOfPedestriant +
                ", numberOfSlightWounded=" + numberOfSlightWounded +
                ", numberOfHeavilyInjured=" + numberOfHeavilyInjured +
                ", numberOfKilled=" + numberOfKilled +
                '}';
    }
}
