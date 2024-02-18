import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class2_Sub43 extends Class2 {

	@OriginalMember(owner = "client!pw", name = "M", descriptor = "I")
	private int anInt7598;

	@OriginalMember(owner = "client!pw", name = "E", descriptor = "Ljava/lang/String;")
	private String aString92;

	@OriginalMember(owner = "client!pw", name = "y", descriptor = "I")
	private int anInt7599;

	@OriginalMember(owner = "client!pw", name = "N", descriptor = "I")
	public int anInt7603;

	@OriginalMember(owner = "client!pw", name = "J", descriptor = "Z")
	private boolean aBoolean580;

	@OriginalMember(owner = "client!pw", name = "D", descriptor = "Ljava/lang/String;")
	private String aString93;

	@OriginalMember(owner = "client!pw", name = "z", descriptor = "I")
	private int anInt7604;

	@OriginalMember(owner = "client!pw", name = "A", descriptor = "I")
	private int anInt7605;

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "I")
	public int anInt7607;

	@OriginalMember(owner = "client!pw", name = "F", descriptor = "I")
	private int anInt7609;

	@OriginalMember(owner = "client!pw", name = "u", descriptor = "Ljava/lang/String;")
	private String aString94;

	@OriginalMember(owner = "client!pw", name = "L", descriptor = "I")
	public int anInt7610;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	private int anInt7611;

	@OriginalMember(owner = "client!pw", name = "O", descriptor = "Ljava/lang/String;")
	private String aString95;

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "I")
	private int anInt7612;

	@OriginalMember(owner = "client!pw", name = "x", descriptor = "Z")
	private boolean aBoolean581;

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "I")
	private int anInt7613;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	private int anInt7614;

	@OriginalMember(owner = "client!pw", name = "K", descriptor = "I")
	private int anInt7615;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
	private int anInt7616;

	@OriginalMember(owner = "client!pw", name = "H", descriptor = "I")
	private int anInt7617;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	private Class2_Sub43() {
	}

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(ZLclient!vq;)V")
	public Class2_Sub43(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class390 arg1) {
		if (Static689.aString119.startsWith("win")) {
			this.anInt7611 = 1;
		} else if (Static689.aString119.startsWith("mac")) {
			this.anInt7611 = 2;
		} else if (Static689.aString119.startsWith("linux")) {
			this.anInt7611 = 3;
		} else {
			this.anInt7611 = 4;
		}
		if (Static689.aString121.startsWith("amd64") || Static689.aString121.startsWith("x86_64")) {
			this.aBoolean580 = true;
		} else {
			this.aBoolean580 = false;
		}
		if (this.anInt7611 == 1) {
			if (Static689.aString120.indexOf("4.0") != -1) {
				this.anInt7612 = 1;
			} else if (Static689.aString120.indexOf("4.1") != -1) {
				this.anInt7612 = 2;
			} else if (Static689.aString120.indexOf("4.9") != -1) {
				this.anInt7612 = 3;
			} else if (Static689.aString120.indexOf("5.0") != -1) {
				this.anInt7612 = 4;
			} else if (Static689.aString120.indexOf("5.1") != -1) {
				this.anInt7612 = 5;
			} else if (Static689.aString120.indexOf("6.0") != -1) {
				this.anInt7612 = 6;
			} else if (Static689.aString120.indexOf("6.1") != -1) {
				this.anInt7612 = 7;
			}
		} else if (this.anInt7611 == 2) {
			if (Static689.aString120.indexOf("10.4") != -1) {
				this.anInt7612 = 20;
			} else if (Static689.aString120.indexOf("10.5") != -1) {
				this.anInt7612 = 21;
			} else if (Static689.aString120.indexOf("10.6") != -1) {
				this.anInt7612 = 22;
			} else if (Static689.aString120.indexOf("10.7") != -1) {
				this.anInt7612 = 23;
			}
		}
		if (Static689.aString123.toLowerCase().indexOf("sun") != -1) {
			this.anInt7617 = 1;
		} else if (Static689.aString123.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt7617 = 2;
		} else if (Static689.aString123.toLowerCase().indexOf("apple") == -1) {
			this.anInt7617 = 4;
		} else {
			this.anInt7617 = 3;
		}
		@Pc(332) int local332 = Static689.aString124.startsWith("1.") ? 2 : 0;
		@Pc(334) int local334 = 0;
		@Pc(340) char local340;
		try {
			while (local332 < Static689.aString124.length()) {
				local340 = Static689.aString124.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local334 = local334 * 10 + local340 - 48;
				local332++;
			}
		} catch (@Pc(372) Exception local372) {
		}
		this.anInt7603 = local334;
		local332 = Static689.aString124.indexOf(46, 2) + 1;
		local334 = 0;
		try {
			while (local332 < Static689.aString124.length()) {
				local340 = Static689.aString124.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local332++;
				local334 = local340 + local334 * 10 - '0';
			}
		} catch (@Pc(422) Exception local422) {
		}
		this.anInt7599 = local334;
		local334 = 0;
		local332 = Static689.aString124.indexOf(95, 4) + 1;
		try {
			while (Static689.aString124.length() > local332) {
				local340 = Static689.aString124.charAt(local332);
				if (local340 < '0' || local340 > '9') {
					break;
				}
				local334 = local334 * 10 + local340 - 48;
				local332++;
			}
		} catch (@Pc(470) Exception local470) {
		}
		this.anInt7607 = local334;
		if (this.anInt7603 > 3) {
			this.anInt7609 = Static495.anInt7422;
		} else {
			this.anInt7609 = 0;
		}
		this.anInt7613 = Static369.anInt4265;
		if (arg1.aBoolean781) {
			this.aBoolean581 = false;
		} else {
			this.aBoolean581 = true;
		}
		try {
			@Pc(511) int[] local511 = HardwareInfo.getCPUInfo();
			if (local511 != null && local511.length == 7) {
				this.anInt7604 = local511[2];
				this.anInt7598 = local511[5];
				this.anInt7610 = local511[6];
				this.anInt7614 = local511[4];
				this.anInt7605 = local511[3];
			}
		} catch (@Pc(548) Throwable local548) {
			this.anInt7610 = 0;
		}
		if (this.aString92 == null) {
			this.aString92 = "";
		}
		if (this.aString95 == null) {
			this.aString95 = "";
		}
		if (this.aString93 == null) {
			this.aString93 = "";
		}
		if (this.aString94 == null) {
			this.aString94 = "";
		}
		this.method6740();
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V")
	private void method6740() {
		if (this.aString95.length() > 40) {
			this.aString95 = this.aString95.substring(0, 40);
		}
		if (this.aString93.length() > 40) {
			this.aString93 = this.aString93.substring(0, 40);
		}
		if (this.aString94.length() > 10) {
			this.aString94 = this.aString94.substring(0, 10);
		}
		if (this.aString92.length() > 10) {
			this.aString92 = this.aString92.substring(0, 10);
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ge;I)V")
	public void method6742(@OriginalArg(0) Packet arg0) {
		arg0.p1(5);
		arg0.p1(this.anInt7611);
		arg0.p1(this.aBoolean580 ? 1 : 0);
		arg0.p1(this.anInt7612);
		arg0.p1(this.anInt7617);
		arg0.p1(this.anInt7603);
		arg0.p1(this.anInt7599);
		arg0.p1(this.anInt7607);
		arg0.p1(this.aBoolean581 ? 1 : 0);
		arg0.p2(this.anInt7613);
		arg0.p1(this.anInt7609);
		arg0.p3(this.anInt7610);
		arg0.p2(this.anInt7604);
		arg0.p1(this.anInt7605);
		arg0.p1(this.anInt7614);
		arg0.p1(this.anInt7598);
		arg0.pjstr2(this.aString95);
		arg0.pjstr2(this.aString93);
		arg0.pjstr2(this.aString94);
		arg0.pjstr2(this.aString92);
		arg0.p1(this.anInt7615);
		arg0.p2(this.anInt7616);
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)I")
	public int method6745() {
		@Pc(18) int local18 = Static579.method7634(this.aString95) + 23;
		@Pc(25) int local25 = local18 + Static579.method7634(this.aString93);
		@Pc(32) int local32 = local25 + Static579.method7634(this.aString94);
		return local32 + Static579.method7634(this.aString92);
	}
}
