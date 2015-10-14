package yuricfurusho.testedatabinding100;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstName = (TextView) findViewById(R.id.tFirstName);
        firstName.setText("Yuri");

        TextView lastName = (TextView) findViewById(R.id.tLastName);
        lastName.setText("Furusho");

    }
}
