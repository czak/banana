package pl.czak.banana;

import android.app.Activity;

public interface ViewBinder<T extends Activity> {
    void bind(T activity);
}
