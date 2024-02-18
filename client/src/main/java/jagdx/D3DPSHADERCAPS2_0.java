package jagdx;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jagdx/D3DPSHADERCAPS2_0")
public final class D3DPSHADERCAPS2_0 {

	@OriginalMember(owner = "client!jagdx/D3DPSHADERCAPS2_0", name = "NumInstructionSlots", descriptor = "I")
	private int NumInstructionSlots;

	@OriginalMember(owner = "client!jagdx/D3DPSHADERCAPS2_0", name = "StaticFlowControlDepth", descriptor = "I")
	private int StaticFlowControlDepth;

	@OriginalMember(owner = "client!jagdx/D3DPSHADERCAPS2_0", name = "NumTemps", descriptor = "I")
	private int NumTemps;

	@OriginalMember(owner = "client!jagdx/D3DPSHADERCAPS2_0", name = "Caps", descriptor = "I")
	private int Caps;

	@OriginalMember(owner = "client!jagdx/D3DPSHADERCAPS2_0", name = "DynamicFlowControlDepth", descriptor = "I")
	private int DynamicFlowControlDepth;
}
