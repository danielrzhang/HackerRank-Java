package Java.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
    	Calendar c = Calendar.getInstance();
    	String dateString = month + "/" + day + "/" + year;
    	Date date = null;
		try {
			date = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);
			c.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
    	DateFormat formatter = new SimpleDateFormat("EEEE", Locale.US);
    	return formatter.format(date).toUpperCase();
    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);
        bufferedReader.close();
    }
}
