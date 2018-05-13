package com.firstapp.sudhimon.tathva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


    }

    public void onClickingEventsButton(View view) {

        Intent gotoEvents = new Intent(this, EventsPage.class);

        startActivity(gotoEvents);
    }

    public void onClickingWorkshopsButton(View view) {

        Intent gotoWorkshops = new Intent(this, WorkshopsPage.class);

        startActivity(gotoWorkshops);
    }

    public void onClickingLecturesButton(View view) {

        Intent goToLectures = new Intent (this, LecturesPage.class);

        startActivity(goToLectures);
    }

    public void onClickingProshowsButton(View view) {

        Intent goToProshows = new Intent(this, ProshowsPage.class);

        startActivity(goToProshows);
    }

    public void onClickingExhibitionsButton(View view) {

        Intent goToExhibitions = new Intent(this, ExhibitionsPage.class);

        startActivity(goToExhibitions);
    }

    public void onClickingNavigationButton(View view) {

        Intent goToNavigation = new Intent(this, NavigationPage.class);

        startActivity(goToNavigation);
    }
}