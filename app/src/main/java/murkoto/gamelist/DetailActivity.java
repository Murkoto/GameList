package murkoto.gamelist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    TextView gameTitle;
    TextView gameDeveloper;
    TextView gameGenre;
    TextView gameYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        gameTitle = (TextView) findViewById(R.id.game_title);
        gameDeveloper = (TextView) findViewById(R.id.game_developer);
        gameGenre = (TextView) findViewById(R.id.game_genre);
        gameYear = (TextView) findViewById(R.id.game_year);

        gameTitle.setText(intent.getStringExtra("title"));
        gameDeveloper.setText(intent.getStringExtra("developer"));
        gameGenre.setText(intent.getStringExtra("genre"));
        gameYear.setText(intent.getStringExtra("year"));
    }
}
