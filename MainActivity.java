package es.esy.drblau.isitwednesdaymydudes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.Calendar;


public class MainActivity extends AppCompatActivity {
    Calendar calendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tView = findViewById(R.id.caption);
        ImageView iView = findViewById(R.id.image);
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.WEDNESDAY:
                tView.setText(R.string.wednesday);
                iView.setImageResource(R.drawable.wednesday);
                break;
            default:
                tView.setText(R.string.notWednesday);
                iView.setImageResource(R.drawable.dab);
                break;
        }
    }
}
