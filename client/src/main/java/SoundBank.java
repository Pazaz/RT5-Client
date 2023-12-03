import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class SoundBank {

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Lclient!ad;")
	private final HashTable aClass4_11 = new HashTable(256);

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!ad;")
	private final HashTable cache = new HashTable(256);

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "Lclient!r;")
	private final Js5 aClass197_4;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "Lclient!r;")
	private final Js5 synthArchive;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!r;Lclient!r;)V")
	public SoundBank(@OriginalArg(0) Js5 arg0, @OriginalArg(1) Js5 arg1) {
		this.aClass197_4 = arg1;
		this.synthArchive = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)Lclient!jn;")
	public PcmSound method869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass197_4.capacity() == 1) {
			return this.method874(arg1, arg0, 0);
		} else if (this.aClass197_4.getGroupCapacity(arg1) == 1) {
			return this.method874(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI[I)Lclient!jn;")
	public PcmSound method871(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.synthArchive.capacity() == 1) {
			return this.getSynthSound(arg0, arg1, 0);
		} else if (this.synthArchive.getGroupCapacity(arg0) == 1) {
			return this.getSynthSound(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[III)Lclient!jn;")
	private PcmSound getSynthSound(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | arg2 << 4 & 0xFFF8) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) PcmSound local31 = (PcmSound) this.cache.get(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(54) SynthSound local54 = SynthSound.create(this.synthArchive, arg2, arg0);
			if (local54 == null) {
				return null;
			}
			local31 = local54.toPcmSound();
			this.cache.put(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.samples.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[II)Lclient!jn;")
	private PcmSound method874(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 << 4 & 0xFFF9 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) PcmSound local33 = (PcmSound) this.cache.get(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class2_Sub27 local55 = (Class2_Sub27) this.aClass4_11.get(local26);
			if (local55 == null) {
				local55 = Static267.method4520(this.aClass197_4, arg2, arg0);
				if (local55 == null) {
					return null;
				}
				this.aClass4_11.put(local55, local26);
			}
			local33 = local55.method4519(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.unlink();
				this.cache.put(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
