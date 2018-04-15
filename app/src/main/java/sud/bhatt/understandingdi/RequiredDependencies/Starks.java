package sud.bhatt.understandingdi.RequiredDependencies;

import javax.inject.Inject;

import sud.bhatt.understandingdi.RequiredDependencies.House;

public class Starks implements House {

    @Inject


    public Starks() {

    }


    @Override
    public void prepareForWar() {
        System.out.println("" + this.getClass().getSimpleName() + "Preparing for War");
    }


    @Override
    public void reportForWar() {
        System.out.println("" + this.getClass().getSimpleName() + "Reporting for War");
    }
}
