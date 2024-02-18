import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!uia")
public final class Class413 {

	@OriginalMember(owner = "loader!uia", name = "d", descriptor = "I")
	private static int anInt10951;

	@OriginalMember(owner = "loader!uia", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString145;

	@OriginalMember(owner = "loader!uia", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString146;

	@OriginalMember(owner = "loader!uia", name = "b", descriptor = "Z")
	private static boolean aBoolean835 = false;

	@OriginalMember(owner = "loader!uia", name = "a", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "loader!uia", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method9488(@OriginalArg(0) String arg0) {
		return method9490(aString145, anInt10951, arg0);
	}

	@OriginalMember(owner = "loader!uia", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method9489(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		aString145 = arg1;
		anInt10951 = arg0;
		try {
			aString146 = System.getProperty("user.home");
			if (aString146 != null) {
				aString146 = aString146 + "/";
			}
		} catch (@Pc(19) Exception local19) {
		}
		aBoolean835 = true;
		if (aString146 == null) {
			aString146 = "~/";
		}
	}

	@OriginalMember(owner = "loader!uia", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	private static File method9490(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean835) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg2);
		if (local11 != null) {
			return local11;
		}
		@Pc(58) String[] local58 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString146, "/tmp/", "" };
		@Pc(83) String[] local83 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(85) int local85 = 0; local85 < 2; local85++) {
			for (@Pc(90) int local90 = 0; local90 < local83.length; local90++) {
				for (@Pc(96) int local96 = 0; local96 < local58.length; local96++) {
					@Pc(134) String local134 = local58[local96] + local83[local90] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(136) RandomAccessFile local136 = null;
					try {
						@Pc(141) File local141 = new File(local134);
						if (local85 != 0 || local141.exists()) {
							@Pc(151) String local151 = local58[local96];
							if (local85 != 1 || local151.length() <= 0 || (new File(local151)).exists()) {
								(new File(local58[local96] + local83[local90])).mkdir();
								if (arg0 != null) {
									(new File(local58[local96] + local83[local90] + "/" + arg0)).mkdir();
								}
								local136 = new RandomAccessFile(local141, "rw");
								@Pc(218) int local218 = local136.read();
								local136.seek(0L);
								local136.write(local218);
								local136.seek(0L);
								local136.close();
								aHashtable9.put(arg2, local141);
								return local141;
							}
						}
					} catch (@Pc(237) Exception local237) {
						try {
							if (local136 != null) {
								local136.close();
							}
						} catch (@Pc(245) Exception local245) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}
}
