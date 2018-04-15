package sud.bhatt.understandingdi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import sud.bhatt.understandingdi.WithDependencyInjecion.War;
import sud.bhatt.understandingdi.RequiredDependencies.Bolton;
import sud.bhatt.understandingdi.RequiredDependencies.Starks;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void startWar(View v) {
//Here’s the class BattleOfBastards, where we create the dependencies Starks and Boltons
// and inject them via constructors to the class War — as War is dependent on the dependencies Starks and Boltons.
        Starks starks = new Starks();
        Bolton bolton = new Bolton();
        War war = new War(bolton, starks);
        war.prepare();
        war.report();


    }
}
