package epfl.sweng.showquestions;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import epfl.sweng.R;

public class ShowQuestionsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_questions);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_show_questions, menu);
        return true;
    }
}
