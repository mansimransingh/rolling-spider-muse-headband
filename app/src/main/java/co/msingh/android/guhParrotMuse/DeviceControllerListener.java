package co.msingh.android.guhParrotMuse;
public interface DeviceControllerListener
{
    public void onDisconnect();
    public void onUpdateBattery(final byte percent);
}
