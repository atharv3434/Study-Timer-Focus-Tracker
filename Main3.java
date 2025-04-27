import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FocusTracker tracker = new FocusTracker();

        System.out.println("📚 Welcome to Study Timer & Focus Tracker!");

        boolean running = true;
        while (running) {
            System.out.println("\n1. Start a new Study Session");
            System.out.println("2. Add Distraction to last session");
            System.out.println("3. Show Report");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter subject: ");
                    String subject = sc.nextLine();
                    System.out.print("Enter study minutes: ");
                    int studyMins = sc.nextInt();
                    System.out.print("Enter break minutes: ");
                    int breakMins = sc.nextInt();
                    sc.nextLine(); // consume newline
                    Session session = new Session(subject, studyMins, breakMins);
                    tracker.addSession(session);
                    System.out.println("✅ Session Added!");
                    break;
                case 2:
                    if (tracker != null && !tracker.sessions.isEmpty()) {
                        tracker.sessions.get(tracker.sessions.size() - 1).addDistraction();
                        System.out.println("⚡ Distraction Recorded for Last Session!");
                    } else {
                        System.out.println("❌ No session found!");
                    }
                    break;
                case 3:
                    tracker.showReport();
                    break;
                case 4:
                    running = false;
                    System.out.println("👋 Exiting... Stay Focused!");
                    break;
                default:
                    System.out.println("❌ Invalid Choice!");
            }
        }
    }
}
