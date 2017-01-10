package tcss450.uw.edu.aboutme;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void showInfo(View view) {
        Intent intent = new Intent(MainActivity.this, ShowInfoActivity.class);
        startActivity(intent);

    }

    public void showImage(View view) {
        Intent intent = new Intent(MainActivity.this, ShowImageActivity.class);
        startActivity(intent);

    }

    public void showWeb(View view){
        Uri webpage = Uri.parse("http://developer.android.com/index.html");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        Log.v(TAG, "showWeb");
        startActivity(webIntent);
    }

    public void showToast(View view){
        Context context = getApplicationContext();
        CharSequence text = "hi";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        Log.v(TAG, "showToast");
        toast.show();
    }

    public void showDialog(View view){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("This is an alert");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        Log.v(TAG, "showDialog");
        alertDialog.show();
    }
}
