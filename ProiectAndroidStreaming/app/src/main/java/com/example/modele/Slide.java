package com.example.modele;

public class Slide {
    private int Imag;
    private String Titlu;

    public Slide(int imag, String titlu) {
        Imag = imag;
        Titlu = titlu;
    }

    public int getImag() {
        return Imag;
    }

    public String getTitlu() {
        return Titlu;
    }

    public void setImag(int imag) {
        Imag = imag;
    }

    public void setTitlu(String titlu) {
        Titlu = titlu;
    }
}
