package com.ramya.tracklocationpoints;
import android.app.Activity;
import android.content.Context;
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
TextView lati,longi; 
LocationManager location_manager;
String getLatitude,getLongitude;
double x,y;
Geocoder geocoder;
Location loc;
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
getloc = (Button) findViewById(R.id.button1);
lati = (TextView) findViewById(R.id.textView2);
longi = (TextView) findViewById(R.id.textView3);
location_manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
getloc.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
LocationListener listner = new MyLocationListner();
location_manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, listner);
}
}); 
}
public class MyLocationListner implements LocationListener {
public void onLocationChanged(Location location) {
getLatitude = "" + location.getLatitude();
getLongitude = "" + location.getLongitude();
lati.setText("LATITUDE :"+getLatitude);
longi.setText("LONGITUDE :"+getLongitude);
} 
public void onProviderDisabled(String arg0) {
} 
public void onProviderEnabled(String arg0) { 
} 
public void onStatusChanged(String arg0, int arg1, Bundle arg2) { 
} 
}
}