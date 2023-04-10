public class Greetings {
    public static void main(String[] args) {
        int hour = java.time.LocalDateTime.now().getHour();
        if (hour >= 6 && hour < 12) {
            System.out.println("Good morning! Welcome to computer science.");
        } else if (hour >= 12 && hour < 18) {
            System.out.println("Good afternoon! Welcome to computer science.");
        } else {
            System.out.println("Good evening! Welcome to computer science.");
        }
    }
}



