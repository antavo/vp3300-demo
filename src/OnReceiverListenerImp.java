import IDTechSDK.*;

/**
 *
 */
public class OnReceiverListenerImp implements OnReceiverListener {
    /**
     * @param card Swiped card
     */
    public void swipeMSRData(IDTMSRData card) {
        System.out.println("Swipe MSR data");
    }

    /**
     * @param mode Display mode
     * @param lines Displayed lines
     * @param timeout Timeout in seconds
     */
    public void lcdDisplay(int mode, String[] lines, int timeout) {
        System.out.println("LCD display");
    }

    /**
     * @param emvData Transaction raw data
     */
    public void emvTransactionData(IDTEMVData emvData) {
        System.out.println("EMV transaction");
    }

    /**
     *
     */
    public void deviceConnected() {
        System.out.println("Device connected");
    }

    /**
     *
     */
    public void deviceDisconnected() {
        System.out.println("Device disconnected");
    }

    /**
     * @param errorCode Timeout error code
     */
    public void timeout(int errorCode) {
        System.out.println("Device timeout");
    }

    /**
     * @param profile Config parameters
     * @deprecated
     */
    public void autoConfigCompleted(StructConfigParameters profile) {
        System.out.println("Auto config completed");
    }

    /**
     * @param progressValue Configuration progress
     * @deprecated
     */
    public void autoConfigProgress(int progressValue) {
        System.out.println("Auto config progress");
    }

    /**
     * @param MACResult Result of the RKI process
     * @deprecated
     */
    public void msgRKICompleted(String MACResult) {
        System.out.println("RKI message completed");
    }

    /**
     * @param dataNotify Notification data
     * @param strMessage Readable string message
     * @deprecated
     */
    public void ICCNotifyInfo(byte[] dataNotify , String strMessage) {
        System.out.println("ICC notify info");
    }

    /**
     * @deprecated
     */
    public void msgBatteryLow() {
        System.out.println("Battery low");
    }

    /**
     * @param index Index of the XML configuration
     * @param strMessage Readable error message
     * @deprecated
     */
    public void LoadXMLConfigFailureInfo(int index , String strMessage) {
        System.out.println("XML config failure");
    }

    /**
     * @deprecated
     */
    public void msgToConnectDevice() {
        System.out.println("Message to connect device");
    }

    /**
     * @deprecated
     */
    public void msgAudioVolumeAjustFailed() {
        System.out.println("Audio volume adjust failed");
    }

    /**
     * @param data Monitored data
     * @param isIncoming True if data is incoming; otherwise false
     */
    public void dataInOutMonitor(byte[] data, boolean isIncoming) {
        System.out.println("In-out monitor data");
    }
}
