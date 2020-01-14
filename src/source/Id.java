package source;

public class Id {

    public int findNum(String type) {
        int num = 0;
        if (type.equals("Patient")) {
            num = 0;
        }
        else if (type.equals("Doctor")) {
            num = 1;
        }
        else if (type.equals("Secretary")) {
            num = 2;
        }
        else if (type.equals("Admin")) {
            num = 3;
        }
        return num;
    }

    public String getNewID(String type) {
        int num = findNum(type);
        num = Data.getNextID(num);
        //num++;
        String value = String.valueOf(num);

        String id = type.charAt(0) + "000" + value;
        Data.increment(num = findNum(type));
        return id;
    }
  
}
