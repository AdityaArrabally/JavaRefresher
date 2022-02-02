package com.learning.adi.java.javarefresher.functional.interfaces;

import java.util.function.BiFunction;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Java8BiFunctionFactory {
	public static void main(String[] args) {
		GPS gpsObj = factory("40.741895", "-73.989308", GPS::new);
		
		System.out.println(gpsObj);
		System.out.println(gpsObj.toJson());
	}

	public static <R extends GPS> R factory(String latitude, String longitude, BiFunction<String, String, R> func) {
		return func.apply(latitude, longitude);
	}
}

class GPS {
	String latitude;
	String longitude;

	GPS(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	public String toJson() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}