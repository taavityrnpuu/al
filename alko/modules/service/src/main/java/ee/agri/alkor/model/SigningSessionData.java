package ee.agri.alkor.model;

import org.digidoc4j.Container;
import org.digidoc4j.DataToSign;


import java.io.Serializable;

public class SigningSessionData implements Serializable {

    private Container container;
    private DataToSign dataToSign;

    public void setContainer(Container container) {
        this.container = container;
    }

    public Container getContainer() {
        return container;
    }

    public void setDataToSign(DataToSign dataToSign) {
        this.dataToSign = dataToSign;
    }

    public DataToSign getDataToSign() {
        return dataToSign;
    }
}
