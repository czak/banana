package pl.czak.bananasample;

import android.widget.TextView;

import pl.czak.banana.ViewBinder;

public class MainActivityViewBinder implements ViewBinder<MainActivity> {
    public void bind(MainActivity activity) {
        activity.label = (TextView) activity.findViewById(R.id.label);
    }
}
