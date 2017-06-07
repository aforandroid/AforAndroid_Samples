package com.ramya.tracklocation;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends Activity {
Button getloc;
TextView address;
LocationManager location_manager;
String getLatitude,getLongitude;
double x,y;
Geocoder geocoder;
List<Address> addresses;
Location loc;
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
getloc = (Button) findViewById(R.id.button1);
address = (TextView) findViewById(R.id.textView2);
location_manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
getloc.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
LocationListener listner = new MyLocationListner();
location_manager.requestLocationUpdates(
LocationManager.GPS_PROVIDER, 0, 0, listner); 
}
}); 
}
public class MyLocationListner implements LocationListener {
public void onLocationChanged(Location location) {
getLatitude = "" + location.getLatitude();
getLongitude = "" + location.getLongitude();
x = location.getLatitude();
y = location.getLongitude();
try {
geocoder = new Geocoder(MainActivity.this, Locale.ENGLISH);
addresses = geocoder.getFromLocation(x, y, 1);
StringBuilder str = new StringBuilder();
if (geocoder.isPresent()) {
Address returnAddress = addresses.get(0);
String localityString = returnAddress.getLocality();
String city = returnAddress.getCountryName();
String region_code = returnAddress.getCountryCode();
String zipcode = returnAddress.getPostalCode();
str.append(localityString + " ");
str.append(city + " " + region_code + " ");
str.append(zipcode + " ");
address.setText(str); 
} else {
}
} catch (IOException e) { 
} 
} 
public void onProviderDisabled(String arg0) { 
} 
public void onProviderEnabled(String arg0) {
} 
public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
} 
}
}