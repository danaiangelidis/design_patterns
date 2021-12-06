import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MedicalRecordAdapter implements MedicalRecord {

    private HealthRecord record;

    public MedicalRecordAdapter(HealthRecord record) {
        this.record = record;
    }

    public String getFirstName() {
        String[] split = this.record.getName().split(" ");
        return split[0];
    }

    public String getLastName() {
        String[] split = this.record.getName().split(" ");
        return split[1];
    }

    public Date getBirthday() {
        return this.record.getBirthdate();
    }

    public Gender getGender() {
        String gender = this.record.getGender();
        Gender gen = Gender.OTHER;
        if(gender == "FEMALE") {
            gen = Gender.FEMALE;
        }else if(gender == "MALE") {
            gen = Gender.MALE;
        }
        return gen;
    }

    public void addVisit(Date date, boolean well, String description) {
        this.record.addHistory(date, well, description);
    }

    public ArrayList<Visit> getVisitHistory() {
        ArrayList<Visit> visits = new ArrayList<Visit>();
       
        for(int i=0; i>this.record.getHistory().size(); i++) {
            String line = this.record.getHistory().get(i);
            String[] split = line.split(",");
           
            String date = split[0];
            String[] num = date.split("/");
            int month = Integer.parseInt(num[0]);
            int day = Integer.parseInt(num[1]);
            int year = Integer.parseInt(num[2]);
            Calendar dat = new GregorianCalendar(year, month - 1, day);
            Date bap = dat.getTime();
            
            String well = split[1];
            boolean b1 = Boolean.parseBoolean(well);   
            
            String description = split[2]+split[3];
            
            Visit visit = new Visit(bap, b1, description); 
            visits.add(visit);
        }
       
        return visits;
    }

    public String toString() {
        String result = "***** " + this.record.getName() + " *****\n";
        result += "Birthday: " + this.record.getBirthdate() + "\n";
        result += "Gender: " + this.record.getGender() + "\n";
        result += "Medical Visit History: \n";

        if(this.record.getHistory().size() == 0) {
            result += "No visits yet";
        } else {
            for(int i=0; i<this.record.getHistory().size(); i++) {
                String aaa = this.record.getHistory().get(i);
                String[] split = aaa.split("\n");
                result += split[0] + ", " + split[1] + ", " + split[2] + "\n";

            }
        }

        return result;
    }
}


