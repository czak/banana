package pl.czak.bananasample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import pl.czak.banana.Banana;

public class MainActivity extends Activity
{
    @BindView(R.id.label) TextView label;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Banana.bind(this);

        label.setText("Hello from activity");
    }
}
