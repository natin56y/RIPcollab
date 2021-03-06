package esgi.project.ripcollab;

import java.io.Serializable;

public class Trajet implements Serializable {

    private int idTrajet;
    private int idClient;
    private int idChauffeur;
    private String heureDebut;
    private String heureFin;
    private String dateResevation;
    private int distanceTrajet;
    private double prixtrajet;
    private String debut;
    private String fin;
    private String duration;
    private String state;
    private int stateDriver;
    private int aboveStartTime;

    public Trajet(int idTrajet, int idClient, int idChauffeur, String heureDebut, String heureFin, String dateResevation, int distanceTrajet, double prixtrajet, String debut, String fin, String duration, String state, int stateDriver, int aboveStartTime) {
        this.idTrajet = idTrajet;
        this.idClient = idClient;
        this.idChauffeur = idChauffeur;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.dateResevation = dateResevation;
        this.distanceTrajet = distanceTrajet;
        this.prixtrajet = prixtrajet;
        this.debut = debut;
        this.fin = fin;
        this.duration = duration;
        this.state = state;
        this.stateDriver = stateDriver;
        this.aboveStartTime = aboveStartTime;
    }

    @Override
    public String toString() {
        return "Trajet{" +
                "idTrajet=" + idTrajet +
                ", idClient=" + idClient +
                ", idChauffeur=" + idChauffeur +
                ", heureDebut='" + heureDebut + '\'' +
                ", heureFin='" + heureFin + '\'' +
                ", dateResevation='" + dateResevation + '\'' +
                ", distanceTrajet=" + distanceTrajet +
                ", prixtrajet=" + prixtrajet +
                ", debut='" + debut + '\'' +
                ", fin='" + fin + '\'' +
                ", duration='" + duration + '\'' +
                ", state='" + state + '\'' +
                ", stateDriver=" + stateDriver +
                '}';
    }

    public int getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(int idTrajet) {
        this.idTrajet = idTrajet;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdChauffeur() {
        return idChauffeur;
    }

    public void setIdChauffeur(int idChauffeur) {
        this.idChauffeur = idChauffeur;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public String getDateResevation() {
        return dateResevation;
    }

    public void setDateResevation(String dateResevation) {
        this.dateResevation = dateResevation;
    }

    public int getDistanceTrajet() {
        return distanceTrajet;
    }

    public void setDistanceTrajet(int distanceTrajet) {
        this.distanceTrajet = distanceTrajet;
    }

    public double getPrixtrajet() {
        return prixtrajet;
    }

    public void setPrixtrajet(float prixtrajet) {
        this.prixtrajet = prixtrajet;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getStateDriver() {
        return stateDriver;
    }

    public void setStateDriver(int stateDriver) {
        this.stateDriver = stateDriver;
    }

    public void setPrixtrajet(double prixtrajet) {
        this.prixtrajet = prixtrajet;
    }

    public int getAboveStartTime() {
        return aboveStartTime;
    }

    public void setAboveStartTime(int aboveStartTime) {
        this.aboveStartTime = aboveStartTime;
    }
}
