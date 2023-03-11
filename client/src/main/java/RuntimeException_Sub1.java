import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class RuntimeException_Sub1 extends RuntimeException {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Ljava/lang/String;")
	public String aString23;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Ljava/lang/Throwable;")
	public final Throwable aThrowable1;

	static {
		new Class79("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
	public RuntimeException_Sub1(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		this.aString23 = arg1;
		this.aThrowable1 = arg0;
	}
}
