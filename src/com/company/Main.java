package com.company;

public class Main {

    public static void main(String[] args) {
        Data root = Data.getInstance();
        root.setup();
        Prescription prescription = new Prescription();
        prescription.setNotes("Test");
        root.patients[1].addPrescription(prescription);
        String msg;
        msg = root.patients[1].viewPrescription();
        System.out.println(msg);
    }
}
