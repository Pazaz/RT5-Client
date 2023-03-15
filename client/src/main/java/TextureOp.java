import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public abstract class TextureOp extends Node {

	@OriginalMember(owner = "client!jq", name = "x", descriptor = "Lclient!vs;")
	protected ColorImageCache colorImageCache;

	@OriginalMember(owner = "client!jq", name = "y", descriptor = "Lclient!nc;")
	protected MonochromeImageCache monochromeImageCache;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
	public int anInt7251;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "[Lclient!jq;")
	public final TextureOp[] ops;

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "Z")
	public boolean monochrome;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IZ)V")
	protected TextureOp(@OriginalArg(0) int size, @OriginalArg(1) boolean monochrome) {
		this.ops = new TextureOp[size];
		this.monochrome = monochrome;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IZI)[I")
	protected final int[] getChildMonochromeOutput(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.ops[arg0].monochrome ? this.ops[arg0].getMonochromeOutput(arg1) : this.ops[arg0].getColorOutput(arg1)[0];
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)V")
	public void method6475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = this.anInt7251 == 255 ? arg0 : this.anInt7251;
		if (this.monochrome) {
			this.monochromeImageCache = new MonochromeImageCache(local12, arg0, arg1);
		} else {
			this.colorImageCache = new ColorImageCache(local12, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void clearImageCache() {
		if (this.monochrome) {
			this.monochromeImageCache.clear();
			this.monochromeImageCache = null;
		} else {
			this.colorImageCache.clear();
			this.colorImageCache = null;
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I")
	public int method6478() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(IB)[[I")
	public int[][] getColorOutput(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V")
	public void postDecode() {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(Z)I")
	public int method6482() {
		return -1;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(IZI)[[I")
	protected final int[][] getChildColorOutput(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.ops[arg0].monochrome) {
			@Pc(22) int[] local22 = this.ops[arg0].getMonochromeOutput(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.ops[arg0].getColorOutput(arg1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!bt;I)V")
	public void decode(@OriginalArg(0) int arg0, @OriginalArg(1) Buffer arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[I")
	public int[] getMonochromeOutput(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
