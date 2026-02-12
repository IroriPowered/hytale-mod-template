package cc.irori.template;

import cc.irori.template.util.Logs;
import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class TemplatePlugin extends JavaPlugin {

    private static final HytaleLogger LOGGER = Logs.logger();

    public TemplatePlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void start() {
        LOGGER.atInfo().log("Hello from TemplateMod!");
    }
}
