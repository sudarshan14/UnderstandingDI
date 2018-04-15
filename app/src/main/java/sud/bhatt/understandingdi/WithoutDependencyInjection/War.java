package sud.bhatt.understandingdi.WithoutDependencyInjection;

import javax.inject.Inject;

import sud.bhatt.understandingdi.RequiredDependencies.Bolton;
import sud.bhatt.understandingdi.RequiredDependencies.Starks;

public class War {

    // war class needs Starks and Boltan class. SO war is dependent on these two class.
//    this is hard dependency cause if the war is between some other classes,
// there is a lot that needs to be changed in the war class.
//https://medium.com/@harivigneshjayapalan/dagger-2-for-android-beginners-di-part-i-f5cc4e5ad878

    private Starks starks;
    private Bolton bolton;

    @Inject
    public War() {

        starks = new Starks();
        bolton = new Bolton();

        starks.prepareForWar();
        ;
        starks.reportForWar();

        bolton.prepareForWar();
        bolton.reportForWar();

    }
}
