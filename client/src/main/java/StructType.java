import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class StructType extends SecondaryNode {

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "[Lclient!vr;")
	private static final OutboundPacket[] aClass242Array1;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "Lclient!ad;")
	private HashTable aClass4_20;

	static {
		new LocalizedString("Select", "Auswählen", "Sélectionner", "Selecionar");
		aClass242Array1 = new OutboundPacket[32];
		@Pc(80) OutboundPacket[] local80 = Static43.method3371();
		for (@Pc(82) int local82 = 0; local82 < local80.length; local82++) {
			aClass242Array1[local80[local82].opcode] = local80[local82];
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!bt;I)V")
	private void decode(@OriginalArg(1) Buffer arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(23) int local23 = arg0.g1();
		@Pc(30) int local30;
		if (this.aClass4_20 == null) {
			local30 = Static162.method2977(local23);
			this.aClass4_20 = new HashTable(local30);
		}
		for (local30 = 0; local30 < local23; local30++) {
			@Pc(49) boolean local49 = arg0.g1() == 1;
			@Pc(53) int local53 = arg0.ig3();
			@Pc(62) Node local62;
			if (local49) {
				local62 = new Class2_Sub40(arg0.gjstr());
			} else {
				local62 = new Class2_Sub39(arg0.g4());
			}
			this.aClass4_20.put(local62, (long) local53);
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)I")
	public int method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass4_20 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub39 local16 = (Class2_Sub39) this.aClass4_20.get((long) arg0);
			return local16 == null ? arg1 : local16.anInt6818;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!bt;B)V")
	public void decode(@OriginalArg(0) Buffer arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.g1();
			if (local16 == 0) {
				return;
			}
			this.decode(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method1346(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass4_20 == null) {
			return arg1;
		} else {
			@Pc(16) Class2_Sub40 local16 = (Class2_Sub40) this.aClass4_20.get((long) arg0);
			return local16 == null ? arg1 : local16.aString65;
		}
	}
}
