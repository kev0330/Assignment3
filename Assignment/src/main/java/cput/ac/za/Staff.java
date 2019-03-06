package cput.ac.za;

public class Staff {

    int staffNo;

    public Staff(){}

    public Staff(int sn){
        staffNo = sn;
    }


    public void setStaffNumber(int staffNum){
        staffNo = staffNum;
    }


    public int getStaffNumber(){
        return staffNo;
    }

    public int hashCode(){
        return this.staffNo;
    }

    public String toString(){
        return String.valueOf(getStaffNumber());
    }
}
