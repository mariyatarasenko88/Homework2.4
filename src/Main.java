public class Main {
    public static void main(String[] args) {
        printResult("java_skypro.go","D_1hWiKjjP_9","D_1hWiKjjP_9");
        printResult("java_skyprogo","D_1hWiKjjP_9","D_1hWiKjjP_9");
        printResult("java_skyprogo","D_1hWiKjjP_9","D_2hWiKjjP_9");
        printResult("java_skyprogo","D-1hWiKjjP-9","D-1hWiKjjP-9");
    }
    public static void printResult(String login, String password, String confirmPassword) {
        Verification verification = new Verification(login, password, confirmPassword);
        System.out.println("Login " + login + " Password " + password + " Confirm " + confirmPassword);
        boolean result = verification.checkParameters();
        System.out.println("Result " + result);
    }
}