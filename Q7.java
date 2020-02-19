package JAVA2;

// WAP to convert seconds into days, hours, minutes and seconds.

public class Q7 {
    public static void main (String[] args)
    {
        // Given n is in seconds
        int n = 129710;
        Convert(n);

    }
    static void Convert(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour + " " + "hours " + minutes + " " + "minutes " + seconds + " " + "seconds ");
    }

}
