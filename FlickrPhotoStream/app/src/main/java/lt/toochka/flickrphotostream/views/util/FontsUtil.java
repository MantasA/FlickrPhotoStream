package lt.toochka.flickrphotostream.views.util;

import android.graphics.Typeface;

import lt.toochka.flickrphotostream.PhotoStreamApplication;

/**
 * Created by Toochka on 23/08/14.
 */
public class FontsUtil {
    /**
     * @param pFont The {@link lt.toochka.flickrphotostream.views.util.FontsUtil.Font}.
     * @return The {@link android.graphics.Typeface} to given font.
     */
    public static final Typeface getFont(final Font pFont) {
        if (pFont == null) {
            throw new IllegalArgumentException("pFont == null");
        }

        return Typeface.createFromAsset(PhotoStreamApplication.getContext().getAssets(), pFont.getFontPath());
    }

    private FontsUtil() {
        /* empty */
    }

    public static enum Font {
        RobotoMedium("assets/Roboto-Medium.ttf"),
        RobotoRegular("assets/Roboto-Regular.ttf");

        private final String mFontPath;

        private Font(final String pFontPath) {
            if (pFontPath == null || pFontPath.equals("")) {
                throw new IllegalArgumentException("pFontPath == null || pFontPath.equals(\"\")");
            }

            mFontPath = pFontPath;
        }

        public String getFontPath() {
            return mFontPath;
        }
    }
}
