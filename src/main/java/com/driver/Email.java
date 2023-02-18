package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId) {
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public Email() {

    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        String currentPassword = getPassword();
        if (oldPassword.equals(currentPassword) && newPassword.length() >= 8) {
            char ch;
            boolean capitalFlag = false;
            boolean lowerCaseFlag = false;
            boolean numberFlag = false;
            boolean specialCharflag = false;
            for (int i = 0; i < newPassword.length(); i++) {
                ch = newPassword.charAt(i);
                if (Character.isDigit(ch)) {
                    numberFlag = true;
                } else if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                } else if (Character.isLowerCase(ch)) {
                    lowerCaseFlag = true;
                } else {
                    specialCharflag = true;
                }
                if (numberFlag && capitalFlag && lowerCaseFlag && specialCharflag)
                    password = newPassword;
                break;
            }
            //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
            // 1. It contains at least 8 characters
            // 2. It contains at least one uppercase letter
            // 3. It contains at least one lowercase letter
            // 4. It contains at least one digit
            // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        }
        return;

    }
}
