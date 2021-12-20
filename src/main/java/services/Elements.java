package services;

import com.google.gson.internal.LinkedTreeMap;

public class Elements {

	//distance
	LinkedTreeMap<String,String> distance;
	
	//duration
	LinkedTreeMap<String,String> duration;
	
	//duration
	LinkedTreeMap<String,String> durationInTraffic;
	
	//status
	LinkedTreeMap<String, String> status;

	public LinkedTreeMap<String, String> getDistance() {
		return distance;
	}

	public void setDistance(LinkedTreeMap<String, String> distance) {
		this.distance = distance;
	}

	public LinkedTreeMap<String, String> getDuration() {
		return duration;
	}

	public void setDuration(LinkedTreeMap<String, String> duration) {
		this.duration = duration;
	}

	public LinkedTreeMap<String, String> getDurationInTraffic() {
		return durationInTraffic;
	}

	public void setDurationInTraffic(LinkedTreeMap<String, String> durationInTraffic) {
		this.durationInTraffic = durationInTraffic;
	}
	
	
	
	
	
}
