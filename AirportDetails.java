class AirportDetails {
    public static void main(String[] args) {

        byte terminals = 3;
        short flightsPerDay = 450;
        int airportCode = 560001;
        long runwayNumber = 123456789L;
        float runwayLength = 3.5f;
        double area = 25.75;
        char category = 'I';
        boolean isInternational = true;
        String airportName = "Kempegowda Airport";

        System.out.println("Terminals: " + terminals);
        System.out.println("Flights Per Day: " + flightsPerDay);
        System.out.println("Airport Code: " + airportCode);
        System.out.println("Runway Number: " + runwayNumber);
        System.out.println("Runway Length: " + runwayLength);
        System.out.println("Area: " + area);
        System.out.println("Category: " + category);
        System.out.println("International: " + isInternational);
        System.out.println("Airport Name: " + airportName);
    }
}