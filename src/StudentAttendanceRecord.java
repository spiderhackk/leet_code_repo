//Find the student attendance record

public class StudentAttendanceRecord {
    public static void main(String[] args) {
        String attIdentity ="LLPLLPLPPLLPLPLPPPLPLPLPPPLPPP";
                ;
        int absentCount =1;
        int lateCount =1;

        for (int i =0;i<attIdentity.length();i++){
            if(attIdentity.charAt(i)=='A'){
                absentCount=absentCount+1;
                if (absentCount>=2){
                    System.out.println(false);
                    break;
                }
            }

            else if (attIdentity.charAt(i)=='L') {
                for (int j=i+1;j<attIdentity.length();j++){
                    if (attIdentity.charAt(i)==attIdentity.charAt(j)){
                        lateCount=lateCount+1;


                    } else if (attIdentity.charAt(i)!=attIdentity.charAt(j)) {
                        if (lateCount==3) {
                            System.out.println(false);
                            break;
                        }
                        else{
                            lateCount=0;
                        }
                    }
                }
                System.out.println(true);
                break;



            }

        }

    }
}
