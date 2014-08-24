package lt.toochka.photostream.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import lt.toochka.photostream.views.util.FontsUtil;

/**
 * Created by Toochka on 23/08/14.
 */
public class RobotoMediumTextView extends TextView {
    public RobotoMediumTextView(final Context context) {
        super(context);
        init(context);
    }

    public RobotoMediumTextView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public RobotoMediumTextView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(final Context pContext) {
        setTypeface(FontsUtil.getFont(pContext, FontsUtil.Font.RobotoMedium));
    }

    @Override
    public boolean isInEditMode() {
        return true;
    }
}
