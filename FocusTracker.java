import java.util.ArrayList;
import java.util.List;

public class FocusTracker {
    public List<Session> sessions;

    public FocusTracker() {
        sessions = new ArrayList<>();
    }

    public void addSession(Session session) {
        sessions.add(session);
    }

    public void showReport() {
        System.out.println("\n📈 Study Report:");
        int totalStudy = 0;
        int totalBreak = 0;
        int totalDistractions = 0;

        for (Session session : sessions) {
            System.out.println(session);
            totalStudy += session.getStudyMinutes();
            totalBreak += session.getBreakMinutes();
            totalDistractions += session.getDistractions();
        }

        System.out.println("\n✅ Total Studied: " + totalStudy + " minutes");
        System.out.println("✅ Total Breaks: " + totalBreak + " minutes");
        System.out.println("❗ Total Distractions: " + totalDistractions);
    }
}
