package tcss450.uw.edu.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_info);
        TextView textElement = (TextView) findViewById(R.id.text_id);
        textElement.setText(R.string.Info);
    }


}
