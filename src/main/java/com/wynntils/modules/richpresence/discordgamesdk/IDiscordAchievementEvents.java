package com.wynntils.modules.richpresence.discordgamesdk;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.wynntils.modules.richpresence.discordgamesdk.options.DiscordGameSDKOptions;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : line 610</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordAchievementEvents extends Structure implements DiscordGameSDKOptions {

    /** C type : on_user_achievement_update_callback* */
    public IDiscordAchievementEvents.on_user_achievement_update_callback on_user_achievement_update;

    public interface on_user_achievement_update_callback extends Callback, DiscordGameSDKOptions {
        void apply(Pointer event_data, DiscordUserAchievement user_achievement);
    };

    public IDiscordAchievementEvents() {
        super();
    }

    protected List<String> getFieldOrder() {
        return Arrays.asList("on_user_achievement_update");
    }

    /** @param on_user_achievement_update C type : on_user_achievement_update_callback* */
    public IDiscordAchievementEvents(IDiscordAchievementEvents.on_user_achievement_update_callback on_user_achievement_update) {
        super();
        this.on_user_achievement_update = on_user_achievement_update;
    }

    public IDiscordAchievementEvents(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends IDiscordAchievementEvents implements Structure.ByReference {

    };

    public static class ByValue extends IDiscordAchievementEvents implements Structure.ByValue {

    };
}