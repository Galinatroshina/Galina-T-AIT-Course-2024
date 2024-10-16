package classwork_22.user;

public class User {

    private String email;
    private String password;

    //constructor
    public User(String email, String password) {
        setEmail(email); //переписали на set!!!
        setPassword(password); //переписали на set!!!
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){ //переписали тоже!!! проходим валидацию
            this.email = email;
        } else {
            System.out.println(email + "Email is not valid.");
        }
    }
    private boolean isEmailValid(String email) {

        int indexAt = email.indexOf('@'); // index where @ placed

        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        if(email.indexOf('.', indexAt) == -1){
            return false;
        }
        if(email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;

    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        if (isPasswordValid(password)){
            this.password = password;
        } else {
            System.out.println(password + " is not valid.");
        }
    }

    private boolean isPasswordValid(String password) {
        boolean[] res = new boolean[5];

        if(password.length() >= 8 && password.length() < 20 ){
            res[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isDigit(ch)){
                res[1] = true;
            }
            if(Character.isUpperCase(ch)){
                res[2] = true;
            }
            if(Character.isLowerCase(ch)){
                res[3] = true;
            }
            if ("!%@$&".indexOf(ch) >= 0) {
                res[4] = true;
            }
            if(res[0] && res[1] && res[2] && res[3] && res[4]){
                return true;
            }

        }
        return false;
    }
}
