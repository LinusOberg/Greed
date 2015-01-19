package c11log.greed;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private die[] diceButtons = new die[6];
    private scoreCalc scoreCalculator = new scoreCalc();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diceButtons[0] = (die) findViewById(R.id.one);
        diceButtons[1] = (die) findViewById(R.id.two);
        diceButtons[2] = (die) findViewById(R.id.three);
        diceButtons[3] = (die) findViewById(R.id.four);
        diceButtons[4] = (die) findViewById(R.id.five);
        diceButtons[5] = (die) findViewById(R.id.six);

        if (savedInstanceState == null) {
            //start new game
        }
        int i =1;
        for(Button die : diceButtons) {
            die.setBackgroundResource(R.drawable.white1);
            i++;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void diceClicked(View view) {
        switch(view.getId()) {
            case R.id.one:
                diceButtons[0].dieActivate(!diceButtons[0].isActive());
                break;
            case R.id.two:
                diceButtons[1].dieActivate(!diceButtons[1].isActive());
                break;
            case R.id.three:
                diceButtons[2].dieActivate(!diceButtons[2].isActive());
                break;
            case R.id.four:
                diceButtons[3].dieActivate(!diceButtons[3].isActive());
                break;
            case R.id.five:
                diceButtons[4].dieActivate(!diceButtons[4].isActive());
                break;
            case R.id.six:
                diceButtons[5].dieActivate(!diceButtons[5].isActive());
                break;
        }
    }

    public void throwClicked(View view) {
    for(die oneDie : diceButtons){
        oneDie.rollDie();
    }
    }

    public void scoreClicked(View view) {

        int score = scoreCalculator.calcScore(diceButtons);
        TextView t = (TextView)findViewById(R.id.txt_score);
        t.setText("Score: "+score);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }
}
