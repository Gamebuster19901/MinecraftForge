package net.minecraftforge.event.entity;

import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event.HasResult;

/**
 * EntityRemovedFromWorld is fired after an entity has been
 * completely removed from a world. <br><br>
 * 
 * This event is fired from {@link net.minecraft.entity.Entity#onRemovedFromWorld()}.<br>
 * <br>
 * This event is not {@link net.minecraftforge.eventbus.api.Cancelable}.<br>
 * <br>
 * This event does not have a result. {@link HasResult}<br>
 * <br>
 * This event is fired on the {@link MinecraftForge#EVENT_BUS}.<br>
 **/
public class EntityRemovedFromWorldEvent extends EntityEvent {

    public EntityRemovedFromWorldEvent(Entity entity) {
        super(entity);
    }

}
