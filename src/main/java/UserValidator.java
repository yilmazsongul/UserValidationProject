public class UserValidator {

    public static boolean isValidName(String name) {
        return name != null && name.length() >= 2;
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    public static boolean isValidPassword(String password) {
        return password != null && password.length() >= 6;
    }

    public static boolean passwordsMatch(String p1, String p2) {
        return p1.equals(p2);
    }
}