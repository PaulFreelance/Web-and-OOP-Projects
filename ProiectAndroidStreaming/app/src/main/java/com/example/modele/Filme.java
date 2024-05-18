package com.example.modele;

public class Filme {
    private String titlu;
    private String descriere;
    private int iconita;
    private String studio;
    private String nota;
    private String streaminglink;
    private String pozaCoperta;

    public Filme(String titlu, int iconita, String pozaCoperta) {
        this.titlu = titlu;
        this.iconita = iconita;
        this.pozaCoperta = pozaCoperta;
    }

    public Filme(String titlu, int iconita, int vicent) {
        this.titlu = titlu;
        this.iconita = iconita;
    }

    public Filme(String titlu, String descriere, int iconita, String studio, String nota, String streaminglink) {
        this.titlu = titlu;
        this.descriere = descriere;
        this.iconita = iconita;
        this.studio = studio;
        this.nota = nota;
        this.streaminglink = streaminglink;
    }

    public String getPozaCoperta() {
        return pozaCoperta;
    }

    public void setPozaCoperta(String pozaCoperta) {
        this.pozaCoperta = pozaCoperta;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getDescriere() {
        return descriere;
    }

    public int getIconita() {
        return iconita;
    }

    public String getStudio() {
        return studio;
    }

    public String getNota() {
        return nota;
    }

    public String getStreaminglink() {
        return streaminglink;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setIconita(int iconita) {
        this.iconita = iconita;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public void setStreaminglink(String streaminglink) {
        this.streaminglink = streaminglink;
    }
}
