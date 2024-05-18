package com.example.modele;

public class Cast {
    String nume;
    int imag_link;

    public Cast(String nume, int imag_link) {
        this.nume = nume;
        this.imag_link = imag_link;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getImag_link() {
        return imag_link;
    }

    public void setImag_link(int imag_link) {
        this.imag_link = imag_link;
    }
}
