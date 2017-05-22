package pl.samouczekprogramisty.pogodynka.thermometer.exceptions;

import org.apache.http.client.HttpResponseException;


public class IllegalResponseCode extends HttpResponseException {

    public IllegalResponseCode(int responseCode, String message) {
        super(responseCode, message);
    }
}