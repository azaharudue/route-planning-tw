package services;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

public class TestGoogleORApis {

	public static <K, V> void main(String[] args) throws IOException {

		// String jsonResponse = DistanceAPIConnector.response.body().string();

		String jsonResponse = "{\r\n"
				+ "   \"destination_addresses\" : [ \"Lexington, MA, USA\", \"Concord, MA, USA\" ],\r\n"
				+ "   \"origin_addresses\" : [ \"Boston, MA, USA\", \"Charlestown, Boston, MA, USA\" ],\r\n"
				+ "   \"rows\" : [\r\n" + "      {\r\n" + "         \"elements\" : [\r\n" + "            {\r\n"
				+ "               \"distance\" : {\r\n" + "                  \"text\" : \"33.3 km\",\r\n"
				+ "                  \"value\" : 33251\r\n" + "               },\r\n"
				+ "               \"duration\" : {\r\n" + "                  \"text\" : \"28 mins\",\r\n"
				+ "                  \"value\" : 1697\r\n" + "               },\r\n"
				+ "               \"duration_in_traffic\" : {\r\n" + "                  \"text\" : \"24 mins\",\r\n"
				+ "                  \"value\" : 1466\r\n" + "               },\r\n"
				+ "               \"status\" : \"OK\"\r\n" + "            },\r\n" + "            {\r\n"
				+ "               \"distance\" : {\r\n" + "                  \"text\" : \"31.6 km\",\r\n"
				+ "                  \"value\" : 31621\r\n" + "               },\r\n"
				+ "               \"duration\" : {\r\n" + "                  \"text\" : \"33 mins\",\r\n"
				+ "                  \"value\" : 1989\r\n" + "               },\r\n"
				+ "               \"duration_in_traffic\" : {\r\n" + "                  \"text\" : \"29 mins\",\r\n"
				+ "                  \"value\" : 1725\r\n" + "               },\r\n"
				+ "               \"status\" : \"OK\"\r\n" + "            }\r\n" + "         ]\r\n" + "      },\r\n"
				+ "      {\r\n" + "         \"elements\" : [\r\n" + "            {\r\n"
				+ "               \"distance\" : {\r\n" + "                  \"text\" : \"31.2 km\",\r\n"
				+ "                  \"value\" : 31220\r\n" + "               },\r\n"
				+ "               \"duration\" : {\r\n" + "                  \"text\" : \"27 mins\",\r\n"
				+ "                  \"value\" : 1630\r\n" + "               },\r\n"
				+ "               \"duration_in_traffic\" : {\r\n" + "                  \"text\" : \"23 mins\",\r\n"
				+ "                  \"value\" : 1384\r\n" + "               },\r\n"
				+ "               \"status\" : \"OK\"\r\n" + "            },\r\n" + "            {\r\n"
				+ "               \"distance\" : {\r\n" + "                  \"text\" : \"29.6 km\",\r\n"
				+ "                  \"value\" : 29590\r\n" + "               },\r\n"
				+ "               \"duration\" : {\r\n" + "                  \"text\" : \"32 mins\",\r\n"
				+ "                  \"value\" : 1921\r\n" + "               },\r\n"
				+ "               \"duration_in_traffic\" : {\r\n" + "                  \"text\" : \"27 mins\",\r\n"
				+ "                  \"value\" : 1649\r\n" + "               },\r\n"
				+ "               \"status\" : \"OK\"\r\n" + "            }\r\n" + "         ]\r\n" + "      }\r\n"
				+ "   ],\r\n" + "   \"status\" : \"OK\"\r\n" + "}";

		// System.out.println("Response Code: " + DistanceAPIConnector.response.code());
		System.out.println("Response Body: " + jsonResponse);

		try {
			Gson gson = new Gson();

			Map<String, List<LinkedTreeMap<Elements, LinkedTreeMap<?, ?>>>> map = gson.fromJson(jsonResponse,
					Map.class);

			List<LinkedTreeMap<Elements, LinkedTreeMap<?, ?>>> elements = (List<LinkedTreeMap<Elements, LinkedTreeMap<?, ?>>>) map
					.getOrDefault("rows", null);

			//	System.out.println(elements);
			for (LinkedTreeMap<?, ?> elementMap : elements) {

				List<LinkedTreeMap<?, ?>> elementChildren = (List<LinkedTreeMap<?, ?>>) elementMap
						.getOrDefault("elements", null);

				// Map<String, String> s = gsons.fromJson(element, Map.class);
				//System.out.println(elementChildren);
				for (LinkedTreeMap<?, ?> elementProperty : elementChildren) {

					LinkedTreeMap<String,String>  durations =(LinkedTreeMap<String, String>) elementProperty.getOrDefault("duration", null);
					System.out.println(durations);
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
