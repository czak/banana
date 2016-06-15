package pl.czak.banana;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

import pl.czak.banana.annotation.BindView;

public class Banana {
    public static void bind(Activity activity) {
        ViewBinder<Activity> vb;

        try {
            // TODO: construct the class name dynamically based on activity.getClass()
            Class<?> cls = Class.forName("pl.czak.bananasample.MainActivityViewBinder");
            //noinspection unchecked
            vb = (ViewBinder<Activity>) cls.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Unable to find view binder for "
                    + activity.getClass().getName());
        }

        vb.bind(activity);
    }
}
