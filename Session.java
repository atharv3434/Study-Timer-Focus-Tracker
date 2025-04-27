public class Session {
    private String subject;
    private int studyMinutes;
    private int breakMinutes;
    private int distractions;

    public Session(String subject, int studyMinutes, int breakMinutes) {
        this.subject = subject;
        this.studyMinutes = studyMinutes;
        this.breakMinutes = breakMinutes;
        this.distractions = 0;
    }

    public void addDistraction() {
        distractions++;
    }

    public String getSubject() {
        return subject;
    }

    public int getStudyMinutes() {
        return studyMinutes;
    }

    public int getBreakMinutes() {
        return breakMinutes;
    }

    public int getDistractions() {
        return distractions;
    }

    @Override
    public String toString() {
        return "Subject: " + subject + ", Studied: " + studyMinutes + " mins, Break: " + breakMinutes +
                " mins, Distractions: " + distractions;
    }
}
