package source;

public class Patient extends User implements IIdStrategy{

    private Appointment[] appointments;
    private Appointment[] oldAppointments;
    private Prescription[] prescriptions;
    private Doctor doctor;


    public Patient() {
        getNextID("Patient");
    }
    
    public Patient(String option) {
        if (option == "request") {
            setId(getNewID("Patient"));
        }
        else {
            
        }
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    public void addPrescription(Prescription input) {
        int Length;
        if (prescriptions == null) {
            Length = 0;
        }
        else {
            Length = prescriptions.length;
        }

        Prescription[] newArray = new Prescription[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = prescriptions[i];
        }
        newArray[Length] = input;
        prescriptions = newArray;
    }
    
    public void addAppointment(Appointment input) {
        int Length;
        if (appointments == null) {
            Length = 0;
        }
        else {
            Length = appointments.length;
        }

        Appointment[] newArray = new Appointment[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = appointments[i];
        }
        newArray[Length] = input;
        appointments = newArray;
    }

    public void viewHistory() {

    }

    public String viewPrescription() {
        return prescriptions[0].getNotes();
    }

    public void requestTermination() {

    }

    public void viewPatient() {

    }
    
    public String getId() {
        return id;
    }

    public Appointment[] getAppointments() {
        return appointments;
    }

    public Appointment[] getOldAppointments() {
        return oldAppointments;
    }

    public Prescription[] getPrescriptions() {
        return prescriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAppointments(Appointment[] appointments) {
        this.appointments = appointments;
    }

    public void setOldAppointments(Appointment[] oldAppointments) {
        this.oldAppointments = oldAppointments;
    }

    public void setPrescriptions(Prescription[] prescriptions) {
        this.prescriptions = prescriptions;
    }
    
    
}
