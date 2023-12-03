import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class AreaSound extends Node {

	@OriginalMember(owner = "client!jc", name = "s", descriptor = "Lclient!nh;")
	public Player player;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public int sound;

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
	public int maxXFine;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
	public int maxInterval;

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "Lclient!qn;")
	public Class2_Sub12_Sub4 secondaryStream;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Z")
	public boolean multiLocOrNpc;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
	public int minXFine;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!oe;")
	public Npc npc;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public int radius;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	public int minInterval;

	@OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
	public int maxZFine;

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "I")
	public int level;

	@OriginalMember(owner = "client!jc", name = "K", descriptor = "Lclient!qn;")
	public Class2_Sub12_Sub4 primaryStream;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
	public int volume;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
	public int remainingLoops;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "Lclient!ct;")
	public LocType aClass41_1;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "[I")
	public int[] sounds;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
	public int minZFine;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	public int movementSpeed = 0;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V")
	public void update() {
		@Pc(8) int local8 = this.sound;
		if (this.aClass41_1 != null) {
			@Pc(88) LocType locType = this.aClass41_1.method1533(VarpDomain.instance);
			if (locType == null) {
				this.sound = -1;
				this.minInterval = 0;
				this.volume = 0;
				this.sounds = null;
				this.radius = 0;
				this.maxInterval = 0;
			} else {
				this.minInterval = locType.bgsoundmin;
				this.maxInterval = locType.bgsoundmax;
				this.volume = locType.anInt1320;
				this.radius = locType.bgsoundrange * 128;
				this.sound = locType.bgsound;
				this.sounds = locType.bgsounds;
			}
		} else if (this.npc != null) {
			@Pc(42) int sound = Static340.getSound(this.npc);
			if (sound != local8) {
				this.sound = sound;
				@Pc(52) NpcType npcType = this.npc.type;
				if (npcType.multiNpcs != null) {
					npcType = npcType.getMultiNpc(VarpDomain.instance);
				}
				if (npcType == null) {
					this.volume = this.radius = 0;
				} else {
					this.radius = npcType.anInt2022 * 128;
					this.volume = npcType.anInt2051;
				}
			}
		} else if (this.player != null) {
			this.sound = Player.getSound(this.player);
			this.radius = this.player.soundRadius * 128;
			this.volume = this.player.soundVolume;
		}
		if (this.sound != local8 && this.primaryStream != null) {
			client.soundStream.removeSubStream(this.primaryStream);
			this.primaryStream = null;
		}
	}
}
