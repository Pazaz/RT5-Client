import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Preferences extends Class177 {

	@OriginalMember(owner = "client!nk", name = "jc", descriptor = "Z")
	public static boolean sentToServer = true;
	@OriginalMember(owner = "client!pe", name = "O", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "Z")
	public boolean neverRemoveRoofs = false;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Preferences(@OriginalArg(0) Signlink arg0) {
		super.brightness = 3;
		this.setAllVisibleLevels(true);
		super.soundEffectVolume = 127;
		super.highDetailLighting = true;
		super.antiAliasingMode = 0;
		super.areaSoundsVolume = 127;
		super.highDetailWater = true;
		super.manyIdleAnimations = 1;
		super.fullScreenWidth = 0;
		super.groundTextures = true;
		super.flickeringEffects = true;
		super.shadows = 2;
		super.antiAliasingModeDefault = 0;
		super.fullScreenHeight = 0;
		super.characterShadows = true;
		super.fogEnabled = true;
		super.musicVolume = 255;
		super.stereo = true;
		super.highDetailTextures = true;
		super.groundDecoration = true;
		super.roofsVisible = true;
		if (GameShell.maxMemory < 96) {
			setParticles(0);
		} else {
			setParticles(2);
		}
		super.cursorsEnabled = true;
		super.groundBlending = true;
		super.safeMode = false;
		super.windowMode = 2;
		super.buildArea = 0;
		super.cpuUsage = Static201.anInt3699 == 1 ? 2 : 4;
		super.bloomEnabled = false;
		super.anInt4878 = 2;
		super.favouriteWorlds = 0;
		super.aBoolean351 = false;
		@Pc(125) FileOnDisk local125 = null;
		try {
			@Pc(129) PrivilegedRequest local129 = arg0.openPreferences();
			while (local129.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (local129.status == 1) {
				local125 = (FileOnDisk) local129.result;
				@Pc(153) byte[] local153 = new byte[(int) local125.length()];
				@Pc(168) int local168;
				for (@Pc(155) int local155 = 0; local155 < local153.length; local155 += local168) {
					local168 = local125.read(local153.length - local155, local155, local153);
					if (local168 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4499(new Buffer(local153));
			}
		} catch (@Pc(193) Exception local193) {
		}
		try {
			if (local125 != null) {
				local125.close();
			}
		} catch (@Pc(200) Exception local200) {
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	public static void setParticles(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static153.anInt2794 = arg0;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	public static int getParticles() {
		return Static153.anInt2794;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I")
	public int method4492(@OriginalArg(1) int arg0) {
		if (this.neverRemoveRoofs) {
			return 0;
		} else if (this.method4495(arg0)) {
			return super.roofsVisible ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
	public void setAllVisibleLevels(@OriginalArg(0) boolean arg0) {
		super.allLevelsVisible = arg0;
		if (client.LocTypes != null) {
			client.LocTypes.method5160(!this.method4495(Static77.anInt1762));
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Lclient!bt;")
	public Buffer encode() {
		@Pc(8) Buffer buf = new Buffer(39);
		buf.p1(16); // version
		buf.p1(super.brightness);
		buf.p1(super.allLevelsVisible ? 1 : 0);
		buf.p1(super.roofsVisible ? 1 : 0);
		buf.p1(super.groundDecoration ? 1 : 0);
		buf.p1(super.highDetailTextures ? 1 : 0);
		buf.p1(0);
		buf.p1(super.flickeringEffects ? 1 : 0);
		buf.p1(super.groundTextures ? 1 : 0);
		buf.p1(super.characterShadows ? 1 : 0);
		buf.p1(super.shadows);
		buf.p1(super.highDetailLighting ? 1 : 0);
		buf.p1(super.highDetailWater ? 1 : 0);
		buf.p1(super.fogEnabled ? 1 : 0);
		buf.p1(super.antiAliasingModeDefault);
		buf.p1(super.stereo ? 1 : 0);
		buf.p1(super.soundEffectVolume);
		buf.p1(super.musicVolume);
		buf.p1(super.areaSoundsVolume);
		buf.p2(super.fullScreenWidth);
		buf.p2(super.fullScreenHeight);
		buf.p1(getParticles());
		buf.p4(super.favouriteWorlds);
		buf.p1(super.windowMode);
		buf.p1(super.safeMode ? 1 : 0);
		buf.p1(super.aBoolean351 ? 1 : 0);
		buf.p1(super.buildArea);
		buf.p1(super.bloomEnabled ? 1 : 0);
		buf.p1(super.cursorsEnabled ? 1 : 0);
		buf.p1(super.manyIdleAnimations);
		buf.p1(super.groundBlending ? 1 : 0);
		buf.p1(super.anInt4878);
		buf.p1(super.cpuUsage);
		buf.p1(super.aBoolean360 ? 0 : 1);
		return buf;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z")
	public boolean method4495(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean365 ? super.allLevelsVisible : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Z")
	public boolean isAllLevelsVisible(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.allLevelsVisible : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ml;)V")
	public void write(@OriginalArg(1) Signlink arg0) {
		@Pc(7) FileOnDisk local7 = null;
		try {
			@Pc(17) PrivilegedRequest local17 = arg0.openPreferences();
			while (local17.status == 0) {
				ThreadUtils.sleep(1L);
			}
			if (local17.status == 1) {
				local7 = (FileOnDisk) local17.result;
				@Pc(39) Buffer local39 = this.encode();
				local7.write(local39.data, local39.pos, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.close();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!bt;)V")
	private void method4499(@OriginalArg(1) Buffer arg0) {
		if (arg0.data.length - arg0.pos < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.g1();
		if (local21 < 0 || local21 > 16) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 16) {
			local34 = 38;
		} else if (local21 == 15) {
			local34 = 37;
		} else if (local21 == 14) {
			local34 = 36;
		} else if (local21 == 13) {
			local34 = 35;
		} else if (local21 == 12) {
			local34 = 34;
		} else if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.data.length - arg0.pos) {
			return;
		}
		super.brightness = arg0.g1();
		if (super.brightness < 1) {
			super.brightness = 1;
		} else if (super.brightness > 4) {
			super.brightness = 4;
		}
		this.setAllVisibleLevels(arg0.g1() == 1);
		super.roofsVisible = arg0.g1() == 1;
		super.groundDecoration = arg0.g1() == 1;
		super.highDetailTextures = arg0.g1() == 1;
		super.manyIdleAnimations = arg0.g1() == 1 ? 1 : 0;
		super.flickeringEffects = arg0.g1() == 1;
		super.groundTextures = arg0.g1() == 1;
		super.characterShadows = arg0.g1() == 1;
		super.shadows = arg0.g1();
		if (super.shadows > 2) {
			super.shadows = 2;
		}
		if (local21 < 2) {
			super.highDetailLighting = arg0.g1() == 1;
			arg0.g1();
		} else {
			super.highDetailLighting = arg0.g1() == 1;
		}
		super.highDetailWater = arg0.g1() == 1;
		super.fogEnabled = arg0.g1() == 1;
		super.antiAliasingModeDefault = arg0.g1();
		if (super.antiAliasingModeDefault > 2) {
			super.antiAliasingModeDefault = 2;
		}
		super.antiAliasingMode = super.antiAliasingModeDefault;
		super.stereo = arg0.g1() == 1;
		super.soundEffectVolume = arg0.g1();
		if (super.soundEffectVolume > 127) {
			super.soundEffectVolume = 127;
		}
		super.musicVolume = arg0.g1();
		super.areaSoundsVolume = arg0.g1();
		if (super.areaSoundsVolume > 127) {
			super.areaSoundsVolume = 127;
		}
		if (local21 >= 1) {
			super.fullScreenWidth = arg0.g2();
			super.fullScreenHeight = arg0.g2();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.g1();
		}
		@Pc(437) int local437;
		if (local21 >= 4) {
			local437 = arg0.g1();
			if (local437 < 0 || local437 > 2) {
				local437 = 0;
			}
			if (GameShell.maxMemory < 96) {
				local437 = 0;
			}
			setParticles(local437);
		}
		if (local21 >= 5) {
			super.favouriteWorlds = arg0.g4();
		}
		local437 = 0;
		if (local21 >= 6) {
			super.windowMode = local437 = arg0.g1();
		}
		if (super.windowMode != 1 && super.windowMode != 2) {
			super.windowMode = 2;
		}
		if (local21 >= 7) {
			super.safeMode = arg0.g1() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean351 = arg0.g1() == 1;
		}
		if (local21 >= 9) {
			super.buildArea = arg0.g1();
		}
		if (super.buildArea < 0 || super.buildArea > Static289.method5019(GameShell.maxMemory)) {
			super.buildArea = 0;
		}
		if (local21 >= 10) {
			super.bloomEnabled = arg0.g1() != 0;
		}
		if (local21 >= 11) {
			super.cursorsEnabled = arg0.g1() != 0;
		}
		if (local21 >= 12) {
			super.manyIdleAnimations = arg0.g1();
		}
		if (super.manyIdleAnimations < 0 || super.manyIdleAnimations > 2) {
			super.manyIdleAnimations = 1;
		}
		if (local21 >= 13) {
			super.groundBlending = arg0.g1() == 1;
		}
		if (local21 >= 14) {
			super.anInt4878 = arg0.g1();
		} else if (local437 == 0) {
			super.anInt4878 = 2;
		} else {
			super.anInt4878 = 1;
		}
		if (super.anInt4878 < 0 || super.anInt4878 > 3) {
			super.anInt4878 = 2;
		}
		if (local21 >= 15) {
			super.cpuUsage = arg0.g1();
			if (super.cpuUsage < 0 || super.cpuUsage > 4) {
				super.cpuUsage = Static201.anInt3699 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean360 = arg0.g1() != 1;
		}
	}
}
