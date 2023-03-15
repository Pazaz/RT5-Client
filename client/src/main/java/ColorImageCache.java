import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class ColorImageCache {

	@OriginalMember(owner = "client!km", name = "j", descriptor = "Lclient!wh;")
	public static final ColorImageCacheEntry VALID = new ColorImageCacheEntry(0, 0);
	@OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
	private int singleRow = -1;

	@OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
	private int size = 0;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!ld;")
	private LinkedList recentlyUsed = new LinkedList();

	@OriginalMember(owner = "client!vs", name = "w", descriptor = "Z")
	public boolean invalid = false;

	@OriginalMember(owner = "client!vs", name = "s", descriptor = "I")
	private final int capacity;

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
	private final int height;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[[[I")
	private int[][][] pixels;

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "[Lclient!wh;")
	private ColorImageCacheEntry[] entries;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(III)V")
	public ColorImageCache(@OriginalArg(0) int capacity, @OriginalArg(1) int height, @OriginalArg(2) int width) {
		this.capacity = capacity;
		this.height = height;
		this.pixels = new int[this.capacity][3][width];
		this.entries = new ColorImageCacheEntry[this.height];
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)[[I")
	public int[][] get(@OriginalArg(0) int arg0) {
		if (this.height == this.capacity) {
			this.invalid = this.entries[arg0] == null;
			this.entries[arg0] = VALID;
			return this.pixels[arg0];
		} else if (this.capacity == 1) {
			this.invalid = arg0 != this.singleRow;
			this.singleRow = arg0;
			return this.pixels[0];
		} else {
			@Pc(30) ColorImageCacheEntry local30 = this.entries[arg0];
			if (local30 == null) {
				this.invalid = true;
				if (this.size >= this.capacity) {
					@Pc(55) ColorImageCacheEntry local55 = (ColorImageCacheEntry) this.recentlyUsed.tail();
					local30 = new ColorImageCacheEntry(arg0, local55.row);
					this.entries[local55.index] = null;
					local55.unlink();
				} else {
					local30 = new ColorImageCacheEntry(arg0, this.size);
					this.size++;
				}
				this.entries[arg0] = local30;
			} else {
				this.invalid = false;
			}
			this.recentlyUsed.addHead(local30);
			return this.pixels[local30.row];
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)[[[I")
	public int[][][] method6280() {
		if (this.height != this.capacity) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(28) int local28 = 0; local28 < this.capacity; local28++) {
			this.entries[local28] = VALID;
		}
		return this.pixels;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	public void clear() {
		for (@Pc(3) int local3 = 0; local3 < this.capacity; local3++) {
			this.pixels[local3][0] = null;
			this.pixels[local3][1] = null;
			this.pixels[local3][2] = null;
			this.pixels[local3] = null;
		}
		this.entries = null;
		this.pixels = null;
		this.recentlyUsed.clear();
		this.recentlyUsed = null;
	}
}
