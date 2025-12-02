package activities;

class Activity3 {
    public static void main(String[] args) {

        double seconds = 1_000_000_000;

        // Length of one Earth year in seconds
        double earthYearSeconds = 31557600.0;

        // Orbital periods in Earth-years
        double mercury = 0.2408467;
        double venus   = 0.61519726;
        double mars    = 1.8808158;
        double jupiter = 11.862615;
        double saturn  = 29.447498;
        double uranus  = 84.016846;
        double neptune = 164.79132;

        // Convert raw seconds → Earth years
        double earthYears = seconds / earthYearSeconds;

        System.out.println("Age on Earth:   " + earthYears);
        System.out.println("Age on Mercury: " + (earthYears / mercury));
        System.out.println("Age on Venus:   " + (earthYears / venus));
        System.out.println("Age on Mars:    " + (earthYears / mars));
        System.out.println("Age on Jupiter: " + (earthYears / jupiter));
        System.out.println("Age on Saturn:  " + (earthYears / saturn));
        System.out.println("Age on Uranus:  " + (earthYears / uranus));
        System.out.println("Age on Neptune: " + (earthYears / neptune));
    }
}
