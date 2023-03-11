import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public abstract class Class19 {

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "[I")
	public static final int[] anIntArray178 = new int[16384];

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "[I")
	public static final int[] anIntArray177 = new int[16384];

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public final int anInt2836;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "Lclient!ci;")
	public final Interface2 anInterface2_5;

	static {
		@Pc(9) double local9 = 3.834951969714103E-4D;
		for (@Pc(11) int local11 = 0; local11 < 16384; local11++) {
			anIntArray178[local11] = (int) (Math.sin(local9 * (double) local11) * 32768.0D);
			anIntArray177[local11] = (int) (Math.cos(local9 * (double) local11) * 32768.0D);
		}
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(ILclient!ci;)V")
	protected Class19(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1) {
		this.anInt2836 = arg0;
		this.anInterface2_5 = arg1;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "()F")
	public abstract float method2802();

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "()V")
	public abstract void method2803();

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "()V")
	public abstract void method2804();

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "()Z")
	public abstract boolean method2805();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
	public abstract int method2806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[[I[[IIII)Lclient!tf;")
	public abstract Class6 method2807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "()Lclient!on;")
	public abstract Class14 method2808();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V")
	public abstract void method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIB)V")
	public final void method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.method2889(arg1, arg2, arg3, arg0, 1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILclient!kf;II)V")
	public abstract void method2811(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "()Z")
	public abstract boolean method2812();

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "()Z")
	public abstract boolean method2813();

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "()I")
	public abstract int method2814();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIILclient!kf;II)V")
	public abstract void method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIII)V")
	protected abstract void method2816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V")
	public abstract void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIZ)Lclient!jd;")
	public abstract Class13 method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "()V")
	public abstract void method2819();

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "()I")
	public abstract int method2820();

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIII)V")
	public abstract void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(FF)V")
	public abstract void method2823(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!gn;Lclient!tp;Lclient!on;Lclient!au;I)V")
	public abstract void method2824(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2 arg3);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public final void method2825() {
		Static168.aBooleanArray67[this.anInt2836] = false;
		this.method2839();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[I[I)Lclient!kf;")
	public abstract Class78 method2826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!rc;Lclient!rc;FLclient!rc;)Lclient!rc;")
	public abstract Class42 method2827(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class42 arg3);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method2828(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "()Z")
	public abstract boolean method2829();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([Lclient!gn;Lclient!tp;Lclient!on;[Lclient!au;I)V")
	public abstract void method2830(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "()V")
	public abstract void method2831();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IFFFFF)V")
	public abstract void method2832(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!tp;)V")
	public abstract void method2833(@OriginalArg(0) Class224 arg0);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[Lclient!of;)V")
	public abstract void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26[] arg1);

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIIIII)V")
	public abstract void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(IIIIII)V")
	public final void method2837(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2836(arg1, arg0, arg4, arg2, arg3, 1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(F)V")
	public abstract void method2838(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "()V")
	protected abstract void method2839();

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "()Z")
	public abstract boolean method2840();

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(IIIIII)Z")
	public abstract boolean method2841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	public abstract void method2842(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "()I")
	public abstract int method2843();

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(IIIIII)V")
	public final void method2844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		this.method2809(arg2, arg0, arg1, arg4, arg3, 1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method2845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!kg;)V")
	public abstract void method2846(@OriginalArg(0) Class2_Sub22 arg0);

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "()Z")
	public abstract boolean method2847();

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public abstract void method2848(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "()Z")
	public abstract boolean method2849();

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(IIII)[I")
	public abstract int[] method2850();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([I)V")
	public abstract void method2851(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	public abstract void method2852(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method2853();

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
	public abstract void method2854(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V")
	public abstract void method2855(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIIII)V")
	public abstract void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() {
		this.method2825();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!vi;[Lclient!dk;Z)Lclient!ur;")
	public abstract Class130 method2857(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class48[] arg1);

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "()Z")
	public abstract boolean method2858();

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "()Z")
	public abstract boolean method2859();

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "()F")
	public abstract float method2860();

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(IIIII)V")
	public final void method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.method2816(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(IIII)V")
	public abstract void method2862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)I")
	public abstract int method2863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!pr;IIII)Lclient!gn;")
	public abstract Class31 method2864(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V")
	public abstract void method2865(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(IIII)V")
	public abstract void method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)V")
	public abstract void method2867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(IIIIII)V")
	public final void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2901(arg1, arg2, arg4, arg0, arg3, 1);
	}

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "()Z")
	public abstract boolean method2869();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!rc;)V")
	public abstract void method2870(@OriginalArg(0) Class42 arg0);

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "()Z")
	public abstract boolean method2871();

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V")
	public abstract void method2872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(FFF)V")
	public abstract void method2873(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(Z)V")
	public abstract void method2874(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "()I")
	public abstract int method2875();

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)Lclient!kg;")
	public abstract Class2_Sub22 method2876();

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(IIIIII)Lclient!rc;")
	public abstract Class42 method2877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wm", name = "A", descriptor = "()Z")
	public abstract boolean method2878();

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)V")
	public abstract void method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(IIII)V")
	public abstract void method2880();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([Lclient!gn;Lclient!on;[Lclient!au;I)V")
	public abstract void method2881(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class12_Sub2[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wm", name = "B", descriptor = "()V")
	public abstract void method2882();

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "()V")
	public abstract void method2883();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIIII)Lclient!jd;")
	public abstract Class13 method2884(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3);

	@OriginalMember(owner = "client!wm", name = "D", descriptor = "()I")
	public abstract int method2886();

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "()V")
	public abstract void method2887();

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "()Z")
	public abstract boolean method2888();

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "(IIIII)V")
	public abstract void method2889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(IIIII)V")
	public final void method2890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.method2856(arg0, arg2, arg1, arg3, 1);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!dk;Z)Lclient!jd;")
	public abstract Class13 method2891(@OriginalArg(0) Class48 arg0);

	@OriginalMember(owner = "client!wm", name = "G", descriptor = "()Z")
	public abstract boolean method2892();

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V")
	public abstract void method2893(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "()Z")
	public abstract boolean method2894();

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(IIII)V")
	public abstract void method2895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!on;)V")
	public abstract void method2896(@OriginalArg(0) Class14 arg0);

	@OriginalMember(owner = "client!wm", name = "I", descriptor = "()Lclient!on;")
	public abstract Class14 method2897();

	@OriginalMember(owner = "client!wm", name = "J", descriptor = "()V")
	public abstract void method2898();

	@OriginalMember(owner = "client!wm", name = "K", descriptor = "()I")
	public abstract int method2899();

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII[BII)V")
	public abstract void method2900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8);

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "(IIIIII)V")
	public abstract void method2901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[I)V")
	public abstract void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!wm", name = "L", descriptor = "()V")
	public abstract void method2903();
}
