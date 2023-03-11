package jaggl;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gl!jaggl/jagglcaps")
public class jagglcaps {

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "doubleBuffered", descriptor = "Z")
	private boolean doubleBuffered;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "stereo", descriptor = "Z")
	private boolean stereo;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "hardwareAccelerated", descriptor = "Z")
	private boolean hardwareAccelerated;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "depthBits", descriptor = "I")
	private int depthBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "stencilBits", descriptor = "I")
	private int stencilBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "redBits", descriptor = "I")
	private int redBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "greenBits", descriptor = "I")
	private int greenBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "blueBits", descriptor = "I")
	private int blueBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "alphaBits", descriptor = "I")
	private int alphaBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumRedBits", descriptor = "I")
	private int accumRedBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumGreenBits", descriptor = "I")
	private int accumGreenBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumBlueBits", descriptor = "I")
	private int accumBlueBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "accumAlphaBits", descriptor = "I")
	private int accumAlphaBits;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "sampleBuffers", descriptor = "Z")
	private boolean sampleBuffers;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "numSamples", descriptor = "I")
	private int numSamples;

	@OriginalMember(owner = "gl!jaggl/jagglcaps", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String toString() {
		return "GLCapabilities [DoubleBuffered: " + this.doubleBuffered + ", Stereo: " + this.stereo + ", HardwareAccelerated: " + this.hardwareAccelerated + ", DepthBits: " + this.depthBits + ", StencilBits: " + this.stencilBits + ", Red: " + this.redBits + ", Green: " + this.greenBits + ", Blue: " + this.blueBits + ", Alpha: " + this.alphaBits + ", Red Accum: " + this.accumRedBits + ", Green Accum: " + this.accumGreenBits + ", Blue Accum: " + this.accumBlueBits + ", Alpha Accum: " + this.accumAlphaBits + ", Multisample: " + this.sampleBuffers + (this.sampleBuffers ? ", Num samples: " + this.numSamples : "") + " ]";
	}
}
