package pl.czak.banana;

import android.app.Activity;
import android.view.View;

import java.lang.reflect.Field;

import pl.czak.banana.annotation.BindView;

public class Banana {
    public static void bind(Activity activity) {
        if (activity == null) return;
        Class<?> cls = activity.getClass();
        for (Field f : cls.getDeclaredFields()) {
            BindView bv = f.getAnnotation(BindView.class);
            if (bv != null) {
                View v = activity.findViewById(bv.value());
                try {
                    f.set(activity, v);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
