package source;

import static source.Data.patients;

public final class PendingAppointments {
    public static Appointment[] pendingAppointments;

    private PendingAppointments() {

    }

    public static void addAppointment(Appointment item) {
        int NumOfAppointments;
        if (pendingAppointments == null) {
            NumOfAppointments = 0;
        }
        else {
            NumOfAppointments = pendingAppointments.length;
        }

        Appointment[] newArray = new Appointment[NumOfAppointments + 1];
        for (int i = 0; i < NumOfAppointments; i++) {
            newArray[i] = pendingAppointments[i];
        }
        newArray[NumOfAppointments] = item;
        pendingAppointments = newArray;

    }
    
    public static int findByID(int ID) {
        int pos = -1;
        int compare;

        for (int i = 0; i < pendingAppointments.length; i++) {
            compare = i;
            if (compare == i) {
                pos = i;
            }
        }
        return pos;
    }
    
    public static void removeAppointment(Appointment item) {
        if (pendingAppointments == null) {
            
        }
        else {
            Appointment[] newArray = new Appointment[pendingAppointments.length - 1];
            int position = 0;
            for (int i = 0; i < pendingAppointments.length; i++) {
                if (pendingAppointments[i] == item) {
                    position = i;
                }
            }

            for (int i = 0, k = 0; i < pendingAppointments.length; i++) {
                if (i == position) {
                    continue;
                }

                newArray[k++] = pendingAppointments[i];
            }

            pendingAppointments = newArray;
        }

        

    }
}
