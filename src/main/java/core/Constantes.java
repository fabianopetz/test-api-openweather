package core;

import io.restassured.http.ContentType;

public interface Constantes {
	String APP_BASE_URL = "http://api.openweathermap.org/data/2.5/weather";
	Integer APP_PORT = 80; //443 https
	String APP_BASE_PATH = "";
	
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	long MAX_TIMEOUT = 5000l;

}
