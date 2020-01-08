package com.company;

public class Patient extends User {

    private Appointment[] appointments;
    private Appointment[] prescriptions;


    public Patient() {
        setId(getNewID("Patient"));
    }

    private void reviewDoctor(Doctor doc, String feedback, int rating) {
        Review review = new Review();
        review.setDoctor(doc);
        review.setFeedback(feedback);
        review.setPatient(this);
        review.setRating(rating);
    }

    public void viewDoctor(Doctor doc) {

    }

    public void requestAppointment(Doctor doc, String notes, String time) {
        Appointment appnt = new Appointment();
        appnt.setDoctor(doc);
        appnt.setNotes(notes);
        appnt.setTime(time);
        appnt.setPatient(this);
        PendingAppointments.addAppointment(appnt);
    }



    public void viewHistory() {

    }

    public void viewPrescription() {

    }

    public void requestTermination() {

    }

    public void viewPatient() {

    }
}
