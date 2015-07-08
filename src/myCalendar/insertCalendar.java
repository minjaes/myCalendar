package myCalendar;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.calendar.model.Calendar;
import com.google.api.services.calendar.Calendar.Builder;

public class insertCalendar {
    
    //inserting new CALENDARRRRRR
    
    
    final JsonFactory jsonFactory =
            JacksonFactory.getDefaultInstance();

        /** Global instance of the HTTP transport. */
    HttpTransport httpTransport;
 // Initialize Calendar service with valid OAuth credentials
    /** Directory to store user credentials. */
    final java.io.File credentials = new java.io.File(
        System.getProperty("user.home"), ".credentials/calendar-api-quickstart");
    
    Calendar service1 = new Calendar.Builder(httpTransport, jsonFactory, credentials)
        .setApplicationName("applicationName").build();

  

    // Create a new calendar
    com.google.api.services.calendar.model.Calendar calendar = new Calendar();
    calendar.setSummary("calendarSummary");
    calendar.setTimeZone("America/Los_Angeles");

    // Insert the new calendar
    Calendar createdCalendar = service1.calendars().insert(calendar).execute();

    System.out.println(createdCalendar.getId());
    

}
