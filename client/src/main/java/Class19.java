import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public abstract class Class19 {

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "Lclient!d;")
	public final Interface4 anInterface4_10;

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
	public final int anInt8962;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!d;)V")
	public Class19(@OriginalArg(0) Interface4 arg0) {
		this.anInterface4_10 = arg0;
		@Pc(6) int local6 = -1;
		for (@Pc(8) int local8 = 0; local8 < 8; local8++) {
			if (!Static259.aBooleanArray8[local8]) {
				Static259.aBooleanArray8[local8] = true;
				local6 = local8;
				break;
			}
		}
		if (local6 == -1) {
			throw new IllegalStateException("NFTI");
		}
		this.anInt8962 = local6;
	}

	@OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
	public abstract void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4);

	@OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
	public abstract void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
	public abstract void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method7935(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
	public abstract boolean method7936();

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
	public abstract boolean method7937();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!za;)V")
	public abstract void method7938(@OriginalArg(0) Class2_Sub13 arg0);

	@OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
	public abstract void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gaa;)V")
	public abstract void method7939(@OriginalArg(0) Interface9 arg0);

	@OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
	public abstract void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
	public abstract void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
	public final void method7940() {
		Static259.aBooleanArray8[this.anInt8962] = false;
		this.method7987();
	}

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
	public abstract void K(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lclient!lca;")
	public abstract Class2_Sub7 method7941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	public abstract void method7942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10);

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
	public abstract int I();

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
	public abstract void method7943();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
	public abstract void method7944(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
	public abstract int E();

	@OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
	public abstract void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBI)V")
	public final void method7945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7976(arg4, arg0, arg2, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(III[III)Lclient!st;")
	public final Class23 method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		return this.method7958(arg3, arg1, arg0, arg2, true);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!wp;Z)Lclient!st;")
	public abstract Class23 method7948(@OriginalArg(0) Class407 arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
	public abstract boolean method7949();

	@OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
	public abstract void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
	public abstract void method7950();

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
	public abstract void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
	public abstract void method7951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!dv;IIII)Lclient!ka;")
	public abstract Class114 method7952(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "()Lclient!tt;")
	public abstract Class73 method7953();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public final void method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method7951(arg4, arg1, arg2, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
	public abstract void la();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "()I")
	public abstract int method7955();

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
	public abstract void method7956(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lclient!st;")
	public abstract Class23 method7958(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	public abstract void method7959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	public abstract int method7960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lclient!za;")
	public abstract Class2_Sub13 method7961(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lclient!eca;")
	public abstract Interface6 method7962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lclient!st;")
	public abstract Class23 method7963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lclient!st;")
	public abstract Class23 method7964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
	public abstract void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
	public abstract void GA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	public abstract void method7965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)V")
	public final void method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.za(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lk;I)V")
	public abstract void method7967(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
	public abstract boolean method7968();

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
	public abstract void method7969();

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
	public abstract boolean method7970();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBII)V")
	public final void method7971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.aa(arg3, arg2, arg0, arg1, arg4, 1);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7972(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pu;)V")
	public abstract void method7973(@OriginalArg(0) Class67 arg0);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
	public abstract void method7974();

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
	public abstract void C(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)V")
	public abstract void method7975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
	public abstract void method7976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
	public abstract void method7977(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
	public abstract boolean method7978();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
	public abstract void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4);

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
	public abstract boolean method7979();

	@OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
	public abstract int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
	public abstract void method7980();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()Lclient!dp;")
	public abstract Class84 method7981();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
	public abstract boolean method7983();

	@OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
	public abstract void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
	public final void method7984() throws Exception_Sub1 {
		this.method7975(0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "()Lclient!tt;")
	public abstract Class73 method7985();

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
	public abstract void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lclient!wja;")
	public abstract Interface26 method7986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7940();
	}

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
	protected abstract void method7987();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!eca;Lclient!wja;)Lclient!gaa;")
	public abstract Interface9 method7988(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Interface26 arg1);

	@OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
	public abstract int[] Y();

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
	public abstract void method7989(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
	public abstract int XA();

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
	public abstract int M();

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
	public abstract void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
	public abstract boolean method7990();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI)V")
	public final void method7991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.U(arg2, arg0, arg3, arg1, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
	public abstract boolean method7992();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
	public abstract void method7993(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	public abstract void method7994();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
	public abstract void method7995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	public abstract Class178 method7996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
	public abstract void method7997(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
	public final void method7998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.P(arg3, arg1, arg0, arg2, 1);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!tt;)V")
	public abstract void method8000(@OriginalArg(0) Class73 arg0);

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "()Z")
	public abstract boolean method8001();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!st;I)V")
	public final void method8002(@OriginalArg(0) Class23 arg0) {
		this.method7939(this.method7988(arg0, this.method7986(arg0.method8199(), arg0.method8182())));
	}

	@OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
	public abstract void pa();

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public abstract void method8003();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	public abstract Class1 method8004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB[Ljava/awt/Rectangle;)V")
	public final void method8005(@OriginalArg(0) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		this.method8011(arg1, arg0, 0, 0);
	}

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
	public abstract boolean method8006();

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
	public abstract void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
	protected abstract void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!pu;Lclient!pu;FLclient!pu;)Lclient!pu;")
	public abstract Class67 method8007(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class67 arg3);

	@OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
	public abstract void xa(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
	public abstract void ya();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)Lclient!pu;")
	public abstract Class67 method8008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
	public abstract int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lclient!lca;)V")
	public abstract void method8009(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ve;[Lclient!wp;Z)Lclient!da;")
	public abstract Class14 method8010(@OriginalArg(0) Class381 arg0, @OriginalArg(1) Class407[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	public abstract void method8011(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILclient!aa;II)V")
	public abstract void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
	public abstract void method8012();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
	public abstract int method8013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
	public abstract int i();

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
	public abstract boolean method8014();

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
	public abstract boolean method8015();

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public abstract void method8016(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "()Lclient!tt;")
	public abstract Class73 method8017();

	@OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
	public abstract int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
	public abstract void method8018(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
	public abstract void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
	public abstract void X(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method8019(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
	public abstract void method8020(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
	public abstract void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!lk;)V")
	public abstract void method8021(@OriginalArg(0) Class230 arg0);

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	public abstract void method8022(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
