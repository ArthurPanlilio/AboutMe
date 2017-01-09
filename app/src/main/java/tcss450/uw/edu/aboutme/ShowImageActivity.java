package tcss450.uw.edu.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ShowImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);
        ImageView image = (ImageView) findViewById(R.id.imageview_id);
        image.setImageResource(R.drawable.a);
    }
}
