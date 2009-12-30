// Created by plusminus on 23:03:24 - 17.01.2009
package org.andnav2.sys.traffic.tpeg.tpegml.impl.util;

import org.andnav2.osm.adt.GeoPoint;
import org.andnav2.traffic.tpeg.adt.misc.WGS84;


public class TypeConverter {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public static GeoPoint convertWGS84ToGeoPoint(final WGS84 coordinates) {
		return new GeoPoint((int)(coordinates.getLatitude() * 1E6), (int)(coordinates.getLongitude() * 1E6));
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
