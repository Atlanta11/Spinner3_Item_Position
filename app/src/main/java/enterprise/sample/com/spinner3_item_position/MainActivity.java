package enterprise.sample.com.spinner3_item_position;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner SpinnerItemPosition;
    TextView PositionDisplay;
    int Hold;

    String[] number = new String[]{
            "WORDPRESS",
            "THEMES",
            "PLUGIN",
            "LAYOUT",
            "QUESTIONS"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SpinnerItemPosition = (Spinner)findViewById(R.id.spinner1);
        PositionDisplay = (TextView)findViewById(R.id.textView1);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(
                this,R.layout.spinner_item_position,number );

        spinnerArrayAdapter.setDropDownViewResource(R.layout.spinner_item_position);

        SpinnerItemPosition.setAdapter(spinnerArrayAdapter);

        SpinnerItemPosition.setOnItemSelectedListener(new OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // TODO Auto-generated method stub

                Hold = SpinnerItemPosition.getSelectedItemPosition() + 1 ;

                PositionDisplay.setText("Item Position is = " + Hold );

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub

            }
        });

    }
}