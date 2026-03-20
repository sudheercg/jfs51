package com.codegnan.staticusage;
class PasswordUtil {

    public static boolean validate(String password) {
        return hasMinLength(password)
            && hasUppercase(password)
            && hasNumber(password);
    }

    private static boolean hasMinLength(String password) {
        return password.length() >= 8;
    }

    private static boolean hasUppercase(String password) {
        return password.matches(".*[A-Z].*");
    }

    private static boolean hasNumber(String password) {
        return password.matches(".*\\d.*");
    }
}
