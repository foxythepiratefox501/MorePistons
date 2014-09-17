/**
 * Created by Alireza Khodakarami on 9/17/2014.
 */

package com.gollumteam.morepistons.utility;

import net.minecraft.util.StatCollector;

public class Lang
{
    public static final String prefix = "enderio.";

    public static String localize(String s) {
        return localize(s, true);
    }

    public static String localize(String s, boolean appendEIO) {
        if(appendEIO) {
            s = prefix + s;
        }
        return StatCollector.translateToLocal(s);
    }

    public static String[] localizeList(String string) {
        String s = localize(string);
        return s.split("\\|");
    }
}
