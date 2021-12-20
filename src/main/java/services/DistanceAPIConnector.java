package services;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DistanceAPIConnector
    {
	private static String API_KEY = "MY_DISTANCE_MATRIX_API_KEY";

	public static Response response = getResponse();

	private static Response getResponse()
	    {
		
		try
		    {
			OkHttpClient client = new OkHttpClient().newBuilder().build();
			Request request = new Request.Builder().url(
				"https://maps.googleapis.com/maps/api/distancematrix/json?origins=Boston%2CMA%7CCharlestown%2CMA&destinations=Lexington%2CMA%7CConcord%2CMA&departure_time=now&key="
					+ API_KEY)
				.method("GET", null).build();
			Response response = client.newCall(request).execute();
			return response;
		    } catch (IOException e)
		    {

			e.printStackTrace();
		    }
		return null;
	    }
    }
