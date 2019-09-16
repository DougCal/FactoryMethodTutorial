package factories;

import com.company.DrumFactory;
import com.company.DrumSet;
import products.PearlRoadShow;
import products.PearlSessionStudio;

public class PearlDrumFactory extends DrumFactory {

    protected DrumSet buildSet(String model) {
        DrumSet drumSet = null;

        if (model.equals("RoadShow")) drumSet = new PearlRoadShow();
        else if (model.equals("SessionStudio")) drumSet = new PearlSessionStudio();

        return drumSet;
    }
}
