package lt.toochka.photostream.activities;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Toochka on 24/08/14.
 */
public abstract class BaseActivity extends ActionBarActivity {
    public abstract void initUI();

    public abstract void initValues();

    public abstract void initListeners();
}
