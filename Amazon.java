class Amazon {

    static String validateAndCreateAccount(String name, long phone, String email, String password) {

        System.out.println("validateAndCreateAccount method is started");

        String result = "";

        if(name != null && phone > 0 && email != null && password != null) {
            result = "Welcome " + name + " Your Amazon account created successfully";
        } else {
            result = "Account creation failed";
        }

        System.out.println("validateAndCreateAccount method is Ended");

        return result;
    }
}
