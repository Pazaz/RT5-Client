package jagex3.graphics2.hw;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagex3/graphics2/hw/NativeInterface")
public final class NativeInterface {

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "peer", descriptor = "J")
	private long peer;

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "<init>", descriptor = "(II)V")
	public NativeInterface(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.init(arg0, arg1);
	}

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyNormals", descriptor = "([S[S[S[BFFIIIJ)V")
	public native void copyNormals(@OriginalArg(0) short[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) long arg9);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "release", descriptor = "()V")
	public native void release();

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyLighting", descriptor = "([S[B[S[S[S[S[BII[SIIIJ)V")
	public native void copyLighting(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) short[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) long arg13);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "init", descriptor = "(II)V")
	private native void init(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "initTextureMetrics", descriptor = "(IBB)V")
	public native void initTextureMetrics(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "setSunColour", descriptor = "(FFFFF)V")
	public native void setSunColour(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "setSunDirection", descriptor = "(FFF)V")
	public native void setSunDirection(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyPositions", descriptor = "([I[I[I[SIIIJ)V")
	public native void copyPositions(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) short[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyTexCoords", descriptor = "([F[FIIIJ)V")
	public native void copyTexCoords(@OriginalArg(0) float[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "setAmbient", descriptor = "(F)V")
	public native void setAmbient(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jagex3/graphics2/hw/NativeInterface", name = "copyColours", descriptor = "([S[B[SI[SIIIJ)V")
	public native void copyColours(@OriginalArg(0) short[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8);
}
