package lt.toochka.photostream.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import lt.toochka.photostream.views.util.FontsUtil;

/**
 * Created by Toochka on 23/08/14.
 */
public class RobotoRegularTextView extends TextView {
    public RobotoRegularTextView(final Context context) {
        super(context);
        init(context);
    }

    public RobotoRegularTextView(final Context context, final AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public RobotoRegularTextView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(final Context pContext) {
        setTypeface(FontsUtil.getFont(pContext, FontsUtil.Font.RobotoRegular));
    }

    @Override
    public boolean isInEditMode() {
        return true;
    }
}
