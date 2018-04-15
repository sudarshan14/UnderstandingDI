package sud.bhatt.understandingdi;

import dagger.Component;
import sud.bhatt.understandingdi.WithDependencyInjecion.War;



@Component
interface  BattleComponent{
    War getWar();

}
public class BattleOfBasterds {

    public static void main(String[] args) {
        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();
    }
}
