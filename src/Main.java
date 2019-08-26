import IDTechSDK.*;

/**
 *
 */
public class Main {
    /**
     * @param args List of string arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("\tLogging Level " + args[0]);
            IDTechSDK.IDTechSDKBridge.enableLogging(Integer.valueOf(args[0]));
        }

        OnReceiverListenerImp MessageCallBack = new OnReceiverListenerImp();
        IDT_VP3300_USB device = new IDT_VP3300_USB(MessageCallBack);
        System.out.println(device.device_getDeviceType()); // Returns: IDT_DEVICE_UNKNOWN
        System.out.println(device.device_isConnected()); // Returns: false
    }
}
