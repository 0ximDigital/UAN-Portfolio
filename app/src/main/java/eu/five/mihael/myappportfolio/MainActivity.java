package eu.five.mihael.myappportfolio;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUiElements();
    }

    private void bindUiElements() {
        bindToastToButton(R.id.spotify_streamer_button, R.string.spotify_toast);
        bindToastToButton(R.id.scores_app_button, R.string.scores_toast);
        bindToastToButton(R.id.library_app_button, R.string.library_toast);
        bindToastToButton(R.id.build_it_bigger_button, R.string.build_it_bigger_toast);
        bindToastToButton(R.id.xyz_reader_button, R.string.xyz_toast);
        bindToastToButton(R.id.my_own_app_button, R.string.capstone_toast);
    }

    private void bindToastToButton(@IdRes int buttonId, @StringRes final int stringMessageId) {
        Button button = (Button) findViewById(buttonId);
        if (button == null) {
            return;
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getResources().getString(stringMessageId), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
