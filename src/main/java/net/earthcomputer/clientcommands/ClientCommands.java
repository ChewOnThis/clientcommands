package net.earthcomputer.clientcommands;

import com.mojang.brigadier.CommandDispatcher;
import net.earthcomputer.clientcommands.command.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v1.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;

import java.io.File;

public class ClientCommands implements ClientModInitializer {

    public static File configDir;

    @Override
    public void onInitializeClient() {
        registerCommands(ClientCommandManager.DISPATCHER);

        configDir = new File(FabricLoader.getInstance().getConfigDirectory(), "clientcommands");
        //noinspection ResultOfMethodCallIgnored
        configDir.mkdirs();
    }

    public static void registerCommands(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        BookCommand.register(dispatcher);
        LookCommand.register(dispatcher);
        NoteCommand.register(dispatcher);
        ShrugCommand.register(dispatcher);
        FindCommand.register(dispatcher);
        FindBlockCommand.register(dispatcher);
        FindItemCommand.register(dispatcher);
        TaskCommand.register(dispatcher);
        CalcCommand.register(dispatcher);
        TempRuleCommand.register(dispatcher);
        RenderCommand.register(dispatcher);
        UsageTreeCommand.register(dispatcher);
        WikiCommand.register(dispatcher);
        CEnchantCommand.register(dispatcher);
        GlowCommand.register(dispatcher);
        GetDataCommand.register(dispatcher);
        CalcStackCommand.register(dispatcher);
        GammaCommand.register(dispatcher);
        MoteCommand.register(dispatcher);
        ChorusCommand.register(dispatcher);
        FishCommand.register(dispatcher);
        SignSearchCommand.register(dispatcher);
        GhostBlockCommand.register(dispatcher);
        RelogCommand.register(dispatcher);
        CGiveCommand.register(dispatcher);
        CPlaySoundCommand.register(dispatcher);
        CStopSoundCommand.register(dispatcher);
        FovCommand.register(dispatcher);
        HotbarCommand.register(dispatcher);
        KitCommand.register(dispatcher);
        ItemGroupCommand.register(dispatcher);
        CParticleCommand.register(dispatcher);
        PermissionLevelCommand.register(dispatcher);
        CTellRawCommand.register(dispatcher);
        CTimeCommand.register(dispatcher);
        AliasCommand.register(dispatcher);
        AreaStatsCommand.register(dispatcher);
        CTeleportCommand.register(dispatcher);
        PlayerInfoCommand.register(dispatcher);

        CrackRNGCommand.register(dispatcher);

        if (MinecraftClient.getInstance().isIntegratedServerRunning()) {
            CheatCrackRNGCommand.register(dispatcher);
        }
    }
}
