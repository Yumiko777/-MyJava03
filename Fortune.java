public class Fortune {
    public static void main(String[] args) {
        int number = 25;

        switch (number % 5) {
            case 0:
                System.out.println("大吉です");
                break;
            case 1:
                System.out.println("中吉です");
                break;
            case 4:
                System.out.println("凶です");
                break;
            // ifのelseに似ている
            default :
                System.out.println("吉です");
                break;

        }

    }
    
}
