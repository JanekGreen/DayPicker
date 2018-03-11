package pl.pwojcik.daypicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import pl.pwojcik.daypicker.view.DayPicker;

public class MainActivity extends AppCompatActivity implements DayPicker.DaySelectionChangedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DayPicker dayPicker = findViewById(R.id.dayPicker);
        dayPicker.setDaySelectionChangedListener(this);
    }

    @Override
    public void onDaySelectionChanged(List<Integer> activeDays, List<String> activeDaysNames) {
        Toast.makeText(this, TextUtils.join(" ",activeDaysNames),Toast.LENGTH_SHORT).show();
    }
}
