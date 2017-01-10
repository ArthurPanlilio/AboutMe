package tcss450.uw.edu.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class ShowImageActivity extends AppCompatActivity {

    private static final String TAG = "ShowImageActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_image);
        ImageView image = (ImageView) findViewById(R.id.imageview_id);
        image.setImageResource(R.drawable.windows);
        Log.i(TAG, "onCreate");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.w(TAG, "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(TAG, "onStart");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.v(TAG, "onStop");
    }
}
