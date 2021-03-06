package net.mcclendo.libjavasdl.api.event.events;

import net.mcclendo.libjavasdl.jna.AbstractSdlStructure;

import com.sun.jna.NativeLong;

public final class SDL_JoyBallEvent extends AbstractSdlStructure {

    public int type;
    public int timestamp;
    public NativeLong which;
    public byte ball;
    public byte padding1;
    public byte padding2;
    public byte padding3;
    public short xrel;
    public short yrel;
}
