import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("unpackclass!unpackclass")
public final class unpackclass extends unpack {

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "[I")
	private int[] CONSTANT_POOL_ENTRY_LENGTHS = new int[] { 0, 3, 0, 5, 5, 9, 9, 3, 3, 5, 5, 5, 5 };

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "Lunpackclass!e;")
	private SimpleBuffer in = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "Lunpackclass!e;")
	private SimpleBuffer newArrayBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "d", descriptor = "Lunpackclass!e;")
	private SimpleBuffer localVariableBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "e", descriptor = "Lunpackclass!e;")
	private SimpleBuffer wideLocalVariableBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "f", descriptor = "Lunpackclass!e;")
	private SimpleBuffer sipushAndSwitchBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "g", descriptor = "Lunpackclass!e;")
	private SimpleBuffer constantBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "h", descriptor = "Lunpackclass!e;")
	private SimpleBuffer wideConstantBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "i", descriptor = "Lunpackclass!e;")
	private SimpleBuffer classBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "j", descriptor = "Lunpackclass!e;")
	private SimpleBuffer fieldRefBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "k", descriptor = "Lunpackclass!e;")
	private SimpleBuffer methodRefBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "l", descriptor = "Lunpackclass!e;")
	private SimpleBuffer interfaceMethodRefBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "m", descriptor = "Lunpackclass!e;")
	private SimpleBuffer branchBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "n", descriptor = "Lunpackclass!e;")
	private SimpleBuffer bipushBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "o", descriptor = "Lunpackclass!e;")
	private SimpleBuffer wideIincBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "p", descriptor = "Lunpackclass!e;")
	private SimpleBuffer iincBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "q", descriptor = "Lunpackclass!e;")
	private SimpleBuffer multiANewArrayBuffer = new SimpleBuffer(null);

	@OriginalMember(owner = "unpackclass!unpackclass", name = "I", descriptor = "Lunpackclass!f;")
	private LinkedList constantPool = new LinkedList();

	@OriginalMember(owner = "unpackclass!unpackclass", name = "J", descriptor = "I")
	private int constantPoolSize = 1;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "K", descriptor = "[I")
	private int[] OPCODE_FLAGS = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 16, 1026, 1026, 1026, 1026, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1026, 1026, 1026, 1026, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 256, 1026, 0, 0, 0, 0, 0, 0, 0, 0, 64, 64, 64, 64, 128, 128, 128, 0, 4, 32, 0, 32, 0, 0, 32, 32, 0, 0, 0, 32, 256, 256, 512, 512, 16, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "unpackclass!unpackclass", name = "A", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] utf8Entries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "u", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] intEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "w", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] longEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "v", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] floatEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "x", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] doubleEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "y", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] fieldNameAndTypeEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "z", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] methodNameAndTypeEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "r", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] fieldRefEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "s", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] methodRefEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "t", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] interfaceMethodRefEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "B", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] stringEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "C", descriptor = "[Lunpackclass!s;")
	private ConstantPoolEntry[] classEntries;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "E", descriptor = "Lunpackclass!s;")
	private ConstantPoolEntry code;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "F", descriptor = "Lunpackclass!s;")
	private ConstantPoolEntry exceptions;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "D", descriptor = "Lunpackclass!s;")
	private ConstantPoolEntry constantValue;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "G", descriptor = "Lunpackclass!s;")
	private final ConstantPoolEntry sourceFile;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "H", descriptor = "Lunpackclass!s;")
	private final ConstantPoolEntry lineNumberTable;

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private static ConstantPoolEntry readEntry1(@OriginalArg(0) SimpleBuffer arg0, @OriginalArg(1) ConstantPoolEntry[] arg1) {
		return arg1[arg0.g2()];
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private static ConstantPoolEntry readEntry2(@OriginalArg(0) SimpleBuffer arg0, @OriginalArg(1) ConstantPoolEntry[] arg1) {
		return arg1[arg0.g2()];
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "d", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private static ConstantPoolEntry readEntry3(@OriginalArg(0) SimpleBuffer arg0, @OriginalArg(1) ConstantPoolEntry[] arg1) {
		return arg1[arg0.g2()];
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Ljava/lang/String;)Lunpackclass!s;")
	private static ConstantPoolEntry createUtf8Entry(@OriginalArg(0) String arg0) {
		@Pc(3) ConstantPoolEntry local3 = new ConstantPoolEntry();
		local3.tag = 1;
		local3.bytesValue = arg0.getBytes();
		return local3;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([B)I")
	private static int getMethodDescriptorSize(@OriginalArg(0) byte[] arg0) {
		@Pc(1) int local1 = 1;
		@Pc(3) int local3 = 1;
		@Pc(5) boolean local5 = false;
		while (true) {
			while (true) {
				@Pc(10) byte local10 = arg0[local3++];
				if (!local5) {
					if (local10 == ')') {
						return local1;
					}
					if (local10 != '[') {
						local1++;
						if (local10 == 'J' || local10 == 'D') {
							local1++;
						}
						if (local10 == 'L') {
							local5 = true;
						}
					}
				} else if (local10 == ';') {
					local5 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "<init>", descriptor = "([BZ)V")
	public unpackclass(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) throws IOException {
		@Pc(572) Js5Pack pack = new Js5Pack(arg0, true, true);
		this.in.data = pack.fetchFile(1, 0);
		this.in.pos = this.in.data.length - 20;
		this.utf8Entries = this.createEntries(1);
		this.intEntries = this.createEntries(3);
		this.longEntries = this.createEntries(5);
		this.floatEntries = this.createEntries(4);
		this.doubleEntries = this.createEntries(6);
		this.fieldNameAndTypeEntries = this.createEntries(12);
		this.methodNameAndTypeEntries = this.createEntries(12);
		this.fieldRefEntries = this.createEntries(9);
		this.methodRefEntries = this.createEntries(10);
		this.interfaceMethodRefEntries = this.createEntries(11);
		this.stringEntries = new ConstantPoolEntry[this.utf8Entries.length];
		this.classEntries = new ConstantPoolEntry[this.utf8Entries.length];
		this.utf8Entries[0] = this.code = createUtf8Entry("Code");
		this.utf8Entries[1] = this.exceptions = createUtf8Entry("Exceptions");
		this.utf8Entries[2] = createUtf8Entry("Synthetic");
		this.utf8Entries[3] = this.constantValue = createUtf8Entry("ConstantValue");
		this.utf8Entries[4] = this.sourceFile = createUtf8Entry("SourceFile");
		this.utf8Entries[5] = this.lineNumberTable = createUtf8Entry("LineNumberTable");
		this.in.pos = 0;
		this.readUtf8Entries();
		this.readEntryNames(this.fieldNameAndTypeEntries);
		this.readEntryNames(this.methodNameAndTypeEntries);
		this.readEntryDescriptors(this.fieldNameAndTypeEntries, this.utf8Entries);
		this.readEntryDescriptors(this.methodNameAndTypeEntries, this.utf8Entries);
		this.readEntryClassNames(this.fieldRefEntries);
		this.readEntryClassNames(this.methodRefEntries);
		this.readEntryClassNames(this.interfaceMethodRefEntries);
		this.readEntryDescriptors(this.fieldRefEntries, this.fieldNameAndTypeEntries);
		this.readEntryDescriptors(this.methodRefEntries, this.methodNameAndTypeEntries);
		this.readEntryDescriptors(this.interfaceMethodRefEntries, this.methodNameAndTypeEntries);
		this.readNumericEntries(this.intEntries, 24);
		this.readNumericEntries(this.intEntries, 16);
		this.readNumericEntries(this.intEntries, 8);
		this.readNumericEntries(this.intEntries, 0);
		this.readNumericEntries(this.longEntries, 56);
		this.readNumericEntries(this.longEntries, 48);
		this.readNumericEntries(this.longEntries, 40);
		this.readNumericEntries(this.longEntries, 32);
		this.readNumericEntries(this.longEntries, 24);
		this.readNumericEntries(this.longEntries, 16);
		this.readNumericEntries(this.longEntries, 8);
		this.readNumericEntries(this.longEntries, 0);
		this.readNumericEntries(this.floatEntries, 24);
		this.readNumericEntries(this.floatEntries, 16);
		this.readNumericEntries(this.floatEntries, 8);
		this.readNumericEntries(this.floatEntries, 0);
		this.readNumericEntries(this.doubleEntries, 56);
		this.readNumericEntries(this.doubleEntries, 48);
		this.readNumericEntries(this.doubleEntries, 40);
		this.readNumericEntries(this.doubleEntries, 32);
		this.readNumericEntries(this.doubleEntries, 24);
		this.readNumericEntries(this.doubleEntries, 16);
		this.readNumericEntries(this.doubleEntries, 8);
		this.readNumericEntries(this.doubleEntries, 0);
		@Pc(881) int local881 = pack.getGroupCapacity();
		for (@Pc(883) int local883 = 0; local883 < local881; local883++) {
			this.in.data = pack.fetchFile(0, local883);
			this.readClass(arg1);
		}
		this.CONSTANT_POOL_ENTRY_LENGTHS = null;
		this.in = null;
		this.newArrayBuffer = null;
		this.localVariableBuffer = null;
		this.wideLocalVariableBuffer = null;
		this.sipushAndSwitchBuffer = null;
		this.constantBuffer = null;
		this.wideConstantBuffer = null;
		this.classBuffer = null;
		this.fieldRefBuffer = null;
		this.methodRefBuffer = null;
		this.interfaceMethodRefBuffer = null;
		this.branchBuffer = null;
		this.bipushBuffer = null;
		this.wideIincBuffer = null;
		this.iincBuffer = null;
		this.multiANewArrayBuffer = null;
		this.fieldRefEntries = null;
		this.methodRefEntries = null;
		this.interfaceMethodRefEntries = null;
		this.intEntries = null;
		this.floatEntries = null;
		this.longEntries = null;
		this.doubleEntries = null;
		this.fieldNameAndTypeEntries = null;
		this.methodNameAndTypeEntries = null;
		this.utf8Entries = null;
		this.stringEntries = null;
		this.classEntries = null;
		this.constantValue = null;
		this.code = null;
		this.exceptions = null;
		this.constantPool = null;
		this.OPCODE_FLAGS = null;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Lunpackclass!s;)V")
	private void addConstantPoolEntry(@OriginalArg(0) ConstantPoolEntry arg0) {
		if (arg0.isLinked()) {
			return;
		}
		this.constantPool.addTail(arg0);
		arg0.index = this.constantPoolSize++;
		if (arg0.tag == 5 || arg0.tag == 6) {
			this.constantPoolSize++;
		}
		if (arg0.name != null) {
			this.addConstantPoolEntry(arg0.name);
		}
		if (arg0.descriptor != null) {
			this.addConstantPoolEntry(arg0.descriptor);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "(Lunpackclass!e;[Lunpackclass!s;)Lunpackclass!s;")
	private ConstantPoolEntry readAndAddEntry(@OriginalArg(0) SimpleBuffer arg0, @OriginalArg(1) ConstantPoolEntry[] arg1) {
		@Pc(4) ConstantPoolEntry local4 = arg1[arg0.g2()];
		this.addConstantPoolEntry(local4);
		return local4;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Lunpackclass!e;[Lunpackclass!s;I)Lunpackclass!s;")
	private ConstantPoolEntry readClass(@OriginalArg(0) SimpleBuffer arg0, @OriginalArg(1) ConstantPoolEntry[] arg1) {
		@Pc(2) int local2 = arg0.g2();
		@Pc(6) ConstantPoolEntry local6 = arg1[local2];
		if (local6 == null) {
			local6 = new ConstantPoolEntry();
			local6.tag = 7;
			local6.name = this.utf8Entries[local2];
			arg1[local2] = local6;
		}
		return local6;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "(Lunpackclass!e;[Lunpackclass!s;I)Lunpackclass!s;")
	private ConstantPoolEntry readNamedEntry(@OriginalArg(0) SimpleBuffer arg0, @OriginalArg(1) ConstantPoolEntry[] arg1, @OriginalArg(2) int arg2) {
		@Pc(2) int local2 = arg0.g2();
		@Pc(6) ConstantPoolEntry local6 = arg1[local2];
		if (local6 == null) {
			local6 = new ConstantPoolEntry();
			local6.tag = arg2;
			local6.name = this.utf8Entries[local2];
			arg1[local2] = local6;
		}
		this.addConstantPoolEntry(local6);
		return local6;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "()Lunpackclass!s;")
	private ConstantPoolEntry readCatchType() {
		@Pc(3) int local3 = this.in.g2();
		if (local3 == 0) {
			return null;
		}
		local3--;
		@Pc(13) ConstantPoolEntry local13 = this.classEntries[local3];
		if (local13 == null) {
			local13 = new ConstantPoolEntry();
			local13.tag = 7;
			local13.name = this.utf8Entries[local3];
			this.classEntries[local3] = local13;
		}
		this.addConstantPoolEntry(local13);
		return local13;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(I)[Lunpackclass!s;")
	private ConstantPoolEntry[] createEntries(@OriginalArg(0) int arg0) {
		@Pc(4) ConstantPoolEntry[] local4 = new ConstantPoolEntry[this.in.g2()];
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			local4[local6] = new ConstantPoolEntry();
			local4[local6].tag = arg0;
		}
		return local4;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "()V")
	private void readUtf8Entries() {
		for (@Pc(1) int local1 = 6; local1 < this.utf8Entries.length; local1++) {
			@Pc(6) int local6;
			for (local6 = this.in.pos; this.in.data[local6] != 0; local6++) {
			}
			local6 -= this.in.pos;
			this.utf8Entries[local1].bytesValue = new byte[local6];
			this.in.gdata(this.utf8Entries[local1].bytesValue, local6);
			this.in.pos++;
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!s;)V")
	private void readEntryNames(@OriginalArg(0) ConstantPoolEntry[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1].name = readEntry1(this.in, this.utf8Entries);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "([Lunpackclass!s;)V")
	private void readEntryClassNames(@OriginalArg(0) ConstantPoolEntry[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1].name = this.readClass(this.in, this.classEntries);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!s;[Lunpackclass!s;)V")
	private void readEntryDescriptors(@OriginalArg(0) ConstantPoolEntry[] arg0, @OriginalArg(1) ConstantPoolEntry[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1].descriptor = readEntry1(this.in, arg1);
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!s;I)V")
	private void readNumericEntries(@OriginalArg(0) ConstantPoolEntry[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) long local1 = 0L;
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			local1 += (long) this.in.g1() << arg1;
			arg0[local3].longValue += local1;
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "()[Lunpackclass!g;")
	private Member[] createMembers() {
		@Pc(4) Member[] local4 = new Member[this.in.g2()];
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			local4[local6] = new Member();
		}
		return local4;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "([Lunpackclass!g;)V")
	private void createAttributes(@OriginalArg(0) Member[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1].attributes = new Attribute[this.in.g1()];
			for (@Pc(12) int local12 = 0; local12 < arg0[local1].attributes.length; local12++) {
				arg0[local1].attributes[local12] = new Attribute();
			}
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "b", descriptor = "([Lunpackclass!g;)V")
	private void readAttributeNames(@OriginalArg(0) Member[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			for (@Pc(4) int local4 = 0; local4 < arg0[local1].attributes.length; local4++) {
				arg0[local1].attributes[local4].name = this.readAndAddEntry(this.in, this.utf8Entries);
			}
		}
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "c", descriptor = "([Lunpackclass!g;)I")
	private int getMembersLength(@OriginalArg(0) Member[] arg0) {
		@Pc(4) int local4 = arg0.length * 8;
		for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
			local4 += arg0[local6].attributes.length * 6;
			for (@Pc(19) int local19 = 0; local19 < arg0[local6].attributes.length; local19++) {
				@Pc(27) Attribute local27 = arg0[local6].attributes[local19];
				if (local27.name == this.constantValue) {
					local4 += 2;
				}
				if (local27.name == this.code) {
					local4 += 12;
					local4 += local27.code.length;
					local4 += local27.code.exceptionTable.length * 8;
					if (local27.code.lineNumberTable != null) {
						local4 += 8;
						local4 += local27.code.lineNumberTable.length * 4;
					}
				}
				if (local27.name == this.exceptions) {
					local4 += 2;
					local4 += local27.exceptions.length * 2;
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "unpackclass!unpackclass", name = "a", descriptor = "(Z)V")
	private void readClass(@OriginalArg(0) boolean arg0) {
		this.in.pos = this.in.data.length - 6;
		@Pc(13) ConstantPoolEntry[] local13 = new ConstantPoolEntry[this.in.g2()];
		@Pc(16) Member[] local16 = this.createMembers();
		@Pc(19) Member[] local19 = this.createMembers();
		this.in.pos = 0;
		this.createAttributes(local16);
		this.createAttributes(local19);
		this.readAttributeNames(local16);
		this.readAttributeNames(local19);
		@Pc(40) int local40;
		for (@Pc(37) int local37 = 0; local37 < local19.length; local37++) {
			for (local40 = 0; local40 < local19[local37].attributes.length; local40++) {
				@Pc(48) Attribute local48 = local19[local37].attributes[local40];
				if (local48.name == this.exceptions) {
					local48.exceptions = new ConstantPoolEntry[this.in.g1()];
				}
			}
		}
		@Pc(104) int local104;
		@Pc(77) int local77;
		for (local40 = 0; local40 < local19.length; local40++) {
			for (local77 = 0; local77 < local19[local40].attributes.length; local77++) {
				@Pc(85) Attribute local85 = local19[local40].attributes[local77];
				if (local85.name == this.code) {
					local85.code = new Code();
					local85.code.exceptionTable = new ExceptionTableEntry[this.in.g1()];
					for (local104 = 0; local104 < local85.code.exceptionTable.length; local104++) {
						local85.code.exceptionTable[local104] = new ExceptionTableEntry();
					}
				}
			}
		}
		@Pc(138) int local138;
		for (local77 = 0; local77 < local19.length; local77++) {
			for (local138 = 0; local138 < local19[local77].attributes.length; local138++) {
				@Pc(146) Attribute local146 = local19[local77].attributes[local138];
				if (local146.name == this.code) {
					local146.code.maxStack = this.in.g1();
				}
			}
		}
		for (local138 = 0; local138 < local19.length; local138++) {
			for (local104 = 0; local104 < local19[local138].attributes.length; local104++) {
				@Pc(183) Attribute local183 = local19[local138].attributes[local104];
				if (local183.name == this.code) {
					local183.code.maxLocals = this.in.g1();
				}
			}
		}
		local104 = 0;
		@Pc(214) int local214;
		@Pc(231) int local231;
		@Pc(237) int local237;
		@Pc(260) int local260;
		@Pc(262) int local262;
		for (@Pc(211) int local211 = 0; local211 < local19.length; local211++) {
			for (local214 = 0; local214 < local19[local211].attributes.length; local214++) {
				@Pc(222) Attribute local222 = local19[local211].attributes[local214];
				if (local222.name == this.code) {
					local231 = this.in.pos;
					if (this.in.gsmart() > 0) {
						local237 = 1;
						while (this.in.gsmart() != 0) {
							local237++;
						}
						if (arg0) {
							this.in.pos = local231;
							this.addConstantPoolEntry(this.lineNumberTable);
							local222.code.lineNumberTable = new LineNumberTableEntry[local237];
							local260 = -1;
							for (local262 = 0; local262 < local237; local262++) {
								local260 += this.in.gsmart();
								local222.code.lineNumberTable[local262] = new LineNumberTableEntry();
								local222.code.lineNumberTable[local262].startPc = local260;
							}
							this.in.pos++;
						} else {
							local104 += local237;
						}
					}
				}
			}
		}
		@Pc(319) int local319;
		if (arg0) {
			local214 = 0;
			for (local319 = 0; local319 < local19.length; local319++) {
				for (local231 = 0; local231 < local19[local319].attributes.length; local231++) {
					@Pc(330) Attribute local330 = local19[local319].attributes[local231];
					if (local330.name == this.code && local330.code.lineNumberTable != null) {
						for (local260 = 0; local260 < local330.code.lineNumberTable.length; local260++) {
							local214 += this.in.g2();
							local330.code.lineNumberTable[local260].lineNumber = local214;
						}
					}
				}
			}
		} else {
			this.in.pos += local104 * 2;
		}
		local214 = this.in.g1() << 8;
		for (local319 = 0; local319 < local16.length; local319++) {
			local16[local319].accessFlags = this.in.g1() << 8;
		}
		for (local231 = 0; local231 < local19.length; local231++) {
			local19[local231].accessFlags = this.in.g1() << 8;
		}
		local214 += this.in.g1();
		for (local237 = 0; local237 < local16.length; local237++) {
			local16[local237].accessFlags += this.in.g1();
		}
		for (local260 = 0; local260 < local19.length; local260++) {
			local19[local260].accessFlags += this.in.g1();
		}
		local262 = this.in.g2();
		@Pc(484) ConstantPoolEntry local484;
		if (local262 > 0) {
			this.addConstantPoolEntry(this.sourceFile);
			local484 = this.utf8Entries[local262 - 1];
			this.addConstantPoolEntry(local484);
		} else {
			local484 = null;
		}
		@Pc(495) int local495;
		for (@Pc(492) int local492 = 0; local492 < local19.length; local492++) {
			for (local495 = 0; local495 < local19[local492].attributes.length; local495++) {
				@Pc(503) Attribute local503 = local19[local492].attributes[local495];
				if (local503.name == this.exceptions) {
					for (@Pc(510) int local510 = 0; local510 < local503.exceptions.length; local510++) {
						local503.exceptions[local510] = this.readNamedEntry(this.in, this.classEntries, 7);
					}
				}
			}
		}
		@Pc(561) int local561;
		for (local495 = 0; local495 < local19.length; local495++) {
			for (@Pc(546) int local546 = 0; local546 < local19[local495].attributes.length; local546++) {
				@Pc(554) Attribute local554 = local19[local495].attributes[local546];
				if (local554.name == this.code) {
					for (local561 = 0; local561 < local554.code.exceptionTable.length; local561++) {
						local554.code.exceptionTable[local561].catchType = this.readCatchType();
					}
				}
			}
		}
		@Pc(598) ConstantPoolEntry local598 = this.readNamedEntry(this.in, this.classEntries, 7);
		@Pc(606) ConstantPoolEntry local606 = this.readNamedEntry(this.in, this.classEntries, 7);
		for (local561 = 0; local561 < local13.length; local561++) {
			local13[local561] = this.readNamedEntry(this.in, this.classEntries, 7);
		}
		for (@Pc(626) int local626 = 0; local626 < local16.length; local626++) {
			local16[local626].nameAndType = readEntry1(this.in, this.fieldNameAndTypeEntries);
			this.addConstantPoolEntry(local16[local626].nameAndType.name);
			this.addConstantPoolEntry(local16[local626].nameAndType.descriptor);
		}
		for (@Pc(657) int local657 = 0; local657 < local19.length; local657++) {
			local19[local657].nameAndType = readEntry1(this.in, this.methodNameAndTypeEntries);
			this.addConstantPoolEntry(local19[local657].nameAndType.name);
			this.addConstantPoolEntry(local19[local657].nameAndType.descriptor);
		}
		@Pc(690) int local690 = this.in.g2();
		@Pc(694) int local694 = this.in.g2();
		@Pc(699) int local699;
		for (@Pc(696) int local696 = 0; local696 < local16.length; local696++) {
			for (local699 = 0; local699 < local16[local696].attributes.length; local699++) {
				@Pc(707) Attribute local707 = local16[local696].attributes[local699];
				if (local707.name == this.constantValue) {
					@Pc(717) ConstantPoolEntry local717 = local16[local696].nameAndType;
					@Pc(720) ConstantPoolEntry local720 = local717.descriptor;
					@Pc(725) byte local725 = local720.bytesValue[0];
					if (local725 == 74) {
						local707.constantValue = this.readAndAddEntry(this.in, this.longEntries);
					} else if (local725 == 70) {
						local707.constantValue = this.readAndAddEntry(this.in, this.floatEntries);
					} else if (local725 == 68) {
						local707.constantValue = this.readAndAddEntry(this.in, this.doubleEntries);
					} else if (local725 == 76) {
						local707.constantValue = this.readNamedEntry(this.in, this.stringEntries, 8);
					} else {
						local707.constantValue = this.readAndAddEntry(this.in, this.intEntries);
					}
				}
			}
		}
		@Pc(822) int local822;
		@Pc(800) int local800;
		@Pc(815) int local815;
		@Pc(817) int local817;
		for (local699 = 0; local699 < local19.length; local699++) {
			for (local800 = 0; local800 < local19[local699].attributes.length; local800++) {
				@Pc(808) Attribute local808 = local19[local699].attributes[local800];
				if (local808.name == this.code) {
					local815 = 0;
					for (local817 = 0; local817 < local808.code.exceptionTable.length; local817++) {
						local822 = this.in.g2();
						if (local822 == 0) {
							local822 = local815;
						} else if (local822 == local815) {
							local822 = 0;
						}
						@Pc(837) ExceptionTableEntry local837 = local808.code.exceptionTable[local817];
						local815 = local822;
						local837.startPc = local822;
					}
				}
			}
		}
		@Pc(866) int local866;
		for (local800 = 0; local800 < local19.length; local800++) {
			for (local866 = 0; local866 < local19[local800].attributes.length; local866++) {
				@Pc(874) Attribute local874 = local19[local800].attributes[local866];
				if (local874.name == this.code) {
					for (local817 = 0; local817 < local874.code.exceptionTable.length; local817++) {
						local874.code.exceptionTable[local817].endPcToHandlerPc = this.in.g2b();
					}
				}
			}
		}
		for (local866 = 0; local866 < local19.length; local866++) {
			for (local815 = 0; local815 < local19[local866].attributes.length; local815++) {
				@Pc(924) Attribute local924 = local19[local866].attributes[local815];
				if (local924.name == this.code) {
					for (local822 = 0; local822 < local924.code.exceptionTable.length; local822++) {
						local924.code.exceptionTable[local822].reverseHandlerPc = this.in.g2();
					}
				}
			}
		}
		local815 = this.in.pos;
		local817 = 0;
		local822 = 0;
		@Pc(971) int local971 = 0;
		@Pc(973) int local973 = 0;
		@Pc(975) int local975 = 0;
		@Pc(977) int local977 = 0;
		@Pc(979) int local979 = 0;
		@Pc(981) int local981 = 0;
		@Pc(983) int local983 = 0;
		@Pc(985) int local985 = 0;
		@Pc(987) int local987 = 0;
		@Pc(989) int local989 = 0;
		@Pc(991) int local991 = 0;
		@Pc(993) int local993 = 0;
		@Pc(998) int local998;
		@Pc(1013) int local1013;
		@Pc(1017) int local1017;
		@Pc(1025) int local1025;
		@Pc(1102) int local1102;
		for (@Pc(995) int local995 = 0; local995 < local19.length; local995++) {
			for (local998 = 0; local998 < local19[local995].attributes.length; local998++) {
				@Pc(1006) Attribute local1006 = local19[local995].attributes[local998];
				if (local1006.name == this.code) {
					local1013 = 0;
					while (true) {
						local1017 = this.in.g1();
						if (local1017 == 204) {
							local1006.code.length = local1013;
							break;
						}
						local1025 = this.OPCODE_FLAGS[local1017];
						local1013++;
						if ((local1025 & 0x1) != 0) {
							throw new RuntimeException("invalid opcode " + local1017);
						}
						if ((local1025 & 0x2) != 0) {
							local822++;
						}
						if ((local1025 & 0x4) != 0) {
							local975 += 2;
						}
						if ((local1025 & 0x10) != 0) {
							local977 += 2;
						}
						if ((local1025 & 0x20) != 0) {
							local979 += 2;
						}
						if ((local1025 & 0x40) != 0) {
							local981 += 2;
						}
						if ((local1025 & 0x80) != 0) {
							local983 += 2;
						}
						if ((local1025 & 0x100) != 0) {
							local987 += 2;
						}
						if ((local1025 & 0x200) != 0) {
							local987 += 4;
						}
						if (local1017 == 16) {
							local989++;
						}
						if (local1017 == 17) {
							local973 += 2;
						}
						if (local1017 == 132) {
							local993++;
						}
						if (local1017 == 170) {
							local1102 = this.in.gVarInt() + 1;
							local987 += (local1102 + 1) * 4;
							local973 += 4;
						}
						if (local1017 == 171) {
							local1102 = this.in.gVarInt();
							local987 += (local1102 + 1) * 4;
							local973 += local1102 * 4;
						}
						if (local1017 == 185) {
							local985 += 2;
						}
						if (local1017 == 188) {
							local817++;
						}
						if (local1017 == 196) {
							local1017 = this.in.g1();
							local1025 = this.OPCODE_FLAGS[local1017];
							if ((local1025 & 0x400) == 0) {
								throw new RuntimeException("invalid opcode " + local1017 + " as operand to wide");
							}
							local971 += 2;
							if (local1017 == 132) {
								local991 += 2;
							}
						}
					}
				}
			}
		}
		local998 = this.in.pos - local815;
		this.in.pos = local815;
		this.newArrayBuffer.data = this.in.data;
		this.newArrayBuffer.pos = this.in.pos + local998;
		this.localVariableBuffer.data = this.in.data;
		this.localVariableBuffer.pos = this.newArrayBuffer.pos + local817;
		this.wideLocalVariableBuffer.data = this.in.data;
		this.wideLocalVariableBuffer.pos = this.localVariableBuffer.pos + local822;
		this.sipushAndSwitchBuffer.data = this.in.data;
		this.sipushAndSwitchBuffer.pos = this.wideLocalVariableBuffer.pos + local971;
		this.constantBuffer.data = this.in.data;
		this.constantBuffer.pos = this.sipushAndSwitchBuffer.pos + local973;
		this.wideConstantBuffer.data = this.in.data;
		this.wideConstantBuffer.pos = this.constantBuffer.pos + local975;
		this.classBuffer.data = this.in.data;
		this.classBuffer.pos = this.wideConstantBuffer.pos + local977;
		this.fieldRefBuffer.data = this.in.data;
		this.fieldRefBuffer.pos = this.classBuffer.pos + local979;
		this.methodRefBuffer.data = this.in.data;
		this.methodRefBuffer.pos = this.fieldRefBuffer.pos + local981;
		this.interfaceMethodRefBuffer.data = this.in.data;
		this.interfaceMethodRefBuffer.pos = this.methodRefBuffer.pos + local983;
		this.branchBuffer.data = this.in.data;
		this.branchBuffer.pos = this.interfaceMethodRefBuffer.pos + local985;
		this.bipushBuffer.data = this.in.data;
		this.bipushBuffer.pos = this.branchBuffer.pos + local987;
		this.wideIincBuffer.data = this.in.data;
		this.wideIincBuffer.pos = this.bipushBuffer.pos + local989;
		this.iincBuffer.data = this.in.data;
		this.iincBuffer.pos = this.wideIincBuffer.pos + local991;
		this.multiANewArrayBuffer.data = this.in.data;
		this.multiANewArrayBuffer.pos = this.iincBuffer.pos + local993;
		@Pc(1414) int local1414 = 0;
		local1013 = 0;
		local1017 = 0;
		@Pc(1444) int local1444;
		@Pc(1446) int local1446;
		@Pc(1448) int local1448;
		for (local1025 = 0; local1025 < local19.length; local1025++) {
			for (local1102 = 0; local1102 < local19[local1025].attributes.length; local1102++) {
				@Pc(1431) Attribute local1431 = local19[local1025].attributes[local1102];
				if (local1431.name == this.code) {
					@Pc(1440) int local1440 = local1431.code.length;
					@Pc(1442) int local1442 = 0;
					local1444 = 0;
					local1446 = 0;
					for (local1448 = 0; local1448 < local1440; local1448++) {
						@Pc(1453) int local1453 = this.in.g1();
						@Pc(1458) int local1458 = this.OPCODE_FLAGS[local1453];
						local1442++;
						if ((local1458 & 0x1) != 0) {
							throw new RuntimeException("invalid opcode " + local1453);
						}
						if ((local1458 & 0x2) != 0) {
							local1442++;
						}
						if ((local1458 & 0x4) != 0) {
							@Pc(1493) ConstantPoolEntry local1493;
							if (local1453 == 18) {
								local1493 = this.readAndAddEntry(this.constantBuffer, this.intEntries);
							} else if (local1453 == 19) {
								local1493 = this.readAndAddEntry(this.constantBuffer, this.floatEntries);
							} else if (local1453 == 186) {
								local1493 = this.readNamedEntry(this.constantBuffer, this.stringEntries, 8);
							} else if (local1453 == 203) {
								local1493 = this.readNamedEntry(this.constantBuffer, this.classEntries, 7);
							} else {
								throw new RuntimeException("opcode " + local1453 + " marked as conref");
							}
							if (local1493.index >= 256) {
								local1442 += 2;
							} else {
								local1442++;
							}
						}
						if ((local1458 & 0x10) != 0) {
							if (local1453 == 20) {
								this.readAndAddEntry(this.wideConstantBuffer, this.longEntries);
							} else if (local1453 == 202) {
								this.readAndAddEntry(this.wideConstantBuffer, this.doubleEntries);
							} else {
								throw new RuntimeException("opcode " + local1453 + " marked as conref2");
							}
							local1442 += 2;
						}
						if ((local1458 & 0x20) != 0) {
							this.readNamedEntry(this.classBuffer, this.classEntries, 7);
							local1442 += 2;
						}
						if ((local1458 & 0x40) != 0) {
							this.readAndAddEntry(this.fieldRefBuffer, this.fieldRefEntries);
							local1442 += 2;
						}
						if ((local1458 & 0x80) != 0) {
							this.readAndAddEntry(this.methodRefBuffer, this.methodRefEntries);
							local1442 += 2;
						}
						if ((local1458 & 0x100) != 0) {
							local1444++;
							local1442 += 2;
						}
						if ((local1458 & 0x200) != 0) {
							local1446++;
							local1442 += 4;
						}
						if (local1453 == 16) {
							local1442++;
						}
						if (local1453 == 17) {
							local1442 += 2;
						}
						if (local1453 == 132) {
							local1442++;
						}
						@Pc(1665) int local1665;
						if (local1453 == 170) {
							local1442 = local1442 + 3 & 0xFFFFFFFC;
							local1665 = this.in.gVarInt() + 1;
							local1442 += 8;
							local1446 += local1665 + 1;
							local1442 += (local1665 + 1) * 4;
						}
						if (local1453 == 171) {
							local1442 = local1442 + 3 & 0xFFFFFFFC;
							local1665 = this.in.gVarInt();
							local1442 += 4;
							local1446 += local1665 + 1;
							local1442 += (local1665 + 1) * 4;
							local1442 += local1665 * 4;
						}
						if (local1453 == 185) {
							this.readAndAddEntry(this.interfaceMethodRefBuffer, this.interfaceMethodRefEntries);
							local1442 += 4;
						}
						if (local1453 == 188) {
							local1442++;
						}
						if (local1453 == 197) {
							local1442++;
						}
						if (local1453 == 196) {
							local1453 = this.in.g1();
							local1442++;
							local1458 = this.OPCODE_FLAGS[local1453];
							if ((local1458 & 0x400) == 0) {
								throw new RuntimeException("invalid opcode " + local1453 + " as operand to wide");
							}
							local1442 += 2;
							if (local1453 == 132) {
								local1442 += 2;
							}
						}
					}
					this.in.pos++;
					local1431.code.length = local1442;
					if (local1440 > local1414) {
						local1414 = local1440;
					}
					if (local1444 > local1013) {
						local1013 = local1444;
					}
					if (local1446 > local1017) {
						local1017 = local1446;
					}
				}
			}
		}
		this.in.pos = local815;
		this.constantBuffer.pos -= local975;
		this.wideConstantBuffer.pos -= local977;
		this.classBuffer.pos -= local979;
		this.fieldRefBuffer.pos -= local981;
		this.methodRefBuffer.pos -= local983;
		this.interfaceMethodRefBuffer.pos -= local985;
		local1102 = 24;
		if (local484 != null) {
			local1102 += 8;
		}
		for (@Pc(1867) ConstantPoolEntry local1867 = (ConstantPoolEntry) this.constantPool.method6594(); local1867 != null; local1867 = (ConstantPoolEntry) this.constantPool.method6595()) {
			local1102 += this.CONSTANT_POOL_ENTRY_LENGTHS[local1867.tag];
			if (local1867.bytesValue != null) {
				local1102 += local1867.bytesValue.length;
			}
		}
		local1102 += local13.length * 2;
		local1102 += this.getMembersLength(local16);
		local1102 += this.getMembersLength(local19);
		@Pc(1916) SimpleBuffer local1916 = new SimpleBuffer(local1102);
		local1916.p4(0xcafebabe);
		local1916.p2(local690);
		local1916.p2(local694);
		local1916.p2(this.constantPoolSize);
		this.constantPoolSize = 1;
		for (@Pc(1937) ConstantPoolEntry local1937 = (ConstantPoolEntry) this.constantPool.method6594(); local1937 != null; local1937 = (ConstantPoolEntry) this.constantPool.method6595()) {
			local1937.unlink();
			local1916.p1(local1937.tag);
			if (local1937.name != null) {
				local1916.p2(local1937.name.index);
			}
			if (local1937.descriptor != null) {
				local1916.p2(local1937.descriptor.index);
			}
			if (local1937.tag == 3 || local1937.tag == 4) {
				local1916.p4((int) local1937.longValue);
			}
			if (local1937.tag == 5 || local1937.tag == 6) {
				local1916.p8(local1937.longValue);
			}
			if (local1937.bytesValue != null) {
				local1916.p2(local1937.bytesValue.length);
				local1916.pdata(local1937.bytesValue, local1937.bytesValue.length);
			}
		}
		local1916.p2(local214);
		local1916.p2(local598.index);
		local1916.p2(local606.index);
		local1916.p2(local13.length);
		for (local1444 = 0; local1444 < local13.length; local1444++) {
			local1916.p2(local13[local1444].index);
		}
		local1916.p2(local16.length);
		for (local1446 = 0; local1446 < local16.length; local1446++) {
			local1916.p2(local16[local1446].accessFlags);
			local1916.p2(local16[local1446].nameAndType.name.index);
			local1916.p2(local16[local1446].nameAndType.descriptor.index);
			local1916.p2(local16[local1446].attributes.length);
			for (local1448 = 0; local1448 < local16[local1446].attributes.length; local1448++) {
				@Pc(2083) Attribute local2083 = local16[local1446].attributes[local1448];
				local1916.p2(local2083.name.index);
				if (local2083.name == this.constantValue) {
					local1916.p4(2);
					local1916.p2(local2083.constantValue.index);
				} else {
					local1916.p4(0);
				}
			}
		}
		local1916.p2(local19.length);
		@Pc(2127) int[] local2127 = new int[local1414 + 1];
		@Pc(2130) int[] local2130 = new int[local1013];
		@Pc(2133) int[] local2133 = new int[local1013];
		@Pc(2136) int[] local2136 = new int[local1017];
		@Pc(2139) int[] local2139 = new int[local1017];
		@Pc(2142) int[] local2142 = new int[local1017];
		for (@Pc(2144) int local2144 = 0; local2144 < local19.length; local2144++) {
			local1916.p2(local19[local2144].accessFlags);
			local1916.p2(local19[local2144].nameAndType.name.index);
			local1916.p2(local19[local2144].nameAndType.descriptor.index);
			local1916.p2(local19[local2144].attributes.length);
			for (@Pc(2176) int local2176 = 0; local2176 < local19[local2144].attributes.length; local2176++) {
				@Pc(2184) Attribute local2184 = local19[local2144].attributes[local2176];
				local1916.p2(local2184.name.index);
				@Pc(2207) int local2207;
				if (local2184.name == this.code) {
					local2207 = local2184.code.length + local2184.code.exceptionTable.length * 8 + 12;
					if (local2184.code.lineNumberTable != null) {
						local2207 += local2184.code.lineNumberTable.length * 4 + 8;
					}
					local1916.p4(local2207);
					local1916.p2(local2184.code.maxStack);
					local1916.p2(local2184.code.maxLocals);
					local1916.p4(local2184.code.length);
					@Pc(2243) int local2243 = local1916.pos;
					@Pc(2245) int local2245 = 0;
					@Pc(2247) int local2247 = 0;
					@Pc(2249) int local2249 = 0;
					while (true) {
						@Pc(2253) int local2253 = this.in.g1();
						@Pc(2261) int local2261;
						@Pc(2353) int local2353;
						@Pc(2472) int local2472;
						@Pc(2732) ConstantPoolEntry local2732;
						if (local2253 == 204) {
							local2127[local2249] = local1916.pos;
							for (local2253 = 0; local2253 < local2245; local2253++) {
								local1916.pos = local2127[local2130[local2253]] + 1;
								local1916.p2(local2127[local2130[local2253] + local2133[local2253]] - local2127[local2130[local2253]]);
							}
							for (local2261 = 0; local2261 < local2247; local2261++) {
								local1916.pos = local2136[local2261];
								local1916.p4(local2127[local2139[local2261] + local2142[local2261]] - local2127[local2139[local2261]]);
							}
							local1916.pos = local2127[local2249];
							local1916.p2(local2184.code.exceptionTable.length);
							for (local2472 = 0; local2472 < local2184.code.exceptionTable.length; local2472++) {
								local1916.p2(local2127[local2184.code.exceptionTable[local2472].startPc] - local2243);
								local2353 = local2249 - local2184.code.exceptionTable[local2472].reverseHandlerPc;
								local1916.p2(local2127[local2353 - local2184.code.exceptionTable[local2472].endPcToHandlerPc] - local2243);
								local1916.p2(local2127[local2353] - local2243);
								local2732 = local2184.code.exceptionTable[local2472].catchType;
								local1916.p2(local2732 == null ? 0 : local2732.index);
							}
							if (local2184.code.lineNumberTable == null) {
								local1916.p2(0);
							} else {
								local1916.p2(1);
								local1916.p2(this.lineNumberTable.index);
								local1916.p4(local2184.code.lineNumberTable.length * 4 + 2);
								local1916.p2(local2184.code.lineNumberTable.length);
								for (local2353 = 0; local2353 < local2184.code.lineNumberTable.length; local2353++) {
									local1916.p2(local2127[local2184.code.lineNumberTable[local2353].startPc] - local2243);
									local1916.p2(local2184.code.lineNumberTable[local2353].lineNumber);
								}
							}
							break;
						}
						local2261 = this.OPCODE_FLAGS[local2253];
						local2127[local2249] = local1916.pos;
						local1916.p1(local2253);
						if ((local2261 & 0x1) != 0) {
							throw new RuntimeException("invalid opcode " + local2253);
						}
						if ((local2261 & 0x2) != 0) {
							local1916.p1(this.localVariableBuffer.g1());
						}
						@Pc(2306) ConstantPoolEntry local2306;
						if ((local2261 & 0x4) != 0) {
							if (local2253 == 18) {
								local2306 = readEntry2(this.constantBuffer, this.intEntries);
							} else if (local2253 == 19) {
								local2306 = readEntry2(this.constantBuffer, this.floatEntries);
							} else if (local2253 == 186) {
								local2306 = readEntry3(this.constantBuffer, this.stringEntries);
							} else if (local2253 == 203) {
								local2306 = readEntry3(this.constantBuffer, this.classEntries);
							} else {
								throw new RuntimeException("opcode " + local2253 + " marked as conref");
							}
							local2353 = local2306.index;
							if (local2353 >= 256) {
								local1916.data[local1916.pos - 1] = 19;
								local1916.p2(local2353);
							} else {
								local1916.data[local1916.pos - 1] = 18;
								local1916.p1(local2353);
							}
						}
						if ((local2261 & 0x10) != 0) {
							if (local2253 == 20) {
								local2306 = readEntry2(this.wideConstantBuffer, this.longEntries);
							} else if (local2253 == 202) {
								local2306 = readEntry2(this.wideConstantBuffer, this.doubleEntries);
							} else {
								throw new RuntimeException("opcode " + local2253 + " marked as conref2");
							}
							local1916.data[local1916.pos - 1] = 20;
							local1916.p2(local2306.index);
						}
						if ((local2261 & 0x20) != 0) {
							local1916.p2(readEntry3(this.classBuffer, this.classEntries).index);
						}
						if ((local2261 & 0x40) != 0) {
							local1916.p2(readEntry2(this.fieldRefBuffer, this.fieldRefEntries).index);
						}
						if ((local2261 & 0x80) != 0) {
							local1916.p2(readEntry2(this.methodRefBuffer, this.methodRefEntries).index);
						}
						if ((local2261 & 0x100) != 0) {
							local2472 = this.branchBuffer.g2b();
							local1916.pos += 2;
							local2130[local2245] = local2249;
							local2133[local2245] = local2472;
							local2245++;
						}
						if ((local2261 & 0x200) != 0) {
							local2472 = this.branchBuffer.g4();
							local2136[local2247] = local1916.pos;
							local1916.pos += 4;
							local2139[local2247] = local2249;
							local2142[local2247] = local2472;
							local2247++;
						}
						if (local2253 == 16) {
							local1916.p1(this.bipushBuffer.g1());
						}
						if (local2253 == 17) {
							local1916.p2(this.sipushAndSwitchBuffer.g2());
						}
						if (local2253 == 132) {
							local1916.p1(this.iincBuffer.g1());
						}
						@Pc(2587) int local2587;
						@Pc(2595) int local2595;
						@Pc(2600) int local2600;
						if (local2253 == 170) {
							while ((local1916.pos - local2243 & 0x3) != 0) {
								local1916.p1(0);
							}
							local2472 = this.branchBuffer.g4();
							local2136[local2247] = local1916.pos;
							local1916.pos += 4;
							local2139[local2247] = local2249;
							local2142[local2247] = local2472;
							local2247++;
							local2353 = this.sipushAndSwitchBuffer.g4();
							local2587 = local2353 + this.in.gVarInt();
							local1916.p4(local2353);
							local1916.p4(local2587);
							for (local2595 = local2353; local2595 != local2587 + 1; local2595++) {
								local2600 = this.branchBuffer.g4();
								local2136[local2247] = local1916.pos;
								local1916.pos += 4;
								local2139[local2247] = local2249;
								local2142[local2247] = local2600;
								local2247++;
							}
						}
						if (local2253 == 171) {
							while ((local1916.pos - local2243 & 0x3) != 0) {
								local1916.p1(0);
							}
							local2472 = this.branchBuffer.g4();
							local2136[local2247] = local1916.pos;
							local1916.pos += 4;
							local2139[local2247] = local2249;
							local2142[local2247] = local2472;
							local2247++;
							local2353 = this.in.gVarInt();
							local1916.p4(local2353);
							local2587 = 0;
							for (local2595 = 0; local2595 < local2353; local2595++) {
								local2587 += this.sipushAndSwitchBuffer.g4();
								local1916.p4(local2587);
								local2600 = this.branchBuffer.g4();
								local2136[local2247] = local1916.pos;
								local1916.pos += 4;
								local2139[local2247] = local2249;
								local2142[local2247] = local2600;
								local2247++;
							}
						}
						if (local2253 == 185) {
							local2306 = readEntry2(this.interfaceMethodRefBuffer, this.interfaceMethodRefEntries);
							local1916.p2(local2306.index);
							@Pc(2729) ConstantPoolEntry local2729 = local2306.descriptor;
							local2732 = local2729.descriptor;
							@Pc(2735) byte[] local2735 = local2732.bytesValue;
							local1916.p1(getMethodDescriptorSize(local2735));
							local1916.p1(0);
						}
						if (local2253 == 188) {
							local1916.p1(this.newArrayBuffer.g1());
						}
						if (local2253 == 197) {
							local1916.p1(this.multiANewArrayBuffer.g1());
						}
						if (local2253 == 196) {
							local2253 = this.in.g1();
							local1916.p1(local2253);
							local2261 = this.OPCODE_FLAGS[local2253];
							if ((local2261 & 0x400) == 0) {
								throw new RuntimeException("invalid opcode " + local2253 + " as operand to wide");
							}
							local1916.p2(this.wideLocalVariableBuffer.g2());
							if (local2253 == 132) {
								local1916.p2(this.wideIincBuffer.g2());
							}
						}
						local2249++;
					}
				} else if (local2184.name == this.exceptions) {
					local1916.p4(local2184.exceptions.length * 2 + 2);
					local1916.p2(local2184.exceptions.length);
					for (local2207 = 0; local2207 < local2184.exceptions.length; local2207++) {
						local1916.p2(local2184.exceptions[local2207].index);
					}
				} else {
					local1916.p4(0);
				}
			}
		}
		if (local484 == null) {
			local1916.p2(0);
		} else {
			local1916.p2(1);
			local1916.p2(this.sourceFile.index);
			local1916.p4(2);
			local1916.p2(local484.index);
		}
		super.cache.put((new String(local598.name.bytesValue)).replace('/', '.'), local1916.data);
	}
}
