package org.kojo.staterkit.model;

import org.kojo.staterkit.view.HomeFragment;
import org.kojo.staterkit.view.StoryFragment;

/**
 * Created by wisaruthkea on 9/27/13.
 */
public final class Content {
    public static final String[] TITLES = {
      "Home",
      "Story",
      "Settings"
    };
    public static final Class[] MY_CLS = {
            HomeFragment.class,
            StoryFragment.class,
            StoryFragment.class
    };
}
