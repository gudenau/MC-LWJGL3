package net.gudenau.lwjgl3;

import com.google.common.eventbus.EventBus;
import net.minecraftforge.fml.common.DummyModContainer;
import net.minecraftforge.fml.common.LoadController;
import net.minecraftforge.fml.common.ModMetadata;

import java.util.Collections;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings("unused")
public class LWJGL3Container extends DummyModContainer{
    public LWJGL3Container(){
        super(new ModMetadata());
        
        ModMetadata metadata = getMetadata();
        metadata.name = "LWJGL 3";
        metadata.modId = "gud_lwjgl3";
        metadata.description = "Modifies Minecraft to use a newer version of LWJGL to allow more features in mods.";
        metadata.authorList = Collections.singletonList("gudenau");
    }

    @Override
    public boolean registerBus(EventBus bus, LoadController controller){
        return true;
    }
}
