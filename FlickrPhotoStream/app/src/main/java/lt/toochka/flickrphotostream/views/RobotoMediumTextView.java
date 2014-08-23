package lt.toochka.flickrphotostream.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import lt.toochka.flickrphotostream.views.util.FontsUtil;

/**
 * Created by Toochka on 23/08/14.
 */
public class RobotoMediumTextView extends TextView {
    public RobotoMediumTextView(final Context context) {
        super(context);
        init();
    }

    public RobotoMediumTextView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RobotoMediumTextView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        setTypeface(FontsUtil.getFont(FontsUtil.Font.RobotoMedium));
    }
}
