package executavel;

public class AulaThread {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread.sleep(2000);
            System.out.println("imprimindo pdf");
        }
    }
}
