package factories;

import com.company.DrumFactory;
import com.company.DrumSet;
import products.DWDesign;
import products.DWPerformance;

public class DWDrumFactory extends DrumFactory {
    public DrumSet buildSet(String modelName) {
        DrumSet drumSet = null;

        if (modelName.equals("Design")) drumSet = new DWDesign();
        else if (modelName.equals("Performance")) drumSet = new DWPerformance();

        return drumSet;
    }
}
