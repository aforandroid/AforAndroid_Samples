

package com.example.ratingbar;
import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends Activity implements RatingBar.OnRatingBarChangeListener {
RatingBar mSmallRatingBar;
RatingBar mIndicatorRatingBar;
TextView mRatingText;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
mRatingText = (TextView) findViewById(R.id.rating);
// We copy the most recently changed rating on to these indicator‐only
// rating bars
mIndicatorRatingBar = (RatingBar) findViewById(R.id.indicator_ratingbar);

((RatingBar)findViewById(R.id.ratingbar2)).setOnRatingBarChangeListener(this);
}
public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromTouch) {
final int numStars = ratingBar.getNumStars();
mRatingText.setText(getString(R.string.rate) + " " + rating + "/" + numStars);

if (mIndicatorRatingBar.getNumStars() != numStars) {
mIndicatorRatingBar.setNumStars(numStars);
}
if (mIndicatorRatingBar.getRating() != rating) {
mIndicatorRatingBar.setRating(rating);
}
final float ratingBarStepSize = ratingBar.getStepSize();
if (mIndicatorRatingBar.getStepSize() != ratingBarStepSize) {
mIndicatorRatingBar.setStepSize(ratingBarStepSize);
}
}
}