import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class DigitalClockTimer {

    // Displays real-time digital clock
    static void digitalClock() throws InterruptedException {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            System.out.print("\rCurrent Time: " + LocalTime.now().format(format));
            Thread.sleep(1000); // refresh every second
        }
    }

    // Countdown timer logic
    static void countdownTimer(int seconds) throws InterruptedException {
        while (seconds >= 0) {
            System.out.print("\rTime Left: " + seconds + " seconds");
            Thread.sleep(1000);
            seconds--;
        }
        System.out.println("\n⏰ Countdown Finished!");
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Digital Clock");
        System.out.println("2. Countdown Timer");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            digitalClock();
        } 
        else if (choice == 2) {
            System.out.print("Enter countdown time (seconds): ");
            int time = sc.nextInt();
            countdownTimer(time);
        } 
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
