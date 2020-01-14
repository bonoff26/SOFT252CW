package source;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public final class Data {

    private static Data instance;

    public static Patient[] patients;
    public static Patient[] terminations;
    public static Review[] reviews;
    public static Doctor[] doctors;
    public static Medicine[] medicines;
    public static Admin[] admins;
    public static Secretary[] secretaries;
    public static String activeID;
    public static String currentUserID;

    private static int[] nextID;
    
    public static Patient[] requests;

    private Data() {

    }

    public static void setup() throws IOException, FileNotFoundException, ParseException {
          
        //loadUsers();
        
        saveUsers();
        
        currentUserID = "";
        nextID = new int[4];
        nextID[0] = 1;
        nextID[1] = 1;
        nextID[2] = 1;
        nextID[3] = 1;
        patients = new Patient[3];
        doctors = new Doctor[3];
        admins = new Admin[1];
        secretaries = new Secretary[1];
        medicines = new Medicine[10];
        secretaries[0] = new Secretary();
        secretaries[0].setPassword("123");
        for (int i = 0; i < patients.length; i++){
            patients[i] = new Patient();
            patients[i].setName("Dave" + i);
            patients[i].setAddress("Address" + i);
            patients[i].setEmail("Email" + i);
            patients[i].setPhoneNumber(123456);
            patients[i].setPassword("password");
            doctors[i] = new Doctor();
            doctors[i].setName("Steve" + i);
            doctors[i].setAddress("Address" + i);
            doctors[i].setEmail("Email" + i);
            doctors[i].setPhoneNumber(123456);
            doctors[i].setPassword("password");
        }
        for (int i = 0; i < medicines.length; i++){
            medicines[i] = new Medicine();
            medicines[i].setName("Medicine " + i);
            medicines[i].setNotes("Notes " + i);
            medicines[i].setQuantity(5);
  
        }
        admins[0] = new Admin();
        admins[0].setName("Bob" + "0");
        admins[0].setAddress("Address" + "0");
        admins[0].setEmail("Email" + "0");
        admins[0].setPhoneNumber(123456);
        admins[0].setPassword("password");
        secretaries[0] = new Secretary();
        secretaries[0].setName("Charlotte" + "0");
        secretaries[0].setAddress("Address" + "0");
        secretaries[0].setEmail("Email" + "0");
        secretaries[0].setPhoneNumber(123456);
        secretaries[0].setPassword("password");
    }

    public static void saveUsers() throws IOException{

        
        BufferedWriter file = new BufferedWriter(new FileWriter("jsonStores\\admins.txt"));
        
        if (admins != null){
            for (int i = 0; i < admins.length; i++){       // save the admins
                if (admins[i] != null){
                JSONObject item = AdminToJSON(admins[i]);
                file.write(item.toJSONString()); 
                file.newLine();
                }
            }
        }
        
        file.close();
        
        file = new BufferedWriter(new FileWriter("jsonStores\\secretaries.txt"));
        
        if (secretaries != null){
            for (int i = 0; i < secretaries.length; i++){       // secondly the secretaries
                if (secretaries[i] != null){
                JSONObject item = SecretaryToJSON(secretaries[i]);
                file.write(item.toJSONString()); 
                }
            }
        }
        
        file.close();
        
        file = new BufferedWriter(new FileWriter("jsonStores\\doctors.txt"));
        
        if (doctors != null){
            for (int i = 0; i < doctors.length; i++){       // then the doctors
                if (doctors[i] != null){
                JSONObject item = DoctorToJSON(doctors[i]);
                file.write(item.toJSONString()); 
                }
            }
        }
        
        file.close();
        
        file = new BufferedWriter(new FileWriter("jsonStores\\patients.txt"));
        
        if (patients != null){
            for (int i = 0; i < patients.length; i++){       // lastly the patients
                if (patients[i] != null){
                JSONObject item = PatientToJSON(patients[i]);
                file.write(item.toJSONString()); 
                }
            }
        
        }
        file.close();
    }
    
    
    private static void loadUsers() throws FileNotFoundException, IOException, ParseException{
        
        
        JSONParser parser = new JSONParser();
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\admins.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // admins
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Admin newAdmin = JSONToAdmin(userJSON);
              admins = createAdmin(admins, newAdmin);
            };
        }
        
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\secretaries.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // secretaries
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Secretary newSec = JSONToSecretary(userJSON);
              secretaries = createSecretary(secretaries, newSec);
            };
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\doctors.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // doctors
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Doctor newDoc = JSONToDoctor(userJSON);
              doctors = createDoctor(doctors, newDoc);
            };
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader("jsonStores\\patients.txt"))) {
            String line;
            while ((line = reader.readLine()) != null){ // patients
              Object tempObj = parser.parse(line);
              if (tempObj == null){
                  break;
              }
              JSONObject userJSON = (JSONObject) tempObj; 

              Patient newPat = JSONToPatient(userJSON);
              patients = createPatient(patients, newPat);
            };
        }
        
        System.out.println("Successfully Read JSON File to Object...");
    }

    private static JSONObject AdminToJSON(Admin inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static JSONObject SecretaryToJSON(Secretary inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static JSONObject DoctorToJSON(Doctor inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static JSONObject PatientToJSON(Patient inObj) {
        JSONObject obj = new JSONObject();

        obj.put("name", inObj.getName());
        obj.put("address", inObj.getAddress());
        obj.put("email", inObj.getEmail());
        obj.put("phoneNumber", inObj.getPhoneNumber());
        obj.put("userId", inObj.getId());
        obj.put("password", inObj.getPassword());
        return obj;
    }
    
    private static Admin JSONToAdmin(JSONObject inObj) {
        Admin newUser = new Admin("HAS ID");
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        
        try {
            String number = (String)inObj.get("phoneNumber");
            newUser.setPhoneNumber(Integer.parseInt(number));
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        catch (Exception e){
            newUser.setPhoneNumber(0);
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        
        
        return newUser;
    }
    
    private static Secretary JSONToSecretary(JSONObject inObj) {
        Secretary newUser = new Secretary("has id");
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        
        try {
            String number = (String)inObj.get("phoneNumber");
            newUser.setPhoneNumber(Integer.parseInt(number));
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        catch (Exception e){
            newUser.setPhoneNumber(0);
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        
        return newUser;
    }
    
    private static Doctor JSONToDoctor(JSONObject inObj) {
        Doctor newUser = new Doctor("has id");
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        
        try {
            String number = (String)inObj.get("phoneNumber");
            newUser.setPhoneNumber(Integer.parseInt(number));
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        catch (Exception e){
            newUser.setPhoneNumber(0);
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        
        return newUser;
    }
    
    private static Patient JSONToPatient(JSONObject inObj) {
        Patient newUser = new Patient("has id");
        
        newUser.setName((String)inObj.get("name"));
        newUser.setAddress((String)inObj.get("address"));
        newUser.setEmail((String)inObj.get("email"));
        
        try {
            String number = (String)inObj.get("phoneNumber");
            newUser.setPhoneNumber(Integer.parseInt(number));
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        catch (Exception e){
            newUser.setPhoneNumber(0);
            newUser.setId((String)inObj.get("userId"));
            newUser.setPassword((String)inObj.get("password"));
        }
        
        return newUser;
    }
    
    public static void setActiveID(String id) {
        activeID = id;
    }
    
    public static void requestAccount(Patient input) {

        int Length;
        if (requests == null) {
            Length = 0;
        }
        else {
            Length = requests.length;
        }

        Patient[] newArray = new Patient[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = requests[i];
        }
        newArray[Length] = input;
        requests = newArray;
    }
    
    public static int findRequestByID(String ID) {
        char firstLetter = ID.charAt(0);
        int pos = -1;
        String compare;
        
        if (firstLetter == 'P') {
            
            for (int i = 0; i < requests.length; i++) {
                compare = requests[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        return pos;
    }
    
    public static int findMedicine(String ID) {
        int pos = -1;
        String compare;

        for (int i = 0; i < medicines.length; i++) {
            compare = medicines[i].getName();
            if (compare.equals(ID)) {
                pos = i;
            }
        }
        return pos;
    }
    
    public static void terminate(int id) {
        patients = deleteRequest(patients, terminations[id]);
        terminations = deleteRequest(terminations, terminations[id]);
    }
    
    public static int findTermination(String ID) {
        int pos = -1;
        String compare;

        for (int i = 0; i < terminations.length; i++) {
            compare = terminations[i].getId();
            if (compare.equals(ID)) {
                pos = i;
            }
        }
        return pos;
    }
    
    public static int findByID(String ID) {
        char firstLetter = ID.charAt(0);
        int pos = -1;
        String compare;
        
        if (firstLetter == 'P') {
            
            for (int i = 0; i < patients.length; i++) {
                compare = patients[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'D') {
            for (int i = 0; i < doctors.length; i++) {
                compare = doctors[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'S') {
            for (int i = 0; i < secretaries.length; i++) {
                compare = secretaries[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        else if (firstLetter == 'A') {
            for (int i = 0; i < admins.length; i++) {
                compare = admins[i].getId();
                if (compare.equals(ID)) {
                    pos = i;
                }
            }
            return pos;
        }
        
        return pos;
    }
    
    public static String checkLogin() {
        String type = "";
        
        return type;
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
    
    public static Patient[] deleteRequest(Patient[] array, Patient item) {
        if (array == null) {
            return array;
        }

        Patient[] newArray = new Patient[array.length - 1];
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
    
    public static Patient[] createPatient(Patient[] array, Patient user) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Patient[] newArray = new Patient[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = user;
        return newArray;
    }
    
    public static Doctor[] createDoctor(Doctor[] array, Doctor user) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Doctor[] newArray = new Doctor[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = user;
        return newArray;
    }
    
    public static Admin[] createAdmin(Admin[] array, Admin user) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Admin[] newArray = new Admin[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = user;
        return newArray;
    }
    
    public static Secretary[] createSecretary(Secretary[] array, Secretary user) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Secretary[] newArray = new Secretary[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = user;
        return newArray;
    }
    
    public static void addMedicine(Medicine medicine) {
        int Length;
        if (medicines == null) {
            Length = 0;
        }
        else {
            Length = medicines.length;
        }

        Medicine[] newArray = new Medicine[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = medicines[i];
        }
        newArray[Length] = medicine;
        medicines = newArray;


    }
    
    public static Patient[] addTermination(Patient[] array, Patient user) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Patient[] newArray = new Patient[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = user;
        return newArray;


    }

    public static Prescription[] pushObject(Prescription[] array, Prescription prescription) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Prescription[] newArray = new Prescription[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = prescription;
        return newArray;


    }
    
    public static void addReview(Review[] array, Review review) {
        int Length;
        if (array == null) {
            Length = 0;
        }
        else {
            Length = array.length;
        }

        Review[] newArray = new Review[Length + 1];
        for (int i = 0; i < Length; i++) {
            newArray[i] = array[i];
        }
        newArray[Length] = review;
        reviews = newArray;
        //return newArray;


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
