package sud.bhatt.understandingdi.WithDependencyInjecion;

import sud.bhatt.understandingdi.RequiredDependencies.Bolton;
import sud.bhatt.understandingdi.RequiredDependencies.Starks;

public class War {

    private Starks starks;
    private Bolton bolton;



    public War(Bolton bolton, Starks starks){
        this.bolton= bolton;
        this.starks = starks;
    }


    public void prepare(){
        bolton.prepareForWar();
        starks.reportForWar();


    }


    public void report(){

        bolton.reportForWar();
        starks.reportForWar();

    }
}
