public class calculateGrade {
    public static String grade (int score) {
        if (score < 0 || score > 100) {
        return "Invalid value";
    } else if (score >= 90) {
            return "A";
        } else if (score >=80) {
            return "B";
        } else if ( score >= 70) {
            return "C";
        } else if ( score >= 60 ) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main (String[] args) {
        int myScore = 100;
        String result = grade (myScore) ;
        System.out.println("Your grade:" + result) ;

    }
}