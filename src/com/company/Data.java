package com.company;

import com.company.Appointment;

import java.lang.reflect.Array;

public final class Data {

    private static Data instance;

    public static Patient[] patients;

    private static int[] nextID;

    private Data() {

    }

    public static void setup() {
        nextID = new int[4];
        patients = new Patient[5];
        for (int i = 0; i < patients.length; i++) {
            patients[i] = new Patient();
        }
        Doctor doc = new Doctor();
        patients[2].requestAppointment(doc, "Notes", "2 0 clock");
    }

    public static void increment(int num) {
        nextID[num]++;
    }

    public static int getNextID(int num) {
        return nextID[num];
    }

    public static int[] getNextIDArray() {
        return nextID;
    }

    public static User[] popObject(User[] array, User item) {
        if (array == null) {
            return array;
        }

        User[] newArray = new User[array.length - 1];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                position = i;
            }
        }

        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == position) {
                continue;
            }

            newArray[k++] = array[i];
        }

        return newArray;
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

    public static void setInstance(Data instance) {
        Data.instance = instance;
    }

    public static Patient[] getPatients() {
        return patients;
    }

    public static int[] getNextID() {
        return nextID;
    }

}
