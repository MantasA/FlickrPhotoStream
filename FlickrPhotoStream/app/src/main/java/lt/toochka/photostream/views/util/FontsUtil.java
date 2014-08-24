package lt.toochka.photostream.views.util;

import android.content.Context;
import android.graphics.Typeface;

import lt.toochka.photostream.PhotoStreamApplication;

/**
 * Created by Toochka on 23/08/14.
 */
public class FontsUtil {
    /**
     * @param pFont The {@link lt.toochka.photostream.views.util.FontsUtil.Font}.
     * @return The {@link android.graphics.Typeface} to given font.
     */
    public static final Typeface getFont(Context pContext, final Font pFont) {
        if (pContext == null) {
            pContext = PhotoStreamApplication.getContext();
        }

        if (pFont == null) {
            throw new IllegalArgumentException("pFont == null");
        }

        try {
            return Typeface.createFromAsset(pContext.getAssets(), pFont.getFontPath());
        } catch (Exception e) {
            // This is only for UI drawing. Should never happen on a device
            return Typeface.DEFAULT;
        }
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
