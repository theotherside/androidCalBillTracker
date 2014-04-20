package com.example.billtracker;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class CalendarActivity extends Activity {

	CalendarView cal;
	TextView date;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendar);
		Toast.makeText(getBaseContext(), "Tap a date to modify bills",
				Toast.LENGTH_LONG).show();

		cal = (CalendarView) findViewById(R.id.calendar_main);

		cal.setOnDateChangeListener(new OnDateChangeListener() {

			@Override
			public void onSelectedDayChange(CalendarView view, int year,
					int month, int dayOfMonth) {


				setContentView(R.layout.view_bill);
				if (date == null) {
					date = (TextView) findViewById(R.id.view_date);
					System.out.println("Date FInder:" + date + " Tried this ID:" + R.id.view_date);
				}
				
				if (date != null) {
					date.setText(month + "/" + dayOfMonth + "/" + year);
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calendar, menu);

		return true;
	}

}
