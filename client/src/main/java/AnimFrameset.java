import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class AnimFrameset extends SecondaryNode {

	@OriginalMember(owner = "client!nt", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!nt", name = "N", descriptor = "[Lclient!nd;")
	public AnimFrame[] frames;

	@OriginalMember(owner = "client!nt", name = "K", descriptor = "I")
	private final int anInt4499;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(I)V")
	public AnimFrameset(@OriginalArg(0) int arg0) {
		this.anInt4499 = arg0;
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(IB)Z")
	public boolean method4235(@OriginalArg(0) int arg0) {
		return this.frames[arg0].transformsAlpha;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
	public boolean method4237(@OriginalArg(1) int arg0) {
		return this.frames[arg0].transformsColor;
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z")
	public boolean method4240() {
		if (this.frames != null) {
			return true;
		}
		@Pc(34) int local34;
		if (this.aByteArrayArray11 == null) {
			if (!Static392.aClass197_97.isGroupReady(this.anInt4499)) {
				return false;
			}
			@Pc(27) int[] local27 = Static392.aClass197_97.getFileIds(this.anInt4499);
			this.aByteArrayArray11 = new byte[local27.length][];
			for (local34 = 0; local34 < local27.length; local34++) {
				this.aByteArrayArray11[local34] = Static392.aClass197_97.fetchFile(local27[local34], this.anInt4499);
			}
		}
		@Pc(55) boolean local55 = true;
		@Pc(78) int local78;
		for (local34 = 0; local34 < this.aByteArrayArray11.length; local34++) {
			@Pc(64) byte[] local64 = this.aByteArrayArray11[local34];
			local78 = local64[1] & 0xFF | (local64[0] & 0xFF) << 8;
			local55 &= Static78.aClass197_89.isFileReady(local78);
		}
		if (!local55) {
			return false;
		}
		@Pc(103) LinkedList local103 = new LinkedList();
		local78 = Static392.aClass197_97.getGroupCapacity(this.anInt4499);
		this.frames = new AnimFrame[local78];
		@Pc(119) int[] local119 = Static392.aClass197_97.getFileIds(this.anInt4499);
		for (@Pc(121) int local121 = 0; local121 < local119.length; local121++) {
			@Pc(128) byte[] local128 = this.aByteArrayArray11[local121];
			@Pc(142) int local142 = local128[1] & 0xFF | (local128[0] & 0xFF) << 8;
			@Pc(144) AnimBase local144 = null;
			for (@Pc(149) AnimBase local149 = (AnimBase) local103.head(); local149 != null; local149 = (AnimBase) local103.next()) {
				if (local149.id == local142) {
					local144 = local149;
					break;
				}
			}
			if (local144 == null) {
				local144 = new AnimBase(local142, Static78.aClass197_89.method5082(local142));
				local103.addTail(local144);
			}
			this.frames[local119[local121]] = new AnimFrame(local128, local144);
		}
		this.aByteArrayArray11 = null;
		return true;
	}
}
