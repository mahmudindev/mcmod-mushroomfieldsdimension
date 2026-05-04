package com.github.mahmudindev.mcmod.mushroomfieldsdimension;

import com.github.mahmudindev.mcmod.mushroomfieldsdimension.platform.Services;
import com.github.mahmudindev.mcmod.mushroomfieldsdimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class MushroomFieldsDimension {
    public static final String MOD_ID = "mushroomfieldsdimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
