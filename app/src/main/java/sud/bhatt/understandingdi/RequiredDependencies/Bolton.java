package sud.bhatt.understandingdi.RequiredDependencies;

import javax.inject.Inject;

public class Bolton implements House {

    @Inject
    public Bolton() {

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
