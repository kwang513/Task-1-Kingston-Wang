package android.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextClock tc1, tc2, tc3, tc4, tc5;
    private Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tc1 = findViewById(R.id.tc1);
        tc1.setTimeZone("Australia/Sydney");

        tc2 = findViewById(R.id.tc2);
        tc2.setTimeZone("America/New_York");

        tc3 = findViewById(R.id.tc3);
        tc3.setTimeZone("Asia/Tokyo");

        tc4 = findViewById(R.id.tc4);
        tc4.setTimeZone("Asia/Taipei");

        tc5 = findViewById(R.id.tc5);
        tc5.setTimeZone("America/Vancouver");

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tc1.setFormat12Hour("MMM d, hh:mm:ss a");
                tc2.setFormat12Hour("MMM d, hh:mm:ss a");
                tc3.setFormat12Hour("MMM d, hh:mm:ss a");
                tc4.setFormat12Hour("MMM d, hh:mm:ss a");
                tc5.setFormat12Hour("MMM d, hh:mm:ss a");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tc1.setFormat12Hour("MMM d, H:mm");
                tc2.setFormat12Hour("MMM d, H:mm");
                tc3.setFormat12Hour("MMM d, H:mm");
                tc4.setFormat12Hour("MMM d, H:mm");
                tc5.setFormat12Hour("MMM d, H:mm");
            }
        });
    }
}
