package lt.toochka.flickrphotostream;

import android.app.Application;
import android.content.Context;

/**
 * Created by Toochka on 23/08/14.
 */
public class PhotoStreamApplication extends Application {
    private static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sContext = this;
    }

    /**
     * @return The application {@link Context}.
     */
    public static Context getContext() {
        return sContext;
    }
}
