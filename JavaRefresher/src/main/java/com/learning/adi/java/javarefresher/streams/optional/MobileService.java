package com.learning.adi.java.javarefresher.streams.optional;

import java.util.Optional;

public class MobileService {

	public int getMobileScreenWidth(Optional<Mobile> mobile) {
		return mobile.flatMap(Mobile::getDisplayFeatures).flatMap(DisplayFeatures::getResolution)
				.map(ScreenResolution::getWidth).orElse(0);
	}
}
