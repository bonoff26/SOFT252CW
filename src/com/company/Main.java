package com.company;

public class Main {

    public static void main(String[] args) {
        Data root = Data.getInstance();
        Data.setup();
        Patient[] pat = Data.getPatients();

        Patient patient = pat[0];
        User[] newarray;
        newarray = Data.popObject(pat, patient);

    }
}
