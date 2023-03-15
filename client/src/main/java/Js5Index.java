import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Js5Index {

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!oc;")
	public IntHashTable groupNameHashTable;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[Lclient!oc;")
	public IntHashTable[] fileNameHashTables;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[[I")
	public int[][] fileIds;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int version;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
	public int[] groupSizes;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
	public int[] groupCapacities;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "[[I")
	public int[][] fileNameHashes;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "[I")
	public int[] groupVersions;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "[I")
	public int[] groupNameHashes;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
	public int[] groupIds;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public int capacity;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
	public int[] groupChecksums;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public final int checksum;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([BI)V")
	public Js5Index(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.checksum = Static36.method1111(arg0, arg0.length);
		if (arg1 != this.checksum) {
			throw new RuntimeException();
		}
		this.method5105(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)V")
	private void method5105(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Buffer local12 = new Buffer(Js5Compression.uncompress(arg0));
		@Pc(16) int local16 = local12.g1();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.version = 0;
		} else {
			this.version = local12.g4();
		}
		@Pc(45) int local45 = local12.g1();
		this.size = local12.g2();
		@Pc(52) int local52 = 0;
		this.groupIds = new int[this.size];
		@Pc(59) int local59 = -1;
		for (@Pc(61) int local61 = 0; local61 < this.size; local61++) {
			this.groupIds[local61] = local52 += local12.g2();
			if (this.groupIds[local61] > local59) {
				local59 = this.groupIds[local61];
			}
		}
		this.capacity = local59 + 1;
		this.groupCapacities = new int[this.capacity];
		this.fileIds = new int[this.capacity][];
		this.groupVersions = new int[this.capacity];
		this.groupChecksums = new int[this.capacity];
		this.groupSizes = new int[this.capacity];
		@Pc(141) int local141;
		@Pc(155) int local155;
		if (local45 != 0) {
			this.groupNameHashes = new int[this.capacity];
			for (local141 = 0; local141 < this.capacity; local141++) {
				this.groupNameHashes[local141] = -1;
			}
			for (local155 = 0; local155 < this.size; local155++) {
				this.groupNameHashes[this.groupIds[local155]] = local12.g4();
			}
			this.groupNameHashTable = new IntHashTable(this.groupNameHashes);
		}
		for (local141 = 0; local141 < this.size; local141++) {
			this.groupChecksums[this.groupIds[local141]] = local12.g4();
		}
		for (local155 = 0; local155 < this.size; local155++) {
			this.groupVersions[this.groupIds[local155]] = local12.g4();
		}
		for (@Pc(223) int local223 = 0; local223 < this.size; local223++) {
			this.groupSizes[this.groupIds[local223]] = local12.g2();
		}
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(270) int local270;
		@Pc(287) int local287;
		for (@Pc(246) int local246 = 0; local246 < this.size; local246++) {
			local253 = this.groupIds[local246];
			local52 = 0;
			local260 = this.groupSizes[local253];
			this.fileIds[local253] = new int[local260];
			local268 = -1;
			for (local270 = 0; local270 < local260; local270++) {
				local287 = this.fileIds[local253][local270] = local52 += local12.g2();
				if (local287 > local268) {
					local268 = local287;
				}
			}
			this.groupCapacities[local253] = local268 + 1;
			if (local268 + 1 == local260) {
				this.fileIds[local253] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.fileNameHashes = new int[local59 + 1][];
		this.fileNameHashTables = new IntHashTable[local59 + 1];
		for (local253 = 0; local253 < this.size; local253++) {
			local260 = this.groupIds[local253];
			local268 = this.groupSizes[local260];
			this.fileNameHashes[local260] = new int[this.groupCapacities[local260]];
			for (local270 = 0; local270 < this.groupCapacities[local260]; local270++) {
				this.fileNameHashes[local260][local270] = -1;
			}
			for (local287 = 0; local287 < local268; local287++) {
				@Pc(408) int local408;
				if (this.fileIds[local260] == null) {
					local408 = local287;
				} else {
					local408 = this.fileIds[local260][local287];
				}
				this.fileNameHashes[local260][local408] = local12.g4();
			}
			this.fileNameHashTables[local260] = new IntHashTable(this.fileNameHashes[local260]);
		}
	}
}
