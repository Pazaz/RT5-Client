import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static649 {

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString112;

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString113;

	@OriginalMember(owner = "client!uia", name = "e", descriptor = "I")
	private static int anInt9672;

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "Z")
	private static boolean aBoolean743 = false;

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable7 = new Hashtable(16);

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method8490(@OriginalArg(0) String arg0) {
		return method8491(aString113, anInt9672, arg0);
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)Ljava/io/File;")
	public static File method8491(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (!aBoolean743) {
			throw new RuntimeException("");
		}
		@Pc(12) File local12 = (File) aHashtable7.get(arg2);
		if (local12 != null) {
			return local12;
		}
		@Pc(64) String[] local64 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString112, "/tmp/", "" };
		@Pc(91) String[] local91 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(99) int local99 = 0; local99 < 2; local99++) {
			for (@Pc(102) int local102 = 0; local102 < local91.length; local102++) {
				for (@Pc(105) int local105 = 0; local105 < local64.length; local105++) {
					@Pc(137) String local137 = local64[local105] + local91[local102] + "/" + (arg0 == null ? "" : arg0 + "/") + arg2;
					@Pc(139) RandomAccessFile local139 = null;
					try {
						@Pc(144) File local144 = new File(local137);
						if (local99 != 0 || local144.exists()) {
							@Pc(155) String local155 = local64[local105];
							if (local99 != 1 || local155.length() <= 0 || (new File(local155)).exists()) {
								(new File(local64[local105] + local91[local102])).mkdir();
								if (arg0 != null) {
									(new File(local64[local105] + local91[local102] + "/" + arg0)).mkdir();
								}
								local139 = new RandomAccessFile(local144, "rw");
								@Pc(224) int local224 = local139.read();
								local139.seek(0L);
								local139.write(local224);
								local139.seek(0L);
								local139.close();
								aHashtable7.put(arg2, local144);
								return local144;
							}
						}
					} catch (@Pc(243) Exception local243) {
						try {
							if (local139 != null) {
								local139.close();
							}
						} catch (@Pc(251) Exception local251) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8492(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		anInt9672 = arg0;
		aString113 = arg1;
		try {
			aString112 = System.getProperty("user.home");
			if (aString112 != null) {
				aString112 = aString112 + "/";
			}
		} catch (@Pc(26) Exception local26) {
		}
		if (aString112 == null) {
			aString112 = "~/";
		}
		aBoolean743 = true;
	}
}
